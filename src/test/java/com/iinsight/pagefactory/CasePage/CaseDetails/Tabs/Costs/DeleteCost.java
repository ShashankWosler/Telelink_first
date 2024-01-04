package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Costs;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteCost extends GenericWrappers{
    @FindBy(css="[title='Delete Cost']")
    public WebElement deletePopUp;
    @FindBy(id="contact_new_1")
    public WebElement deletePopUpOkButton;
    @FindBy(id="cost_delete_invoiced_1")
    public WebElement deletePopUpCancelButton;
    @FindBy(css="td[id='prestatus4']")
    public WebElement selectAllCheckBoxes;

}
