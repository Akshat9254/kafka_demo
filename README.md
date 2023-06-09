# Apache Kafka Demo with Java Spring Boot

## Introduction
This repository provides a demonstration of using Apache Kafka with Java Spring Boot. It showcases how to create a simple endpoint to add a string message to the Kafka message broker and how to set up a listener to process the messages.

Apache Kafka is a distributed event streaming platform that allows you to publish and subscribe to streams of records, similar to a message queue or enterprise messaging system. It is known for its high throughput, fault-tolerance, and scalability, making it an ideal choice for building real-time data pipelines and streaming applications.

## Installation Steps
To run the Apache Kafka demo with Java Spring Boot, follow the steps below:

### Prerequisites
- Java Development Kit (JDK) installed on your machine. Make sure you have Java 8 or later version.
- Apache Kafka installed. You can download Kafka from the official Apache Kafka website: https://kafka.apache.org/downloads.
- Apache Maven installed. You can download Maven from the official Apache Maven website: https://maven.apache.org/download.cgi.

### Step 1: Download Apache Kafka
Download Apache Kafka from the official website:

- Go to the Apache Kafka downloads page: https://kafka.apache.org/downloads.
- Select the desired Kafka version. It is recommended to use the latest stable release.
- Choose the binary download option for your operating system.
- Click on the download link to start the download.

### Step 2: Extract Kafka
Once the download is complete, follow these steps to extract Kafka:

- Navigate to the directory where you downloaded Kafka.
- Extract the downloaded archive file.
- On Unix-based systems (Linux, macOS), use the following command:
```
tar -xzf kafka_<version>.tgz
```

- On Windows, you can use a tool like 7-Zip to extract the downloaded .zip file.

### Step 3: Start Apache Kafka
Start Apache Kafka by following these steps:

- Open a terminal or command prompt.
- Navigate to the Kafka installation directory.

### Step 4: Start ZooKeeper Server
ZooKeeper is a centralized service used by Kafka for maintaining configuration information, naming, and providing distributed synchronization.

- In the terminal or command prompt, start the ZooKeeper server using the following command:

```
bin/zookeeper-server-start.sh config/zookeeper.properties
```

### Step 5: Start Kafka Server
Next, start the Kafka server:
- Open a new terminal or command prompt.
- Navigate to the Kafka installation directory.
- Start the Kafka server using the following command:

```
bin/kafka-server-start.sh config/server.properties
```

### Step 6: Configure the Application
- Navigate to the kafka-demo directory that you cloned in Step 1.
- Open the src/main/resources/application.properties file and modify the Kafka broker configuration if necessary.
- By default, it is set to:
```
spring.kafka.bootstrap-servers=localhost:9092
```


### Step 7: Build and Run the Application
- Open a terminal or command prompt in the kafka-demo directory.
- Run the following command to build the application using Maven:
```
mvn clean package
```

- After a successful build, start the application with the following command:
```
mvn spring-boot:run
```

The Spring Boot application will start, and the Kafka listener will be ready to consume messages.



