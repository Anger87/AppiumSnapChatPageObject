package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.SearchCarObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SearchCarPage extends CommonAppiumTest {

    public Logger logger = Logger.getLogger(SearchCarPage.class);
    SearchCarObjects searchCarObjects = new SearchCarObjects();

    public SearchCarPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), searchCarObjects);
        waitForPageToLoad(searchCarObjects.FormMain);
    }

    public void clickCategory() {
        logger.info("Click on Category element on Search ");
        searchCarObjects.SelectCategory.click();
    }

}
