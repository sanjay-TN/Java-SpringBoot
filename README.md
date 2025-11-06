# Spring Boot Learning Repository

This repository contains a collection of **Spring Boot based demo applications** created during my learning journey.  
It includes small feature-based examples, concept demos, and one complete project: **Student Management System (CRUD)**.

The goal of this repository is to maintain all my Spring Boot practice work in a structured and version-controlled way.

---

## 📂 Contents Included in this Repo

| Module / Folder | Description |
|-----------------|-------------|
| **Demo Files** | Contains various Spring Boot feature based test files (starter demos, controller demos, JPA demos etc.) |
| **Thymeleaf Concepts** | Server-side UI rendering using Thymeleaf templates (forms, display data, HTML integration) |
| **Student Management System** | Full CRUD web application with DB integration → Add / Edit / List / Delete Students |

---

## 🧩 Tech Stack Used

| Layer | Technology |
|-------|------------|
| Framework | Spring Boot |
| Language | Java 17+ |
| View Layer | Thymeleaf |
| ORM | Spring Data JPA |
| Database | MySQL |
| Build Tool | Maven |

---

## ⚙️ Example Database Configuration (`application.properties`)

```properties
spring.application.name=SpringBoot-Learning

spring.datasource.url=jdbc:mysql://127.0.0.1:3306/StudentManagementSystem?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

---

## ▶️ How To Run This Repository

1️⃣ Clone the repository  
```bash
git clone <your-github-repo-url>

---

## ⭐ Project Highlight: Student Management System

This is the main complete project inside this repository – a real CRUD based Spring Boot web application.

### What this project can do
- Add new Student
- View list of all Students
- Edit/Update Student details
- Delete Student
- Valid MVC Structure (Controller → Service → Repository)
- Thymeleaf based UI pages (server-side templates)
- Connected with MySQL database using Spring Data JPA

This module demonstrates how to build a working production-style application using Spring Boot + Thymeleaf.

---

## 📌 Future Scope / Enhancements

- JWT based Authentication / Login & Register
- Role Based Access Control (Admin / User)
- Pagination & Sorting of Students Table
- Input Validations (Email pattern check, Mandatory fields etc.)
- Add Search Filter (Search Student by Name)
- Complete Frontend using React or Angular framework
- Convert this project to REST API + SPA UI architecture

---

