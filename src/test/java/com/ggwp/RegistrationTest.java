package com.ggwp;

import org.testng.annotations.Test;

public class RegistrationTest {

    @Test(priority = 1, description = " Register ")
    public void testRegistration() {
        Registration registration = new Registration(); // Create a new instance and call the constructor
        Purchase purchaser = new Purchase();
        registration.register();
        purchaser.purchase();

    }
}
