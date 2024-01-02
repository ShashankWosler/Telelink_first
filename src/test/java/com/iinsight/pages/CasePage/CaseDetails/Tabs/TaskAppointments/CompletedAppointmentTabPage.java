package com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments.CompletedAppointmentTab;
import org.openqa.selenium.support.PageFactory;

public class CompletedAppointmentTabPage extends CompletedAppointmentTab {
    public CompletedAppointmentTabPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public boolean isSearchInputVisible(){
        waitVisibilityOfElement(searchInput);
        return isElementDisplayed(searchInput);
    }
    public void clickSearchInput(){
        waitElementToBeClickable(searchInput);
        clickButtonWithOutScroll(searchInput);}

    public void clickByDropDown(){clickButtonWithOutScroll(byDropDown);}
    public void clickFindButton(){clickButtonWithOutScroll(findButton);}
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);}
    public String getTextTitleOfFirstRow(){return getAttributeValue(getTitleOfFirstRow,"title");}



}
