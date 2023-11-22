package com.iinsight.steps.CasePage;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Costs.CostsMain;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Costs.CostsMainPage;
import io.cucumber.java.en.And;

public class TabCostsMainSteps extends CostsMainPage {

    @And("Verify that new Created {string} is listed in Cost list under Costs Tab")
    public void verifyThatNewCreatedCostIsListedInCostListUnderCostsTab(String cost) {

        getCostID(cost);
    }


}
