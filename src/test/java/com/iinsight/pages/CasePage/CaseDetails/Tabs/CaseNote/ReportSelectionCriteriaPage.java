package com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote.ReportSelectionCriteria;
import org.openqa.selenium.support.PageFactory;

public class ReportSelectionCriteriaPage extends ReportSelectionCriteria {
    public ReportSelectionCriteriaPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isFromDateButtonVisible(){
        return isElementDisplayed(from_btn);
    }
    public void clickFromDateButton(){
        //clickButtonWithOutScroll(from_btn);
        enterText(from_btn, "23-11-23");
    }
    public void clickToDateButton(){
        //clickButtonWithOutScroll(to_btn);
        enterText(to_date, "24-11-2023");
    }
    public void selectFromDate(){clickButtonWithOutScroll(from_date);
    }
    public void selectToDate(){clickButtonWithOutScroll(to_date);
    }
    public void selectNextMonth(){clickButtonWithOutScroll(nextMonthArrow);
    }
    public boolean isReportSelectionVisible(){return isElementDisplayed(reportSelectionTab);}
    public void scrollToReportSelection(){clickButtonWithOutScroll(reportSelectionTab);}
    public boolean isDateDropDownVisible(){return isElementDisplayed(date_dropdown);
    }
    public void clickDateDropDown(){clickButtonWithOutScroll(date_dropdown);
    }
    public void selectLastWeekFromDateDropDown(){clickButtonWithOutScroll(dropdown_value2);
    }
    public void selectCustomRangeFromDateDropDown(){clickButtonWithOutScroll(dropdown_value7);
    }
    public void selectAscendingFromOrderDropdown(){
        SelectByVisibleText(order_dropdown,"Ascending");
    }
    public void selectDescendingFromOrderDropdown(){
        SelectByVisibleText(order_dropdown,"Descending");
    }
    public void userClickOnNoteType(){clickButtonWithOutScroll(note_type_dropdown);
    }
    public void selectOnlyPrivileged(){clickButtonWithOutScroll(dropdown_value3);
    }
    public void clickOnPrintPreviewButton(){clickButtonWithOutScroll(print_preview_btn);
    }
    public void clickOnExportButton(){clickButtonWithOutScroll(export_btn);
    }
}
