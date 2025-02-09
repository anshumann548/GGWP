# Automation Test Project

## Description
This project is a Selenium-based automation testing framework designed for testing web applications. It includes functionalities for logging in and making purchases on a demo web shop.

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/anshumann548
   cd selenium-test
   ```
2. Make sure you have [Maven](https://maven.apache.org/install.html) installed.
3. Install the required dependencies by running:
   ```bash
   mvn install
   ```
4. Set the path to your ChromeDriver in the `DriverFactory.java` file.

## Important Note
- The inclusion of `config.properties` under the `src/main/resources` folder is mandatory for this script to work.
- Each time the tests are run, new credentials are required because using an already registered email will be considered a failed test scenario.

## Usage
- To run the tests, you can use the following command:
  ```bash
  mvn clean test
  ```
- The tests will execute the 
Register , login and purchase functionalities in  on the demo web shop.
Xss attack test on Login form fields.

## Running Tests
- Tests are located in the `src/test/java/com/ggwp` directory.
- You can add more test cases as needed.
