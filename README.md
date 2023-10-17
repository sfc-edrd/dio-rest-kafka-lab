# Spring Boot Lab Project with Kafka Integration (Docker)

This repository contains a Spring Boot lab project that demonstrates how to integrate with Apache Kafka, while running Kafka inside Docker containers. This lab project provides a step-by-step guide to help you understand and implement Kafka integration within a Spring Boot application.

## Table of Contents
0. [Course Information](#Course Information)
1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Setup](#setup)
4. [Project Structure](#project-structure)
5. [Running Kafka in Docker](#running-kafka-in-docker)
6. [Running the Spring Boot Application](#running-the-spring-boot-application)
7. [Project Configuration](#project-configuration)
8. [Usage](#usage)
9. [Contributing](#contributing)
10. [License](#license)

## Course Information

This lab project was created as part of the "Arquitetura Orientada a Eventos com Java, Spring Boot e Kafka" course from Digital Innovation One. It serves as a practical example and implementation of the concepts taught in the course.

- **Course Instructor**: Rodrigo Tavares
- **Course Link**: https://web.dio.me/course/arquitetura-orientada-a-eventos-com-java-spring-boot-e-kafka/learning

I am thankful to the instructor and the platform for providing valuable insights and guidance on event-driven architecture with Java, Spring Boot, and Kafka.

## Introduction

This lab project is designed to help you get started with integrating Apache Kafka into a Spring Boot application. It covers the setup of both Kafka and the Spring Boot project in Docker containers to ensure a smooth and consistent development environment.

## Prerequisites

Before you begin, make sure you have the following prerequisites installed:

- Docker: [Install Docker](https://docs.docker.com/get-docker/)
- Docker Compose: [Install Docker Compose](https://docs.docker.com/compose/install/)
- Java Development Kit (JDK): Install a compatible version of the JDK, such as OpenJDK or Oracle JDK.
- Maven: [Install Apache Maven](https://maven.apache.org/install.html)
- Git: [Install Git](https://git-scm.com/downloads)

## Setup

1. Clone the repository:

   ```shell
   git clone https://github.com/your-username/spring-boot-kafka-lab.git
   ```

2. Change the directory to the project folder:

   ```shell
   cd dio-rest-kafka-lab
   ```

## Project Structure

The project has the following structure:

```
spring-boot-kafka-multimodule/
├── common/
│ ├── local/
│ │ ├── learning/
│ │ │ ├── lab/
│ │ │ │ ├── dio/
│ │ │ │ │ ├── model/
│ │ │ │ │ │ ├── OrderData.java
├── Consumer/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/
│ │ │ │ ├── local/
│ │ │ │ │ ├── learning/
│ │ │ │ │ │ ├── lab/
│ │ │ │ │ │ │ ├── dio/
│ │ │ │ │ │ │ │ ├── ConsumerMain.java
│ │ │ │ │ │ │ │ ├── services/
│ │ │ │ │ │ │ │ │ ├── EventRetrieveService.java
├── Producer/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/
│ │ │ │ ├── local/
│ │ │ │ │ ├── learning/
│ │ │ │ │ │ ├── lab/
│ │ │ │ │ │ │ ├── dio/
│ │ │ │ │ │ │ │ ├── ProducerMain.java
│ │ │ │ │ │ │ │ ├── controller/
│ │ │ │ │ │ │ │ │ ├── OrderController.java
│ │ │ │ │ │ │ │ ├── services/
│ │ │ │ │ │ │ │ │ ├── EventRegistryService.java
```

## Running Kafka in Docker

To run Kafka inside Docker containers using the `docker-compose.yml` file located at the classpath of the project, follow these steps:

1. Open a terminal and navigate to the project directory.

2. Start the Kafka and Zookeeper containers:

   ```shell
   docker-compose -f docker-compose.yml up -d

3. Kafka and Zookeeper containers should now be running. You can verify this by running:

   ```shell
   docker-compose ps
   ```

   This should display the status of the running containers.

## Running the Spring Boot Application

### Consumer Module

1. Open a new terminal and navigate to the Consumer module's directory:
   ```shell
   cd Consumer
   ```

2. Build the `Consumer` project using Maven:

   ```shell
   mvn clean install
   ```

3. Run the `Consumer` module:

   ```shell
   java -jar target/consumer-0.1.jar
   ```

### Producer Module

1. Open a new terminal and navigate to the Consumer module's directory:
   ```shell
   cd Producer
   ```

2. Build the `Producer` project using Maven:

   ```shell
   mvn clean install
   ```

3. Run the `Producer` module:

   ```shell
   java -jar target/producer-0.1.jar
   ```

The both modules should now be running and ready to interact with the Kafka cluster.

## Project Configuration

The project configuration can be found in the `application.properties` file under the `src/main/resources` directory. You can configure Kafka-related properties there, such as the Kafka server address and topic names.

## Usage

The Spring Boot application includes a Kafka producer (`EventRegistryService`) and a REST controller (`OrderController`) to send messages to Kafka topic. You can use the API endpoints provided by the controller to interact with Kafka.

For example, you can send a message to a Kafka topic by making a POST request to `/api/save-order` endpoint with a JSON request body. Here is a sample request body:

```json
{
    "code": "090001",
    "productName": "Secador de cabelo",
    "price": 1200
}
```

Make sure to replace the sample data with the actual information you want to save as an order. This is just a representation of the expected JSON structure. When you send a POST request with this JSON body to the mentioned endpoint, the Spring Boot application will process it accordingly.


## Contributing

I welcome contributions to this lab project. If you have improvements or new features to propose, please submit a pull request. For bug reports or feature requests, open an issue on the repository.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

Enjoy exploring Kafka integration with Spring Boot in a Docker environment! If you have any questions or encounter issues, feel free to reach out to the project maintainers.

Happy coding!