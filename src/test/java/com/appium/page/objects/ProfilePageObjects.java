package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePageObjects {

    @AndroidFindBy(id = "com.ria.auto:id/login_form")
    public MobileElement LoginForm;

    @AndroidFindBy(id = "com.ria.auto:id/sign_in_button")
    public MobileElement SigninButton;


}
