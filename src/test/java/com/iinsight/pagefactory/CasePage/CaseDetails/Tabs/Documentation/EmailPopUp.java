package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Documentation;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPopUp extends GenericWrappers {

    @FindBy(css = "img[onclick=\"text_select_show_list_filter('documentation_email_to')\"]")
    public WebElement email_to_dropdown_icon;
    @FindBy(css = "img[onclick=\"text_select_show_list_filter('documentation_email_cc')\"]")
    public WebElement email_cc_dropdown_icon;
    @FindBy(id = "selects_all")
    public WebElement selectAll_email;
    @FindBy(css = "img[onclick=\"text_select_show_list_filter('documentation_email_template')\"]")
    public WebElement email_template_dropdown_icon;
    @FindBy(css = "img[onclick=\"text_select_show_list_filter('documentation_email_subject')\"]")
    public WebElement email_subject_dropdown_icon;
    @FindBy(css = "input#case_documentations_email_search_text")
    public WebElement email_search_text_field;
    @FindBy(css = "img[name='case_documentations_email_button']")
    public WebElement email_search_dropdown;

}
