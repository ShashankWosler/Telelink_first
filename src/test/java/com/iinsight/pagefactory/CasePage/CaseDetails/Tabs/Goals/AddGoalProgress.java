package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Goals;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddGoalProgress extends GenericWrappers {

    @FindBy(xpath="//div[text()='Add Progress']")
    public WebElement addProgress;
    @FindBy(id="level3_form_close")
    public WebElement crossButton;
    @FindBy(id="id_goal_progress_goal")
    public WebElement goalDropDown;
    @FindBy(id="case_reopen_1")
    public WebElement saveButton;
    @FindBy(id="case_reopen_2")
    public WebElement cancelButton;

    //  C R E A T I N G    A    N E W    G O A L
    @FindBy(xpath = "//div[text()='Creating a new Goal']")
    public WebElement createPopUp;
    @FindBy(xpath = "//div[text()='Editing goal']")
    public WebElement editPopUp;
    @FindBy(css="[id='goals.goal']")
    public WebElement title;
    @FindBy(css="[id='goals.assigned_to_dialog']")
    public WebElement assignToInput;
    @FindBy(css="[name='goals.assigned_to_dialog_button']")
    public WebElement assignToDropDown;
    @FindBy(id="[id='goals.goal_due_date_dialog']")
    public WebElement dueDateInput;
    @FindBy(xpath = "//table[@class='tables date_table2']//tr[last()-1]//td[starts-with(text(), '2')][last()]")
    public WebElement getLastDueDate;
    @FindBy(css="[name='goals.goal_due_date_dialog_button']")
    public WebElement dueDateDropDown;
    @FindBy(id="id_goal_status")
    public WebElement status;       // SELECT - Started, Completed
    @FindBy(css="[id='goals.goal_priority_dialog']")
    public WebElement priority;     // SELECT - Low,Medium,High
    @FindBy(css="[id='goals.case_number_dialog']")
    public WebElement caseId;
    @FindBy(css="[name='goals_disabled']")
    public WebElement disabledCheckBox;
    @FindBy(xpath="//div[@class='ql-editor ql-blank']//p")
    public WebElement descriptionText;

}
