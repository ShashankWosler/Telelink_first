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
    @FindBy(className = ".criteria_img_erase.right")
    public List<WebElement> delete_btn;
    @FindBy(xpath="//div[@id='drop_down_multiselect']/child::div[text()='Case Alert']")
    public WebElement search_dropdown_value;
    @FindBy(css="td[title='NAT12']")
    public WebElement caseListIndex1;
    @FindBy(css="input[id*='field_criteria']")
    public List<WebElement> search_criteria_fields;


}
