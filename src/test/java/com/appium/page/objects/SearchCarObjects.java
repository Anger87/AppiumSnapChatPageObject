package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchCarObjects {

    @AndroidFindBy(id = "com.ria.auto:id/old_auto_form_main")
    public MobileElement FormMain;

    @AndroidFindBy(id = "com.ria.auto:id/view_select_category")
    public MobileElement SelectCategory;


}
