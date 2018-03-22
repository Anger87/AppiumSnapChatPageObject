package com.appium.utility;

import com.appium.config.ReadProperties;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppiumDriverBuilder {
    //    TODO - read capabilities from cap.properties file

    AndroidDriver driver;
    ReadProperties capProperties = new ReadProperties();

    public AppiumDriver build() throws Exception {

        capProperties.initProperty("emulatorCapability.properties");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, capProperties.getPropValue("platformVersion"));
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, capProperties.getPropValue("deviceName"));
//        capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, WAIT_ACTIVITIES);
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + capProperties.getPropValue("apk_path"));
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, capProperties.getPropValue("appPackage"));
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, capProperties.getPropValue("appActivity"));
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);

        return driver = new AndroidDriver(new URL(capProperties.getPropValue("URL")), capabilities);
    }

}
