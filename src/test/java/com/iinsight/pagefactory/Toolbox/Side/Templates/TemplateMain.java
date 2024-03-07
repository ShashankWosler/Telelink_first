package com.iinsight.pagefactory.Toolbox.Side.Templates;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplateMain extends GenericWrappers {

    @FindBy(css = "li[data-section='documents'] a")
    public WebElement documentTemplatesTab;
    @FindBy(css = "li[data-section='custom_forms'] a")
    public WebElement customFormsTab;
    @FindBy(css = "li[data-section='finance'] a")
    public WebElement financeTemplatesTab;
    @FindBy(css = "li[data-section='emails'] a")
    public WebElement emailsTemplatesTab;
    @FindBy(css = "li[data-section='proda'] a")
    public WebElement prodaTemplatesTab;
    @FindBy(css = "button[onclick='new_templates_button_new();']")
    public WebElement newBtn;
    @FindBy(id = "template_list_delete")
    public WebElement deleteBtn;
    @FindBy(id = "template_list_open")
    public WebElement openBtn;
    @FindBy(id = "template_list_details")
    public WebElement editBtn;

}
