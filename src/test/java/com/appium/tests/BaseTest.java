package com.appium.tests;

import com.appium.pages.*;
import com.appium.utility.AppiumDriverBuilder;
import com.appium.utility.InitScreens;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BaseTest {
    public Logger logger = Logger.getLogger(BaseTest.class);
    protected AppiumDriver driver;
    protected LandingPage landingPage;
    protected SearchCarPage searchCarPage;
    protected Toolbar toolbar;
    protected Menubar menubar;
    protected ProfilePage profilePage;

    @BeforeSuite
    public void connect() throws Exception {

        this.driver = new AppiumDriverBuilder().build();

        // init for new page class
        InitScreens app = new InitScreens(driver);
//        landingPage= app.landingPage();
        searchCarPage = app.searchOldCarPage();
        toolbar = app.Toolbar();
    }

    @BeforeMethod
    public void beforeMethod(Method testMethod, ITestContext testContext){
        String className = testMethod.getDeclaringClass().getSimpleName();
        String methodName = testMethod.getName();
        String testName = testContext.getName();
        logger.info("\n\n:::\nStarting test: " + testName + "." + className + "." + methodName);
    }

    @AfterSuite
    public void shutDown() {
        driver.resetApp();
    }

}
