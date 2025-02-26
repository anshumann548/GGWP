package com.ggwp;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Login {

    private Locators locators;

    public void login(WebDriver driver) {
    
        locators = new Locators();
        PropertyLoader.loadProperties();
        Properties properties = PropertyLoader.getProperty();

        // Step 1: Navigate to the login page and log in
        driver.navigate().to("https://demowebshop.tricentis.com/login");
        driver.findElement(locators.emailField).sendKeys(properties.getProperty("email"));
        driver.findElement(locators.passwordField).sendKeys(properties.getProperty("password"));
        driver.findElement(locators.loginButton).click();

    }
}
