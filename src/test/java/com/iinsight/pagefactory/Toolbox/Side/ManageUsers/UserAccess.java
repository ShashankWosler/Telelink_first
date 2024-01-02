package com.iinsight.pagefactory.Toolbox.Side.ManageUsers;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccess extends GenericWrappers {
    public UserAccess(){PageFactory.initElements(getDriver(), this);
    }
    //General
    @FindBy(id="users.priv_options")
    public WebElement canAccessTheOptionCheckbox;
    @FindBy(id="users.priv_other_list")
    public WebElement canAccessOtherListCheckbox;
    @FindBy(id="users.priv_todo")
    public WebElement canAccessToDoListCheckbox;

    //Case List
    @FindBy(id="users.priv_case_list")
    public WebElement accessCaseListCheckbox;
    @FindBy(id="users.priv_all_cases")
    public WebElement accessAllCasesCheckbox;
    @FindBy(id="users.priv_team_cases")
    public WebElement accessTeamCasesCheckbox;
    @FindBy(id="users.priv_archived_cases")
    public WebElement accessArchivedCasesCheckbox;

    //Admin
    @FindBy(id="users.priv_employee_list")
    public WebElement accessAdminSectionCheckbox;
    @FindBy(id="users.priv_can_access_own_employee_record")
    public WebElement accessOwnEmployeeRecordCheckbox;
    @FindBy(id="users.priv_can_access_all_other_employee_record")
    public WebElement accessAllEmployeeRecordCheckbox;
    @FindBy(id="users.priv_can_access_only_assigned_employee_record")
    public WebElement accessOnlyAssignedEmployeeRecordCheckbox;


}
