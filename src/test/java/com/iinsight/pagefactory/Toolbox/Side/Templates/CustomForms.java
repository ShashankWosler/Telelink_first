package com.iinsight.pagefactory.Toolbox.Side.Templates;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomForms extends TemplateMain {


    @FindBy(id = "template_list_delete")
    public WebElement deleteBtn;
    @FindBy(id = "template_list_open")
    public WebElement openBtn;
    @FindBy(id = "template_list_details")
    public WebElement editBtn;
    @FindBy(id = "custom_forms.form_name")
    public WebElement formNameField;
    @FindBy(id = "custom_forms.description")
    public WebElement descriptionField;
    @FindBy(id = "btn_new_custom_form_and_edit_ok")
    public WebElement saveBtn;
    @FindBy(id = "template_upload_2")
    public WebElement cancelBtn;
}
