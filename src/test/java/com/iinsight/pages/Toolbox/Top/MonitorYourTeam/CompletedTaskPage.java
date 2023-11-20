package com.iinsight.pages.Toolbox.Top.MonitorYourTeam;

import com.iinsight.pagefactory.Toolbox.Top.MonitorYourTeam.CompletedTask;
import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.support.PageFactory;

public class CompletedTaskPage extends CompletedTask {
    public CompletedTaskPage(){PageFactory.initElements(getDriver(), this);
    }

    public void clickSearchBtn(){clickButtonWithOutScroll(searchBtn);}
    public void clickAssignToColumn(){clickButtonWithOutScroll(assignToColumn);}
    public void clickExportBtn(){clickButtonWithOutScroll(exportBtn);}
    public void clickDeleteBtn(){clickButtonWithOutScroll(deleteBtn);}
    public void clickEditBtn(){clickButtonWithOutScroll(editBtn);}
    public void clickFieldsEditBtn(){clickButtonWithOutScroll(fieldsEditBtn);}
    public void clickFindBtn(){clickButtonWithOutScroll(findBtn);}
    public void clickSssignDropDown(){clickButtonWithOutScroll(assignDropDown);}

}
