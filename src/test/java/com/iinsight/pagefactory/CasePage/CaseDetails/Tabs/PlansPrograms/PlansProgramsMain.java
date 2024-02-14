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
    @FindBy(xpath="//div[@id='estimates_list']//tr[last()]")
    public WebElement getLastRow;
    @FindBy(xpath="//img[contains(@src,'current_1')]")
    public WebElement getActivePlanRow;
    @FindBy(id="currentestimate")
    public WebElement currentPlanInput;
    @FindBy(xpath="(//td[@id='estimate_summary.plan_id_column'])[last()]")
    public WebElement currentPlanId;

    // P L A N      D E L E T E      P O P       U P
    @FindBy(id="level3_form")
    public WebElement planDeletePopUp;      // Pop-Up [Plan Delete, Plan New] : Same Locator
    @FindBy(id="estimate_delete_1")
    public WebElement deletePopUpOkButton;
    @FindBy(id="estimate_delete_2")
    public WebElement deletePopUpCancelButton;

}
