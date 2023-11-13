package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigHandler {

    private static Properties androidProperties;
    public static final String ANDROID_CONFIG_PATH = "src/test/resources/config-android.properties";


    public static void setAndroidProperties() throws IOException {
        androidProperties = new Properties();
        androidProperties.load(new FileInputStream(ANDROID_CONFIG_PATH));
    }


    public static Properties getAndroidProperties() {
        return androidProperties;
    }
}
