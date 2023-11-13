package com;

import com.screens.*;
import io.appium.java_client.android.AndroidDriver;

public class TeacherApp {

    public Landing landing;
    public Login login;
    public Course course;

    public Home home;

    public TeacherApp(AndroidDriver driver){
        this.landing = new Landing(driver);
        this.login = new Login(driver);
        this.home = new Home(driver);
        this.course = new Course(driver);
    }

}
