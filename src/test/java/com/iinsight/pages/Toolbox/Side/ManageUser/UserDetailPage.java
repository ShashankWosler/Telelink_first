package com.iinsight.pages.Toolbox.Side.ManageUser;

import com.iinsight.pagefactory.Toolbox.Side.ManageUsers.UserDetails;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class UserDetailPage extends UserDetails {
    public UserDetailPage(){PageFactory.initElements(getDriver(), this);
    }
   public List<WebElement> elemsList = new ArrayList<>();

    public boolean isPasswordButtonVisible(){
        waitVisibilityOfElement(passwordButton);
        return isElementDisplayed(passwordButton);
    }
    public boolean isSignatureButton(){return isElementDisplayed(signatureButton);
    }
    public boolean isEmailNotificationButtonVisible(){return isElementDisplayed(emailNotificationButton);
    }

    public String getEmailText(){
        String email="";
        try {
            mouseOver(emailInput);
            email = getAttributeValue(emailInput, "value");
        } catch(Exception e){
            System.out.println("UserDetailPage.getEmailText() - "+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            mouseOver(emailInput);
            email = getAttributeValue(emailInput, "value");
        } return email;
    }
    public String getFirstNameText(){
        String firstName="";
        try {
            mouseOver(firstNameInput);
            firstName = getAttributeValue(firstNameInput, "value");
        } catch(Exception e){
            System.out.println("UserDetailPage.getFirstNameText() - "+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            mouseOver(firstNameInput);
            firstName = getAttributeValue(firstNameInput, "value");
        } return firstName;
    }
    public String getLastNameText(){
        String lastName="";
        try {
            mouseOver(lastNameInput);
            lastName = getAttributeValue(lastNameInput, "value");
        } catch(Exception e){
            System.out.println("UserDetailPage.getLastNameText() - "+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            mouseOver(lastNameInput);
            lastName = getAttributeValue(lastNameInput, "value");
        } return lastName;
    }
    public String getTimeZoneText(){
        String timeZone="";
        try {
            mouseOver(timeZoneInput);
            timeZone = getAttributeValue(timeZoneInput, "value");
        } catch(Exception e){
            System.out.println("UserDetailPage.getTimeZoneText() - "+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            mouseOver(timeZoneInput);
            timeZone = getAttributeValue(timeZoneInput, "value");
        } return timeZone;
    }
    public void isInputs1Visible1(){
        elemsList.add(jobTitleInput);           elemsList.add(qualificationInput);
        elemsList.add(providerNumberInput);     elemsList.add(consultantInput); elemsList.add(emailInput);
        elemsList.add(secondEmailInput);        elemsList.add(firstNameInput);  elemsList.add(titleInput);
        elemsList.add(titleDropDown);           elemsList.add(lastNameInput);   elemsList.add(hourlyRate);
        elemsList.add(applyVAT);                elemsList.add(superRate);       elemsList.add(userProfileInput);
        elemsList.add(userProfileDropDown);     elemsList.add(userTypeInput);   elemsList.add(userTypeDropDown);

        System.out.println("UserDetailPage.isInputs1Visible1()- "+elemsList.size());
        for(WebElement e : elemsList){
            mouseOver(e);
            //waitFor(300);
            waitVisibilityOfElement(e);
            isElementDisplayed(e);
        } elemsList.clear();
    }

    public void isInputs1Visible2(){
        waitVisibilityOfElement(userLocationButton);
        mouseOver(userLocationButton);

        elemsList.add(phoneInput);             elemsList.add(userProfileDropdown);  elemsList.add(toTimeInput);
        elemsList.add(mobileInput);            elemsList.add(userTypeDropdown);     elemsList.add(localeInput);
        elemsList.add(selectedTeam);           elemsList.add(titleDropdown);        elemsList.add(localeDropdown);
        elemsList.add(selectTeamInput);        elemsList.add(selectTeamDropdown);   elemsList.add(userLocationInput);
        elemsList.add(selectTeamDropDown);     elemsList.add(fromDateInput);        elemsList.add(userLocationButton);
        elemsList.add(selectTeamSortButton);   elemsList.add(fromTimeInput);        elemsList.add(selectTeamRemoveButton);
        elemsList.add(toDateInput);

        elemsList.addAll(availabilityLocationCheckBoxes);
        elemsList.addAll(accessStateCheckBoxes);
        System.out.println("isInputs1Visible2() - 1:"+availabilityLocationCheckBoxes.size());
        System.out.println("isInputs1Visible2() - 2:"+accessStateCheckBoxes.size());

        System.out.println("UserDetailPage.isInputs1Visible2()- "+elemsList.size());
        for(WebElement e : elemsList){
            mouseOver(e);
            //waitFor(300);
            waitVisibilityOfElement(e);
            isElementDisplayed(e);
        } elemsList.clear();
    }

    public void isInputs1Visible3(){
        waitVisibilityOfElement(allConsultCheckBox);
        mouseOver(allConsultCheckBox);

        elemsList.add(timeZoneInput);             elemsList.add(customWorkTimeCheckBox);
        elemsList.add(allWorkTimeCheckBox);       elemsList.add(timeZoneDropDown);
        elemsList.add(bussDevWorkTimeCheckBox);   elemsList.add(customConsultCheckBox);
        elemsList.add(bussDevConsultCheckBox);    elemsList.add(allConsultCheckBox);

        elemsList.addAll(timeInputsWorkTime);
        elemsList.addAll(timeInputsConsultant);
        System.out.println("isInputs1Visible3() - 1:"+timeInputsWorkTime.size());
        System.out.println("isInputs1Visible3() - 2:"+timeInputsConsultant.size());

        System.out.println("UserDetailPage.isInputs1Visible3()- "+elemsList.size());
        for(WebElement e : elemsList){
            mouseOver(e);
            //waitFor(300);
            waitVisibilityOfElement(e);
            isElementDisplayed(e);
        }elemsList.clear();
    }


}
