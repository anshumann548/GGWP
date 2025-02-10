package com.ggwp;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Registration {

    private WebDriver driver;
    private Locators locators;

    public void register() {
        driver = DriverFactory.getdriver();
        locators = new Locators();

        PropertyLoader.loadProperties();
        Properties properties = PropertyLoader.getProperty();

        driver.get(locators.Baseurl);

        driver.findElement(locators.firstNameField).sendKeys(
                properties.getProperty("firstName"));
        driver.findElement(locators.lastNameField).sendKeys(
                properties.getProperty("lastName"));
        driver.findElement(locators.emailField).sendKeys(
                properties.getProperty("email"));
        driver.findElement(locators.passwordField).sendKeys(
                properties.getProperty("password"));
        driver.findElement(locators.confirmPasswordField).sendKeys(
                properties.getProperty("password"));

        driver.findElement(locators.registerButton).click();
    
        driver.quit();
    }


}
