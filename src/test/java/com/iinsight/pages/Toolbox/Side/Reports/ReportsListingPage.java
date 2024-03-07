package com.iinsight.pages.Toolbox.Side.Reports;

import com.iinsight.pagefactory.Toolbox.Side.Reports.ReportsListing;
import org.openqa.selenium.support.PageFactory;

public class ReportsListingPage extends ReportsListing {
    public ReportsListingPage(){PageFactory.initElements(getDriver(), this);
    }

    public boolean isKpiReportsVisible(){
        mouseOver(kpiReports);
        waitVisibilityOfElement(kpiReports);
        waitElementToBeClickable(kpiReports);
        return isElementDisplayed(kpiReports);
    }

    // L I S T I N G
    public boolean isKpiByCaseVisible(){
        waitVisibilityOfElement(kpiByCase);
        return isElementDisplayed(kpiByCase);
    }
    public void clickKpiByCase(){
        waitElementToBeClickable(kpiByCase);
        clickButtonWithOutScroll(kpiByCase);
    }
    public void clickKpiByEmployee(){
        waitElementToBeClickable(kpiByEmployee);
        clickButtonWithOutScroll(kpiByEmployee);
    }
    public void clickByEmployeeGrouped(){
        waitElementToBeClickable(byEmployeeGrouped);
        clickButtonWithOutScroll(byEmployeeGrouped);
    }

    // F I L T E R S
    public boolean isFilterHeaderVisible(){
        waitVisibilityOfElement(filterHeader);
        return isElementDisplayed(filterHeader);
    }

    // P R O F I L E
    public void enterProfileInput(String value){
        waitElementToBeClickable(profileInput);
        enterText(profileInput,value);
    }
    public void clickProfileDropDown(){
        waitElementToBeClickable(profileDropDown);
        clickButtonWithOutScroll(profileDropDown);
    }
    public void clickProfileLoadButton(){
        waitElementToBeClickable(profileLoadButton);
        clickButtonWithOutScroll(profileLoadButton);
    }
    public void clickProfileSaveButton(){
        waitElementToBeClickable(profileSaveButton);
        clickButtonWithOutScroll(profileSaveButton);
    }
    public void clickProfileDefaultButton(){
        waitElementToBeClickable(profileDefaultButton);
        clickButtonWithOutScroll(profileDefaultButton);
    }
    public void clickProfileDeleteButton(){
        waitElementToBeClickable(profileDeleteButton);
        clickButtonWithOutScroll(profileDeleteButton);
    }

    //  S E L E C T E D     E M P L O Y E E
    public void clickSelectedEmployee(){
        waitElementToBeClickable(selectedEmployee);
        clickButtonWithOutScroll(selectedEmployee);}

    public void enterEmployeeInput(String value){
        waitElementToBeClickable(employeeInput);
        enterText(employeeInput,value);
    }
    public void clickEmployeeDropDown(){
        waitElementToBeClickable(employeeDropDown);
        clickButtonWithOutScroll(employeeDropDown);
    }
    public void clickEmployeeClearButton(){
        waitElementToBeClickable(employeeClear);
        clickButtonWithOutScroll(employeeClear);
    }
    public void clickEmployeeRemoveButton(){
        waitElementToBeClickable(employeeRemove);
        clickButtonWithOutScroll(employeeRemove);
    }
    public void clickEmployeeSortButton(){
        waitElementToBeClickable(employeeSort);
        clickButtonWithOutScroll(employeeSort);
    }
    public void clickEmployeeAllCheckBox(){
        waitElementToBeClickable(employeeAllCheckBox);
        clickButtonWithOutScroll(employeeAllCheckBox);
    }


    // S E L E C T E D      T E A M S
    public void enterTeamInput(String value){
        waitElementToBeClickable(teamInput);
        enterText(teamInput,value);
    }
    public void clickTeamDropDown(){
        waitElementToBeClickable(teamDropDown);
        clickButtonWithOutScroll(teamDropDown);
    }
    public void clickTeamClearButton(){
        waitElementToBeClickable(teamClearButton);
        clickButtonWithOutScroll(teamClearButton);
    }
    public void clickTeamRemoveButton(){
        waitElementToBeClickable(teamRemoveButton);
        clickButtonWithOutScroll(teamRemoveButton);
    }
    public void clickTeamSortButton(){
        waitElementToBeClickable(teamsortButton);
        clickButtonWithOutScroll(teamsortButton);
    }
    public void clickTeamEditButton(){
        waitElementToBeClickable(teamEditButton);
        clickButtonWithOutScroll(teamEditButton);
    }

