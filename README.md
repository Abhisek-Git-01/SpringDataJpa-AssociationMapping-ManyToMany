# 🔗 Spring Data JPA – Many-to-Many Association Mapping

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange"/>
  <img src="https://img.shields.io/badge/SpringBoot-3-green"/>
  <img src="https://img.shields.io/badge/SpringDataJPA-ORM-blue"/>
  <img src="https://img.shields.io/badge/Hibernate-JPA-yellow"/>
  <img src="https://img.shields.io/badge/MySQL-Database-blue"/>
</p>

---

## 🚀 Overview

This project demonstrates how to implement **Many-to-Many association mapping** using **Spring Data JPA** and **Hibernate**.

In a Many-to-Many relationship, multiple records in one table are associated with multiple records in another table using a **join table**.

---

## 🧠 Concept Explanation

👉 Example:

* A **Student** can enroll in multiple **Courses**
* A **Course** can have multiple **Students**

✔ This relationship is handled using a **join table**

---

## 🏗️ Architecture Diagram

<p align="center">
  <img src="images/many-to-many.png" width="700"/>
</p>

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

---

## 📂 Project Structure

```id="b8b6bp"
src/main/java
│
├── entity        # Entity classes (Student, Course)
├── repository    # JPA repositories
├── service       # Business logic
├── controller    # REST APIs
└── config        # Configuration files
```

---

## 🔗 Entity Mapping

### 📌 Student Entity

```java id="n1n0d2"
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Integer studentId;

    private String studentName;

    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
}
```

---

### 📌 Course Entity

```java id="wxfz5q"
@Entity
public class Course {

    @Id
    @GeneratedValue
    private Integer courseId;

    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
```

---

## 📊 Database Schema

* `student` table
* `course` table
* `student_course` (join table)

---

## ⚙️ Features

* Demonstrates Many-to-Many mapping
* Uses `@JoinTable` for relationship mapping
* Bi-directional relationship
* CRUD operations using Spring Data JPA

---

## ▶️ How to Run

1. Clone the repository

```bash
git clone https://github.com/Abhisek-Git-01/<your-repo-name>.git
```

2. Configure database in `application.properties`

3. Run Spring Boot application

4. Test APIs using Postman

---

## 📌 Key Concepts Covered

* JPA Relationships
* Many-to-Many Mapping
* Join Table (`@JoinTable`)
* Owning vs Inverse side (`mappedBy`)
* Hibernate ORM

---

## 🎯 Learning Outcome

* Understood Many-to-Many relationship in JPA
* Learned how join tables work
* Implemented bi-directional association
* Gained hands-on experience with Hibernate

---

## 🤝 Contributing

Feel free to fork and enhance this project.

---

## ⭐ Acknowledgement

This project is part of hands-on learning for Spring Boot and JPA relationships.

---
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3-green)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
