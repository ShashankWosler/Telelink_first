package com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.TestData.CaseTypeTestData;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts.InvoicePopUp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class InvoicePopUpPage extends InvoicePopUp {
    public InvoicePopUpPage(){
        PageFactory.initElements(getDriver(), this);
    }

    // P A G E      1
    public boolean isInvoiceModalIsVisible(){return isElementDisplayed(inVoicePopUpModal);}
    public boolean isCurrentCaseTabIsVisible(){return isElementDisplayed(currentCaseTab);}
    public void clickCurrentCaseTab(){
        clickButtonWithOutScroll(currentCaseTab);
    }
    public void enterDescription(){enterText(enterDescription, CaseTypeTestData.Description);
    }
    public void clickSearchCaseTab(){clickButtonWithOutScroll(searchCaseTab);}
    public String getCaseBusinessDiv(){return getAttributeValue(readCase,"value");}
    public String getCompanyName(){return getAttributeValue(readCompanyName,"value");}
    public void clickDateDropDown(){clickButtonWithOutScroll(dateDropDown);}
    public void clickNextButton1(){clickButtonWithOutScroll(nextButton1);}
    public boolean isPreviousButtonIsVisible(){return isElementDisplayed(previousButton);}
    public void clickStandardIcon(){clickButtonWithOutScroll(standardIcon);}
    public void clickInvoiceIcon(){clickButtonWithOutScroll(invoiceIcon);}
    public void clickMilestoneIcon(){clickButtonWithOutScroll(milestoneIcon);}

    // P A G E      2
    public boolean isActiveCostIdIsVisible(){return isElementDisplayed(activeCostId);}
    public void clickActiveTableRow(){
        try{
            WebElement listElem;
            if(activeCostId.size()>=2){
                for(int i =0;i<activeCostId.size();i++){
                    listElem = activeCostId.get(i);
                    isElementDisplayed(listElem);
                    clickButtonWithOutScroll(listElem);
                }
            }else{
                isElementDisplayed(activeCostId.get(0));
                clickButtonWithOutScroll(activeCostId.get(0));
            }
        }catch (IndexOutOfBoundsException  | NullPointerException e) {
            System.out.println("InvoicePopUpPage.clickActiveTableRow() - :"+e.getClass()+" "+e.getMessage());
        }
    }
    public void clickNextButton2(){clickButtonWithOutScroll(nextButton2);}
    public void clickBillingButton(){clickButtonWithOutScroll(billingButton);}
    public void clickExcludeAllButton(){clickButtonWithOutScroll(excludeAllButton);}
    public void clickSelectAllButton(){clickButtonWithOutScroll(selectAllButton);}
    public String getDurationText(){return getAttributeValue(tableDurationTab,"title");}
    public String getChargeText(){return getAttributeValue(tableChargeTab,"title");}

    // P A G E      3
    public boolean isFinishButtonIsVisible(){return isElementDisplayed(finishButton);}
    public String getCompanyName2(){return getAttributeValue(readCompanyName2,"value");}
    public void clickPreviewInvoiceCheckBox(){clickButtonWithOutScroll(previewInvoiceButton);}
    public void clickSaveInvoiceButton(){clickButtonWithOutScroll(saveInvoiceButton);}
    public void clickFinishButton(){clickButtonWithOutScroll(finishButton);}
    public String getTotalTabText(){return getAttributeValue(totalTab,"value").replaceAll(" ","").replaceAll("[^0-9]","");}
    public String getInvoiceNumberTabText(){return getAttributeValue(invoiceNumberTab,"value");}
    public String getAmountExVatTabText(){return getAttributeValue(amountExVatTab,"value").replaceAll(" ","").replaceAll("[^0-9]","");}
    public String getVATAmountTabText(){return getAttributeValue(vatAmountTab,"value").replaceAll("[^0-9]","");}
    public String getInvoicePrefixTabText(){return getAttributeValue(invoicePrefixTab,"value");}

}
