## Table of contents
* [General info](#general-info)
* [Prerequisites](#prerequisites)
* [Setup](#setup)

## General info
To-do Web application React JS backend.

Frontend application available in [https://github.com/rboeg/todo-react-fe](https://github.com/rboeg/todo-react-fe)


## Prerequisites
* Java 11
* Spring Boot 2.4.4 (requires Java 8 and is compatible up to Java 16)
* Apache Maven >= 3.3
* Tomcat 9.0 (Servlet version 4.0)

* PostgreSQL >= 10


## Setup
Clone down this repository. 

You must provide a newly created Postgres database.

The application's tables are created in the database (using Flyway) during the Spring Boot build process.

Using the Maven build automation tool, run:

`./mvnw spring-boot:run`  

