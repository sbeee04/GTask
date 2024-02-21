# Payanam, Keep Calm and Travel ON  

Online Bus Ticket Booking using Spring Boot, Thymeleaf and MySQL database.

# How it looks

# From Admin Side


1. Registration Page

![image](https://github.com/sbeee04/GTask/assets/69748917/77fcd1bf-e6e4-4fd8-aab8-59bffef9c004)

2. Login Page

![image](https://github.com/sbeee04/GTask/assets/69748917/6827d916-08ab-49a8-8d7d-6de95cc198ab)

3. AdminScreen
Able to add bus and book bus if the admin also wants to travel

![image](https://github.com/sbeee04/GTask/assets/69748917/8e83e489-7c2c-4d78-8bff-0b6ecfa1e68e)


# From User Side

1. Registration Page

![image](https://github.com/sbeee04/GTask/assets/69748917/a016cadb-cd8e-461d-9986-bcfd41bf493d)

2. Login Page

![image](https://github.com/sbeee04/GTask/assets/69748917/5d628f00-0a06-4c68-ad45-a7ef1b862a4a)

3. Bus Terminal Dashboard to find and book a bus

![image](https://github.com/sbeee04/GTask/assets/69748917/10cb526e-20b2-4299-8108-7b0f3f7769e0)

![image](https://github.com/sbeee04/GTask/assets/69748917/376f8aef-3fbb-4176-9eae-77de2471a798)

4. User Booking Details Page

![image](https://github.com/sbeee04/GTask/assets/69748917/95e658ed-d0b5-4c5a-9ef1-2198ae50b8a1)

5. clcik generate button if you need a soft copy of bus ticket

![image](https://github.com/sbeee04/GTask/assets/69748917/04f62050-833f-449f-969a-114a5e26a328)

6. click cancel if you want to cancel your ride

![image](https://github.com/sbeee04/GTask/assets/69748917/192e6a06-c687-4fe8-b260-0f67f7a40353)



# From Mysql Payanamdb 

![image](https://github.com/sbeee04/GTask/assets/69748917/08d60c41-16f9-4940-b227-99de51843973)


![image](https://github.com/sbeee04/GTask/assets/69748917/91ce49b4-ece2-450f-a9fc-95af9668368b)


![image](https://github.com/sbeee04/GTask/assets/69748917/9acc9a82-3471-4953-99c0-8293221690ba)



# Tools and technologies used:

- Java
- Spring Boot
- Spring Security
- Spring Data JPA (Hibernate)
- MySQL
- Thymeleaf(HTML/CSS)
- Intellij
  


# Details

The Online Bus Ticket Booking Project is a web-based application developed to book a bus seat user friendly and book ticket without any tension. This documentation provides instructions on setting up, configuring, and running the project.


# Author

SathishBabu

# Prerequisites
Before you begin, ensure you have the following installed:

1. Java Development Kit (JDK)
2. Apache Maven
3. MySQL or another supported database
4. React (It is need, If You using react for frontend)
5. NodeJS (It is need,If You using react/angular for frontend)

# Project Structure
The project follows a standard Spring Boot structure. Key directories include:

* src/main/java: Java source code
* src/main/resources: Application properties, Thymeleaf templates, and static resources
* src/test: Unit and integration tests

# Configuration

server port number is 1999

# Database Setup
* Create a MySQL database named PAYANAMDB.

* Run the SQL script located in src/main/resources/db/migration/V1__create_employee_table.sql to create the necessary table.

# Running the Application
Use Maven to build and run the application. Navigate to the project root directory and execute the following commands:


mvn clean install
mvn spring-boot:run
The application will start on the configured port (default is 8080).

# Refernces
* https://www.geeksforgeeks.org/spring-security-form-based-authentication/
* https://www.redbus.in/
* https://start.spring.io/
* https://aws.amazon.com/blogs/business-intelligence/a-dive-into-redbuss-data-platform-and-how-they-used-amazon-quicksight-to-accelerate-business-insights/#:~:text=redBus%20uses%20Amazon%20Redshift%20to,aggregated%20data%20from%20Apache%20Druid.
* https://www.thymeleaf.org/doc/articles/springmvcaccessdata.html


# Thank YOU
