package com.appium.tests;

//import com.appium.config.ReadProperties;

import com.appium.config.ReadProperties;
import com.appium.config.UserCredentials;
import com.appium.pages.*;
import com.appium.utility.AppiumDriverBuilder;
import com.appium.utility.InitScreens;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class BaseTest {

    public Logger logger = Logger.getLogger(BaseTest.class);
    SoftAssert softAssert ;
    protected AppiumDriver driver;
    protected LandingPage landingPage;
    protected LoginPage loginPage;
    protected NeonHeaderPage neonHeaderPage;
    protected PopUpPage popUpPage;
    protected ProfilePage profilePage;
    protected SettingsPage settingsPage;

    public UserCredentials userCredentials;
    ReadProperties user = new ReadProperties();

    @BeforeSuite
    public void connect() throws Exception {

        this.driver = new AppiumDriverBuilder().build();

        // init for new page class
        InitScreens app = new InitScreens(driver);
        landingPage = app.landingPage();

        //init User credentials
        user.initProperty("user.properties");
        userCredentials = new UserCredentials(user.getPropValue("login"), user.getPropValue("password"));
    }

    @BeforeMethod
    public void beforeMethod(Method testMethod, ITestContext testContext) {
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
