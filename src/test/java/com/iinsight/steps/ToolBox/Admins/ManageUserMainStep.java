package com.iinsight.steps.ToolBox.Admins;

import com.iinsight.pages.Toolbox.Side.ManageUser.ManageUserMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.text.WordUtils;
import org.junit.Assert;

public class ManageUserMainStep extends ManageUserMainPage {

    @And("User click on search button from Manage User")
    public void clickOnSearchButton(){
        setImplicit(60);
        Assert.assertTrue(isNewButtonVisible());
        clickSearchButton();
    }
    @Then("User verify the Email Address of searched Name")
    public void verifyCredentials(){
        waitFor(3000);
        Assert.assertTrue(isNewButtonVisible());
        Assert.assertEquals(getNameColumnFirstText(), WordUtils.capitalizeFully(globalUserName.substring(0, globalUserName.indexOf("@")).replace("."," ")));
        Assert.assertEquals(getEmailColumnFirstText(),globalUserName.toLowerCase());
    }
    @And("User click on {string} Tab from Manage User page")
    public void clickOnManageUserTabs(String tabOption){
        switch (tabOption){
            case "User Detail":
                Assert.assertTrue(isUserDetailsTabVisible());
                clickUserDetailsTab();
                break;
            case "User Access":
                Assert.assertTrue(isUserAccessTabVisible());
                clickUserAccessTab();
                break;
            case "User View":
                Assert.assertTrue(isUserViewTabVisible());
                clickUserViewTab();
                break;
            case "User Modify":
                Assert.assertTrue(isUserModifyTabVisible());
                clickUserModifyTab();
                break;
        }
    }
}
