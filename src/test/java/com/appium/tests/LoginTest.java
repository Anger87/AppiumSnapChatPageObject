package com.appium.tests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest {

    @Test
    public void LoginLogOut() {
        softAssert = new SoftAssert();
        loginPage = landingPage.clickLoginButton();
        neonHeaderPage = loginPage.logIn(userCredentials.getUserName(),userCredentials.getPassWord());

        profilePage = neonHeaderPage.clickProfileButton();
        logger.info("Check User name on Profile Page");
        softAssert.assertEquals(profilePage.getUserName(),userCredentials.getUserName(),"ProfilePage Check UserName");
        softAssert.assertEquals(profilePage.getFullName(),"Test Continuum","ProfilePage Check FullName");

        settingsPage = profilePage.clickSettingButton();
        logger.info("Check User name on Settings Page");
        softAssert.assertEquals(settingsPage.getUserName(),userCredentials.getUserName(),"SettingsPage Check UserName");
        softAssert.assertEquals(settingsPage.getFullName(),"Test Continuum","SettingsPage Check FullName");
        settingsPage.scrollToLogOutButton();

        popUpPage = settingsPage.clickLogOutButton();
        logger.info("Check Allert message");
        softAssert.assertEquals(popUpPage.getAllertMessage(),"Are you sure you want to log out?","Check Alert message");

        landingPage = popUpPage.clickYesButton();
        logger.info("Check Landing page opened");
        softAssert.assertNotEquals(landingPage, null);

        softAssert.assertAll();
    }

}
