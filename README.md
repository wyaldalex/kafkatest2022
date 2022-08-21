# Dummy Kafka Testing Project

Kafka project for local Testing  
Using Kafka on local https://downloads.apache.org/kafka/3.2.1/kafka_2.13-3.2.1.tgz  

## Initial run on windows
### cd bin\windows
### Start the ZooKeeper service
 .\zookeeper-server-start.bat "..\..\config\zookeeper.properties"

### Start the Kafka broker service
.\kafka-server-start.bat ..\..\config\server.properties