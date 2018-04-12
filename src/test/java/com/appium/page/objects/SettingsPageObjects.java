package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsPageObjects {


    @AndroidFindBy(id = "com.snapchat.android:id/general_settings_scrollview")
    public MobileElement SettingsView;

    @AndroidFindBy(id = "com.snapchat.android:id/display_name_text")
    public MobileElement FullName;

    @AndroidFindBy(id = "com.snapchat.android:id/collaborator_username")
    public MobileElement UserName;

    @AndroidFindBy(id = "com.snapchat.android:id/account_actions_logout")
    public MobileElement LogOutButton;

}
