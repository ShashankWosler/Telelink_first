package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportSelectionCriteria extends GenericWrappers {
    @FindBy(id="case_notes_print_console")
    public WebElement reportSelectionTab;
    @FindBy(id="datefrom")
    public WebElement from_btn;
    @FindBy(css=".tables.date_table2 tr:nth-child(3) td:nth-child(5)")
    public WebElement from_date;
    @FindBy(css=".tables.date_table2 tr:nth-child(4) td:nth-child(5)")
    public WebElement to_date;
    @FindBy(xpath = "//td[@class='date_button'][2]")
    public WebElement nextMonthArrow;
    @FindBy(id="dateto")
    public WebElement to_btn;
    @FindBy(id="cases_notes_preview")
    public WebElement print_preview_btn;
    @FindBy(id="cases_notes_print_word")
    public WebElement export_btn;
    @FindBy(id="date-range")
    public WebElement date_tab; // Have 7 options
    @FindBy(css="[name='dates_button']")
    public WebElement date_dropdown; // Have 7 options
    @FindBy(css="div#drop_down_multiselect div:nth-child(1)")
    public WebElement dropdown_value1; // All Date, All Notes
    @FindBy(css="div#drop_down_multiselect div:nth-child(2)")
    public WebElement dropdown_value2; // Today, Exclude Privileged
    @FindBy(css="div#drop_down_multiselect div:nth-child(3)")
    public WebElement dropdown_value3; // Last Week, Only Privileged
    @FindBy(css="div#drop_down_multiselect div:nth-child(4)")
    public WebElement dropdown_value4; // Last Month
    @FindBy(css="div#drop_down_multiselect div:nth-child(5)")
    public WebElement dropdown_value5; // Last Quarter
    @FindBy(css="div#drop_down_multiselect div:nth-child(6)")
    public WebElement dropdown_value6; // Last 12 Month
    @FindBy(css="div#drop_down_multiselect div:nth-child(6)")
    public WebElement dropdown_value7; // Custom Range
    @FindBy(id="order")
    public WebElement order_dropdown;
    @FindBy(id="notes_types_options")
    public WebElement note_type_dropdown; // Have 3 Options
}
