#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# See the NOTICE file distributed with this work for additional
# information regarding copyright ownership.
#

FROM maven:3-jdk-11

#Sampling rate of the profiler in Hz (or per s)
ARG PROFILER_FREQ 
RUN echo "$PROFILER_FREQ" > /.profiler

#PERF
RUN apt-get update && apt-get install -y build-essential cmake wget unzip flex bison && rm -rf /var/lib/apt/lists/*
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
RUN wget https://github.com/torvalds/linux/archive/v5.1.zip && unzip v5.1.zip && rm v5.1.zip && \
    cd linux-5.1/tools/perf && make && cp perf /usr/bin && \
    rm -rf linux-5.1

RUN cd /root && wget https://github.com/TelluIoT/ThingML/releases/download/1.0.0/mvn_repo_generated.tar.gz
RUN cd /root && tar -xzf mvn_repo_generated.tar.gz
COPY . .
RUN mvn install






CMD ["/bin/sh", "run.sh"]