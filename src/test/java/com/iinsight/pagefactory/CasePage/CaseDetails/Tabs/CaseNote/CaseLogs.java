package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseLogs extends GenericWrappers {

    @FindBy(id = "li_log_note")
    public WebElement getCase_log_tab;

    @FindBy(id="log_notes_details")
    public WebElement details_btn;

    @FindBy(css="input#log_list_search_text")
    public WebElement search_tab;

    @FindBy(id = "log_list_search_field")
    public WebElement get_by_dropdown_tab;

    @FindBy(id = "log_list_find")
    public WebElement find_btn;

    @FindBy(id = "log_list_find_small")
    public WebElement field_edit_btn;

    @FindBy(css = "[id='log_list'] tr:nth-child(1)")
    public WebElement table_index1;

    @FindBy(xpath="(//td[@id=\"notes.title_column\"])[1]")
    public WebElement title_text;

}