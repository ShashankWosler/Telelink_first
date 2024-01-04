package com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts.AdjustPopUp;
import org.openqa.selenium.support.PageFactory;

public class AdjustPopUpPage extends AdjustPopUp {
    public AdjustPopUpPage(){
        PageFactory.initElements(getDriver(), this);
    }

    //Only Applicable To Invoice Tab

    // A D J U S T M E N T S        D E T A I L S
    public boolean isAdjustPopUpVisible(){
        waitVisibilityOfElement(adjustPopUp);
        return isElementDisplayed(adjustPopUp);}
    public String getIDTabText(){return getAttributeValue(idTab,"value");}  // - NAT117-A2
    public void enterTextDateTab(){enterText(dateTab,getTodayDate());}
    public void enterTextReasonTab(){enterText(reasonTab, CaseTypeTestData.Reason);}

    // C U R R E N T        A C C O U N T S        S T A T U S
    public String getInvoiceTabText(){return getAttributeValue(invoiceTab,"value").replaceAll("[^0-9]","");} // NAT117
    public String getPaymentReceivedTabText(){return getAttributeValue(paymentReceivedTab,"value").replaceAll("[^0-9,-]","");}
    public String getInvoiceBalanceTabText(){return getAttributeValue(invoiceBalanceTab,"value").replaceAll("[^0-9,]","");}
    public String getOriginalInvoiceTotalTabText(){return getAttributeValue(originalInvoiceTotalTab,"value").replaceAll("[^0-9]","");}
    public String getAdjustmentTabText(){return getAttributeValue(adjustmentTab,"value").replaceAll("[^0-9]","");}
    public String getVATBalanceTabText(){return getAttributeValue(vatBalanceTab,"value").replaceAll("[^0-9]","");}
    public String getTotalAdjustmentTabText(){return getAttributeValue(totalAdjustmentTab,"value");}
    public String getTotalVATTabText(){return getAttributeValue(totalVatTab,"value");}

    // F I L T E R
    public boolean isSearchInputTabVisible(){
        waitVisibilityOfElement(searchInputTab);
        return isElementDisplayed(searchInputTab);
    }
    public void clickByDropDownButton(){clickButtonWithOutScroll(byDropDownButton);}
    public void clickAdjustFindButton(){clickButtonWithOutScroll(adjustFindButton);}
    public void clickAdjustFieldEditButton(){clickButtonWithOutScroll(adjustFieldEditButton);}

    // T A B L E
    public void clickSelectAllDescriptionItemBox(){clickButtonWithOutScroll(selectAllDescriptionItemBox);}
    public int getTableSize(){
        waitVisibilityOfElement(tableSize.get(0));
        return tableSize.size(); }
    public boolean isExistingActivityTotalAmountVisible(){
        waitVisibilityOfElement(existingActivityTotalAmount);
        return isElementDisplayed(existingActivityTotalAmount);}
    public String getTextExistingActivityTotalAmount(){return getAttributeValue(existingActivityTotalAmount,"value");}

    // R O W    -    1
    public void enterTextInDuration1(){
        waitElementToBeClickable(Duration1);
        enterTextAndClearAll(Duration1,CaseTypeTestData.AdjustNewDuration);
    }
    public void clickEmployee1(){mouseOverClick(Employee1);}
    public String getTextSubTotal1(){return getText(SubTotal1).replaceAll("[^0-9]","");}
    public String getTextVat1(){return getText(Vat1).replaceAll("[^0-9]","");}
    public String getTextTotal1(){return getAttributeValue(Total1,"value").replaceAll("[^0-9]","");}

    // R O W    -    2
    public boolean isCheckBox2Visible(){
        waitVisibilityOfElement(CheckBox2);
        return isElementDisplayed(CheckBox2);}
    public void clickCheckBox2(){
        waitFor(2000);
        waitElementToBeClickable(CheckBox2);
        clickButtonWithOutScroll(CheckBox2);}
    public void enterTextDescription2(){enterText(description2,CaseTypeTestData.Description);}
    public void enterTextDetails2(){enterText(details2,CaseTypeTestData.Description);}
    public void enterTextRate2(){enterText(rate2,CaseTypeTestData.Rate);}
    public void enterTextDuration2(){enterText(duration2,CaseTypeTestData.Duration);}
    public String getSubtotal2Text(){return getAttributeValue(subtotal2,"title");}
    public String getVAT2Text(){return getAttributeValue(vat2,"title");}
    public void enterTextTotalAmount2(){enterText(totalAmount2,CaseTypeTestData.UpdatedPrice);}
    public void moveToTableEnd(){clickButtonWithOutScroll(glCodeHeader);}
    public void clickVATCheckBox2(){clickButtonWithOutScroll(vatCheckBox2);}
    public void selectChargeCodeDropDown(String chargeCodeValue){SelectByVisibleText(chargeCodeDropDown,chargeCodeValue);}

    // B O T T O M          B U T T O N S
    public void clickActivityLineButton(){clickButtonWithOutScroll(activityLineButton);}
    public void clickItemLineButton(){clickButtonWithOutScroll(itemLineButton);}
    public void clickOkButton(){clickButtonWithOutScroll(okButton);}
    public void clickCancelButton(){clickButtonWithOutScroll(cancelButton);}

}
