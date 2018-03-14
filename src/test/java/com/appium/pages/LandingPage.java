package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.CommentPageObjects;
import com.appium.page.objects.LandingPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends CommonAppiumTest {

    LandingPageObjects landingPageObjects = new LandingPageObjects();

    public LandingPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), landingPageObjects);
    }

//    TODO - tap on Element method
    public void clickIndicator() {
        landingPageObjects.Indicator.click();
    }



}
