package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.PlansPrograms;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlansProgramsMain extends GenericWrappers {
    @FindBy(id="case_estimates_tab2")
    public WebElement plansTab;
    @FindBy(id="estimates_templates_tab2")
    public WebElement templateTab;
    @FindBy(id="cases_estimate_new")
    public WebElement newButton;
    @FindBy(id="cases_estimate_delete")
    public WebElement deleteButton;
    @FindBy(id="cases_estimate_details")
    public WebElement detailsButton;
    @FindBy(id="cases_estimate_current")
    public WebElement currentButton;
    @FindBy(id="cases_estimate_preview")
    public WebElement previewButton;

    // P L A N      D E L E T E      P O P       U P
    @FindBy(id="level3_form")
    public WebElement planDeletePopUp;      // Pop-Up [Plan Delete, Plan New] : Same Locator
    @FindBy(id="estimate_delete_1")
    public WebElement deletePopUpOkButton;
    @FindBy(id="estimate_delete_2")
    public WebElement deletePopUpCancelButton;

}
