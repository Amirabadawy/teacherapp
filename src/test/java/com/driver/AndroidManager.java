package com.driver;

import com.ConfigHandler;
import com.tests.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class AndroidManager extends BaseTest {
    private static Properties properties;
    private static UiAutomator2Options options;
    private static AndroidManager androidManager = null;
    private AndroidDriver driver;

    private AndroidManager() {
        setAndroidDriver();
    }

    public static AndroidManager getAndroidManager() {
        if (androidManager == null)
            androidManager = new AndroidManager();
        return androidManager;
    }


    public AndroidDriver getDriver() {
        return driver;
    }


    public void setAndroidDriver() {
        try {
            ConfigHandler.setAndroidProperties();
            properties = ConfigHandler.getAndroidProperties();
            setMobileDesiredCapabilities();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void setMobileDesiredCapabilities() throws IOException {
        String appDirectory = getAppDirectory();
        options = new UiAutomator2Options()
                .setApp(appDirectory)
                .setPlatformName(properties.getProperty("platformName"))
                .setPlatformVersion(properties.getProperty("platformVersion"))
                .setAppPackage(properties.getProperty("appPackage"))
                .setAppActivity(properties.getProperty("appActivity"))
                .setDeviceName(properties.getProperty("deviceName"))
                .setAutomationName(properties.getProperty("automationName"));
    }

    private static String getAppDirectory() throws IOException {
        File app = new File(properties.getProperty("app"));
        String appDirectory = app.getCanonicalPath();
        return appDirectory;
    }
}
