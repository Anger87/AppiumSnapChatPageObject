package com.appium.pages;

import com.appium.page.objects.NeonHeaderPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class NeonHeaderPage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(NeonHeaderPage.class);
    NeonHeaderPageObjects neonHeaderPageObjects = new NeonHeaderPageObjects();


    public NeonHeaderPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), neonHeaderPageObjects);
        waitForElementToLoad(neonHeaderPageObjects.NeonHeader);
    }

    public ProfilePage clickProfileButton(){
        logger.info("NeonHeaderPage click Profile Button");
        neonHeaderPageObjects.ProfileButton.click();
        return new ProfilePage(driver);
    }



}
