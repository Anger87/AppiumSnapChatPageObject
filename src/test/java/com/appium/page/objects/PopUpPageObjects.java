package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PopUpPageObjects {

    @AndroidFindBy(id = "com.snapchat.android:id/description_text")
    public MobileElement DescriptionText;

    @AndroidFindBy(id = "com.snapchat.android:id/sc_alert_dialog_buttons_container")
    public MobileElement AlertDialogButtonsContainer;

    @AndroidFindBy(id = "com.snapchat.android:id/yes_button")
    public MobileElement YesButton;

}
