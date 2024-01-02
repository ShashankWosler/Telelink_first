package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.PlansPrograms;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Plans extends GenericWrappers {
    @FindBy(id="cases_estimate_5")
    public WebElement saveAsTemplateButton;
    @FindBy(css="input#estimates_list_search_text")
    public WebElement searchInputText;
    @FindBy(css="[name='estimates_list_button']")
    public WebElement byDropDownButton;
    @FindBy(id="estimates_list_find")
    public WebElement findButton;
    @FindBy(id="small_fields_view_estimates_list")
    public WebElement fieldEditButton;
    @FindBy(xpath="//div[@id='estimates_list']//tr[last()]//td[7]")
    public WebElement TitleOfCreatedPlan;    // GetAttribute : title
    @FindBy(xpath="//div[@id='estimates_list']//tr[last()]//td[5]")
    public WebElement IdOfCreatedPlan;
}
