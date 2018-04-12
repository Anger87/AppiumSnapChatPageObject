package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePageObjects {


    @AndroidFindBy(id = "com.snapchat.android:id/profile_v3_display_name_view")
    public MobileElement FullName;

    @AndroidFindBy(id = "com.snapchat.android:id/profile_v3_username_view")
    public MobileElement UserName;

    @AndroidFindBy(id = "com.snapchat.android:id/profile_v3_container")
    public MobileElement ProfileContainer;

    @AndroidFindBy(id = "com.snapchat.android:id/profile_v3_settings_button")
    public MobileElement SettingButton;

}
