package com.iinsight.pages.Toolbox.Side.ManageUser;

import com.iinsight.pagefactory.Toolbox.Side.ManageUsers.MainUserMain;
import org.openqa.selenium.support.PageFactory;

public class ManageUserMainPage extends MainUserMain {
    public ManageUserMainPage(){ PageFactory.initElements(getDriver(),this);
    }
    public boolean isNewButtonVisible(){
        waitVisibilityOfElement(newButton);
        return isElementDisplayed(newButton);
    }
    public void clickDeleteButton(){clickButtonWithOutScroll(deleteButton);
    }
    public void clickExportButton(){clickButtonWithOutScroll(exportButton);
    }
    public String getDisplayText(){return getAttributeValue(displayInput,"value");
    }
    public void clickDisplayDropDown(){clickButtonWithOutScroll(displayDropDown);
    }
    public void clickGoButton(){clickButtonWithOutScroll(goButton);
    }
    public void clickAddRulesButton(){clickButtonWithOutScroll(addRulesButton);
    }
    public void clickSearchButton(){clickButtonWithOutScroll(searchButton);
    }
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);
    }
    public void clickSaveViewButton(){clickButtonWithOutScroll(saveViewButton);
    }

    // L I S T I N G
    public String getNameColumnFirstText(){return getAttributeValue(nameColumnFirst,"title");
    }
    public String getEmailColumnFirstText(){return getAttributeValue(emailColumnFirst,"title");
    }

    // T A B S      B U T T O N S

    // U S E R      D E T A I L S
    public boolean isUserDetailsTabVisible(){
        waitVisibilityOfElement(userDetailsTab);
        return isElementDisplayed(userDetailsTab);
    }
    public void clickUserDetailsTab(){clickButtonWithOutScroll(userDetailsTab);
    }
    // U S E R      A C C E S S
    public boolean isUserAccessTabVisible(){
        waitVisibilityOfElement(userAccessTab);
        return isElementDisplayed(userAccessTab);
    }
    public void clickUserAccessTab(){clickButtonWithOutScroll(userAccessTab);
    }
    // U S E R      V I E W
    public boolean isUserViewTabVisible(){
        waitVisibilityOfElement(userViewTab);
        return isElementDisplayed(userViewTab);
    }
    public void clickUserViewTab(){clickButtonWithOutScroll(userViewTab);
    }
    // U S E R      M O D I F Y
    public boolean isUserModifyTabVisible(){
        waitVisibilityOfElement(userModifyTab);
        return isElementDisplayed(userModifyTab);
    }
    public void clickUserModifyTab(){clickButtonWithOutScroll(userModifyTab);
    }
}
