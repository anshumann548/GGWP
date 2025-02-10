package com.ggwp;

import org.testng.annotations.Test;
import org.testng.Assert; // Make sure this is the import


public class RegistrationTest {
Locators locators = new Locators();
    @Test(priority = 1, description = " Register ")
    public void testRegistration() {
        Registration registration = new Registration(); // Create a new instance and call the constructor
        Purchase purchaser = new Purchase();
        registration.register();
        purchaser.purchase();

        Assert.assertTrue(purchaser.isUrlValid);

    }
}
