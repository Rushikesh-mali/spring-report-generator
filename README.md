# Spring Report Generator

This Spring Boot project generates reports dynamically based on the report type (Employee, Sales, Inventory) using:

- Spring's `ApplicationContext`
- Factory Design Pattern
- Interface-based implementation

## Features

- Dynamic report generation using a single endpoint
- Clean separation of responsibilities using interfaces
- Easy to extend for more report types

## How to Run

1. Clone the repo
2. Run the application with your preferred IDE or `mvn spring-boot:run`
3. Access: `http://localhost:8080/report?type=employee`

## Technologies

- Java
- Spring Boot
- Maven
