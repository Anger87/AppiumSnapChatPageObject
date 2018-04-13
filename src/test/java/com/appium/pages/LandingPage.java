package com.appium.pages;

import com.appium.page.objects.LandingPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(LandingPage.class);
    LandingPageObjects landingPageObjects = new LandingPageObjects();

    public LandingPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), landingPageObjects);
        waitForElementToLoad(landingPageObjects.LoginButton);
    }

    public LoginPage clickLoginButton(){
        logger.info("LandingPage click Login Button");
        landingPageObjects.LoginButton.click();
        return new LoginPage(driver);
    }



}
