package com.iinsight.steps.ToolBox;

import com.iinsight.pages.Toolbox.Side.Reports.ReportsListingPage;
import io.cucumber.java.en.And;
import org.apache.commons.text.WordUtils;
import org.junit.Assert;

public class ReportListingStep extends ReportsListingPage {
    String getUsername = WordUtils.capitalizeFully(globalUserName.substring(0, globalUserName.indexOf("@")).replace("."," "));
    String[] HardCodedName = getUsername.split(" ");

    @And("User Select {string} Type From Report Option")
    public void selectReportType(String reportType){
        waitFor(3000);
        Assert.assertTrue(isKpiReportsVisible());
        switch (reportType){
            case "Billing By Case":
                mouseOver(kpiByCase);
                clickKpiByCase();
                break;
            case "Billing By Employee":
                mouseOver(kpiByEmployee);
                clickKpiByEmployee();
                break;
            case "Billing By Employee Group":
                mouseOver(byEmployeeGrouped);
                clickByEmployeeGrouped();
                break;
        } isFilterHeaderVisible();
    }
    @And("User Select {string} From Filter Section")
    public void selectReportFilters(String filterType){
        switch (filterType){
            case "Business Division":
                mouseOver(busDivDropDown);
                clickBusDivDropDown();
                break;
            case "Service Contract":
                mouseOver(serviceDropDown);
                clickServiceDropDown();
                break;
        }
        waitFor(2000);
        Assert.assertTrue(isFilterSelectAllVisible());
        clickFilterSelectAll();
        waitFor(2000);
        clickFilterCrossButton();
    }
    @And("User Select {string} From Date Filter Section")
    public void selectDateFilter(String dateDropDownValue){
        clickDateDropDown();
        selectDropDownFromText(dateDropDownValue);
        Assert.assertEquals(getAttributeValue(dateInput,"value"),dateDropDownValue);
    }

    @And("User Select Selected Employee From Employee Filter Section")
    public void selectEmployeeFilter(){
        mouseOver(employeeClear);
        clickEmployeeClearButton();
        Assert.assertEquals(getText(selectedEmployeeText),"0 employees selected");
        // Enter Employee Name
        enterEmployeeInput(HardCodedName[0]);
        enterTextAppend(employeeInput," "+HardCodedName[1]);
        try {
            selectDropDownFromText(HardCodedName[0] + " " + HardCodedName[1]);
        } catch (Exception e){
            System.out.println("ReportListingStep.selectReportFilters()-"+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            selectDropDownFromText(HardCodedName[0] + " " + HardCodedName[1]);
        }
        waitFor(4000);
        clickSelectedEmployee();
    }
    @And("User Click on Build Report")
    public void clickOnBuildExport(){
        clickExportButton();
    }
}
