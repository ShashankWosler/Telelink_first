package com.iinsight.pagefactory.Toolbox.Side.Templates;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailTemplates extends TemplateMain {

    @FindBy(id = "email_templates_name")
    public WebElement emailNameField;
    @FindBy(id = "email_templates_description")
    public WebElement emailDescriptionField;
    @FindBy(id = "new_templates_email_template_button")
    public WebElement saveBtn;
    @FindBy(css = "[class='btn btn-default btn-cancel']")
    public WebElement cancelBtn;
}
