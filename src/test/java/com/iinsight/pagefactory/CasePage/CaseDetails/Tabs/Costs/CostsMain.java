package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Costs;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CostsMain extends GenericWrappers {
    @FindBy(xpath="(//td[@id=\"record_id_column\"])[1]")
    public WebElement cost_ID;

    @FindBy(id="table_header_col_new_2510")
    public WebElement Id_header;
}
