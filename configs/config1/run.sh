#!/bin/sh

java -XX:+PreserveFramePointer -agentpath:/liblagent.so -jar /target/perftest-1.0.0-jar-with-dependencies.jar &
PID=$!
java -jar /libperfagent.jar $PID &


#perf record
PROFILER_FREQ=$(cat /.profiler)
perf record -e cpu-clock -F $PROFILER_FREQ -p $PID -a -g -o /data/perf.data &

wait

cp /tmp/perf*.map /data/perf-$PID.map
cp traces.txt /data/traces.txt


chmod -R 777 /data
