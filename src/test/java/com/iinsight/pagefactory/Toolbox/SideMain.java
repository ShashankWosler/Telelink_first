package com.iinsight.pagefactory.Toolbox;

import com.iinsight.utils.GenericWrappers;
import com.iinsight.pagefactory.CasePage.CaseListing.CaseListingMain;
import org.openqa.selenium.support.PageFactory;

public class SideMain extends GenericWrappers {
    public SideMain(){PageFactory.initElements(getDriver(), this);
    }

}
