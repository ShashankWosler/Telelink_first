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

}
