package com.appium.pages;

import com.appium.page.objects.LoginPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(LoginPage.class);
    LoginPageObjects loginPageObjects = new LoginPageObjects();

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
        waitForPageToLoad(loginPageObjects.LoginForm);
    }

    public NeonHeaderPage logIn(String username, String password) {
        logger.info("LoginPage Entering UserName: " + username);
        loginPageObjects.UserName.setValue(username);

        logger.info("LoginPage Entering Password: " + password);
        loginPageObjects.Password.setValue(password);

        logger.info("LoginPage click Login Button");
        loginPageObjects.LogInButton.click();

        return new NeonHeaderPage(driver);
    }


}
