package com.tests.create_course;

import com.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TeacherStepDefs extends BaseTest {

    @Given("click on get started button")
    public void clickOnCourseIcon(){
        device.teacherApp.landing.clickOnGetStarted();
    }

    @When("login with valid email {string} and valid password {string} in login page")
    public void loginWithValidEmailAndPassword(String email, String password){
        device.teacherApp.login.enterEmail(email);
        device.teacherApp.login.enterPassword(password);
    }

    @When("click on login button in login page")
    public void clickOnLogin(){
        device.teacherApp.login.clickOnLoginButton();
    }

    @When("click on skip button in home page")
    public void clickOnSkip(){
        device.teacherApp.home.clickOnSkipButton();
    }

    @When("click on mobile course in home page")
    public void clickOnMobileCourse(){
        device.teacherApp.home.clickOnMobileCourse();
    }
    @When("click on member tab in course page")
    public void clickOnMemberTab(){
        device.teacherApp.course.clickOnMemberTab();
    }

    @When("click on skip button in course page")
    public void clickOnSkipButton(){
        device.teacherApp.course.clickOnSkipButton();
    }

    @When("click on Test Student in course page")
    public void clickOnTestStudent(){
        device.teacherApp.course.clickOnTestStudent();
    }

    @Then("title should be {string}")
    public void checkTitleInCourseScreen(String title){
        Assert.assertEquals(device.teacherApp.course.getTitleButton(),title);
    }

}
