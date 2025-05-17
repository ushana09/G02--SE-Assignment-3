# Admin Module - E-Retail Platform

## 📌 Overview

This module is part of the E-Retail Platform and implements core administrative functionalities for managing users, discounts, notifications, and support. It is designed as a command-line application for demonstration purposes.

**Developed by:** Member 4  
**Module:** Admin Module  
**Assignment:** Software Engineering Project - Assignment 3 Part A

---

## 🛠️ Features Implemented

### ✔️ Classes

- **Admin**: Represents admin user and handles dashboard access.
- **Authentication**: Provides secure admin login functionality.
- **Notification**: Enables the admin to send and view system notifications.
- **Discount**: Allows the creation and listing of promotional discounts.

### 🖥️ Screens Simulated (via Console)

1. **Admin Login Screen**
2. **Admin Dashboard**
3. **User Management Screen** *(Placeholder)*
4. **Discount/Promotion Management Screen**
5. **Notifications Screen**
6. **Contact Us / Support Screen**

---

## 📂 File Structure

```
AdminModule/
├── Admin.java
├── Authentication.java
├── Discount.java
├── Notification.java
├── MainApp.java
└── README.md
```

---

## 🚀 How to Run

1. Ensure Java is installed on your system (Java 8 or later).
2. Compile all `.java` files:
   ```bash
   javac *.java
   ```
3. Run the main application:
   ```bash
   java MainApp
   ```

---

## 🔐 Admin Credentials

Use the following default credentials to log in:

- **Username:** `admin`  
- **Password:** `admin123`

---

## 📝 Notes

- The **User Management Screen** is currently a placeholder and can be extended in future versions.
- This version uses **command-line interface** only. GUI integration (JavaFX/Swing) can be added later.
- No persistent database or file storage is used—data exists in memory for this demo.

---


```
