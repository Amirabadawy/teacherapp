package com.tests.create_course;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/tests/create_course/teacher.feature",
        glue = {"com.tests"},
        plugin = {"pretty","html:reports/cucumber-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
public class TeacherTestRunner extends AbstractTestNGCucumberTests {

}
