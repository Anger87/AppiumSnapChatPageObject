package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class LandingPageObjects {

    @AndroidFindBy(id = "com.ria.auto:id/indicator")
    public MobileElement Indicator;

    @AndroidFindBy(id = "com.ria.auto:id/tv_go_container")
    public MobileElement GoButton;

}
