package com.iinsight.pages;

import com.iinsight.pagefactory.Kiosk;
import org.openqa.selenium.support.PageFactory;

public class KioskePage extends Kiosk {
    public KioskePage()
    {
    	PageFactory.initElements(getDriver(), this);
    }
    public void gotoRegisterKioskPage(){
        clickButtonWithOutScroll(kiosksMenuBar);
        clickButtonWithOutScroll(registerKiosksTab);
    }
    public void enterName(String kioskeName) {
        enterTextWithoutScroll(nameField, kioskeName);
    }
    public void clickOnRegisterBtn(){
        clickButtonWithOutScroll(registerBtn);
    }
    public void clickOnanywhere(){
    	waitFor(4000);
        clickButtonWithOutScroll(TapAnywhere);
        waitFor(4000);
    }
    public void clickOnCheckInBox(){
        clickButtonWithOutScroll(checkInBox);
        waitFor(4000);
    }
    
    
    public void enterYourName(String yourName) {
        enterTextWithoutScroll(yourNameField,yourName);
    }
    public void enterPhoneNo(String phoneNo)
    {
        enterTextWithoutScroll(phoneNumberField, globalPassword);
    }
    public void enterHealthCarsNo(String healthCardNo)
    {
        enterTextWithoutScroll(healthCardNumberField, globalPassword);
    }
    public void clickOnConnectAssistantBtn() {
        clickButtonWithOutScroll(connectBtn);
        waitFor(4000);
    }


}