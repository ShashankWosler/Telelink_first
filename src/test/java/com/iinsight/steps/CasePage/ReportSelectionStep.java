package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.ReportSelectionCriteriaPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException;

public class ReportSelectionStep extends ReportSelectionCriteriaPage {
    @And("User Go to the Report Selection Criteria Select {string} from DropDown")
    public void selectDateRangeFromBottomOfPage(String dateDropDownValue){
        CaseTypeTestData.ReportToDownload = getDownloadedReportCount();
        CaseTypeTestData.ReportToDownloadI = Integer.parseInt(CaseTypeTestData.ReportToDownload);
        waitFor(4000);
        isDateDropDownVisible();
        clickDateDropDown();
        selectDropDownFromText(dateDropDownValue);
        Assert.assertEquals(getDateValue(),dateDropDownValue);
    }
    @And("User Sort it by {string} order")
    public void sortItAscendingOrder(String sortValue){
        SelectByVisibleText(order_dropdown,sortValue);
    }
    @And("User Select {string} from the Note Types")
    public void userSelectNoteType(String noteTypeValue){
        clickNoteTypeDropDown();
        selectDropDownFromText(noteTypeValue);
        Assert.assertEquals(getNoteTypeInputText(),noteTypeValue);

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
    public void userClickOnExportButton(){
        clickOnExportButton();
        waitFor(5000);
        String exp = String.valueOf(++CaseTypeTestData.ReportToDownloadI);
        Assert.assertEquals(getDownloadedReportCount(),exp);
    }
}
