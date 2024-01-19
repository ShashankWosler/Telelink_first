package com.iinsight.pages.Toolbox.Side.TimeSheets;

import com.iinsight.pagefactory.Toolbox.Side.TimeSheets.ActivityDetail;
import org.openqa.selenium.support.PageFactory;

public class ActivityDetailPage extends ActivityDetail {
    public ActivityDetailPage(){PageFactory.initElements(getDriver(),this);
    }
    public void clickDetailsTab(){clickButtonWithOutScroll(detailsTab);
    }
    public void clickEmployeeExpenseTab(){clickButtonWithOutScroll(employeeExpenseTab);
    }
    /**  D E T A I L S __ T A B**/
    public void clickSaveAsDraftButton(){clickButtonWithOutScroll(saveAsDraftButton);
    }
    public void clickSubmitButton(){clickButtonWithOutScroll(submitButton);
    }
    public String getCaseText(){return getAttributeValue(caseText,"value");
    }
    public void clickRoleDropDown(){clickButtonWithOutScroll(roleDropDown);
    }
    public String getRoleInputText(){return getAttributeValue(roleInput,"value");
    }
    public void selectServiceContract(){SelectByVisibleText(serviceContract,"NAT: Clone@CTP");
    }
    public void selectBilling(){SelectByVisibleText(billing,"CTP403 : TestAutoActivity");
    }
    public String getDescriptionInputText(){return getAttributeValue(descriptionInput,"value");
    }
    public String getCodeInputText(){return getAttributeValue(codeInput,"value");
    }
    public void enterDetailsInput(String input){enterText(detailsInput,input);}
    public void clickLinkedPlanCheckBox(){clickButtonWithOutScroll(linkedPlanCheckBox);}

    //                  S   C   R   O   L   L       P   A   G   E
    public void enterKilometresInput(String value){enterText(kilometresInput,value);
    }
    public String getKilometresInputText(){return getAttributeValue(kilometresInput,"value");
    }
    public void clickDurationRadioButton(){mouseDoubleClick(durationRadioButton);
    }
    public void clickUnitRadioButton(){mouseDoubleClick(unitRadioButton);
    }
    public String getDurationInputText(){return getAttributeValue(durationInput,"value");
    }
    public String getDurationRateInputText(){return getAttributeValue(durationRateInput,"value");
    }
    public String getSubTotalText(){return getAttributeValue(subTotalText,"value");}
    public String getDurationLeftInputText(){return getAttributeValue(durationLeftInput,"value");}
    public String getVatAmountText(){return getAttributeValue(vatAmountText,"value");}
    public void clickDetailVatCheckBox(String vatValue){
        mouseOver(applyVatCheckBox);
        waitFor(2000);
        String getValue = getAttributeValue(applyVatCheckBox,"value");
        switch (vatValue){
            case "With":
                if(!(getValue.equals("1"))){
                    clickButtonWithOutScroll(applyVatCheckBox);
                }
                break;
            case "Without":
                if(!(getValue.equals("0"))){
                    clickButtonWithOutScroll(applyVatCheckBox);
                }
                break;
        }
    }

    // O T H E R    D E T A I L S
    public String getTotalText(){return getAttributeValue(totalText,"value");}
    public String getDueDateInputText(){return getAttributeValue(dueDateInput,"value");}
    public String getTimeInputText(){return getAttributeValue(timeInput,"value");}
    public String getEmployeeText(){return getAttributeValue(employeeText,"value");}
    public String getTeamInputText(){return getAttributeValue(teamInput,"value");}
    public String getNoteInputText(){return getAttributeValue(noteInput,"value");}
    public void clickNoteDropDown(){clickButtonWithOutScroll(noteDropDown);
    }
    public void clickTeamDropDown(){clickButtonWithOutScroll(teamDropDown);
    }
    public void clickDueDateDropDown(){clickButtonWithOutScroll(dueDateDropDown);
    }
    public void clickPrivilegedCheckBox(){clickButtonWithOutScroll(privilegedCheckBox);
    }
    public void enterNotesInput(String value){enterText(notesInput,value);
    }

    /**E M P L O Y E E __ E X P E N S E __ T A B**/

    public boolean isSaveButtonVisible(){
        waitVisibilityOfElement(saveButton);
        return isElementDisplayed(saveButton);
    }
    public String getEmployeeDurationInputText(){return getAttributeValue(employeeDurationInput,"value");
    }
    public String getEmployeeRateInputText(){return getAttributeValue(employeeRateInput,"value");
    }
    public String getEmployeeSubTotalInputText(){return getAttributeValue(employeeSubTotalInput,"value");
    }
    public String getEmployeeVATInputText(){return getAttributeValue(employeeVATInput,"value");
    }
    public String getEmployeeTotalInputText(){return getAttributeValue(employeeTotalInput,"value");
    }
    public String getSuperRateInputText(){return getAttributeValue(superRateInput,"value");
    }
    public String getSuperExpenseInputText(){return getAttributeValue(superExpenseInput,"value");
    }

    public void clickEmployeeVatCheckBox(String vatValue){
        mouseOver(employeeVatCheckBox);
        waitFor(2000);
        String getValue = getAttributeValue(employeeVatCheckBox,"value");
        switch (vatValue){
            case "With":
                if(!(getValue.equals("1"))){
                    clickButtonWithOutScroll(employeeVatCheckBox);
                }
                break;
            case "Without":
                if(!(getValue.equals("0"))){
                    clickButtonWithOutScroll(employeeVatCheckBox);
                }
                break;
        }
    }
}
