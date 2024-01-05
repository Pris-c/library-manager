# Library Management System

## Overview

Diagonal Library Management System is an application designed to manage a library's book inventory. It provides functionalities to add, update, delete, and retrieve information about books in the library.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)
- [Configuration](#configuration)
- [Usage](#usage)
- [Contributing](#contributing)
- [Author](#author)

## Prerequisites

Ensure you have the following installed on your system:

- Java 17
- PostgreSQL Database
- Maven

## Getting Started

1. Clone the repository with the specific branch:
    ```bash
    git clone -b spring-boot-migration https://github.com/Pris-c/library-manager.git

2. Set up your PostgreSQL database and update the `application.yml` file with the appropriate database configurations.

3. Build and run the project:
    ```bash
    cd diagonal-library
    mvn spring-boot:run
    ```

4. **Access the application at [http://localhost:8080](http://localhost:8080) in your web browser.**

## Project Structure

The project follows a standard Spring Boot project structure:

- `src/main/java`: Contains the Java source code.
- `src/main/resources`: Contains application properties and configuration files.
- `src/test`: Contains test classes.

## Dependencies

The project utilizes the following major dependencies:

- Spring Boot
- Spring Data JPA 
- MapStruct
- Lombok
- H2 Database (for testing)
- PostgreSQL


## Configuration

### Maven Compiler Plugin

The project uses the Maven Compiler Plugin for annotation processing. Ensure you have the required annotation processors for Lombok and MapStruct added to your project's build configuration.

```xml
<plugins>
    <!-- Other plugins -->

    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>${maven-compiler-plugin.version}</version>
        <configuration>
            <annotationProcessorPaths>
                <path>
                    <groupId>org.projectlombok</groupId>
                    <artifactId>lombok</artifactId>
                    <version>${lombok.version}</version>
                </path>
                <path>
                    <groupId>org.mapstruct</groupId>
                    <artifactId>mapstruct-processor</artifactId>
                    <version>${org.mapstruct.version}</version>
                </path>
            </annotationProcessorPaths>
        </configuration>
    </plugin>
</plugins>
```

## Usage

The Diagonal Library Management System provides a set of RESTful APIs to manage a library's book inventory.
You can interact with the APIs using tools like Insomnia, Postman, or integrate them into your own applications.

### Examples:

#### Get all books:
```http
GET http://localhost:8080/books
```

#### Add a new book:
```http
POST http://localhost:8080/books
Content-Type: application/json

{
"title": "Example Book",
"author": "John Doe",
"year": 2022
}
```

#### Update a book:
```http
PUT http://localhost:8080/books
Content-Type: application/json

{
  "bookId": "your-book-id",
  "title": "Updated Book",
  "author": "Jane Doe",
  "year": 2023
}
```

#### Delete a book:
```http
DELETE http://localhost:8080/books/your-book-id
```


## Contributing

Contributions are welcome! Feel free to open issues to report bugs or propose enhancements. If you'd like to contribute directly, open a pull request.

## Author

Priscila Campos




