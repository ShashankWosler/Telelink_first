package com.iinsight.pages.Toolbox.Side.ManageUser;

import com.iinsight.pagefactory.Toolbox.Side.ManageUsers.UserViewAccessModify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UserViewAccessModifyPage extends UserViewAccessModify {
    public UserViewAccessModifyPage(){PageFactory.initElements(getDriver(),this);
    }

    // U S E R      A C C E S S
    public boolean isUserAccessSaveButtonVisible(){
        waitVisibilityOfElement(userAccessSaveButton);
        return isElementDisplayed(userAccessSaveButton);
    }
    public void clickUserAccessSaveButton(){clickButtonWithOutScroll(userAccessSaveButton);
    }

    public void isUserAccessCheckBoxesVisible(){
        for(int i=0;i<userAccessCheckBox.size();i++){
            if(i == 27 || i == 28 || i == 29){
                System.out.println("isUserAccessCheckBoxesVisible: i="+i);
                continue;
            }
            mouseOver(userAccessCheckBox.get(i));
            //waitFor(300);
            waitVisibilityOfElement(userAccessCheckBox.get(i));
            isElementDisplayed(userAccessCheckBox.get(i));
        }
    }


    // U S E R      V I E W
    public boolean isUserViewSaveButtonVisible(){
        waitVisibilityOfElement(userViewSaveButton);
        return isElementDisplayed(userViewSaveButton);
    }
    public void clickUserViewSaveButton(){clickButtonWithOutScroll(userViewSaveButton);
    }

    public void isUserViewCheckBoxesVisible(){
        for(WebElement e : userViewCheckBox){
            mouseOver(e);
            //waitFor(300);
            waitVisibilityOfElement(e);
            isElementDisplayed(e);
        }
    }

    // U S E R      M O D I F Y

    public boolean isUserModifySaveButtonVisible(){
        waitVisibilityOfElement(userModifySaveButton);
        return isElementDisplayed(userModifySaveButton);
    }
    public void clickUserModifySaveButton(){clickButtonWithOutScroll(userModifySaveButton);
    }

    public void isUserModifyCheckBoxesVisible(){
        for(WebElement e : userModifyCheckBox){
            mouseOver(e);
            //waitFor(300);
            waitVisibilityOfElement(e);
            isElementDisplayed(e);
        }
    }
    public void clickUserModifyCheckBox(String permission,String checkBoxValue){
        By permissionPath = By.xpath("//td[contains(text(),'"+checkBoxValue+"')]/preceding-sibling::td/img");
        WebElement permissionElement = getDriver().findElement(permissionPath);
        mouseOver(permissionElement);
        waitElementToBeClickable(permissionElement);
        switch (permission){
            case "Enabled":
                if(!(getAttributeValue(permissionElement,"value").equals("1"))){
                    clickButtonWithOutScroll(permissionElement);
                }
                break;
            case "Disabled":
                if(!(getAttributeValue(permissionElement,"value").equals("0"))){
                    clickButtonWithOutScroll(permissionElement);
                }
                break;
        }
    }


}
