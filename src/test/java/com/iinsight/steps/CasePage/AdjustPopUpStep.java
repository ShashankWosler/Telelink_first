package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts.AdjustPopUpPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class AdjustPopUpStep extends AdjustPopUpPage {
    @And("User Verify Amounts Fields From Adjust popup {string} VAT")
    public void verifyAmountFieldsFromAdjust(String vatValue){
        waitFor(20000);

        setImplicit(60);
        Assert.assertTrue(isAdjustPopUpVisible());
        CaseTypeTestData.AdjustId = getIDTabText();
        enterTextReasonTab();
        switch(vatValue){
            case "With":
                Assert.assertTrue("E:"+getInvoiceTabText()+" A:"+CaseTypeTestData.InvoiceNumber,getInvoiceTabText().contains(CaseTypeTestData.InvoiceNumber));
                Assert.assertTrue("E:"+getPaymentReceivedTabText()+" A:"+CaseTypeTestData.PaymentUpdatedAmountI,getPaymentReceivedTabText().contains("-"+CaseTypeTestData.PaymentUpdatedAmountI));
                Assert.assertTrue("E:"+getInvoiceBalanceTabText()+" A:"+CaseTypeTestData.VATRemainingAmount,getInvoiceBalanceTabText().contains(CaseTypeTestData.VATRemainingAmount));
                Assert.assertTrue("E:"+getOriginalInvoiceTotalTabText()+" A:"+CaseTypeTestData.Total,getOriginalInvoiceTotalTabText().contains(String.valueOf(CaseTypeTestData.Total)));
                Assert.assertTrue("E:"+getAdjustmentTabText(),getAdjustmentTabText().contains("0"));
                Assert.assertTrue("E:"+getVATBalanceTabText()+" A:"+CaseTypeTestData.VAT,getVATBalanceTabText().contains(String.valueOf(CaseTypeTestData.VAT)));

//                Assert.assertTrue("E:"+getInvoiceTabText()+" A:"+CaseTypeTestData.InvoiceNumber,getInvoiceTabText().contains("152"));
//                Assert.assertTrue("E:"+getPaymentReceivedTabText()+" A:"+CaseTypeTestData.PaymentUpdatedAmountI,getPaymentReceivedTabText().contains("-100"));
//                Assert.assertTrue("E:"+getInvoiceBalanceTabText(),getInvoiceBalanceTabText().contains("1000"));
//                Assert.assertTrue("E:"+getOriginalInvoiceTotalTabText()+" A:"+CaseTypeTestData.Total,getOriginalInvoiceTotalTabText().contains(String.valueOf("1100")));
//                Assert.assertTrue("E:"+getAdjustmentTabText(),getAdjustmentTabText().contains("0"));
//                Assert.assertTrue("E:"+getVATBalanceTabText()+" A:"+CaseTypeTestData.VAT,getVATBalanceTabText().contains("100"));
                break;
            case "Without":
                Assert.assertTrue("E:"+getInvoiceTabText()+" A:"+CaseTypeTestData.InvoiceNumber,getInvoiceTabText().contains(CaseTypeTestData.InvoiceNumber));
                Assert.assertTrue("E:"+getPaymentReceivedTabText()+" A:"+CaseTypeTestData.PaymentUpdatedAmountI,getPaymentReceivedTabText().contains("-"+CaseTypeTestData.PaymentUpdatedAmountI));
                Assert.assertTrue("E:"+getInvoiceBalanceTabText()+" A:"+CaseTypeTestData.NOVATRemainingAmount,getInvoiceBalanceTabText().contains(CaseTypeTestData.NOVATRemainingAmount));
                Assert.assertTrue("E:"+getOriginalInvoiceTotalTabText()+" A:"+CaseTypeTestData.SubTotal,getOriginalInvoiceTotalTabText().contains(String.valueOf(CaseTypeTestData.SubTotal)));
                Assert.assertTrue("E:"+getAdjustmentTabText(),getAdjustmentTabText().contains("0"));

//                Assert.assertTrue("E:"+getInvoiceTabText()+" A:"+CaseTypeTestData.InvoiceNumber,getInvoiceTabText().contains("152"));
//                Assert.assertTrue("E:"+getPaymentReceivedTabText()+" A:"+CaseTypeTestData.PaymentUpdatedAmountI,getPaymentReceivedTabText().contains("-100"));
//                Assert.assertTrue("E:"+getInvoiceBalanceTabText(),getInvoiceBalanceTabText().contains("1000"));
//                Assert.assertTrue("E:"+getOriginalInvoiceTotalTabText()+" A:"+CaseTypeTestData.Total,getOriginalInvoiceTotalTabText().contains("1100"));
//                Assert.assertTrue("E:"+getAdjustmentTabText(),getAdjustmentTabText().contains("0"));
                System.out.println(getVATBalanceTabText());
                break;
        }
    }
    @And("User Select Activity from Adjust popup")
    public void selectActivityFromTable(){
        setImplicit(40);
        clickSelectAllDescriptionItemBox();
        Assert.assertTrue(isExistingActivityTotalAmountVisible());
        enterTextInDuration1();
        //clickEmployee1();
        clickItemLineButton();
        Assert.assertTrue(isCheckBox2Visible());
        setImplicit(10);
        //Assert.assertTrue("getTextSubTotal1() E: "+getTextSubTotal1()+" A:"+CaseTypeTestData.AdjustSubTotal,getTextSubTotal1().contains(CaseTypeTestData.AdjustSubTotal));
        //Assert.assertTrue("getTextTotal1() E: "+getTextTotal1()+" A:"+CaseTypeTestData.AdjustTotal,getTextTotal1().contains(CaseTypeTestData.AdjustTotal));
        //Assert.assertTrue("getTextVat1() E: "+getTextVat1()+" A:"+CaseTypeTestData.AdjustVAT,getTextVat1().contains(CaseTypeTestData.AdjustVAT));
        clickOkButton();
    }

}
