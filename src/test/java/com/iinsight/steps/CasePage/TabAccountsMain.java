package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts.AccountsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TabAccountsMain extends AccountsPage {
    @And("User Click on +Invoice Button")
    public void userClickOnInvoiceButton() {
        clickOnAddInvoiceButton();
    }

    @And("Verify {string} Id is Created and should be visible in the Case Account table")
    public void verifyInvoiceIdIsCreatedAndShouldBeVisibleInTheCaseAccountTable(String invoice) {
        waitFor(2000);
        getInvoiceID(invoice);
        getAmount("Amount");
    }
    @Then("Click On Payment Button from Accounts Tab")
    public void clickOnAccountTabPaymentButton(){
        //isPaymentButtonClickable();
        waitFor(10000);
        clickPaymentButton();

    }
    @Then("Verify {string} Amount is Created and should be visible in the Case Account table")
    public void verifyPaymentEntryIsCreated(String entryType){
        waitFor(2000);
        Assert.assertEquals(entryType,getTypePaymentText());
        String getAmountFromTable = getTextAmountOfInvoice().replace("R","").replace(",",".");
        Assert.assertEquals(getAmountFromTable, "-"+ CaseTypeTestData.UpdatedPrice);
    }
    @And("User click Delete Invoice button")
    public void userClickDeleteInvoiceButton() {
        clickDeleteButton();
        waitFor(1000);
        clickDeleteYesButton();
    }
}
