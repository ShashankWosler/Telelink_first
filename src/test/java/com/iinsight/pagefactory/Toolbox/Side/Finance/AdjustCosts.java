package com.iinsight.pagefactory.Toolbox.Side.Finance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class AdjustCosts extends Invoices {
    @FindBy(id="ifinance_adjusted_costs_export")
    public WebElement exportAdjustCostsBtn;
    @FindBy(id="ifinance_adjusted_costs_search_text")
    public WebElement searchAdjustCostsField;
    @FindBy(id="ifinance_adjusted_costs_find")
    public WebElement findAdjustCostsBtn;
    @FindBy(id="small_fields_view_ifinance_adjusted_costs")
    public WebElement fieldEditAdjustCostsBtn;

}
