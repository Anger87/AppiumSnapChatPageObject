package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPageObjects {


    @AndroidFindBy(id = "com.snapchat.android:id/login_form")
    public MobileElement LoginForm;

    @AndroidFindBy(id = "com.snapchat.android:id/username_or_email_field")
    public MobileElement UserName;

    @AndroidFindBy(id = "com.snapchat.android:id/password_field")
    public MobileElement Password;

    @AndroidFindBy(id = "com.snapchat.android:id/registration_nav_container")
    public MobileElement LogInButton;

}
