# PasswordHasher-Java
# 🔐 Password Hasher - Java

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://www.oracle.com/java/)
[![Build](https://img.shields.io/badge/Build-Passing-brightgreen.svg)](#)

A simple and secure **Java-based password hashing** tool using industry-standard algorithms like **BCrypt** and **SHA-256**.  
This project demonstrates secure authentication techniques and is great for students and beginners.

---

## 📂 Project Structure

PasswordHasher-Java/
├── lib/
│ └── jbcrypt-0.4.jar
├── src/
│ ├── BCryptHasher.java
│ ├── SHA256Hasher.java
│ └── PasswordHasher.java
└── README.md


---

## 🚀 Features

-  Hash passwords using **SHA-256**
-  Hash passwords using **BCrypt**
-  Verify plaintext passwords against hashes
-  Lightweight and beginner-friendly

---

##  How to Run

###  Compile the code

> On Windows:

```bash
javac -cp ".;lib/jbcrypt-0.4.jar" src/*.java
On macOS/Linux (replace ; with :):
javac -cp ".:lib/jbcrypt-0.4.jar" src/*.java

📦 Dependencies
✅ jbcrypt-0.4.jar – Used for BCrypt password hashing

🧪 Example Output
Enter password to hash: hello123
Choose hashing algorithm (1: SHA-256, 2: BCrypt): 2
BCrypt Hashed Password: $2a$12$kDi3sFGURm3lHDu5rh8Pue1rT2e4Ka...

📜 License
This project is licensed under the MIT License.
Feel free to use, modify, and share it.





