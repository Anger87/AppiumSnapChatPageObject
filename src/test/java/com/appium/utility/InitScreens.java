package com.appium.utility;

import com.appium.pages.LandingPage;
import io.appium.java_client.AppiumDriver;


public class InitScreens {

    private AppiumDriver driver;

    public InitScreens(AppiumDriver driver) {
        this.driver = driver;
    }

    public LandingPage landingPage() {
        return new LandingPage(driver);
    }



}
