package com.iinsight.pages.CasePage.CaseListing;

import com.iinsight.pagefactory.CasePage.CaseListing.CaseListingMain;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;

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
    public void clickDropDownCases(){clickButtonWithOutScroll(dropDown);
    }
    public void clickDropDownExportValue(){clickButtonWithOutScroll(dropDownValue1);
    }
    public void clickDropDownSaveViewValue(){clickButtonWithOutScroll(dropDownValue2);
    }
    public void clickDropDownArchiveCaseValue(){clickButtonWithOutScroll(dropDownValue3);
    }
    public void clickDropDownDeleteCaseValue(){clickButtonWithOutScroll(dropDownValue4);
    }
    public void clickFilterDropDown(){clickButtonWithOutScroll(filterDropDown);
    }
    public void clickFilterDropDownMyCaseValue(){clickButtonWithOutScroll(filterDropDownValue4);
    }
    public boolean isSearchButtonVisible(){return isElementDisplayed(searchBtn);
    }
    public boolean isSearchedTableIsVisible(){return isElementDisplayed(getSearchedTableRow);}
}

