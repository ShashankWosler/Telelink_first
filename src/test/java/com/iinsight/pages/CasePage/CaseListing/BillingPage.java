package com.iinsight.pages.CasePage.CaseListing;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseListing.Billing;
import org.openqa.selenium.support.PageFactory;

public class BillingPage extends Billing {
    public BillingPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public void clickOnInvoiceDropdown(){
        selectDropdown(invoice_dropdown_icon);
    }
    public void clickOnBillingDropdown(){
        clickButtonWithOutScroll(billing_dropdown_icon);
    }
    public void clickOnSubmitButton(){
        clickButtonWithOutScroll(submit_button);
    }
    public void enterTextDurationTab(){
        setImplicit(10);
        waitElementToBeClickable(durationInput);
        enterTextAndClearAll(durationInput, CaseTypeTestData.Duration);
    }
    public void enterTextRateTab(){
        setImplicit(10);
        waitElementToBeClickable(rateInput);
        enterTextAndClearAll(rateInput, CaseTypeTestData.Rate);
        waitFor(2000);
    }
    public void clickFileNote(){clickButtonWithOutScroll(fileNotes);} // To Update Duration & Input
    public String getSubtotal(){return getInnerText(subTotal);}
    public String getVAT(){return getInnerText(vat);}
    public String getTotal(){return getInnerText(total);}
    public boolean isBillApplyVATCheckBoxVisible(){
        waitVisibilityOfElement(billApplyVatCheckBox);
        return isElementDisplayed(billApplyVatCheckBox);}
    public void clickBillApplyVATCheckBox(){
        waitElementToBeClickable(billApplyVatCheckBox);
        clickButtonWithOutScroll(billApplyVatCheckBox);
    }
    public boolean isDescriptionInputVisible(){
        waitVisibilityOfElement(descriptionInput);
        return isElementDisplayed(descriptionInput);}
    public void clickDescriptionInput(){
        waitElementToBeClickable(descriptionInput);
        clickButtonWithOutScroll(descriptionInput);
    }
    public String getDescriptionValue(){return getAttributeValue(descriptionInput,"value");}
    public String getCodeValue(){return getAttributeValue(codeInput,"value");}

}
