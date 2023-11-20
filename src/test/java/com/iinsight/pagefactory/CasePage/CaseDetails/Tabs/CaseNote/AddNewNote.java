package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewNote extends GenericWrappers {

    @FindBy(css="input[id='users.name']")
    public WebElement employee_tab;

    @FindBy(css = "input[id='costs.role']")
    public WebElement role_dropdown;

    @FindBy(css="div[id='drop_down_multiselect'] div:nth-child(1)")
    public WebElement role_dropdown_value1;

    @FindBy(css="input[id='notes.date_created']")
    public WebElement created_date;

    @FindBy(css = "input[id='notes.time_created']")
    public WebElement created_time;

    @FindBy(css = "input[id='notes.title']")
    public WebElement title;

    @FindBy(css="input[id='template_title']")
    public WebElement case_note_template_dropdown;

    @FindBy(css="div#drop_down_multiselect")
    public WebElement case_note_template_dropdown_value;

    @FindBy(css="button[id='notes.signature_clear']")
    public WebElement clear_btn;

    @FindBy(id="notes_new_3")
    public WebElement save_btn;

    @FindBy(id="notes_new_4")
    public WebElement cancel_btn;

}
