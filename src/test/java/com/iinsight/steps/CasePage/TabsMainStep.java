package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.TabsMainPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.StaleElementReferenceException;

public class TabsMainStep extends TabsMainPage {
    @And("User select Case Notes tab")
    public void userSelectCaseNotesTab(){
        try {clickCaseNotesTab();
        }
        catch(StaleElementReferenceException e) {
            clickCaseNotesTab();
            System.out.println("TabsMainStep.userSelectCaseNotesTab() -->> StaleElementReferenceException: Clicked Element Again");
        }
    }
    @And("User Select Title Option from By DropDown")
    public void selectTitleOptionFromDropdown(){
        isFiveValueFromByDropDownDisplayed();
        SelectFiveValueFromByDropDown();
    }

}
