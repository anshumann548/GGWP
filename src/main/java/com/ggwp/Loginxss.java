package com.ggwp;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Loginxss {

    private WebDriver driver;
    private Locators locators;
    public boolean result;
    public void loginxss() {
        driver = DriverFactory.getdriver();
        locators = new Locators();
        PropertyLoader.loadProperties();
        Properties properties = PropertyLoader.getProperty();

        // Step 1: Navigate to the login page and log in
        driver.navigate().to("https://demowebshop.tricentis.com/login");
        driver.findElement(locators.emailField).sendKeys(properties.getProperty("xssPayload"));
        driver.findElement(locators.passwordField).sendKeys(properties.getProperty("password"));
        driver.findElement(locators.loginButton).click();
        result = driver.getCurrentUrl().contains("https://demowebshop.tricentis.com/login"); // Check if the current url is still /login


    }
public void quit() {
    driver.quit();
}
}