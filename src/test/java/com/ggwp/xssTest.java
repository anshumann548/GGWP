package com.ggwp;

import org.testng.annotations.Test;
import org.testng.Assert; // Make sure this is the import

public class xssTest {

    @Test(priority = 2, dependsOnMethods = "com.ggwp.RegistrationTest.testRegistration", description = "testing xss in email field")
    public void testXss() {
      
        Loginxss scripter = new Loginxss(); // Create a new instance and call the constructor
        scripter.loginxss();
        boolean result = scripter.result;
        Assert.assertTrue(result , "XSS test passed");
    }

}
