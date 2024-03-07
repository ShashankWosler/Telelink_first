package com.iinsight.pages.CasePage.CaseDetails.Tabs.Settings;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Settings.SettingsMain;
import org.openqa.selenium.support.PageFactory;

public class SettingsMainPage extends SettingsMain {
    public SettingsMainPage(){PageFactory.initElements(getDriver(),this);
    }
    public boolean isSettingTextVisible(){
        waitVisibilityOfElement(settingText);
        return isElementDisplayed(settingText);
    }
    public void clickSaveButton(){clickButtonWithOutScroll(saveButton);
    }
    public void clickArchivalDateDropDown(){clickButtonWithOutScroll(archivalDateDropDown);
    }
    public void clickDeletionDateDropDown(){clickButtonWithOutScroll(deletionDateDropDown);
    }

    public void enterDeletionDateInput(String date){enterText(deletionDateInput,date);}
    public void enterArchivalDateInput(String date){enterText(archivalDateInput,date);}
    public String getArchivalDateInputText(){
        waitVisibilityOfElement(archivalDateInput);
        return getAttributeValue(archivalDateInput,"value");
    }
    public String getDeletionDateInputText(){
        waitVisibilityOfElement(deletionDateInput);
        return getAttributeValue(deletionDateInput,"value");
    }

    // C L I E N T      C O N T A C T      N O T I F I C A T I O N
    public String getEnableCaseAlertCheckBox(){return getAttributeValue(enableCaseAlertCheckBox,"value");
    }
    public String getExcludeCaseCheckBox(){return getAttributeValue(excludeCaseCheckBox,"value");
    }
    // I S  -   D I S P L A Y E D
    public boolean isReceiveSmsNotificationsCheckBoxVisible(){
        waitVisibilityOfElement(receiveSmsNotificationsCheckBox);
        return isElementDisplayed(receiveSmsNotificationsCheckBox);
    }
    public boolean isReceiveEmailNotificationsCheckBoxVisible(){
        waitVisibilityOfElement(receiveEmailNotificationsCheckBox);
        return isElementDisplayed(receiveEmailNotificationsCheckBox);
    }
    public String getReceiveSmsNotificationsCheckBox(){return getAttributeValue(receiveSmsNotificationsCheckBox,"value");
    }
    public String getReceiveEmailNotificationsCheckBox(){return getAttributeValue(receiveEmailNotificationsCheckBox,"value");
    }
    public void clickEnableCaseAlertCheckBox(){
        if(!(getEnableCaseAlertCheckBox().equals("1"))){
            clickButtonWithOutScroll(enableCaseAlertCheckBox);}
    }
    public void clickReceiveSmsNotificationsCheckBox(){
        if(!(getReceiveSmsNotificationsCheckBox().equals("1"))){
            clickButtonWithOutScroll(receiveSmsNotificationsCheckBox);}
    }
    public void clickReceiveEmailNotificationsCheckBox(){
        if(!(getReceiveEmailNotificationsCheckBox().equals("1"))){
            clickButtonWithOutScroll(receiveEmailNotificationsCheckBox);}
    }
    public void clickExcludeCaseCheckBox(){
        if(!(getExcludeCaseCheckBox().equals("1"))){
            clickButtonWithOutScroll(excludeCaseCheckBox);}
    }

    //F I N A N C E      T E M P L A T E S
    // D R O P D O W N S    B U T T O N S

    public void clickInvoiceTemplateDropDown(){clickButtonWithOutScroll(invoiceTemplateDropDown);}
    public void clickPaymentTemplateDropDown(){clickButtonWithOutScroll(paymentTemplateDropDown);}
    public void clickRefundTemplateDropDown(){clickButtonWithOutScroll(refundTemplateDropDown);}
    public void clickAdjustmentTemplateDropDown(){clickButtonWithOutScroll(adjustmentTemplateDropDown);}
    public void clickMonetaryBasedDropDown(){clickButtonWithOutScroll(MonetaryBasedDropDown);}
    public void clickTimeBasedDropDown(){clickButtonWithOutScroll(timeBasedDropDown);}

    // I N P U T
    public String getInvoiceTemplateInputText(){return getAttributeValue(invoiceTemplateInput,"value");}
    public String getPaymentTemplateInputText(){return getAttributeValue(paymentTemplateInput,"value");}
    public String getAdjustmentTemplateInputText(){return getAttributeValue(adjustmentTemplateInput,"value");}
    public String getRefundTemplateInputText(){return getAttributeValue(refundTemplateInput,"value");}
    public String getMonetaryInputText(){return getAttributeValue(monetaryInput,"value");}
    public String getTimeBasedInputText(){return getAttributeValue(timeBasedInput,"value");}

    // A L E R T
    public void enterAlertMessage(){enterText(caseAlertMessageBox,"test");}


}
