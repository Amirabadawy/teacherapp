package com.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Login extends BaseScreen{
    public Login(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "emailView")
    private WebElement emailField;

    @AndroidFindBy(id = "passwordView")
    private WebElement passwordField;

    @AndroidFindBy(id = "buttonLogin")
    private WebElement loginButton;


    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickOnLoginButton(){
        loginButton.click();
    }

}
