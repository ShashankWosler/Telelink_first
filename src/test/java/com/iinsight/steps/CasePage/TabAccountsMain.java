package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts.AccountsPage;
import io.cucumber.java.en.And;

public class TabAccountsMain extends AccountsPage {
    @And("User Click on +Invoice Button")
    public void userClickOnInvoiceButton() {
        clickOnAddInvoiceButton();
    }

    @And("Verify {string} Id is Created and should be visible in the Case Account table")
    public void verifyInvoiceIdIsCreatedAndShouldBeVisibleInTheCaseAccountTable(String invoice) {
        waitFor(2000);
        getInvoiceID(invoice);
    }
}
