# CRM System - DB Utility Module

This module, named `crm-db-utility`, is responsible for managing the database operations related to user authentication, roles, and any other data storage needs of the CRM system.

## Features

- **User Management:** CRUD operations for managing user data.
- **Role Management:** CRUD operations for managing roles.
- **Many-to-Many Relationship:** Establishes a many-to-many relationship between users and roles through the `user_roles` association table.

## Table Structure

### User Table

| Column   | Type         | Description             |
|----------|--------------|-------------------------|
| id       | INT          | Primary Key             |
| username | VARCHAR(50)  | Unique username         |
| password | VARCHAR(100) | User password (hashed)  |
| email    | VARCHAR(100) | User email              |

### Role Table

| Column | Type         | Description       |
|--------|--------------|-------------------|
| id     | INT          | Primary Key       |
| name   | VARCHAR(20)  | Unique role name  |

### User_Role Table

| Column  | Type | Description                         |
|---------|------|-------------------------------------|
| user_id | INT  | Foreign Key referencing User table  |
| role_id | INT  | Foreign Key referencing Role table  |
| PRIMARY KEY (user_id, role_id)          |

## Entity Classes

- `User`: Represents user information and includes a many-to-many relationship with roles.
- `Role`: Represents role information and includes a many-to-many relationship with users.

## Usage

1. **Configure Database:** Set up your database connection details in the `application.properties` file.

2. **Entity Classes:** Ensure that the `User` and `Role` entities are correctly annotated with JPA annotations.

3. **Repositories:** Use the provided `UserRepository` and `RoleRepository` interfaces to interact with the database.

4. **Services:** Leverage the `UserService` and `RoleService` for business logic related to users and roles.

5. **Database Schema:** Refer to the database schema section for details on the table structure and relationships.


