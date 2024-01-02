package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.PlansPrograms;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Templates extends GenericWrappers {
    @FindBy(id="cases_estimate_4")
    public WebElement saveAsPlanButton;
    @FindBy(css="input#estimates_template_list_search_text")
    public WebElement searchTab;
    @FindBy(css="[name='estimates_template_list_button']")
    public WebElement byDropDownButton;
    @FindBy(id="small_fields_view_estimates_template_list")
    public WebElement fieldEditButton;
    @FindBy(xpath = "//div[@id='estimates_template_list']//tr[1]/td")
    public List<WebElement> firstRowFields;
}
