package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts.AccountsPage;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Contacts.ContactsMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;

public class TabContactsMainStep extends ContactsMainPage {

    @And("Verify Number of Contacts added")
    public void verifyNumberOfContactsAdded() {
        waitFor(3000);
        getContactsCount();
    }
}
