package com.iinsight.pagefactory.Toolbox.Side.ManageUsers;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.sql.DriverManager.getDriver;

public class UserDetails extends GenericWrappers {
    public UserDetails(){PageFactory.initElements(getDriver(), this);
    }
    @FindBy(id="_tab_level2a_form_b")
    public WebElement userDetailsTab;
    @FindBy(id="users.job_title")
    public WebElement jobTitleField;
    @FindBy(id="users.qualifications")

    public WebElement qualificationField;
    @FindBy(id="users.provider_number")
    public WebElement providerNumberField;
    @FindBy(id="users.users.consultant_id")
    public WebElement consultantField;
    @FindBy(id="users.email")
    public WebElement emailField;
    @FindBy(id="users.second_email")
    public WebElement secondEmailField;
    @FindBy(id="users.first_name")
    public WebElement firstNameField;
    @FindBy(id="users.last_name")
    public WebElement lastNameField;
    @FindBy(id="users.phone")
    public WebElement phoneField;
    @FindBy(id="users.mobile")
    public WebElement mobileField;

    @FindBy(css="img[name='user_profiles_button']")
    public WebElement userProfileDropdown;
    @FindBy(css="img[name='employee_type_button']")
    public WebElement userTypeDropdown;
    @FindBy(css="img[name='users.title_button']")
    public WebElement titleDropdown;
    @FindBy(css="img[name='teamslist_button']")
    public WebElement selectTeamDropdown;

    @FindBy(id="users.userstatus")
    public WebElement disableCheckbox;
    @FindBy(id="users.without_login_ability")
    public WebElement withoutLoginAbilityCheckbox;
    @FindBy(id="users.with_login_ability")
    public WebElement withLoginAbilityCheckbox;
    @FindBy(id="users.change_password")
    public WebElement changePasswordCheckbox;
    @FindBy(id="users.mfa_successfully_enrolled")
    public WebElement untickToResetCheckbox;


}
