package com.appium.tests;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void SearchCar() throws InterruptedException {
        searchCarPage.clickCategory();
        toolbar.clickMenu();
        Thread.sleep(6000);
    }

}
