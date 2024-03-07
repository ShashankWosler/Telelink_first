package com.iinsight.steps.ToolBox;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.Toolbox.Side.Reports.ReportPreviewPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ReportPreviewStep extends ReportPreviewPage {
    @Then("User Verify Amount of {string} Report")
    public void verifyReportPrices(String reportType){
        Assert.assertTrue(isCrossButtonVisible());
        switch (reportType){
            case "Billing By Case":
                verifyReportGetByCase();
                break;
            case "Billing By Employee Group":
                clickTabularReportTab();
                Assert.assertTrue(isGroupedByEmployeeAmountExVATVisible());

                // Duration - TOTAL & GRAND TOTAL
                String durationSum = Integer.toString(CaseTypeTestData.DurationsList.stream().mapToInt(Integer::parseInt).sum());
                Assert.assertEquals(getGroupedByEmployeeDurationText(),durationSum);
                Assert.assertEquals(getGroupedByEmployeeDurationTotalText(),durationSum);
                Assert.assertEquals(getGroupedByEmployeeDurationGrandTotalText(),durationSum);
                CaseTypeTestData.DurationsList.clear();

                // AMOUNT - TOTAL & GRAND TOTAL
                int expectedAmount = calculateAmount(getGroupedByEmployeeAmountExVAT1Text(),getGroupedByEmployeeVAT1Text());
                Assert.assertEquals(getGroupedByEmployeeAmountGrandTotalText(),String.valueOf(expectedAmount));
                Assert.assertEquals(getGroupedByEmployeeAmountTotalText(),String.valueOf(expectedAmount));

                // PROFIT - TOTAL & GRAND TOTAL
                int expectedProfit1 = calculateProfit(getGroupedByEmployeeAmountExVAT1Text(),getGroupedByEmployeeCostsExVAT1Text());
                Assert.assertEquals(getGroupedByEmployeeProfit1Text(),String.valueOf(expectedProfit1));
                Assert.assertEquals(getGroupedByEmployeeProfitGrandTotalText(),String.valueOf(expectedProfit1));
                Assert.assertEquals(getGroupedByEmployeeProfitTotalText(),String.valueOf(expectedProfit1));

                // MARGIN - TOTAL & GRAND TOTAL
                double expectedMargin1 = calculateMargin(getGroupedByEmployeeAmountExVAT1Text(),getGroupedByEmployeeCostsExVAT1Text());
                Assert.assertEquals(getGroupedByEmployeeMargin1Text(),String.valueOf((int) expectedMargin1));
                Assert.assertEquals(getGroupedByEmployeeMarginGrandTotalText(),String.valueOf((int) expectedMargin1));
                Assert.assertEquals(getGroupedByEmployeeMarginTotalText(),String.valueOf((int) expectedMargin1));

                break;
            case "Billing By Employee":
                int expectedProfit = calculateProfit(getByEmployeeAmountExVAT1Text(),getByEmployeeCostsExVAT1Text());
                Assert.assertEquals(getByEmployeeProfit1Text(),String.valueOf(expectedProfit));
                double expectedMargin = calculateMargin(getByEmployeeAmountExVAT1Text(),getByEmployeeCostsExVAT1Text());
                Assert.assertEquals(getByEmployeeMargin1Text(),String.valueOf((int) expectedMargin));
                break;
        }

    }
}
