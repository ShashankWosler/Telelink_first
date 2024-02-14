package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Goals;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoalsMain extends GenericWrappers {

    @FindBy(id="cases_goal_new")
    public WebElement newButton;
    @FindBy(id="cases_goal_edit")
    public WebElement editButton;
    @FindBy(id="cases_goal_delete")
    public WebElement deleteButton;
    @FindBy(id="cases_goal_export")
    public WebElement exportButton;
    @FindBy(id="cases_goal_progress_new")
    public WebElement addProgressButton;

    // G O A L S    T A B
    @FindBy(id="header_goals")
    public WebElement goalsTab;
    @FindBy(id="header_goal_progress")
    public WebElement goalTrackingTab;

    // G O A L S    T A B     E L E M E N T S
    @FindBy(css="input#goals_list_search_text")
    public WebElement searchInput;
    @FindBy(css="goals_list_search_field")
    public WebElement assignToInput;        //getAttribute - "value"
    @FindBy(css="[name='goals_list_button']")
    public WebElement assignToDropDown;     // Assigned To, Priority, Status, Title
    @FindBy(id="goals_list_find")
    public WebElement findButton;
    @FindBy(id="small_fields_view_goals_list")
    public WebElement fieldEditButton;

    // G O A L S    T A B   L I S T I G
    @FindBy(css="[id='goals.goal_column']")
    public WebElement getTitle;     //getAttribute - "title"
    @FindBy(css="[id='goals.goal_due_date_column']")
    public WebElement getData;     //getAttribute - "title" = 01-02-2024
    @FindBy(xpath="(//td[@id='list.description_column'])[position() = last()]")
    public WebElement getStatus;   //getAttribute - "title" = Started, Completed
    @FindBy(xpath="//div[@id='goals_list']//td[@id='prestatus2']/img")
    public WebElement getPriority;  //getAttribute - "data-tooltip" = low, medium, high
    @FindBy(xpath="//div[@id='goals_list']//progress")
    public WebElement getProgress;   //getAttribute - "value", "max" = 100

    // G O A L S    T R A C K I N G     T A B
    @FindBy(css="input#goals_progress_list_search_text")
    public WebElement goalTrackSearchInput;
    @FindBy(id="goals_progress_list_search_field")
    public WebElement goalTrackByInput;     //getAttribute - "value"
    @FindBy(css="[name='goals_progress_list_button']")
    public WebElement goalTrackByDropDown;  // Goal Progress Id, Progress
    @FindBy(id="goals_progress_list_find")
    public WebElement goalTrackFindButton;
    @FindBy(id="small_fields_view_goals_progress_list")
    public WebElement goalTrackFieldEditButton;

    // G O A L S    T R A C K I N G     E L E M E N T S
    @FindBy(xpath="//div[@id='goals_progress_list']//td[@id='goals.goal_column']")
    public WebElement getGoalTrackTitle;    //getAttribute - "title"
    @FindBy(xpath="//div[@id='goals_progress_list']//td[@id='goal_progress.progress_note_column']")
    public WebElement getGoalTrackProgress;    //getAttribute - "title"

}
