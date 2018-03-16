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
    private static final String APK_PATH = "d:\\Java\\automation";
    private static final String APK = "AUTO.apk";
    private static final String DEVICE = "emulator-5554";
    private static final String WAIT_ACTIVITIES
            = "com.ria.auto.SearchForm.SearchFormActivity, " +
            "com.ria.auto.RiaGifAnimationActivity, " +
            "com.ria.auto.AdvertViewNewAutoActivity, " +
            "com.ria.auto.AdvertViewOldAutoActivity";
    private static final String ACTIVITY="com.ria.auto.SearchForm.SearchFormActivity";
    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";
    AndroidDriver driver;

    public AppiumDriver build() throws Exception {

        File appDir = new File(APK_PATH);
        File app = new File(appDir, APK);
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE);
//        capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, WAIT_ACTIVITIES);
        capabilities.setCapability("appPackage", "com.ria.auto");
        capabilities.setCapability("appActivity", ACTIVITY);

        return driver = new AndroidDriver(new URL(APPIUM_URL), capabilities);
    }

}
