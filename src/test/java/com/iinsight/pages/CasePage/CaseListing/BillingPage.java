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
    // T A S K      A P P O I N T M E N T S
    public boolean isDescriptionInputVisible(){
        waitVisibilityOfElement(descriptionInput);
        return isElementDisplayed(descriptionInput);}
    public void clickDescriptionInput(){
        waitElementToBeClickable(descriptionInput);
        clickButtonWithOutScroll(descriptionInput);
    }
    public String getDescriptionValue(){return getAttributeValue(descriptionInput,"value");}
    public String getCodeValue(){return getAttributeValue(codeInput,"value");}

    // C O N S U L T A N T S        T I M E
    public void enterConsultantDurationInput(){
        enterTextAndClearAll(consultantDurationInput,CaseTypeTestData.Duration);
    }
    public void enterConsultantRateInput(){
        enterTextAndClearAll(consultantRateInput,CaseTypeTestData.TimeSheetRate);
        waitFor(2000);
    }
    public String getConsultantSubTotalInputText(){return getAttributeValue(consultantSubTotalInput,"value");
    }
    public String getConsultantVatInputText(){return getAttributeValue(consultantVatInput,"value");
    }
    public String getConsultantTotalInputText(){return getAttributeValue(consultantTotalInput,"value");
    }
    public String getConsultantSuperRateInputText(){return getAttributeValue(consultantSuperRateInput,"value");
    }
    public void clickConsultantSuperRateInput(){clickButtonWithOutScroll(consultantSuperRateInput);
    }
    public String getConsultantSuperExpenseInputText(){return getAttributeValue(consultantSuperExpenseInput,"value");
    }
    public void clickConsultantApplyVatCheckBox(){clickButtonWithOutScroll(consultantApplyVatCheckBox);
    }
    // N E W    T I M S H E E T     B I L L I N G
    public void clickSearchByDropDown(){clickButtonWithOutScroll(searchByDropDown);
    }
    public String getSearchByInputText(){return getAttributeValue(searchByInput,"value");
    }
    public void enterSearchTextInput(String value){enterText(searchTextInput,value);
    }

    // W A R N I N G    N O T I F I C A T I O N S   - Are you sure you want close this window? Any unsubmitted costs or changes will be lost.
    public void clickOkButton(){clickButtonWithOutScroll(okButton);
    }
    public void clickCancelButtonTimesheet(){clickButtonWithOutScroll(cancelButtonTimesheet);
    }

    // D U P L I C A T E    C O S T     -   P O P - U P
    public boolean isDuplicatePopUpVisible(){
        waitVisibilityOfElement(isDuplicatePopUp);
        return isElementDisplayed(isDuplicatePopUp);
    }

    public void clickNoButton(){clickButtonWithOutScroll(noButton);
    }
}
