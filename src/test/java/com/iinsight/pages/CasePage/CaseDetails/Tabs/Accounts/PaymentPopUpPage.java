package com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts.PaymentPopUp;
import org.openqa.selenium.support.PageFactory;

public class PaymentPopUpPage extends PaymentPopUp {
    public PaymentPopUpPage(){
        PageFactory.initElements(getDriver(), this);
    }
    // F I R S T    P A G E
    public boolean isPaymentPopUpVisible(){return isElementDisplayed(verifyPaymentPopUp);}
    public void clickAllCasesCheckBox(){clickButtonWithOutScroll(allCasesCheckBox);}
    public void clickCurrentCaseCheckBox(){clickButtonWithOutScroll(currentCaseCheckBox);}
    public void clickSelectCaseCheckBox(){clickButtonWithOutScroll(selectCaseCheckBox);}
    public void clickCurrentInvoiceCheckBox(){clickButtonWithOutScroll(currentInvoiceCheckBox);}
    public void clickOpenCaseCheckBox(){clickButtonWithOutScroll(openCasesOnlyCheckBox);}
    public String getDefaultPaymentTypeMethod(){return getAttributeValue(paymentTypeInputTab,"value");}
    public String getTextOfAmount(){return getAttributeValue(getAmount,"value");}
    public void clickPaymentTypeDropDown(){clickButtonWithOutScroll(paymentTypeDropDown);}
    public void clickNextButton(){clickButtonWithOutScroll(nextButton1);}


    // V E R I F Y      F I E L D S
    public String getCaseIDText(){return getAttributeValue(caseIdTab,"value");}
    public String getInvoiceIDText(){return getAttributeValue(invoiceIdTab,"value");}
    public String getAmountTabText(){return getInnerText(amountTab).replaceAll(" ","");}


    // S E C O N D    P A G E
    public boolean isFinishButtonVisible(){return isElementDisplayed(finishButton);}
    public void clickFinishButton(){clickButtonWithOutScroll(finishButton);}
    public boolean isClearAllButtonVisible(){
        setImplicit(10);
        waitVisibilityOfElement(clearAllButton);
        return isElementDisplayed(clearAllButton);}

    public void clickFillAllButton(){clickButtonWithOutScroll(fillAllButton);}
    public void clickClearAllButton(){clickButtonWithOutScroll(clearAllButton);}
    //public String getTextPaymentTab(){return getText(clearAllButton);}
    public void clickEditAmountButton(){clickButtonWithOutScroll(editAmount);}
    public boolean isEditAmountPopUpVisible(){return isElementDisplayed(editAmountPopUp);}
    public void clickOkButton(){clickButtonWithOutScroll(okButtonEditAmountPopUp);}
    public String getAmountTextFromEditPopUp(){return getAttributeValue(enterAmountInput,"value");}
    public void enterUpdatedAmount(){enterText(enterAmountInput, CaseTypeTestData.UpdatedPrice);}
    public String getTableOwningTabText(){return getAttributeValue(tableOwningTab,"title").replaceAll("[^0-9]","");}

    // Need To Call clickFillAllButton() Before Calling Below Two Methods
    public String getTextFromPaymentTab(){
        return getAttributeValue(paymentTabText,"title").replaceAll(" ","").replaceAll("[^0-9],","").replaceAll(",","");}
    public String getTextFromBalanceTab(){return getInnerText(balanceTab);}
}
