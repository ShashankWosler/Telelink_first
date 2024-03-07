package com.iinsight.steps.ToolBox;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.Toolbox.Side.TimeSheets.ActivityDetailPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class ActivityDetailStep extends ActivityDetailPage {
    @And("User Verify Fields From Activity Detail {string} VAT")
    public void verifyFieldsDetailsForm(String vatValue){
        // DETAIL TAB
        //clickDetailsTab();
        Assert.assertTrue(getCaseText().contains(getTestDataValue("CompanyID")));
        Assert.assertEquals(getRoleInputText(),"Admin");
        Assert.assertEquals(getDescriptionInputText(),"TestAutoActivity");
        Assert.assertEquals(getCodeInputText(),"CTP403");
        // BILLING INPUTS
        Assert.assertEquals(getDurationInputText(),CaseTypeTestData.Duration);
        Assert.assertTrue(getDurationRateInputText().replaceAll(" ","").contains(String.valueOf(CaseTypeTestData.ZeroRate)));
        Assert.assertTrue(getSubTotalText().replaceAll(" ","").contains(CaseTypeTestData.SubTotal));
        clickDetailVatCheckBox(vatValue);
        switch (vatValue){
            case "With":
                Assert.assertTrue(getTotalText().replaceAll(" ","").contains(CaseTypeTestData.Total));
                break;
            case "Without":
                Assert.assertTrue(getTotalText().replaceAll(" ","").contains(CaseTypeTestData.SubTotal));
                break;
        }
        // EMPLOYEE EXPENSE TAB
        clickEmployeeExpenseTab();
        Assert.assertTrue(isSaveButtonVisible());
        waitFor(2000);
        Assert.assertEquals(getEmployeeDurationInputText(),CaseTypeTestData.Duration);
        Assert.assertTrue(getEmployeeRateInputText().replaceAll(" ","").contains(String.valueOf(CaseTypeTestData.TimeSheetRate)));
        Assert.assertTrue(getEmployeeSubTotalInputText().replaceAll(" ","").contains(CaseTypeTestData.SubTotalS));
        clickEmployeeVatCheckBox(vatValue);
        switch (vatValue){
            case "With":
                Assert.assertTrue(getEmployeeTotalInputText().replaceAll(" ","").contains(CaseTypeTestData.TotalS));
                break;
            case "Without":
                Assert.assertTrue(getEmployeeTotalInputText().replaceAll(" ","").contains(CaseTypeTestData.SubTotalS));
                break;
        }


    }
}
