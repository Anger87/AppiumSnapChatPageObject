package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class LandingPageObjects {
//TODO - use different FindBy aproaches from https://github.com/appium/java-client/blob/master/docs/Page-objects.md

    @AndroidFindBy(id = "com.snapchat.android:id/registration_page_fragment_container")
    public MobileElement PageContainer;

    @AndroidFindBy(id = "com.snapchat.android:id/login_and_signup_page_fragment_login_button")
    public MobileElement LoginButton;

}
