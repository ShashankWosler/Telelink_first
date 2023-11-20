package com.iinsight.pagefactory.Toolbox.Top.MyDashboard;
import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Messages extends GenericWrappers {
    @FindBy(css="#tab_messages button:nth-child(1)")
    public WebElement deleteBtn;
    @FindBy(css="#tab_messages button:nth-child(2)")
    public WebElement marksAsUnreadBtn;
    @FindBy(id="unselect_mymsg")
    public WebElement markAsReadBtn;
    @FindBy(id="select_mymsg")
    public WebElement selectAllBtn;}
