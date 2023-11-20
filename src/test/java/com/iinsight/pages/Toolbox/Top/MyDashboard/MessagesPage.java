package com.iinsight.pages.Toolbox.Top.MyDashboard;


import com.iinsight.pagefactory.Toolbox.Top.MyDashboard.Messages;
import org.openqa.selenium.support.PageFactory;

public class MessagesPage extends Messages {
 public MessagesPage(){PageFactory.initElements(getDriver(), this);
 }
   public boolean isDeleteBtnVisible(){return isElementDisplayed(deleteBtn);}
    public boolean isMarksAsUnreadBtnVisible(){return isElementDisplayed(marksAsUnreadBtn);}
    public boolean isMarkAsReadBtnVisible(){return isElementDisplayed(markAsReadBtn);}
    public boolean isSelectAllBtnVisible(){return isElementDisplayed(selectAllBtn);}
    public void clickDeleteBtn(){clickButtonWithOutScroll(deleteBtn);}
    public void clickMarksAsUnreadBtn(){clickButtonWithOutScroll(marksAsUnreadBtn);}
    public void clickMarkAsReadBtn(){clickButtonWithOutScroll (markAsReadBtn);}
    public void clickSelectAllBtn(){ clickButtonWithOutScroll(selectAllBtn);}

}
