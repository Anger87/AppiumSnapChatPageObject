package com.appium.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonAppiumMethods {
    public AppiumDriver driver;
    Logger logger = Logger.getLogger(CommonAppiumMethods.class);

    CommonAppiumMethods(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    void waitForPageToLoad(WebElement id) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(id));
    }

    void waitForElementToDisAppear(String id) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
    }

    WebElement waitForElement(WebElement arg) {
        waitForPageToLoad(arg);
        WebElement el = arg;
        return el;
    }

    boolean scrollToElementById(String elemId) {
        System.out.println(driver.getPlatformName());
        try {
            logger.info("Scroll to element: " + elemId);
            AndroidDriver driverAndroid = (AndroidDriver) driver;
            driverAndroid.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                    ".scrollIntoView(new UiSelector().resourceId(\"" + elemId + "\").instance(0))");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("Scroll to element: " + elemId + " FAILED");
            return false;
        }
    }


    void swipeLeftUntilTextExists(String expected) {
        do {
            swipeLeft();
        } while (!driver.getPageSource().contains(expected));
    }

    void swipeRight() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.9);
        int endx = (int) (size.width * 0.20);
        int starty = size.height / 2;
        new TouchAction(driver).press(startx, starty)
                .waitAction(Duration.ofSeconds(2))
                .moveTo(endx, starty).release().perform();
    }

    void swipeLeft() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.8);
        int endx = (int) (size.width * 0.20);
        int starty = size.height / 2;
        new TouchAction(driver).press(startx, starty)
                .waitAction(Duration.ofSeconds(3000))
                .moveTo(endx, starty).release();
    }


    void clickBackButton() {
        driver.navigate().back(); //Closes keyboard
    }


    String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    void tapElement(MobileElement element) {
        TouchAction t1 = new TouchAction(driver);
        t1.tap(element);
        driver.performTouchAction(t1);
    }
}
