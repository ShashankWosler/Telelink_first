package com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts.RefundPopUp;
import org.openqa.selenium.support.PageFactory;

public class RefundPopUpPage extends RefundPopUp {
    public RefundPopUpPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isRefundPopUpVisible(){
        waitVisibilityOfElement(refundPopUp);
        return isElementDisplayed(refundPopUp);}
    public String getCaseID(){
        waitElementToBeClickable(caseTab);
        return getAttributeValue(caseTab,"value");
    }
    public String getInvoiceID(){return getAttributeValue(invoiceTab,"value");}
    public void enterTextDateTab(){enterText(dateTab,getTodayDate());}
    public String getDate(){return getAttributeValue(dateTab,"value");}
    public void enterAmount(){enterTextAndClearAll(amountTab, CaseTypeTestData.AdjustAmount);}
    public String getAmount(){return getAttributeValue(amountTab,"value");}
    public void enterReason(){
        waitElementToBeClickable(reasonTab);
        enterText(reasonTab, CaseTypeTestData.Reason);}
    public void clickRefundButton(){
        waitElementToBeClickable(refundButton);
        clickButtonWithOutScroll(refundButton);}
    public void clickCancelButton(){
        waitElementToBeClickable(cancelButton);
        clickButtonWithOutScroll(cancelButton);}

}
