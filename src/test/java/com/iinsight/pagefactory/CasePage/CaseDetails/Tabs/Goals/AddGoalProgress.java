package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Goals;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddGoalProgress extends GenericWrappers {

    @FindBy(xpath="//div[text()='Add Progress']")
    public WebElement addProgress;
    @FindBy(id="level3_form_close")
    public WebElement crossButton;
    @FindBy(id="id_goal_status")
    public WebElement statusDropDOwn;
    @FindBy(id="id_goal_progress_goal")
    public WebElement goalDropDown;
    @FindBy(xpath="//div[@id='goal_progress.progress_notes_dialog'][1]")
    public WebElement descriptionInput;
    @FindBy(id="case_reopen_1")
    public WebElement saveButton;
    @FindBy(id="case_reopen_2")
    public WebElement cancelButton;
}