    // S E L E C T E D      B I L L     T O
    public void enterBillToInput(String value){
        waitElementToBeClickable(billToInput);
        enterText(billToInput,value);
    }
    public void clickBillToDropDown(){
        waitElementToBeClickable(billToDropDown);
        clickButtonWithOutScroll(billToDropDown);
    }
    public void clickBillToClear(){
        waitElementToBeClickable(billToClear);
        clickButtonWithOutScroll(billToClear);
    }
    public void clickBillToRemove(){
        waitElementToBeClickable(billToRemove);
        clickButtonWithOutScroll(billToRemove);
    }
    public void clickBillToSort(){
        waitElementToBeClickable(billToSort);
        clickButtonWithOutScroll(billToSort);
    }

    // D A T E S    R A N G E
    public void enterDateInput(String value){
        waitElementToBeClickable(dateInput);
        enterText(dateInput,value);
    }
    public void clickDateDropDown(){
        mouseOver(dateDropDown);
        waitElementToBeClickable(dateDropDown);
        clickButtonWithOutScroll(dateDropDown);
    }
    public void clickDateFromInput(){
        mouseOver(dateFromInput);
        waitElementToBeClickable(dateFromInput);
        clickButtonWithOutScroll(dateFromInput);
    }
    public void clickDateFromDropDown(){
        mouseOver(dateFromDropDown);
        waitElementToBeClickable(dateFromDropDown);
        clickButtonWithOutScroll(dateFromDropDown);
    }
    public void clickDateToInput(){
        mouseOver(dateToInput);
        waitElementToBeClickable(dateToInput);
        clickButtonWithOutScroll(dateToInput);
    }
    public void clickDateToDropDown(){
        mouseOver(dateToDropDown);
        waitElementToBeClickable(dateToDropDown);
        clickButtonWithOutScroll(dateToDropDown);
    }

    //  CHARGE CODE TYPE
    public void enterCodeInput(String value){
        waitElementToBeClickable(codeInput);
        enterText(codeInput,value);
    }
    public void clickCodeDropDown(){
        waitElementToBeClickable(codeDropDown);
        clickButtonWithOutScroll(codeDropDown);
    }

    // BUSINESS DIVISION
    public void enterBusDivInput(String value){
        waitElementToBeClickable(busDivInput);
        enterText(busDivInput,value);
    }
    public void clickBusDivDropDown(){
        waitElementToBeClickable(busDivDropDown);
        clickButtonWithOutScroll(busDivDropDown);
    }

    // C O M M O N
    public boolean isFilterSelectAllVisible(){
        waitVisibilityOfElement(filterSelectAll);
        return isElementDisplayed(filterSelectAll);
    }
    public void clickFilterSelectAll(){
        waitElementToBeClickable(filterSelectAll);
        clickButtonWithOutScroll(filterSelectAll);
    }
    public void clickFilterSelectNone(){
        waitElementToBeClickable(filterSelectNone);
        clickButtonWithOutScroll(filterSelectNone);
    }
    public void clickFilterSelectInvert(){
        waitElementToBeClickable(filterSelectInvert);
        clickButtonWithOutScroll(filterSelectInvert);
    }
    public void clickFilterCrossButton(){
        waitElementToBeClickable(filterCrossButton);
        clickButtonWithOutScroll(filterCrossButton);
    }

    // SERVICE CONTRACT
    public void enterServiceInput(String value){
        waitElementToBeClickable(serviceInput);
        enterText(serviceInput,value);
    }
    public void clickServiceDropDown(){
        waitElementToBeClickable(serviceDropDown);
        clickButtonWithOutScroll(serviceDropDown);
    }

    // BUILD & EXPORT BUTTON
    public void clickExportButton(){
        waitElementToBeClickable(exportButton);
        clickButtonWithOutScroll(exportButton);
    }
}