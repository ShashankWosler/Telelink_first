package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.ReportSelectionCriteriaPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException;

public class ReportSelectionStep extends ReportSelectionCriteriaPage {
    @And("User Go to the Report Selection Criteria, Select Date Range from DropDown")
    public void selectDateRangeFromBottomOfPage(){
        setZoomLevel(0.6);
        waitFor(4000);
        scrollToReportSelection();
        isDateDropDownVisible();
        clickDateDropDown();
        selectCustomRangeFromDateDropDown();
    }
    @And("User Select the date From and To")
    public void selectFromToDate(){
        try{
            clickFromDateButton();
            selectFromDate();
            clickToDateButton();
            selectToDate();}
        catch(ElementNotInteractableException e){
            System.out.println("CaseLogsStep.selectFromToDate() -->> "+e.getMessage());
        }
    }
    @And("User Sort it by Ascending order")
    public void sortItAscendingOrder(){selectAscendingFromOrderDropdown();
    }
    @And("User Select Note type from the dropdown")
    public void userSelectNoteType(){
        userClickOnNoteType();
        selectOnlyPrivileged();
    }
    @And("User click on the print-preview button")
    public void userClickOnPrintPreviewButton(){
        try{
            clickOnPrintPreviewButton();
            String currentWindow = getWindowTitle();
            SwitchToParentWindow(currentWindow);}
        catch(Exception e){
            System.out.println("CaseLogsStep.userClickOnPrintPreviewButton() -->> "+ e.getMessage());
        }
    }
    @And("User click on the Export button")
    public void userClickOnExportButton(){ clickOnExportButton();
    }
}
