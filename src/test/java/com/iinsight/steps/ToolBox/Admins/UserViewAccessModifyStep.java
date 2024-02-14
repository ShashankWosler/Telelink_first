package com.iinsight.steps.ToolBox.Admins;

import com.iinsight.pages.Toolbox.Side.ManageUser.UserViewAccessModifyPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UserViewAccessModifyStep extends UserViewAccessModifyPage {

    @Then("User verify fields of {string} Tab")
    public void verifyAccessModifyViewFields(String tabOptions){
        switch (tabOptions){
            case "User Access":
                Assert.assertTrue(isUserAccessSaveButtonVisible());
                isUserAccessCheckBoxesVisible();
                break;
            case "User View":
                Assert.assertTrue(isUserViewSaveButtonVisible());
                isUserViewCheckBoxesVisible();
                break;
            case "User Modify":
                Assert.assertTrue(isUserModifySaveButtonVisible());
                isUserModifyCheckBoxesVisible();
                break;
        }
    }
    @Then("User {string} {string} CheckBox From User Modify Page")
    public void userModifyPermission(String permission,String checkBoxValue){
        clickUserModifyCheckBox(permission, checkBoxValue);
        clickUserModifySaveButton();
    }
}
