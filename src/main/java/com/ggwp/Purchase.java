package com.ggwp;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Purchase {

    private WebDriver driver;
    private Locators locators;

    public void purchase() {
        driver = DriverFactory.getdriver();
        locators = new Locators();
        PropertyLoader.loadProperties();
        Properties properties = PropertyLoader.getProperty();

        // Step 1: Navigate to the login page and log in
        Login logger = new Login();
        logger.login(driver);

        // Step 2: Navigate to the Books section
        driver.navigate().to("https://demowebshop.tricentis.com/books");

        // Step 3: Click on "Add to cart" for a specific product
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.addToCartButton));
        driver.findElement(locators.addToCartButton).click();

        // Step 4: Wait for a moment to ensure the action is completed
        pauseExecution(3000); // Optional: wait for 3 seconds

        // Step 5: Navigate to the cart
        driver.get(locators.Carturl);

        // Step 6: Agree to the terms and conditions checkbox
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.termsofservice));
        driver.findElement(locators.termsofservice).click();
        driver.findElement(locators.checkoutButton).click();

        // Step 7: Fill in billing information
        driver.findElement(locators.companyField).sendKeys(properties.getProperty("companyName"));
        driver.findElement(locators.countryDropdown).click();

        // Step 8: Select country using keyboard actions
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform(); // Press down key once
        actions.sendKeys(Keys.ARROW_DOWN).perform(); // Press down key again
        actions.sendKeys(Keys.ENTER).perform(); // Press enter to select the country

        // Fill in other fields
        driver.findElement(locators.cityField).sendKeys(properties.getProperty("billingCity"));
        driver.findElement(locators.address1Field).sendKeys(properties.getProperty("billingAddress1"));
        driver.findElement(locators.address2Field).sendKeys(properties.getProperty("billingAddress2"));
        driver.findElement(locators.zipField).sendKeys(properties.getProperty("billingZip"));
        driver.findElement(locators.phoneField).sendKeys(properties.getProperty("billingPhone"));
        driver.findElement(locators.faxField).sendKeys(properties.getProperty("billingFax"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.continueButton));
        driver.findElement(locators.continueButton).click();

        // Step 9: Continue 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shipping-buttons-container']/input")));
        driver.findElement(By.xpath("//*[@id='shipping-buttons-container']/input")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shipping-buttons-container']/input")));
        driver.findElement(By.xpath("//*[@id='shipping-buttons-container']/input")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shipping-buttons-container']/input")));
        driver.findElement(By.xpath("//*[@id='shipping-buttons-container']/input")).click();

        String currentUrl = driver.getCurrentUrl();

        // Clean up
        if (driver != null) {
            driver.quit();
        }
    }

    private void pauseExecution(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
