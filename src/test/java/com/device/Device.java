package com.device;

import com.ConfigHandler;
import com.TeacherApp;
import com.driver.AndroidManager;
import java.io.IOException;
import java.util.Properties;

public class Device {
    private static Properties androidProperties;
    private final AndroidManager androidManager = AndroidManager.getAndroidManager();
    public TeacherApp teacherApp = new TeacherApp(androidManager.getDriver());
    public String appPackage = ConfigHandler.getAndroidProperties().getProperty("appPackage");
    public String appActivity = ConfigHandler.getAndroidProperties().getProperty("appActivity");

    public void launchApp() throws IOException {
        Runtime.getRuntime().exec("adb shell am start -n " + appPackage + "/" + appActivity);
    }

    public void clearApp() throws IOException {
        Runtime.getRuntime().exec("adb shell pm clear " + appPackage);
    }

    public void closeApp() throws IOException {
        Runtime.getRuntime().exec("adb shell am force-stop " + appPackage);
    }
}
