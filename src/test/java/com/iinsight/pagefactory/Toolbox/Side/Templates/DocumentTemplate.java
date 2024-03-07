package com.iinsight.pagefactory.Toolbox.Side.Templates;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocumentTemplate extends TemplateMain {

//    @FindBy(css = "button[onclick='new_templates_button_new();']")
//    public WebElement newBtn;
//    @FindBy(id = "template_list_delete")
//    public WebElement deleteBtn;
//    @FindBy(id = "template_list_open")
//    public WebElement openBtn;
//    @FindBy(id = "template_list_details")
//    public WebElement editBtn;
    @FindBy(id = "templates.name")
    public WebElement nameField;
    @FindBy(id = "templates.description")
    public WebElement descriptionField;
    @FindBy(id = "template_upload_1")
    public WebElement uploadBtn;
    @FindBy(id = "template_upload_2")
    public WebElement cancelBtn;
}
