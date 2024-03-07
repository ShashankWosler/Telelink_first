package com.iinsight.pagefactory.Toolbox.Side.Templates;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinanceTemplates extends TemplateMain {

    @FindBy(id = "finance_templates_name")
    public WebElement financeNameField;
    @FindBy(id = "finance_templates_description")
    public WebElement financeDescriptionField;
    @FindBy(id = "finance_templates_type")
    public WebElement templateTypeDropdown;
    @FindBy(id = "fieldset_group.grouped")
    public WebElement groupingDropdown;
    @FindBy(id = "fieldset_group.subtotal_by")
    public WebElement subtotalByDropdown;
    @FindBy(id = "fieldset_group.order_by")
    public WebElement orderByDropdown;
    @FindBy(id = "templates_upload_finance_template")
    public WebElement uploadTemplateFile;
    @FindBy(id = "new_templates_fincne_template_button")
    public WebElement saveBtn;
    @FindBy(css = "[class='btn btn-default btn-cancel']")
    public WebElement cancelBtn;
}
