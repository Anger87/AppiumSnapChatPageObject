package com.appium.pages;

import com.appium.page.objects.PopUpPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class PopUpPage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(PopUpPage.class);
    PopUpPageObjects popUpPageObjects = new PopUpPageObjects();


    public PopUpPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), popUpPageObjects);
        waitForElementToLoad(popUpPageObjects.AlertDialogButtonsContainer);
    }

    public String getAllertMessage(){
        return popUpPageObjects.DescriptionText.getText();
    }

    public LandingPage clickYesButton(){
        logger.info("PopUp click Log Out Button");
        popUpPageObjects.YesButton.click();
        return new LandingPage(driver);
    }



}
