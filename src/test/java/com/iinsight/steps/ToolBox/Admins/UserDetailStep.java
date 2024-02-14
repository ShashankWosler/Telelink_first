package com.iinsight.steps.ToolBox.Admins;

import com.iinsight.pages.Toolbox.Side.ManageUser.UserDetailPage;
import io.cucumber.java.en.Then;
import org.apache.commons.text.WordUtils;
import org.junit.Assert;

public class UserDetailStep extends UserDetailPage {
    public String[] getName = WordUtils.capitalizeFully(globalUserName.substring(0, globalUserName.indexOf("@")).replace("."," ")).split(" ");
    @Then("User verify fields of User Detail Tab")
    public void verifyUserDetailFields(){
        setImplicit(60);
        Assert.assertTrue(isPasswordButtonVisible());
        Assert.assertEquals(getEmailText(),globalUserName.toLowerCase());
        Assert.assertEquals(getFirstNameText(),getName[0]);
        Assert.assertEquals(getLastNameText(),getName[1]);
        isInputs1Visible1();
        isInputs1Visible2();
        isInputs1Visible3();
    }
}
