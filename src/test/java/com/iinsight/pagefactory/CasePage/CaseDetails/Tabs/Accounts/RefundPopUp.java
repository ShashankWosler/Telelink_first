package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RefundPopUp extends GenericWrappers {
    @FindBy(xpath="//div[text()='Refund']")
    public WebElement refundPopUp;
    @FindBy(css="input#case")
    public WebElement caseTab;      //GetAttribute Value
    @FindBy(css="input#invoice")
    public WebElement invoiceTab;      //GetAttribute Value
    @FindBy(css="input#date")
    public WebElement dateTab;      //GetAttribute Value - Date Format : 04-12-2023 (Send Keys)
    @FindBy(css="input#amount")
    public WebElement amountTab;      //GetAttribute Value - 0.00 (Send Keys)
    @FindBy(id="reason")
    public WebElement reasonTab;
    @FindBy(id="refund_1")
    public WebElement refundButton;
    @FindBy(id="refund_2")
    public WebElement cancelButton;
}
