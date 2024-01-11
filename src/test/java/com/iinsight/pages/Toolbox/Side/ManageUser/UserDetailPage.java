package com.iinsight.pages.Toolbox.Side.ManageUser;

import com.iinsight.pagefactory.Toolbox.Side.SideMain;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class UserDetailPage extends SideMain {
    public UserDetailPage(){PageFactory.initElements(getDriver(), this);
    }



    public void selectCheckBoxFromText (String CheckBoxValue){
        By elem = By.xpath("//div[@id='users_view_scroll_content']//td[contains(text(),"+'"'+CheckBoxValue+'"'+")]");
        waitPresenceOfElementLocated(elem);
        clickButtonWithOutScroll(getDriver().findElement(elem));
    }


}
