package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NeonHeaderPageObjects {

    @AndroidFindBy(id = "com.snapchat.android:id/neon_header")
    public MobileElement NeonHeader;

    @AndroidFindBy(id = "com.snapchat.android:id/neon_header_profile_button_container")
    public MobileElement ProfileButton;

    @AndroidFindBy(id = "com.snapchat.android:id/neon_header_search_button")
    public MobileElement SearchButton;

}
