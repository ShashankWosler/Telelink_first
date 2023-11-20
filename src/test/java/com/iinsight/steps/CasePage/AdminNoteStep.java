package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.AdminNotesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdminNoteStep extends AdminNotesPage {
    @And("User select Admin Notes tab")
    public void userSelectAdminNotesTab(){
        clickAdminNotesTab();
    }
    @And("User click on Admin Add New button")
    public void UserClickOnAddNewButton(){
        clickAddNewButton();
    }
    @Then("Verify the Admin Note should be added on Admin notes tab")
    public void verifyAdminNoteAdded(){
        getFirstRowFromTable();
    }
    @And("User select any Admin Notes from the admin list")
    public void clickAdminNoteList(){
        clickFirstRowFromTable();
    }
    @And("User click on the Admin Details button")
    public void clickOnAdminDetailButton(){
        clickDetailsButton();
    }

}
