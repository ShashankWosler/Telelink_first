package com.iinsight.pagefactory.Toolbox.Side.ManageUsers;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserViewAccessModify extends GenericWrappers {

    // U S E R      A C C E S S
    @FindBy(xpath="//div[contains(@id,'admin_access_container')]//img")
    public List<WebElement> userAccessCheckBox;     // 28, 29, 30 - Break
    @FindBy(xpath="(//button[@id='user_access_title'])[1]")
    public WebElement userAccessSaveButton;

    // U S E R      V I E W

    @FindBy(xpath="//div[contains(@id,'users_view_scroll_content')]//img")
    public List<WebElement> userViewCheckBox;
    @FindBy(id="user_view_title")
    public WebElement userViewSaveButton;

    // U S E R      M O D I F Y

    @FindBy(xpath="//div[contains(@id,'admin_modify_container')]//img")
    public List<WebElement> userModifyCheckBox;
    @FindBy(xpath="//div[contains(@id,'admin_modify_container')]//td[position() mod 2 = 0]")
    public List<WebElement> userModifyTexts;
    @FindBy(id="user_modify_title")
    public WebElement userModifySaveButton;
    @FindBy(css="[name='users.priv_can_archive_cases']")
    public WebElement archiveRestoreCheckBox;       //Can Archive/Restore Cases - value:[0,1]

}
