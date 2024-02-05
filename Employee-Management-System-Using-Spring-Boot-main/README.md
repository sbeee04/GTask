# Employee Management System using Spring Boot

Employee Management System using Spring Boot, Thymeleaf and MySQL database.

# How it looks
![image](https://github.com/sbeee04/GTask/assets/69748917/c094d657-91ce-4289-9924-5c480f5d79fa)
![image](https://github.com/sbeee04/GTask/assets/69748917/3278aaea-4e61-4f74-bbb8-41493656f110)
![image](https://github.com/sbeee04/GTask/assets/69748917/e1bb5693-d42b-48fc-9d32-3542e1cad3cf)
![image](https://github.com/sbeee04/GTask/assets/69748917/a6d33845-9c76-4c80-a73b-611132c6b573)
![image](https://github.com/sbeee04/GTask/assets/69748917/924e4aa6-bfd8-40e5-b447-c065b134bdf0)








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


# Thank YOU
