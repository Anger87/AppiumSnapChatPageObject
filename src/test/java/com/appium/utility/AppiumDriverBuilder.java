package com.appium.utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class AppiumDriverBuilder {
    //    TODO - read capabilities from cap.properties file
    private static final String APK_PATH = System.getProperty("user.dir") + "\\app\\AUTO.apk";
    private static final String DEVICE = "HIEEGY6SPBKJ4S9H";
    private static final String WAIT_ACTIVITIES
            = "com.ria.auto.SearchForm.SearchFormActivity, " +
            "com.ria.auto.RiaGifAnimationActivity, " +
            "com.ria.auto.AdvertViewNewAutoActivity, " +
            "com.ria.auto.AdvertViewOldAutoActivity";
    private static final String ACTIVITY = "com.ria.auto.SearchForm.SearchFormActivity";
    private static final String PACKEGE = "com.ria.auto";
    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";
    AndroidDriver driver;

    public AppiumDriver build() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE);
//        capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, WAIT_ACTIVITIES);
//        capabilities.setCapability(MobileCapabilityType.APP, APK_PATH);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, PACKEGE);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ACTIVITY);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);

        return driver = new AndroidDriver(new URL(APPIUM_URL), capabilities);
    }

}
