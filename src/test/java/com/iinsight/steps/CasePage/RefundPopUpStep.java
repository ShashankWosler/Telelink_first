package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts.RefundPopUpPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class RefundPopUpStep extends RefundPopUpPage {
    @And("User Verify CaseId InvoiceId Amount from Refund PopUp")
    public void verifyFieldsRefundPopUp(){
        Assert.assertTrue(isRefundPopUpVisible());
        Assert.assertTrue(getCaseID().contains(CaseTypeTestData.CaseNumber));
        Assert.assertTrue(getInvoiceID().contains(CaseTypeTestData.InvoiceNumber));
        Assert.assertTrue(getAmount().contains("0"));
        enterReason();
        Assert.assertTrue(isElementDisplayed(refundButton));
        Assert.assertTrue(isElementDisplayed(cancelButton));
        Assert.assertEquals(getDate(),getTodayDate());
        enterAmount();
        clickRefundButton();
    }
}
