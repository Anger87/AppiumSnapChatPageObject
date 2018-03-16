package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ToolbarObjects {

    @AndroidFindBy(className = "android.widget.ImageButton")
    public MobileElement Menu;

    @AndroidFindBy(id = "com.ria.auto:id/action_add")
    public MobileElement Add;


}
