package com.appium.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class CommonAppiumTest {
    public AppiumDriver driver;
    Logger logger = Logger.getLogger(CommonAppiumTest.class);

    public CommonAppiumTest(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void waitForPageToLoad(WebElement id) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(id));
    }

    public void waitForElementToDisAppear(String id) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
    }

    public WebElement waitForElement(WebElement arg) {
        waitForPageToLoad(arg);
        WebElement el = arg;
        return el;
    }

    public void swipeRightUntilLogOutScreen() {
        do {
            swipeRight();
        } while (!isElementPresent(By.id("org.wordpress.android:id/me_login_logout_text_view")));
    }

    //TODO - delete try catch, add isdisplayed
    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public void swipeLeftUntilTextExists(String expected) {
        do {
            swipeLeft();
        } while (!driver.getPageSource().contains(expected));
    }

    public void swipeRight() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.9);
        int endx = (int) (size.width * 0.20);
        int starty = size.height / 2;
        new TouchAction(driver).press(startx, starty)
                .waitAction(Duration.ofSeconds(2))
                .moveTo(endx, starty).release().perform();
    }

    public void swipeLeft() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.8);
        int endx = (int) (size.width * 0.20);
        int starty = size.height / 2;
        new TouchAction(driver).press(startx, starty)
                .waitAction(Duration.ofSeconds(3000))
                .moveTo(endx, starty).release();
    }


    public void clickBackButton() {
        driver.navigate().back(); //Closes keyboard
    }


    public String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public void tapElement(MobileElement element){
        TouchAction t1 = new TouchAction(driver);
        t1.tap(element);
        driver.performTouchAction(t1);
    }
}
