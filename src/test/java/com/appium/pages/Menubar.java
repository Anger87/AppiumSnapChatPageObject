package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.MenubarObjects;
import com.appium.page.objects.SearchCarObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class Menubar extends CommonAppiumTest {

    MenubarObjects menubarObjects = new MenubarObjects();
    public Logger logger = Logger.getLogger(Menubar.class);

    public Menubar(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), menubarObjects);
        waitForPageToLoad(menubarObjects.Menu);
    }

    public ProfilePage clickProfile(){
        logger.info("Click Profile");
        menubarObjects.Profile.click();
        return new ProfilePage(driver);
    }

}
