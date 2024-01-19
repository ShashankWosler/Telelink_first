package com.iinsight.pages.CasePage.CaseListing;

import com.iinsight.pagefactory.CasePage.CaseListing.CaseListingMain;
import org.openqa.selenium.support.PageFactory;

public class CaseListingPage extends CaseListingMain {
    public CaseListingPage(){PageFactory.initElements(getDriver(), this);
    }
    public void getFirstRowFromTable(){clickButtonWithOutScroll(caseListIndex1);
    }
    public boolean isClickListViewVisible(){return isElementDisplayed(listView);
    }
    public void clickListView(){clickButtonWithOutScroll(listView);
    }
    public void clickListDetailsView(){clickButtonWithOutScroll(listDetailsView);
    }
    public void clickAddCaseButton(){clickButtonWithOutScroll(addCaseBtn);
    }
    public void clickCaseBillingButton(){clickButtonWithOutScroll(addCaseBillingBtn);
    }
    public void clickSearchButton(){clickButtonWithOutScroll(searchBtn);
    }
    public void clickFieldsEditButton(){clickButtonWithOutScroll(fieldsEditBtn);
    }
    public void clickEllipsesIcon(){clickButtonWithOutScroll(ellipsesIcon);
    }
    public void clickDropDownExportValue(){clickButtonWithOutScroll(dropDownValue1);
    }
    public void clickDropDownSaveViewValue(){clickButtonWithOutScroll(dropDownValue2);
    }
    public void clickDropDownArchiveCaseValue(){clickButtonWithOutScroll(dropDownValue3);
    }
    public void clickArchiveConfirmBtn(){clickButtonWithOutScroll(archiveConfirmBtn);
    }
    public void clickDropDownDeleteCaseValue(){clickButtonWithOutScroll(dropDownValue4);
    }
    public void clickProceedAnywayDeleteBtn(){clickButtonWithOutScroll(proceedAnywayBtn);
    }
    public void clickDeleteCaseBtn(){clickButtonWithOutScroll(deleteCaseBtn);
    }
    public void clickFilterDropDown(){clickButtonWithOutScroll(filterDropDown);
    }
    public String getFilterInputText(){return getAttributeValue(filterInput,"value");
    }
    public void clickFilterDropDownMyCaseValue(){clickButtonWithOutScroll(filterDropDownValue4);
    }
    public boolean isSearchButtonVisible(){return isElementDisplayed(searchBtn);
    }
    public boolean isSearchedTableIsVisible(){return isElementDisplayed(getSearchedTableRow);}
    public void enterPassword() {enterTextWithoutScroll(txt_Password, globalPassword);
    }
}

