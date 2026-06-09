# 🏥 Hospital Management System - Spring Core Learning Project

A complete Spring Core project built to practice and demonstrate the core concepts of the Spring Framework through a real-world Hospital Management System.

This project was designed as part of my Spring learning journey and covers Dependency Injection, Bean Management, Collection Injection, Standalone Collections, Bean Lifecycle, and XML-based configuration.

---

## 🚀 Features

### 👨‍⚕️ Doctor Management

* Doctor registration and information management
* Doctor specialization details
* Prescription generation
* Interaction with Pharmacy

### 🧑‍🤝‍🧑 Patient Management

* Patient information management
* Address management
* Prescription receiving

### 💊 Pharmacy Management

* Medicine inventory management
* Stock tracking using Map Collection
* Medicine availability checking
* Medicine dispensing
* Automatic stock reduction after dispensing

### 🏥 Hospital Management

* Hospital information management
* Doctor and Patient association
* Centralized hospital operations

### 🗄️ Database Simulation

* Database initialization
* Bean lifecycle demonstration
* Resource cleanup

---

# 📚 Spring Concepts Covered

## Dependency Injection (DI)

* Setter Injection
* Reference Injection

## Collection Injection

* List Injection
* Set Injection
* Map Injection

## Standalone Collections

* util:list
* util:set
* util:map

## Bean Lifecycle

* Initialization Methods
* Destruction Methods
* @PostConstruct
* @PreDestroy

## IoC Container

* ApplicationContext
* Bean Retrieval
* Bean Wiring

---

# 🏗️ Project Architecture

```text
Hospital
│
├── Doctor
│     │
│     └── Pharmacy
│
└── Patient
      │
      └── Address

DatabaseBean
```

---

# 📦 Package Structure

```text
src/main/java
│
└── com.spring.practice.hsmlearningspring
    │
    ├── Hospital
    │     └── Hospital.java
    │
    ├── doctor
    │     └── Doctor.java
    │
    ├── patient
    │     ├── Patient.java
    │     └── Address.java
    │
    ├── pharmacy
    │     └── Pharmacy.java
    │
    ├── database
    │     └── DataBaseBean.java
    │
    └── HsmLearningSpringApplication.java
```

---

# ⚙️ Configuration Files

## beans.xml

Master Spring Configuration File

Contains:

* Doctor Bean
* Patient Bean
* Hospital Bean
* Pharmacy Bean
* Database Bean
* Address Bean

---

## standalone-beans.xml

Contains standalone collection beans:

```xml
util:list
util:set
util:map
```

Used for:

* Medicine List
* Department Set
* Stock Map

---

# 💊 Pharmacy Workflow

```text
Doctor Writes Prescription
            │
            ▼
Patient Receives Prescription
            │
            ▼
Pharmacy Checks Availability
            │
            ▼
Medicine Dispensed
            │
            ▼
Stock Updated
```

---

# 🔥 Sample Output

```text
====================================
    HOSPITAL MANAGEMENT SYSTEM
====================================

===== DATABASE =====
Database Initialized

===== HOSPITAL DETAILS =====
Hospital Name : Apollo Hospital
Hospital Address : Kanpur

===== DOCTOR DETAILS =====
Doctor ID : 10001
Doctor Name : Dr. Sanjana Yadav

===== PATIENT DETAILS =====
Patient Name : Kuldeep Kumar Kashyap

===== PHARMACY DETAILS =====

Stock Before Selling:
{Paracetamol=100, Azithromycin=50}

Medicine Dispensing:
Paracetamol : Dispensed

Stock After Selling:
{Paracetamol=99, Azithromycin=50}
```

---

# 🛠️ Technologies Used

* Java
* Spring Core 6.x
* Maven
* Lombok
* XML Configuration

---

# 🎯 Learning Objectives

This project helped me understand:

* Spring IoC Container
* Dependency Injection
* Loose Coupling
* Bean Lifecycle
* Collection Injection
* XML Configuration
* Real-world Object Relationships

---

# 📈 Future Improvements

* Spring Boot Migration
* Spring Data JPA
* MySQL Integration
* REST APIs
* Spring Security
* JWT Authentication
* Exception Handling
* Logging Framework

---

# 👨‍💻 Author

**Kuldeep Kashyap**

B.Tech CSE Student | Java Developer | Spring Learner

Currently exploring:

* Core Java
* Spring Framework
* Spring Boot
* DSA
* Backend Development

---

⭐ If you found this project helpful, consider giving it a star.
