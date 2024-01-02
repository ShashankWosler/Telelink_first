package com.iinsight.pagefactory.Toolbox.Side.ManageUsers;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserView extends GenericWrappers {
    public UserView(){PageFactory.initElements(getDriver(), this);
    }

    //Case List
    @FindBy(id="users.priv_view_client_tab")
    public WebElement accessClientTabCheckbox;
    @FindBy(id="users.priv_view_case_tab")
    public WebElement accessCaseTabCheckbox;
    @FindBy(id="users.priv_view_additional_tab")
    public WebElement accessAdditionalTabCheckbox;
    @FindBy(id="users.priv_archived_cases")
    public WebElement accessArchivedCasesCheckbox;
    @FindBy(id="users.priv_view_notes")
    public WebElement accessViewNotesCheckbox;
    @FindBy(id="users.priv_view_documentaton_tab")
    public WebElement accessDocumentationTabCheckbox;
    @FindBy(id="users.priv_view_documentaton_tab")
    public WebElement accessContactTabCheckbox;
    @FindBy(id="users.priv_view_costs_tab")
    public WebElement accessViewCostTAbCheckbox;
    @FindBy(id="users.priv_view_account_tab")
    public WebElement accessAccountTabCheckbox;

    //General
    @FindBy(id="users.priv_options")
    public WebElement canAccessTheOptionCheckbox;
    @FindBy(id="users.priv_other_list")
    public WebElement canAccessOtherListCheckbox;
    @FindBy(id="users.priv_todo")
    public WebElement canAccessToDoListCheckbox;


}
