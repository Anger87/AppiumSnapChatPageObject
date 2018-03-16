package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.SearchCarObjects;
import com.appium.page.objects.ToolbarObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Toolbar extends CommonAppiumTest {

    ToolbarObjects toolbarObjects = new ToolbarObjects();

    public Toolbar(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), toolbarObjects);
        waitForPageToLoad(toolbarObjects.Menu);
    }

    public void clickMenu(){
        tapElement(toolbarObjects.Menu);
        swipeLeft();
    }

}
