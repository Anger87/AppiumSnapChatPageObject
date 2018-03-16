package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.SearchCarObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SearchCarPage extends CommonAppiumTest {

    SearchCarObjects searchCarObjects = new SearchCarObjects();

    public SearchCarPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), searchCarObjects);
        waitForPageToLoad(searchCarObjects.FormMain);
    }

    public void clickCategory(){
        searchCarObjects.SelectCategory.click();
        searchCarObjects.SelectCategory.click();
    }

}
