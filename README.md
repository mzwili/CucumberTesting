# 🧪 CucumberTraining

A Java-based automation testing framework built using **Cucumber**, **Selenium WebDriver**, and **JUnit**.  
This project demonstrates BDD-style (Behavior Driven Development) test automation with reusable, scalable, and readable test scenarios.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Running Tests](#running-tests)
- [Generating Reports](#generating-reports)
- [Sample Command Usage](#sample-command-usage)
- [Contributing](#contributing)
- [License](#license)

---

## 📖 Overview

This project uses **Cucumber** for BDD-style test definitions and **Selenium WebDriver** for browser automation.  
**JUnit** serves as the test runner, and **Maven** manages dependencies and report generation.

Key objectives:
- Automate end-to-end UI test scenarios
- Support readable test cases using Gherkin syntax
- Generate detailed HTML reports
- Ensure maintainability and reusability

---

## 🧰 Tech Stack

| Component | Description |
|------------|-------------|
| **Language** | Java 8 |
| **Build Tool** | Maven |
| **Testing Framework** | Cucumber (v7.16.1) |
| **Automation Library** | Selenium WebDriver (v4.19.1) |
| **Dependency Injection** | PicoContainer |
| **Test Runner** | JUnit (v4.13.2) |
| **Reports** | Maven Cucumber Reporting Plugin |

---

## 📂 Project Structure

CucumberTraining/
│
├── src/
│ ├── main/java/ # Application source (if any)
│ └── test/java/
│ ├── stepDefinitions/ # Cucumber step definition classes
│ ├── pageObjects/ # Page Object Model classes
│ ├── runners/ # Test runner classes
│ └── features/ # Gherkin feature files (.feature)
│
├── pom.xml # Maven configuration file
└── README.md # Project documentation

---

## ⚙️ Installation

### Prerequisites
Ensure you have the following installed:
- **Java 8** or higher
- **Maven 3.6+**
- **Git**
- **Browser Drivers** (e.g., ChromeDriver or GeckoDriver)

### Clone the Repository Install Dependencies

git clone https://github.com/<your-username>/CucumberTraining.git
cd CucumberTraining
### Install Dependencies


mvn clean install

🚀 Running Tests
Run all test scenarios using Maven:

mvn test
Or specify a particular runner class:

mvn -Dtest=TestRunner test

📊 Generating Reports
After execution, the Cucumber JSON files will be automatically used by the Maven Cucumber Reporting Plugin to generate an HTML report.

Generate Report Manually:

mvn verify
Default Report Location:
target/cucumber-html-reports/


| Command       | Description                                 |
| ------------- | ------------------------------------------- |
| `mvn clean`   | Cleans previous builds                      |
| `mvn test`    | Executes the Cucumber test suite            |
| `mvn verify`  | Generates HTML reports after test execution |
| `mvn install` | Compiles and installs dependencies          |


🤝 Contributing
Fork the repository

Create your feature branch (git checkout -b feature/your-feature)

Commit your changes (git commit -m 'Add new feature')

Push to the branch (git push origin feature/your-feature)

Open a Pull Request

📄 License
This project is open-source and available under the MIT License.

🧠 Author
Mzwili Mthiyane
Software Quality Assurance Engineer
🔗 LinkedIn | GitHub
```bash






