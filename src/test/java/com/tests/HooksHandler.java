package com.tests;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.driver.AndroidManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;

public class HooksHandler extends BaseTest {

    @Before()
    public void setUp() throws IOException {
        device.launchApp();
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Screenshot()).build());
        }
    }

//    @After()
//    public void tearDown() throws IOException {
//        device.closeApp();
//        device.clearApp();
//    }

    public String getBase64Screenshot() {
        return ((TakesScreenshot) AndroidManager.getAndroidManager().getDriver()).getScreenshotAs(OutputType.BASE64);

    }

}
