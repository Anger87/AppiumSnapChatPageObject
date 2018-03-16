package com.appium.utility;

import com.appium.pages.LandingPage;
import com.appium.pages.SearchCarPage;
import com.appium.pages.Toolbar;
import io.appium.java_client.AppiumDriver;


public class InitScreens {

    private AppiumDriver driver;

    public InitScreens(AppiumDriver driver) {
        this.driver = driver;
    }

    public LandingPage landingPage() {
        return new LandingPage(driver);
    }

    public SearchCarPage searchOldCarPage(){
    return new SearchCarPage(driver);
    }

    public Toolbar Toolbar(){
        return new Toolbar(driver);
    }

}
