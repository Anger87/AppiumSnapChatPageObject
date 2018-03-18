package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.ToolbarObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class Toolbar extends CommonAppiumTest {
    public Logger logger = Logger.getLogger(Toolbar.class);
    ToolbarObjects toolbarObjects = new ToolbarObjects();

    public Toolbar(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), toolbarObjects);
        waitForPageToLoad(toolbarObjects.Menu);
    }

    public Menubar clickMenu(){
        logger.info("Click on Menu at Toolbar");
        tapElement(toolbarObjects.Menu);
        return new Menubar(driver);
    }

}
