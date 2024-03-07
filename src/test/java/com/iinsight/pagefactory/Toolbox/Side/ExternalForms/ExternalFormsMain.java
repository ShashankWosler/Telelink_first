package com.iinsight.pagefactory.Toolbox.Side.ExternalForms;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExternalFormsMain extends GenericWrappers {
    @FindBy(css = "img[name='forms_button']")
    public WebElement formNamesDropdown;
    @FindBy(css = "img[name='sources_button']")
    public WebElement sourcesDropdown;
    @FindBy(css = "img[name='external_form.user_button']")
    public WebElement workingOnDropdown;
    @FindBy(css = "img[name='external_form.status_button']")
    public WebElement statusDropdown;
    @FindBy(css = "img[name='date_from_filter_button']")
    public WebElement fromDropdown;
    @FindBy(css = "img[name='date_to_filter_button']")
    public WebElement toDropdown;
    @FindBy(id = "reset_external_form_search")
    public WebElement resetSearchBtn;
    @FindBy(id = "table-search-icon")
    public WebElement searchIcon;
    @FindBy(id = "reload_external_form")
    public WebElement refreshBtn;
    @FindBy(id = "external_form_submissions_search_text")
    public WebElement searchField;
    @FindBy(id = "external_form_submissions_find")
    public WebElement searchButton;
}
