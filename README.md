📝 Task Manager API
The Task Manager API is a RESTful service for managing tasks, built using Spring Boot, with PostgreSQL 16 as the database, and tested with JUnit 5 and Mockito.

🚀 Quick Start
Prerequisites
Ensure the following are installed:

Java 17 or higher
Maven (or Gradle)
PostgreSQL 16
Docker (optional, for containerization)
📂 Clone the Repository
bash

git clone https://github.com/sardortokhirov/TaskManager.git
git checkout master
📦 Install Dependencies
bash

mvn clean install
⚙️ Database Setup
Start PostgreSQL: Ensure PostgreSQL 16 is running. You can start it using Docker:

bash
docker run --name taskmanager-postgres -e POSTGRES_DB=taskdb -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres:16
Create the database:

sql

CREATE DATABASE taskdb;
Application Configuration (already set in src/main/resources/application.yml):

yaml

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/taskdb
    username: postgres
    password: postgres
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
🛠️ Run the Application
bash

mvn spring-boot:run
The server will be available at http://localhost:8080.

🔌 API Endpoints
GET /tasks — Retrieve all tasks
POST /tasks — Create a new task
GET /tasks/{id} — Retrieve task by ID
PUT /tasks/{id} — Update a task by ID
DELETE /tasks/{id} — Delete a task by ID
🧪 Running Tests
bash

mvn test
This runs the unit tests, including service and repository tests with JUnit 5 and Mockito.

