# Library Management System

## Project Overview

The Library Management System project is a comprehensive book management system designed to cater to the needs of a library. It has undergone several versions, introducing new features and incorporating modern technologies such as Maven, SQL databases, and the Spring Boot framework.

This application enables essential operations within a library context, including the ability to save new books, make alterations to existing records, delete works from the collection, and search for specific books in the database.

With different versions, ranging from a basic implementation in pure Java to more advanced iterations utilizing Maven, Spring Boot, and other enhancements, the project aims to provide a flexible and scalable solution for efficient library book management. Each version builds upon the previous one, bringing improvements in project structure, dependency management, documentation, and unit testing, aligning with industry best practices and technological advancements.

## Upcoming Versions

- Migration of the database to Docker

## Branching Strategy

Different versions of the project are organized into specific branches:

1. [**java**](https://github.com/Pris-c/library-manager/tree/java) ✔ : The initial version of the Library Management System is implemented solely in Java, featuring a simulated List-based database. User interaction in this version occurs through a command-line prompt.

2. [**maven-sql-integration**](https://github.com/Pris-c/library-manager/tree/maven-sql-integration) ✔ : This branch focuses on integrating Maven to enhance project structure and dependency management. Additionally, it includes the integration of an SQL database for establishing persistent and efficient data storage.

3. [**spring-boot-migration**](https://github.com/Pris-c/library-manager/tree/spring-boot-migration) ✔ : The project underwent a transition to the Spring Boot framework to leverage advanced features and realized architectural enhancements. The replacement entailed the adoption of a RESTful API paradigm.

4. [**external-api-integration**](https://github.com/Pris-c/library-manager/blob/spring-boot-migration/README.md) ✔ : To simplify the addition of books to the database, an external API integration was implemented. This integration allows for searching and retrieving several information about the books.

5. [**adapt-for-frontend-integration**](https://github.com/Pris-c/library-manager/tree/adapt-for-frontend-integration) ✔ : This branch focuses on integrating the Library Management System backend application with the frontend in [Lumus Library](https://github.com/Pris-c/lumus-library-angular). It aims to establish seamless communication between the frontend and backend components, enabling cohesive user experiences and enhanced functionality.

6. [**docker-migration**](https://github.com/Pris-c/library-manager/tree/docker-migration) ✔ : To streamline the deployment and management of the database, this branch focuses on migrating the project to Docker. This migration aims to enhance scalability, portability, and ease of maintenance by containerizing the database within a Docker environment.
