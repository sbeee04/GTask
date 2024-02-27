# Doctor-Appointment-Scheduler

A springboot based project that provides and 
easy to use web application which enables patients to 
schedule an appointment with a doctor of their choice.

### Author
Sathish Babu

### Functionalities
* Patient Regitrsation
* Patient Login
* Doctor Registration
* Doctor Login
* Patient can book, view and cancel appointments
* Doctor can view and cancel appointments
* Doctor can prescribe medicines

### Tools and Technologies
* Framework: Spring Boot 
* Language: Java
* Database: MySQL
* Build Tool: Maven
* FrontEnd: Thymeleaf (HTML,CSS)


### Requirements
- Maven
- Java
- Sql

### Dependencies Used

##### Spring Boot Starter Data JPA: 
Simplifies database access using Spring Data repositories.

##### Spring Boot Starter Web: 
Provides support for building web applications, including RESTful APIs.

##### MySQL Connector/J (Runtime Dependency): T
he MySQL JDBC driver for connecting to MySQL databases.

##### Spring Boot Starter Test (For Testing): 
Provides support for testing Spring Boot applications.


##### Other Dependencies: 
Various other dependencies are included in the pom.xml file for specific functionalities.

### Project Structure

##### Main Application Class: 
The entry point for the application is defined in the main class.
##### Entities: 
The application includes entities such as Doctor, Patient, Appointment, Prescription.
##### Repository Interfaces: 
Spring Data JPA repository interfaces manage data access.
##### Controller Class: 
These class define Business logic is implemented and for managing appointments, authentication, and doctors.

### Data Flow
The Doctor's Appointment Application follows a structured data flow for managing appointments

#### Appointment Booking:

A patient initiates an appointment booking by sending a GET request to the /docdetails endpoint, specifying the doctor details and the appointment time.


The system sends a appointment in appointed page.

#### Appointment Cancellation:

A patient can cancel an appointment by clicking the cancel button.

The system checks if the provided appointment exists and is associated with the patient.

If the appointment is valid, it is deleted from the database.



#### User Registration (Sign Up):

A patient can register by sending a POST request to the /register endpoint, providing registration details such as email address, password.


#### User Authentication (Sign In):

To authenticate, a patient sends a GET request to the /patlog endpoint with their email and password.

The system validates the provided email and password, checking against the stored data in the database.

If the credentials are valid, the system generates an authentication token, associates it with the patient, and saves it in the database.

The system sends a response with the authentication token.

### How It Works
Home Page
![image](https://github.com/sbeee04/GTask/assets/69748917/9d55d041-5936-47e8-9757-6be6533c7b28)


Patient Login
![image](https://github.com/sbeee04/GTask/assets/69748917/9e5c9f9e-6971-475f-bda8-8a6b41bc4fdd)

Doctor Login
![image](https://github.com/sbeee04/GTask/assets/69748917/9a466c3e-a0cb-4468-bf35-298fae332887)

Patient Home Page
![image](https://github.com/sbeee04/GTask/assets/69748917/8fe1cb09-27b0-458a-bcfa-e9fd2f007155)

Appointment Booking Page
![image](https://github.com/sbeee04/GTask/assets/69748917/28dfe215-0f92-4da9-ba00-0716c5b07bb3)

![image](https://github.com/sbeee04/GTask/assets/69748917/0a5d2047-80bf-48a9-9e2a-e7c8d88acede)




Doctor-Patient Appointment Page
![image](https://github.com/sbeee04/GTask/assets/69748917/e0cc29cc-3c46-4d9f-a4dc-4e8368b2c80b)

Prescription Page
![image](https://github.com/sbeee04/GTask/assets/69748917/9788b658-091c-4ddc-8f79-367ab98768bd)

