package com.ggwp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    // Path to the ChromeDriver executable , it needed to be  replaced with  the actual path  of chromedriver executable in your system
    // you can specify any type of browser like this  by adding their respective path and use them in place of ChromeDriver 
    private static final String CHROME_DRIVER_PATH = "/home/anshumann/Desktop/chromedriver/chromedriver";

    public static WebDriver driver;

    public static WebDriver getdriver() {
        // Set the system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);

        // Create a new instance of ChromeDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-save-password-bubble");

        // Return the configured WebDriver instance
        return new ChromeDriver(options);
    }
}
