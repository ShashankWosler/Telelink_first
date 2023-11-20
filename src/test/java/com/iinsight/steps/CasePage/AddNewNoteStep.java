package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.AddNewNotePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddNewNoteStep extends AddNewNotePage {
    @And("User fill all the mandatory fields in Add Note PopUp")
    public void userFillMandatoryFields(){
        clickTitle();
        enterNewTitle();
    }
    @And("User click on the Save button")
    public void UserClickOnTheSaveButton(){
        clickSaveButton();
    }
    @And("User Edit the information in Title and Description fields")
    public void userEditInformationInTitle(){
        clickTitle();
        enterUpdatedTitle();
    }
    @And("User Check and View the Add Note PopUp")
    public void verifyAddNewPopup(){
        verifyTitleIsVisible();
        verifyCancelButtonIsVisible();
    }
    @Then("User click on the Close button Add Note PopUp")
    public void userClickOnCloseButton(){
        clickCancelButton();
    }
}
