package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenubarObjects {

    @AndroidFindBy(id = "com.ria.auto:id/profile_lable")
    public MobileElement Profile;

    @AndroidFindBy(id = "com.ria.auto:id/menu")
    public MobileElement Menu;


}
