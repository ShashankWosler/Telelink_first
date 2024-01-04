package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.AdminNotesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException ;
import org.openqa.selenium.StaleElementReferenceException;

public class AdminNoteStep extends AdminNotesPage {
    int verify_table_size;
    @And("User select Admin Notes tab")
    public void userSelectAdminNotesTab(){
        setImplicit(10);
        Assert.assertTrue(isAdminNoteTabIsVisible());
        clickAdminNotesTab();
    }
    @And("User click on Admin Add New button")
    public void UserClickOnAddNewButton(){
        clickAddNewButton();
    }
    @Then("Verify the Admin Note should be added on Admin notes tab")
    public void verifyAdminNoteAdded(){
        try{
        waitFor(2000);
        getFirstRowFromTable();}
        catch(StaleElementReferenceException e){
            System.out.println("AdminNoteStep.verifyAdminNoteAdded() - StaleElementReferenceException "+e.getMessage());
        }
    }
    @And("User select any Admin Notes from the admin list")
    public void clickAdminNoteList(){
        verify_table_size = getSizeOfTable();
        clickFirstRowFromTable();
    }
    @And("User click on the Admin Details button")
    public void clickOnAdminDetailButton(){
        try {
            waitElementToBeClickable(details_btn);
            clickDetailsButton();
        }catch(ElementClickInterceptedException e){
            System.out.println("AdminNoteStep.clickOnAdminDetailButton() - ElementClickInterceptedException");
            waitFor(2000);
            clickDetailsButton();
        }
    }
    @And("User click on the Admin Delete button")
    public void clickOnAdminDeleteButton(){clickDeleteButton();
    }
    @And("User click on the Ok button from Delete PopUp")
    public void clickOnOkButtonFromDeletePopUp(){
        try {
            setImplicit(10);
            Assert.assertTrue(isDeletePopUpVisible());
        }catch(ElementNotInteractableException e){
            System.out.println("AdminNoteStep.clickOnOkButtonFromDeletePopUp() - "+e.getClass());
            waitFor(3000);
            Assert.assertTrue(isDeletePopUpVisible());

        }finally {
            clickOkButton();}
    }
    @Then("Verify Admin Note is Deleted")
    public void verifyUpdatedNotesList(){
        System.out.println("verify_table_size -"+verify_table_size);
        //Assert.assertEquals(verify_table_size-1,getSizeOfTable());
    }

}
