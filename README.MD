This repository demonstrates how to collect traces for different Docker configurations, generated by CAMP or otherwise.

`configs` folder contains three simple configurations. Each configuration is a simple Java program that yields a single Docker image. The `Dockerfile` for each configuration shows how to instrument your app to collect traces.

> Not meant for production. Just insert instrumentation in a testing environment to collect traces.

In the remainder of this README, we will detail how to instrument your containers, and why we suggest to do it this way. Of course, you can try other ways...

# TL;DR

> You need Docker properly installed

```
sudo apt-get update
sudo apt-get install linux-tools-common linux-tools-generic linux-tools-`uname -r`
sudo ./demo.sh
```

Enjoy the nice metrics!

Look at `configs/config0/Dockerfile` to see how to instrument your (Java) app.

If system metrics are 0, it means `perf` is not properly installed. Try installing it from the sources:

```
sudo apt-get update 
sudo apt-get install -y build-essential cmake wget unzip flex bison
cd /tmp && wget https://github.com/torvalds/linux/archive/v5.1.zip && unzip v5.1.zip && rm v5.1.zip
cd linux-5.1/tools/perf && make 
sudo cp perf /usr/bin
```

# Instrumenting any app

Collecting traces is based on profiling your running app. Since profiling basically takes a snapshot of your running app *n* times per second (or at *n* Hz), there is no guarantee it will collect all traces. To increase the quality of the traces, we may want to run the profiler several times, possibly at different frequencies. Let's add the following lines early in your existing `Dockerfile` *e.g.* right after your `FROM` statement:

```
#Sampling rate of the profiler in Hz (or per s)
ARG PROFILER_FREQ
RUN echo "$PROFILER_FREQ" > /.profiler
```

This way, we can re-build an image where the profiler will be set to a different frequency, using `docker build -t demo/config0 --build-arg PROFILER_FREQ=444` to specify that the profiler should run at 444 Hz.

By default, we will rely on the `perf` tool to collect systems calls, which requires the PID of a process as argument. In principle, we could run `perf` on the host to profile processes running in Docker. Getting a fully automated and fully reliable procedure to map Docker PIDs to Host PIDs proved to be more tricky than planned... So, let install and run `perf` directly in the container. Installing `perf` did not work using `apt-get install` in the `Dockerfile`, so we'll install it from the sources :-)

```
RUN apt-get update && apt-get install -y build-essential cmake wget unzip flex bison && rm -rf /var/lib/apt/lists/*
RUN wget https://github.com/torvalds/linux/archive/v5.1.zip && unzip v5.1.zip && rm v5.1.zip && \
    cd linux-5.1/tools/perf && make && cp perf /usr/bin && \
    rm -rf linux-5.1
```

> it will take a while to build... but again, this is not intended for use in production, just for one-shot experimentation in a testing environment.

Now, instead of directly running your app in a `CMD` statement, let's execute a script instead:

```
CMD ["/bin/sh", "run.sh"]
```

In `script.sh`:

```
java -XX:+PreserveFramePointer -jar /target/perftest-1.0.0-jar-with-dependencies.jar &
PID=$!
#perf record
PROFILER_FREQ=$(cat /.profiler)
perf record -e cpu-clock -F $PROFILER_FREQ -p $PID -a -g -o /data/perf.data &
```

Will profile your app (here a JAR run with `java -jar`). By default, `perf` will run as long as the java process is alive. If you want to profile your java process only for a given duration use `perf record -e cpu-clock -F $PROFILER_FREQ -p $PID -a -g -o /data/perf.data -- sleep 60 &` e.g. to profile during 60 seconds.

This will generate a `perf.data` file in a `/data` folder.

> You need to mount this /data volume and run the container with additional capabilities for perf to execute e.g. `docker run -v $(pwd):/data --cap-add=ALL <name-of-the-image>`

This `perf.data` files mostly contains systems calls. If you are running a Java app, and if you want to trace more specifically java methods, see next section.

# Instrumenting a Java app

> You need the instrumentation described in the section above + instrumentation described in this section

We need a Java agent to collect more detailed Java-specific traces. Add the following to your `Dockerfile` e.g. after the `RUN` statement where we installed `perf`:

```
RUN cd /root && wget https://github.com/jvm-profiling-tools/perf-map-agent/archive/master.zip && unzip master.zip && rm -f master.zip && \
    cd /root/perf-map-agent-master && \
    sed -i '/find_package(Java REQUIRED)/Q' CMakeLists.txt && \
    export PATH=$JAVA_HOME/bin:$PATH && cmake . && make && \
    cd src/java && javac -d ../../out *.java && cd ../../out && jar -cvfe libperfagent.jar net.virtualvoid.perf.AttachOnce net/virtualvoid/perf && \
    cd /root/perf-map-agent-master && \
    cp out/libperfmap.so /libperfmap.so && cp out/libperfagent.jar /libperfagent.jar && \
    rm -rf /root/perf-map-agent-master

RUN cd /root && wget https://github.com/dcapwell/lightweight-java-profiler/archive/master.zip && unzip master.zip && rm -f master.zip && \
    cd /root/lightweight-java-profiler-master && \
    sed -i "s/static const int kNumInterrupts = 100;/static const int kNumInterrupts = $PROFILER_FREQ;/" src/globals.h && \
    make && \
    cp /root/lightweight-java-profiler-master/build-64/liblagent.so /liblagent.so && \
    rm -rf /root/lightweight-java-profiler-master
```

> We compile the Java agent directly in the image rather than copying a pre-compiled agent. This way we avoid problems when the host and the container have different versions of Java.

The updated `script.sh` would look like this:

```
java -XX:+PreserveFramePointer -agentpath:/liblagent.so -jar /target/perftest-1.0.0-jar-with-dependencies.jar &
PID=$!
java -jar /libperfagent.jar $PID &

#perf record
PROFILER_FREQ=$(cat /.profiler)
perf record -e cpu-clock -F $PROFILER_FREQ -p $PID -a -g -o /data/perf.data &

wait

cp /tmp/perf*.map /data/perf-$PID.map
cp traces.txt /data/traces.txt
```

In addition to `perf.data`, this will produce a `perf-*.map` and a `traces.txt` file in `/data`.

> You need to mount this /data volume and run the container with additional capabilities. See end of previous section.

# Analyzing traces

The script `demo.sh` show how to:

- Build the three demo configurations
- Run the three configurations
- Process the profiling traces and generate a metric (improvement pendings)

In this script, each configuration is built and executed several times, with the profiling set at three different frequencies. The goal is to maximize the number of traces caught by the profiler. Since it is not meant for production, go for high frequencies.

> `demo.sh` is self-documented through comments... :-)

# Viewing the traces

Folder `profiling` contains aggregated traces about **all** configurations, including flamegraphs for Java calls and for systems calls.

Each configuration also contains a `profiling` folder with traces for this configuration, flamegraphs (Java and systems calls) and diff flamegraphs comparing this configuration to the aggregated traces.
