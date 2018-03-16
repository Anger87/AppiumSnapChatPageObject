package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.CommentPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CommentPage extends CommonAppiumTest {

    CommentPageObjects commentPageObjects = new CommentPageObjects();

    public CommentPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), commentPageObjects);
    }

    public CommentPage selectTopic() {
        commentPageObjects.SELECT_TOPIC.get(0).click();
        return new CommentPage(driver);
    }



}
