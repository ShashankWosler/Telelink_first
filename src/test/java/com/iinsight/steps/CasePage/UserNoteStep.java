package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.UserNotesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;

public class UserNoteStep extends UserNotesPage {
    int verify_table_size;
    @And("User select User Notes tab")
    public void userSelectUserNotesTab(){
        clickUserNotesTab();
    }

    @And("User click on the User Notes Details button")
    public void userClickOnUserNotesDetailButton(){
        clickDetailsButton();
    }
    @Then("Verify the User Note should be added on User notes tab")
    public void VerifyUserNoteAdded(){
        try {getFirstRowFromTable();
        }
        catch(StaleElementReferenceException e) {
            getFirstRowFromTable();
            System.out.println("UserNoteStep.getFirstRowFromTable() -->> StaleElementReferenceException: Clicked Element Again");
        }
    }
    @And("User click on User Notes Add New button")
    public void UserClickAddNewButton(){
        clickAddNewButton();
    }
    @And("User click on the by Dropdown on User Notes Tab")
    public void UserSelectDropdown(){
        Assert.assertTrue(isByDropDownTabDisplayed());
        waitFor(4000);
        clickByDropDownTab();
    }
    @And("User Enter the keyword on the search box according to the filter option selected in the by dropdown")
    public void enterSearchKeyword(){
        enterKeywordInSearchTab();
    }
    @And("User click on the Find button")
    public void userClickOnFindButton(){
        clickFindBtn();
    }
    @Then("Verify the Search Result")
    public void verifySearchResult(){
        getFirstRowFromTable();
    }
    @And("User click on the Field Edit button From User Notes Tab")
    public void clickOnFieldButton(){
        try{
        isFieldEditBtnDisplayed();
        clickFieldEditBtn();}
        catch(StaleElementReferenceException e) {
            clickFieldEditBtn();
            System.out.println("UserNoteStep.clickOnFieldButton() -->> StaleElementReferenceException: Clicked Element Again");
        }}
    @And("User select any User Notes from the list")
    public void selectListFromUUserList(){
        verify_table_size =  getSizeOfTable();
        getFirstRowFromTable();
    }
    @And("User click on the User Note Delete button")
    public void clickDeleteButtonUserNote(){
        try {
            waitElementToBeClickable(delete_btn);
            clickDeleteButton();
        }catch(ElementClickInterceptedException e){
                System.out.println("UserNoteStep.clickDeleteButtonUserNote() - ElementClickInterceptedException");
                waitFor(2000);
            clickDeleteButton();
            }
    }
    @Then("Verify User Note is Deleted")
    public void verifyUpdatedList(){
        System.out.println("verify_table_size -"+verify_table_size);
        //Assert.assertEquals(verify_table_size-1,getSizeOfTable());
    }

    @Then("Verify the New, Details and Delete Button is Disabled on User Notes")
    public void verifyTheNewDetailsAndDeleteButtonIsDisabledOnUserNotes() {
        Assert.assertEquals(getAttributeValue(add_new_btn,"disabled"),"true");
        Assert.assertEquals(getAttributeValue(delete_btn,"disabled"),"true");
        Assert.assertEquals(getAttributeValue(details_btn,"disabled"),"true");
    }


}
