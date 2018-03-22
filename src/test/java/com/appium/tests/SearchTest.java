package com.appium.tests;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void SearchCar() throws InterruptedException {
        menubar = toolbar.clickMenu();
        profilePage = menubar.clickProfile();
        profilePage.clickSignInByEmail();

    }

}
