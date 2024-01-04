package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminNotes extends GenericWrappers {

    @FindBy(id = "li_admin_note")
    public WebElement admin_notes_tab;

    @FindBy(id = "admin_notes_new")
    public WebElement add_new_btn;

    @FindBy(id = "admin_notes_details")
    public WebElement details_btn;

    @FindBy(id="admin_notes_delete")
    public WebElement delete_btn;

    @FindBy(css = "input#admin_notes_list_search_text")
    public WebElement search_tab;

    @FindBy(id = "admin_notes_list_search_field")
    public WebElement get_by_dropdown_tab;

    @FindBy(id = "admin_notes_list_find")
    public WebElement find_btn;

    @FindBy(id="small_fields_view_admin_notes_list")
    public WebElement field_edit_btn;

    @FindBy(css = "[id='admin_notes_list'] tr:nth-child(1)")
    public WebElement table_index1;


    // D E L E T E      P O P   U P
    @FindBy(id="contact_new_1")
    public WebElement deletePopUpOkButton;
}
