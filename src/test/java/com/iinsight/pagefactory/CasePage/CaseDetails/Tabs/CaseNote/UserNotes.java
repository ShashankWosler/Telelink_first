package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserNotes extends GenericWrappers {

    @FindBy(id = "li_user_note")
    public WebElement user_notes_tab;

    @FindBy(id = "cases_notes_new")
    public WebElement add_new_btn;

    @FindBy(id = "cases_notes_delete")
    public WebElement delete_btn;

    @FindBy(id = "cases_notes_details")
    public WebElement details_btn;

    @FindBy(css="input#notes_list_search_text")
    public WebElement search_tab;

    @FindBy(css="[name='notes_list_button']")
    public WebElement get_by_dropdown_tab;

    @FindBy(id = "notes_list_find")
    public WebElement find_btn;

    @FindBy(id = "small_fields_view_notes_list")
    public WebElement field_edit_btn;

    @FindBy(css="[id='notes_list'] tr:nth-child(1)")
    public WebElement table_index1;


}
