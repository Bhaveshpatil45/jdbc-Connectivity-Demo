# jdbc-Connectivity-Demo
This repository contains JDBC concepts to illustrate its advantages


# Personal Finance Management

## Description
A personal finance management system to track expenses, manage budgets, and generate reports.

## Features
- User registration and login
- Expense and income tracking
- Budget management
- Notifications for overspending
- Secure password storage

## Tech Stack
- Java 17
- PostgreSQL
- Maven
- SLF4J (Logging)
- JUnit (Testing)

## Setup
1. Install PostgreSQL and create a database named `finance`.
2. Update the database credentials in the `repository` package.
3. Run the following commands:
   ```bash
   mvn clean install
   java -cp target/finance-management-1.0-SNAPSHOT.jar com.finance.Main
