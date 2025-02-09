# Selenium Test Project

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
   git clone <repository-url>
   cd selenium-test
   ```
2. Make sure you have [Maven](https://maven.apache.org/install.html) installed.
3. Install the required dependencies by running:
   ```bash
   mvn install
   ```
4. Set the path to your ChromeDriver in the `DriverFactory.java` file.

## Usage
- To run the tests, you can use the following command:
  ```bash
  mvn test
  ```
- The tests will execute the login and purchase functionalities on the demo web shop.

## Running Tests
- Tests are located in the `src/test/java/com/ggwp` directory.
- You can add more test cases as needed.

## License
This project is licensed under the MIT License.
