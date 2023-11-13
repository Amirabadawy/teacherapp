package com.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Landing extends BaseScreen {
    @AndroidFindBy(id = "buttonSignIn")
    private WebElement getStarted;


    public Landing(AndroidDriver driver) {
        super(driver);
    }

    public void clickOnGetStarted(){
        getStarted.click();
    }
}
