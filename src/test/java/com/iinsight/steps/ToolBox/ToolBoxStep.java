package com.iinsight.steps.ToolBox;

import com.iinsight.pages.Toolbox.TopMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ToolBoxStep extends TopMainPage {
    @Then(("Go to the report"))
    public void goToReport(){
        waitFor(4000);
        clickDownloadsReport();
    }


    @And("User Click on Menu Icon")
    public void userClickOnMenuIcon() {
        clickSideBarMenu();
    }
}
