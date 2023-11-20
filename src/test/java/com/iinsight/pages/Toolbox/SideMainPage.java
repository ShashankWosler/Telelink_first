package com.iinsight.pages.Toolbox;

import com.iinsight.pagefactory.Toolbox.SideMain;
import org.openqa.selenium.support.PageFactory;

public class SideMainPage extends SideMain {
    public SideMainPage(){PageFactory.initElements(getDriver(), this);
    }

}
