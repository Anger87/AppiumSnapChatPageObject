package com.appium.pages;

import com.appium.page.objects.SettingsPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(SettingsPage.class);
    SettingsPageObjects settingsPageObjects = new SettingsPageObjects();


    public SettingsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), settingsPageObjects);
        waitForPageToLoad(settingsPageObjects.SettingsView);
    }

    public PopUpPage clickLogOutButton(){
        logger.info("SettingsPage click Log Out Button");
        settingsPageObjects.LogOutButton.click();
        return new PopUpPage(driver);
    }

    public String getFullName(){
        logger.info("SettingsPage get FullName");
        return settingsPageObjects.FullName.getText();
    }

    public String getUserName(){
        logger.info("SettingsPage get UserName");
        return settingsPageObjects.UserName.getText();
    }

    public void scrollToLogOutButton(){
        logger.info("Scrolling the veiew until LogOut button shown");
        scrollToElementById("com.snapchat.android:id/account_actions_logout");
    }

}
