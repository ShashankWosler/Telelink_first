package com.iinsight.pagefactory.CasePage.CaseListing;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchMenu extends GenericWrappers {
    @FindBy(id="case_list_clear")
    public WebElement clear_btn;
    @FindBy(id="case_list_find")
    public WebElement search_btn;
    @FindBy(xpath = "//div[contains(@class,'search-criteria-list')]//span")
    public List<WebElement> delete_btn;
    @FindBy(css="[name='xero_credential.rcategory_button']")
    public WebElement search_criteria_field_dropdown;
    @FindBy(id="search_criteria_fields")
    public WebElement searchCriteriaInput;
    @FindBy(xpath="//div[contains(@id,'case_list-table')]/div[1]/div[3]")
    public WebElement search_criteria_main_tab;
    @FindBy(css="input[id*='field_criteria']")
    public WebElement search_criteria_fields;


}
