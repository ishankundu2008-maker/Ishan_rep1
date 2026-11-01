
# User Registration Web Application

A full-stack web application built using **Spring Boot**, **Spring Data JPA**, and **MySQL**, styled with a modern glassmorphism UI/UX design.

---

## 🚀 Features

* **User Registration:** Simple and modern HTML form to collect username and email address.
* **Database Integration:** Persists user data directly into a MySQL database (`user_db`) using Spring Data JPA.
* **Modern UI/UX:** Features a sleek glassmorphism design with gradient backdrops, glowing input fields, and smooth CSS animations.
* **Automatic Schema Generation:** Relies on Hibernate DDL auto-update to construct database tables seamlessly.

---

## 🛠️ Technology Stack

* **Backend:** Java 17/21, Spring Boot (Spring Web, Spring Data JPA)
* **Database:** MySQL
* **Frontend:** HTML5, CSS3 (Custom Glassmorphism styling)
* **Build Tool:** Maven

---

## 📁 Project Structure

```text
demo/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── DemoApplication.java    # Application Entry Point
│   │   │   ├── User.java               # JPA Entity
│   │   │   ├── UserRepository.java     # Spring Data JPA Repository
│   │   │   └── UserController.java     # Web & Request Controller
│   │   └── resources/
│   │       ├── application.properties  # Database & Spring Configurations
│   │       └── static/
│   │           └── style.css           # Glassmorphism UI Stylesheet
└── pom.xml                             # Maven Dependencies
```

---

## ⚙️ Prerequisites

Before running the application, ensure you have the following installed:

1. **Java Development Kit (JDK 17 or later)**
2. **MySQL Server**
3. **IDE** (IntelliJ IDEA, Eclipse, or VS Code)
4. **Maven** (included via Maven wrapper `./mvnw`)

---

## 🔧 Database Setup

1. Open your MySQL client (MySQL Workbench, Command Line, etc.).
2. Create the target database:

```sql
CREATE DATABASE user_db;
```

3. Update `src/main/resources/application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/user_db
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🏃 Running the Application

### Option A: Using IntelliJ IDEA
1. Open the project folder in IntelliJ IDEA.
2. Locate `src/main/java/com/example/demo/DemoApplication.java`.
3. Click the **Green Play Button (▶)** next to the `main` method or class declaration.

### Option B: Using Command Line / Terminal
Run the following command from the root directory of the project:

```bash
./mvnw spring-boot:run
```
*(On Windows Command Prompt, use `mvnw spring-boot:run`)*

---

## 🌐 Usage

1. Once the server starts, open your web browser and navigate to:
   ```text
   http://localhost:8080
   ```
2. Enter a **Username** and **Email Address**.
3. Click **Submit**.
4. Check your MySQL `user_db` database under the `users` table to verify the stored record:

```sql
SELECT * FROM users;
```
