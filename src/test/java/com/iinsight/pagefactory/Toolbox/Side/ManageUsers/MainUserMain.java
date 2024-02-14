package com.iinsight.pagefactory.Toolbox.Side.ManageUsers;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainUserMain extends GenericWrappers {

    // T O P    B U T T O N S
    @FindBy(id="users_add")
    public WebElement newButton;
    @FindBy(id="user_list_delete")
    public WebElement deleteButton;
    @FindBy(id="user_list_exportt")
    public WebElement exportButton;
    @FindBy(css="[id='user_list.filter']")
    public WebElement displayInput;
    @FindBy(css="[name='user_list.filter_button']")
    public WebElement displayDropDown;
    @FindBy(id="go_find")
    public WebElement goButton;
    @FindBy(id="user_rate_apply")
    public WebElement addRulesButton;
    @FindBy(css="[id='table-search-icon']")
    public WebElement searchButton;
    @FindBy(css="[id='fields_view_multicriteria_user_list']")
    public WebElement fieldEditButton;
    @FindBy(css="[id='Fields View']")
    public WebElement saveViewButton;

    // L I S T I N G
    @FindBy(css="td[id='users.name_column']")
    public WebElement nameColumnFirst;     // getAttribute - "title"
    @FindBy(css="td[id='users.email_column']")
    public WebElement emailColumnFirst;     // getAttribute - "title"

    // T A B        B U T T O N S
    @FindBy(id="_tab_level2a_form_b")
    public WebElement userDetailsTab;
    @FindBy(id="_tab_level2b_form_b")
    public WebElement userAccessTab;
    @FindBy(id="_tab_level2c_form_b")
    public WebElement userViewTab;
    @FindBy(id="_tab_level2d_form_b")
    public WebElement userModifyTab;




}
