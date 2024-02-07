# Employee Management System using Spring Boot

Employee Management System using Spring Boot, Thymeleaf and MySQL database.

# How it looks


https://github.com/sbeee04/GTask/assets/69748917/ed53adc6-6e0e-4a32-8771-afed2fd39905





# Tools and technologies used:

- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Thymeleaf
- Intellij
- Security


# Details

The Employee Management System is a web-based application developed to manage employee information. This documentation provides instructions on setting up, configuring, and running the project.


# Author

SathishBabu

# Prerequisites
Before you begin, ensure you have the following installed:

1. Java Development Kit (JDK)
2. Apache Maven
3. MySQL or another supported database

# Project Structure
The project follows a standard Spring Boot structure. Key directories include:

* src/main/java: Java source code
* src/main/resources: Application properties, Thymeleaf templates, and static resources
* src/test: Unit and integration tests

# Configuration

server port number is 4455

# Database Setup
* Create a MySQL database named GPRJ.

* Run the SQL script located in src/main/resources/db/migration/V1__create_employee_table.sql to create the necessary table.

# Running the Application
Use Maven to build and run the application. Navigate to the project root directory and execute the following commands:


mvn clean install
mvn spring-boot:run
The application will start on the configured port (default is 8080).

# Refernces
* https://www.geeksforgeeks.org/spring-security-form-based-authentication/
* https://niemvuilaptrinh.medium.com/36-html-table-style-for-web-design-faa19dad2cab


# Thank YOU
