package com.iinsight.pages.CasePage.CaseDetails.Tabs.Costs;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Costs.CostsMain;
import org.openqa.selenium.support.PageFactory;

public class CostsMainPage extends CostsMain {
    public CostsMainPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void getCostID(String cost){
        waitFor(3000);
        String billingID = getAttributeValue(cost_ID , "title");
        System.out.println("Billing Id ----------------- "+billingID);
        getID(cost, billingID);
    }
    public boolean isDeleteButtonIsVisible(){return isElementDisplayed(deleteButton);}
    public void clickDeleteButton(){clickButtonWithOutScroll(deleteButton);}
    public boolean isBillingButtonIsVisible(){return isElementDisplayed(billingButton);}

    public void clickBillingButton(){clickButtonWithOutScroll(billingButton);}
    public void clickEditButton(){clickButtonWithOutScroll(editButton);}
    public void clickSelectAllButton(){clickButtonWithOutScroll(selectAllButton);}
    public void clickExcludeAllButton(){clickButtonWithOutScroll(excludeAllButton);}
    public void clickSearchTab(){clickButtonWithOutScroll(searchTab);}
    public void enterTextSearchTab(String caseID){enterText(searchTab,caseID);}

    public void clickByDropDown(){clickButtonWithOutScroll(byDropDown);}
    public void clickFindButton(){clickButtonWithOutScroll(findButton);}
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);}
    public String getChargeText(){

        return getAttributeValue(chargeText,"title").replaceAll(" ","").replaceAll("[^0-9]","");}
    public String getDurationTab(){return getAttributeValue(durationTab,"value");}
    public String getActivityChargeTab(){return getAttributeValue(activityChargeTab,"value").replaceAll(" ","").replaceAll("[^0-9]","");}
    public String getTotalCharge(){return getAttributeValue(totalCharge,"value").replaceAll(" ","").replaceAll("[^0-9]","");}
    public String getQuantity(){return getAttributeValue(quantity,"value");}
    public String getItemCharge(){return getAttributeValue(itemCharge,"value").replaceAll(",","").replaceAll("[^0-9]","");}
    public void isCostFormVisible(){
        setImplicit(10);
        waitVisibilityOfElement(costForm);
        isElementDisplayed(costForm);
        waitFor(2000);
        mouseOver(costForm);
    }
    public String getTextAppointmentToolTip(){return getAttributeValue(appointmentToolTip,"data-tooltip");}

}
