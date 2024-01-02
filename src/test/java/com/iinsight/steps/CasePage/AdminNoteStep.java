package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.AdminNotesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;

public class AdminNoteStep extends AdminNotesPage {
    @And("User select Admin Notes tab")
    public void userSelectAdminNotesTab(){
        clickAdminNotesTab();
    }
    @And("User click on Admin Add New button")
    public void UserClickOnAddNewButton(){
        clickAddNewButton();
    }
    @Then("Verify the {string} should be added on Admin notes tab")
    public void verifyAdminNoteAdded(String str){
        getFirstRowFromTable(str);
    }
    @And("User select any Admin Notes from the admin list")
    public void clickAdminNoteList(){
        clickFirstRowFromTable();
    }
    @And("User click on the Admin Details button")
    public void clickOnAdminDetailButton(){
        clickDetailsButton();
    }
    @And("User click on the Admin Delete button")
    public void clickOnAdminDeleteButton(){clickDeleteButton();
    }
    @And("User click on the Ok button from Delete PopUp")
    public void clickOnOkButtonFromDeletePopUp(){
        try {
            Assert.assertTrue(isDeletePopUpVisible());
        }catch(ElementNotVisibleException | ElementClickInterceptedException e){
            System.out.println("AdminNoteStep.clickOnOkButtonFromDeletePopUp() - "+e.getClass());
            waitFor(3000);
        }finally {
            clickOkButton();}
    }
}
