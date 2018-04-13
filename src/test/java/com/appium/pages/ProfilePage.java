package com.appium.pages;

import com.appium.page.objects.ProfilePageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(ProfilePage.class);
    ProfilePageObjects profilePageObjects = new ProfilePageObjects();


    public ProfilePage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), profilePageObjects);
        waitForElementToLoad(profilePageObjects.ProfileContainer);
    }

    public SettingsPage clickSettingButton(){
        logger.info("ProfilePage click Settings Button");
        profilePageObjects.SettingButton.click();
        return new SettingsPage(driver);
    }

    public String getFullName(){
        logger.info("ProfilePage get FullName");
        return profilePageObjects.FullName.getText();
    }

    public String getUserName(){
        logger.info("ProfilePage get UserName");
        return profilePageObjects.UserName.getText();
    }

}
