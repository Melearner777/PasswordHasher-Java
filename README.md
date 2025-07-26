
# Password Hasher - Java

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://www.oracle.com/java/)
[![Build](https://img.shields.io/badge/Build-Passing-brightgreen.svg)](#)

A simple and secure **Java-based password hashing** tool using industry-standard algorithms like **BCrypt** and **SHA-256**.  
This project demonstrates secure authentication techniques and is great for students and beginners.

---

# Project Structure
```bash
PasswordHasher-Java/
├── lib/
│ └── jbcrypt-0.4.jar
├── src/
│ ├── BCryptHasher.java
│ ├── SHA256Hasher.java
│ └── PasswordHasher.java
└── README.md
```

---

#Features

-  Hash passwords using **SHA-256**
-  Hash passwords using **BCrypt**
-  Verify plaintext passwords against hashes
-  Lightweight and beginner-friendly

---

# How to Run

#Compile the code

> On Windows:

#How to Compile

## How to Run

# Compile the code

#On Windows:

```bash
javac -cp ".;lib/jbcrypt-0.4.jar" src/*.java
```
#ON MAC
```bash
ON MAC
javac -cp ".:lib/jbcrypt-0.4.jar" src/*.java
```
**Add JBCrypt to Your Project**
Download jbcrypt-0.4.jar from Maven Repository

Add it to your classpath:
```bash
javac -cp ".;lib/jbcrypt-0.4.jar" src/*.java
java -cp ".;lib/jbcrypt-0.4.jar;src" PasswordHasher
```

**Concepts Demonstrated**
Feature	Tech Used	Purpose
```bash
Password Hashing	Java + SHA-256/BCrypt	Secure authentication
External Jar Usage	jBCrypt	Learn library handling
```




