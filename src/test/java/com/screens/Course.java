package com.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Course extends BaseScreen{
    public Course(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "members_tab")
    private WebElement memberTab;

    @AndroidFindBy(id = "imageViewPhoto")
    private WebElement testStudent;

    @AndroidFindBy(id = "recyclerViewMembers")
    private WebElement skipButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement titleButton;


    public void clickOnMemberTab(){
        memberTab.click();
    }

    public void clickOnSkipButton(){
        skipButton.click();
    }

    public void clickOnTestStudent(){
        testStudent.click();
    }

    public String getTitleButton() {
        return titleButton.getText();
    }

}