package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FieldsEdit extends GenericWrappers {
    @FindBy(id="Enabled")
    public WebElement enabledBox;
    @FindBy(id="Disabled")
    public WebElement disabledBox;
    @FindBy(css="[name='Disable']")
    public WebElement disableBtn;
    @FindBy(css="[name='Enable']")
    public WebElement enableBtn;
    @FindBy(css="[name='image_up_arrow']")
    public WebElement upArrowBtn;
    @FindBy(css="[name='image_down_arrow']")
    public WebElement downArrowBtn;
    @FindBy(id="fields_view_edit_apply")
    public WebElement applyBtn;
    @FindBy(id="fields_view_edit_0")
    public WebElement cancelBtn;
}
