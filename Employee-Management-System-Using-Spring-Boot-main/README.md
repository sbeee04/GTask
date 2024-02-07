# Employee Management System using Spring Boot

Employee Management System using Spring Boot, Thymeleaf and MySQL database.

# How it looks

![image](https://github.com/sbeee04/GTask/assets/69748917/47430b9d-4269-4e1c-8d41-a044c3332480)

![image](https://github.com/sbeee04/GTask/assets/69748917/0d265322-2f45-42f4-afb8-eca89109777a)

![image](https://github.com/sbeee04/GTask/assets/69748917/4137c22c-9655-4de3-bce1-28204cf55b56)

![image](https://github.com/sbeee04/GTask/assets/69748917/6aabd662-8b5d-4fdd-bfdb-e737d41e301c)

![image](https://github.com/sbeee04/GTask/assets/69748917/7ed9981e-cdfb-42a5-8ed2-cb8f2511da9f)



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
