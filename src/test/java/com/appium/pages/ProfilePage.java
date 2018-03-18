package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.ProfilePageObjects;
import com.appium.page.objects.ToolbarObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends CommonAppiumTest {
    public Logger logger = Logger.getLogger(ProfilePage.class);
    ProfilePageObjects profilePageObjects = new ProfilePageObjects();

    public ProfilePage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), profilePageObjects);
        waitForPageToLoad(profilePageObjects.LoginForm);
    }

    public void clickSignInByEmail(){
        logger.info("Click Sign in by Email");
        profilePageObjects.SigninButton.click();
    }
}
