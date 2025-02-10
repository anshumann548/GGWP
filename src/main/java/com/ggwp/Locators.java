package com.ggwp;

import org.openqa.selenium.By;

public class Locators {
  
    public final String Baseurl = "https://demowebshop.tricentis.com/register";
    public final String Carturl = "https://demowebshop.tricentis.com/cart";
    public final String completedurl = "https://demowebshop.tricentis.com/checkout/completed/";
    public By firstNameField = By.id("FirstName");
    public By lastNameField = By.id("LastName");
    public By emailField = By.id("Email");
    public By passwordField = By.id("Password");
    public By loginButton = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
    public By confirmPasswordField = By.id("ConfirmPassword");
    public By registerButton = By.id("register-button");
    public By termsofservice = By.id("termsofservice"); 
    public By booksLink = By.linkText("Books");
    public By addToCartButton = By.cssSelector("input.button-2.product-box-add-to-cart-button");
    public By cartUrl = By.id("cart"); 
    public By companyField = By.id("BillingNewAddress_Company");
    public By countryDropdown = By.id("BillingNewAddress_CountryId");
    public By cityField = By.id("BillingNewAddress_City");
    public By address1Field = By.id("BillingNewAddress_Address1");
    public By address2Field = By.id("BillingNewAddress_Address2");
    public By zipField = By.xpath("//*[@id=\'BillingNewAddress_ZipPostalCode\']");
    public By phoneField = By.id("BillingNewAddress_PhoneNumber");
    public By faxField = By.id("BillingNewAddress_FaxNumber");
    public By continueButton = By.xpath("//*[@title='Continue']");
    public By shippingMethodLabel = By.cssSelector("label[for='shippingoption_0']");
    public By paymentMethodLabel = By.cssSelector("label[for='paymentmethod_0']");
    public By checkoutButton = By.id("checkout");
}
