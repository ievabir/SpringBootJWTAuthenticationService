#Spring Boot JWT Authentication Service


##Overview

This is a Spring Boot-based system for managing users (employees in this case) 
within an organization. It allows each user to create, update, delete, and retrieve 
only the employee records it has created.
The application uses JWT for authentication.

------------
##Features

JWT Authentication: The application uses JWT (JSON Web Token) for secure 
authentication and authorization.

Role-based Access Control: Users can only manage employees that report 
directly to them.

Employee CRUD Operations: Create, update, delete, and retrieve employee records.

User Authentication: Only authenticated users can perform CRUD operations on 
employee data.

------------
##Configuration

To run, application.yml needs to be updated first, with correct info for database, 
and base64 secret key. While this approach its functional, for security reasons it is 
better to store it in place like Azure Key Vaults, or at least to keep it as an environmental variable.

_____________
##API Endpoints

-Register User: Endpoint to create a new user.
-Authenticate user: Endpoint to authenticate a user and obtain a JWT.
-Create Employee: Endpoint to add a new employee record.
-Get Employee: Endpoint to retrieve employee records.
-Update employee: Endpoint to update existing employee records.
-Delete employee: Endpoint to delete employee records.

