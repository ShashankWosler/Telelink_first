package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Documentation.DocumentationsMain;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Costs.CostsMainPage;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Documentation.DocumentationMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;

public class TabDocumentationsMainSteps extends DocumentationMainPage {

    @And("Verify Number of Documentation added")
    public void verifyNumberOfCostAdded() {
        waitFor(5000);
        getDocumentationsCount();
    }
}
