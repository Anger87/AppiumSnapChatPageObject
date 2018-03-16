package com.appium.tests;

import com.appium.pages.LandingPage;
import com.appium.pages.SearchCarPage;
import com.appium.pages.Toolbar;
import com.appium.utility.AppiumDriverBuilder;
import com.appium.utility.InitScreens;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected AppiumDriver driver;
    protected LandingPage landingPage;
    protected SearchCarPage searchCarPage;
    protected Toolbar toolbar;

    @BeforeSuite
    public void connect() throws Exception {

        this.driver = new AppiumDriverBuilder().build();

        // init for new page class
        InitScreens app = new InitScreens(driver);
//        landingPage= app.landingPage();
        searchCarPage = app.searchOldCarPage();
        toolbar = app.Toolbar();
    }

    @AfterSuite
    public void shutDown() {
        driver.resetApp();
    }

}
