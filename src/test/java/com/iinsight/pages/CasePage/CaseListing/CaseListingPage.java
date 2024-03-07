package com.iinsight.pages.CasePage.CaseListing;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseListing.CaseListingMain;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CaseListingPage extends CaseListingMain {
    public CaseListingPage(){PageFactory.initElements(getDriver(), this);
    }

    // T A B L E
    public void clickFirstRowFromTable(){
        //mouseDoubleClick(caseListIndex1);
        waitElementToBeClickable(caseListIndex1);
        doubleClickWithJS(caseListIndex1);
    }
    public boolean isEmptySearchResultVisible(){
        waitVisibilityOfElement(emptySearchResult);
        return isElementDisplayed(emptySearchResult);
    }
    public boolean isArchiveTextVisible(){
        waitVisibilityOfElement(archiveText);
        return isElementDisplayed(archiveText);
    }
    public boolean isClickListViewVisible(){return isElementDisplayed(listView);
    }
    // C H A N G E       V I E W
    public void clickListView(){clickButtonWithOutScroll(listView);
    }
    public void clickListDetailsView(){clickButtonWithOutScroll(listDetailsView);
    }

    // T O P    W R A P P E R   -   B U T T O N S
    public void clickAddCaseButton(){
        waitElementToBeClickable(addCaseBtn);
        clickButtonWithOutScroll(addCaseBtn);
    }

    public void clickCaseBillingButton(){clickButtonWithOutScroll(addCaseBillingBtn);
    }
    public void clickSearchButton(){
        try {
            waitElementToBeClickable(searchBtn);
            clickWithJS(searchBtn);
        }catch (Exception e){
            System.out.println("CaseListingPage.clickSearchButton()- "+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            waitElementToBeClickable(searchBtn);
            clickWithJS(searchBtn);
        }
    }
    public void clickFieldsEditButton(){clickButtonWithOutScroll(fieldsEditBtn);
    }
    public void clickEllipsesIcon(){clickButtonWithOutScroll(ellipsesIcon);
    }

    // F U L L      S C R E E N
    public boolean isBackButtonFullScreenVisible(){
        waitVisibilityOfElement(backButtonFullScreen);
        return isElementDisplayed(backButtonFullScreen);
    }
    public void clickBackButtonFullScreen(){clickButtonWithOutScroll(backButtonFullScreen);
    }


    // E L L I P S E S  -  V A L U E S
    public void clickDropDownExportValue(){clickButtonWithOutScroll(dropDownValue1);
    }
    public void clickDropDownSaveViewValue(){clickButtonWithOutScroll(dropDownValue2);
    }
    public void clickDropDownArchiveCaseValue(){clickButtonWithOutScroll(dropDownValue3);
    }

    public void clickDropDownDeleteCaseValue(){clickButtonWithOutScroll(dropDownValue4);
    }
    public void clickRestoreArchiveBtn(){clickButtonWithOutScroll(restoreArchiveBtn);
    }

    // A R C H I V E    P O P - U P
    public void clickPopUpCrossBtn(){clickButtonWithOutScroll(popUpCrossBtn);
    }
    public void clickArchiveConfirmBtn(){clickButtonWithOutScroll(archiveConfirmBtn);
    }

    public void clickArchiveCancelBtn(){clickButtonWithOutScroll(archiveCancelBtn);
    }
    public void enterPassword() {enterTextWithoutScroll(txt_Password, globalPassword);
    }
    public String getNewCreatedCaseID(){
        String [] getIDArray = getText(newCreatedCase).split(" ");
        return getIDArray[2];
    }

    // S A V E  P O P - U P
    public void enterViewName(String text){
        enterText(viewNameField, text);
    }
    public void clickOnOrganisationCheckbox(){
        clickButtonWithOutScroll(organisationViewBtn);
    }
    public void clickOnNewViewCheckbox(){
        clickButtonWithOutScroll(newViewSaveBtn);
    }
    // S A V E  P O P - U P -- Delete Popup
    public void clickONOKBtn(){
        clickButtonWithOutScroll(okBtn);
    }
    public void clickONCancelBtn(){
        clickButtonWithOutScroll(cancelDeleteBtn);
    }
    // D E L E T E   -   P O P - U P
    public void clickProceedAnywayDeleteBtn(){clickButtonWithOutScroll(proceedAnywayBtn);
    }
    public void clickDeleteCaseBtn(){clickButtonWithOutScroll(deleteCaseBtn);
    }

    public void verifyCostCount(){
        String str = getAttributeValue(costCount, "Value");
        System.out.println("Costs Count in Delete Popup: "+ str);

        Assert.assertEquals(str, CaseTypeTestData.costSize);
    }
    public void verifyInvoiceCount(){
        String str = getAttributeValue(invoicesCount, "Value");
        System.out.println("Invoices Count in Delete Popup: "+ str);

        Assert.assertEquals(str, CaseTypeTestData.invoiceSize);
    }
    public void verifyTransactionsCount(){
        String str = getAttributeValue(transactionsCount, "Value");
        System.out.println("Transactions Count in Delete Popup: "+ str);

        Assert.assertEquals(str, CaseTypeTestData.transactionsSize);
    }
    public void verifyTasksCount(){
        String str = getAttributeValue(tasksCount, "Value");
        System.out.println("Tasks Count in Delete Popup: "+ str);

        Assert.assertEquals(str, CaseTypeTestData.tasksSize);
    }
    public void verifyContactsCount(){
        String str = getAttributeValue(contactCount, "Value");
        System.out.println("Contacts Count in Delete Popup: "+ str);

        Assert.assertEquals(str, CaseTypeTestData.contactsSize);
    }
    public void verifyPlansCount(){
        String str = getAttributeValue(planCount, "Value");
        System.out.println("Plans Count in Delete Popup: "+ str);

        Assert.assertEquals(str, CaseTypeTestData.plansSize);
    }
    public void verifyAppointmentsCount(){
        int str = Integer.parseInt(getAttributeValue(appointmentCount, "Value"));
        System.out.println("Appointment Count in Delete Popup: "+ str);

        Assert.assertEquals(str, CaseTypeTestData.appointmentSize);
    }
    public void verifyDocumentsCount(){
        String str = getAttributeValue(documentationCount, "Value");
        System.out.println("Documents Count in Delete Popup: "+ str);

        Assert.assertEquals(str, CaseTypeTestData.documentSize);
    }
    public void clickFilterDropDown(){
        waitElementToBeClickable(filterDropDown);
        clickButtonWithOutScroll(filterDropDown);
    }
    public String getFilterInputText(){return getAttributeValue(filterInput,"value");
    }
    public void clickDeleteIconFromDropdown(String dropDownvalue){
        By elem = By.xpath("//div[@id='drop_down_multiselect']/child::div[text()="+'"'+dropDownvalue+'"'+"]//i[@title='Remove']");
        waitPresenceOfElementLocated(elem);
        clickButtonWithOutScroll(getDriver().findElement(elem));
    }
    public void clickFilterDropDownMyCaseValue(){clickButtonWithOutScroll(filterDropDownValue4);
    }
    // S E A R C H      S I D E     B A R
    public boolean isSearchButtonVisible(){return isElementDisplayed(searchBtn);
    }
    public boolean isSearchedTableIsVisible(){return isElementDisplayed(getSearchedTableRow);}


    //  W A R N I N G - S E T T I N G S : [Archival,Deletion]
    public boolean isDeleteWarningVisible(){
        waitVisibilityOfElement(deleteWarning);
        return isElementDisplayed(deleteWarning);
    }
    public boolean isArchiveWarningVisible(){
        waitVisibilityOfElement(archiveWarning);
        return isElementDisplayed(archiveWarning);
    }

    // T A B L E    H E A D E R
    public int getCaseListHeadersSize(){return caseListingHeaderCount.size();
    }
    public void clickOnCaseIDColumnSort(){
        clickWithJS(caseIDColumn);
    }
}

