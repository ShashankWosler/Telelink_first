package com.iinsight.pages.CasePage.CaseListing;

import com.iinsight.pagefactory.CasePage.CaseListing.CaseListingMain;
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
    public void clickAddCaseButton(){clickButtonWithOutScroll(addCaseBtn);
    }
    public void clickCaseBillingButton(){clickButtonWithOutScroll(addCaseBillingBtn);
    }
    public void clickSearchButton(){
        waitElementToBeClickable(searchBtn);
        clickWithJS(searchBtn);
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

   // D E L E T E   -   P O P - U P
    public void clickProceedAnywayDeleteBtn(){clickButtonWithOutScroll(proceedAnywayBtn);
    }
    public void clickDeleteCaseBtn(){clickButtonWithOutScroll(deleteCaseBtn);
    }

    public void clickFilterDropDown(){
        waitElementToBeClickable(filterDropDown);
        clickButtonWithOutScroll(filterDropDown);
    }
    public String getFilterInputText(){return getAttributeValue(filterInput,"value");
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
}

