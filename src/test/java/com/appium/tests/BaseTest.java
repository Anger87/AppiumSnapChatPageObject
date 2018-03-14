package com.appium.tests;

import com.appium.pages.LandingPage;
import com.appium.utility.AppiumDriverBuilder;
import com.appium.utility.InitScreens;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected AppiumDriver driver;
    protected InitScreens app;
    protected LandingPage landingPage;

    @BeforeSuite
    public void connect() throws Exception {

        this.driver = new AppiumDriverBuilder().build();

        // init for new page class
        InitScreens app = new InitScreens(driver);
        landingPage= app.landingPage();
    }

    @AfterSuite
    public void shutDown(){
        driver.resetApp();
    }

}
