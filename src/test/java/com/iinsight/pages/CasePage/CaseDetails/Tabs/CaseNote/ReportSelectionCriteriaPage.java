package com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote.ReportSelectionCriteria;
import org.openqa.selenium.support.PageFactory;

public class ReportSelectionCriteriaPage extends ReportSelectionCriteria {
    public ReportSelectionCriteriaPage(){PageFactory.initElements(getDriver(), this);
    }
    public String getDownloadedReportCount(){
        waitElementToBeClickable(downloadedReportCount);
        return getText(downloadedReportCount);}
    public boolean isFromDateButtonVisible(){
        return isElementDisplayed(from_btn);
    }
    public void clickFromDateButton(){clickButtonWithOutScroll(from_btn);
    }
    public String getDateValue(){return getAttributeValue(dateInput,"value");}
    public void clickToDateButton(){clickButtonWithOutScroll(to_btn);
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
    public void selectDescendingFromOrderDropdown(){
        SelectByVisibleText(order_dropdown,"Descending");
    }
    public void clickNoteTypeDropDown(){clickButtonWithOutScroll(noteTypeDropDown);}
    public String getNoteTypeInputText(){return getAttributeValue(noteTypeInput,"value");}
    public void selectOnlyPrivileged(){clickButtonWithOutScroll(dropdown_value3);
    }
    public void clickOnPrintPreviewButton(){clickButtonWithOutScroll(print_preview_btn);
    }
    public void clickOnExportButton(){clickButtonWithOutScroll(export_btn);
    }
}
