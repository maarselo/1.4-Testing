# 🛠️ 1.4-Testing

A complete set of exercises focused on unit testing in Java using JUnit and AssertJ.  
This project demonstrates Test-Driven Development (TDD) practices and various testing techniques to ensure code quality and reliability.

## 📄 Description - Exercise Statement

This repository contains the full solution for **Sprint 1 - JUnit Testing** of the Java programming track.  
The sprint is divided into three levels, each focusing on different testing techniques:

### 🧪 Level 1: JUnit Basics

**Exercise 1**  
Implements a `Library` class to manage book collections with tests verifying all required functionalities.

**Exercise 2**  
Creates a `CalculoDni` class that calculates DNI letters with parameterized tests for validation.

**Exercise 3**  
Demonstrates testing for `ArrayIndexOutOfBoundsException`.

### 🔍 Level 2: AssertJ Assertions

Exercises 1-7 cover various AssertJ assertions including:
- Primitive value comparisons
- Object reference comparisons
- Array validations
- Collection assertions
- Map validations
- Exception testing
- Optional object testing

### 🚀 Level 3: Test-Driven Development

Implements a `Calculadora` class using TDD methodology:
- Tests written before implementation
- Iterative development process
- Continuous refactoring

## 💻 Technologies Used
- Java (SDK 17+)
- JUnit 5
- AssertJ
- Gradle (build tool)
- IntelliJ IDEA (used for development)

## 📋 Requirements
Before running this project, make sure you have:
- Java SDK **17+** or higher
- Gradle 7.0+
- IntelliJ IDEA or Eclipse (recommended)
- Git (optional, for cloning the repository)

## 🛠️ Installation

To run this project, you **must first clone the repository locally**. Otherwise, you won't be able to open it correctly in IntelliJ IDEA.
To get a local copy of the project:

```bash
# Clone this repository
https://github.com/maarselo/1.4-Testing.git

# Navigate into the project directory
cd 1.4-Testing.git/
```

### 📥 Cloning and Opening in IntelliJ IDEA

1. Open **IntelliJ IDEA**.
2. On the welcome screen, click **"Clone Repository"** (Get from Version Control).
3. Paste the following URL into the **URL** field:
```bash
git clone https://github.com/maarselo/1.4-Testing.git
```
4. Choose the folder where the project should be saved.
5. Click **Clone**.

 if you already have it cloned, click on `Open` and select the local copy to open it. 

 ## ▶️ Running the Project

This is a Gradle project. To run the tests::

1. Open the project in IntelliJ IDEA
2. Let Gradle sync and download dependencies automatically
3. To run all tests:
·Right-click on the `src/test` folder
·Select `Run 'All Tests'`
4. To run specific tests:
   ·Open any test class
   ·Click the green Run button next to the test class/method

Command line alternative:
```bash
  ./gradle test
```

## 🌐 Deployment

This project is intended to run in a **local development environment** only.  
No production deployment configuration has been defined.

In the future, it could be extended into a GUI or web-based application for a better user experience.

## 🤝 Contributions

Contributions are welcome! If you’d like to collaborate:

1. Fork this repository.
2. Create a new branch:  
 `git checkout -b feature/YourFeatureName`
3. Make your changes and commit them:  
 `git commit -m "Add: Your meaningful commit message"`
4. Push your branch to your fork:  
 `git push origin feature/YourFeatureName`
5. Open a pull request with a clear description of your changes.

Thanks for your interest and support! 🚀
