package com.iinsight.steps.ToolBox;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.Toolbox.Side.TimeSheets.TimeSheetsMainPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class TimeSheetMainStep extends TimeSheetsMainPage {
    @And("User Verify the Billing and Employee Amounts")
    public void verifyBillingPriceFromInputsTab(){
        // SEARCH SIDE BAR
        Assert.assertTrue(isBillingButtonVisible());
        clickSearchButton();
        Assert.assertTrue(isSideBarVisible());
        clickByDropDown();
        selectDropDownFromText("Case No");
        Assert.assertEquals(getByInputText(),"Case No");
        enterSideBarInput(getTestDataValue("CompanyID"));
        Assert.assertTrue(isBackButtonVisible());
        clickSideBarSearchButton();

        // MAIN PAGE LISTING
        clickEmployeeDropDown();
        clickEmployeeAllFilterButton();
        waitElementToBeClickable(employeeInput);
        Assert.assertTrue(getEmployeeInputText().contains("Selected"));
        Assert.assertTrue(isTableListingVisible());
        getAllTimesheetChargesAmount();
        Assert.assertEquals(CaseTypeTestData.AmountsList, CaseTypeTestData.AmountsListTimeSheet);
        //int amountsSum = CaseTypeTestData.AmountsListTimeSheet.stream().mapToInt(Integer::parseInt).sum();
    }

}
