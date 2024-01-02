package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPopUp extends GenericWrappers {
    // F I R S T    P A G E
    @FindBy(id="level3_form")
    public WebElement verifyPaymentPopUp;
    @FindBy(css="img[name='payment_all']")
    public WebElement allCasesCheckBox;
    @FindBy(css="img[name='payment_current']")
    public WebElement currentCaseCheckBox;
    @FindBy(css="img[name='payment_case']")
    public WebElement selectCaseCheckBox;
    @FindBy(css="img[name='payment_invoice']")
    public WebElement currentInvoiceCheckBox;
    @FindBy(css="img[name='payment_open']")
    public WebElement openCasesOnlyCheckBox;
    @FindBy(id="payment")
    public WebElement getAmount;
    @FindBy(id="payment_type")
    public WebElement paymentTypeInputTab;
    @FindBy(css="img[name='payment_type_button']")
    public WebElement paymentTypeDropDown;
    @FindBy(id="payment_1_4")
    public WebElement nextButton1;

    // S E C O N D    P A G E
    @FindBy(id="payment_2_6")
    public WebElement finishButton;
    @FindBy(id="payment_2_3")
    public WebElement fillAllButton;
    @FindBy(id="payment_2_2")
    public WebElement clearAllButton;
    @FindBy(id="payment_column")
    public WebElement paymentTabText;
    @FindBy(xpath="//img[contains(@src,'icon_edit')]")
    public WebElement editAmount;
    @FindBy(id="balance")
    public WebElement balanceTab;  //ClickOn FillAll Button : Amount is Shown on PaymentTab & Balance Tab
    @FindBy(id="#level4_form")
    public WebElement editAmountPopUp;
    @FindBy(id="payment_cost_change_1")
    public WebElement okButtonEditAmountPopUp;
    @FindBy(id="amount")
    public WebElement enterAmountInput;
}
