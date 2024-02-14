@regressionTest
Feature: Validating of the Regression Test

  Background:
    Given User is on Login Page
    Then User Login with the Valid Credential

  Scenario: Verify that user can create a new case as a company type and validate that created case
    When User click on +case button
    And User click on Business Division dropdown get "NAT" value from dropdown
    And User click on Service Contract dropdown get "NAT-Clone@CTP" value from dropdown
    And User select case type "Company" to add
    And User fill the Cases Type Form of "Company"
    And User fill the Employment Details Form of "Company"
    And User fill the Referral Details Form
    And User fill the Bill To Company Form
    And User fill the Save Form
    When User Select Filter "My assigned cases" from HomePage
    Then User Verify the case is created and should be visible in case list "Regression"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "Case Created" Text is visible in Case Logs Tab

  Scenario Outline: Verify the "Archived Case" option is not displayed while disabling this permission "Can Archive/Restore cases"
    When User Click on Menu Icon
    And User Click on Admins Option
    And User Click on Admins "Manage User" Option
    Then User click on search button from Manage User
    And User select "Name" from search criteria dropdown
    And User enter Name to Search
    And User click on search button from "Manage User" search popup
    Then User verify the Email Address of searched Name
    And User click on "User Modify" Tab from Manage User page
    Then User "<Permission>" "Can Archive/Restore Cases" CheckBox From User Modify Page
    And User Click on Menu Icon
    And User Click on Case List Option
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    Then User click on ellipses and verify "Archive Case" Case "<Permission>"
    Examples:
      |Permission|
      |Disabled  |
      |Enabled   |

  Scenario: Verify Archive Case PopUp Buttons Functionality
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    And User click on ellipses and Select "Archive" Case
    And User click on "Cancel" From Archive PopUp
    And User click on ellipses and Select "Archive" Case
    And User click on "Cross Button" From Archive PopUp
    And User click on ellipses and Select "Archive" Case
    And User click on "Proceed Anyway" From Archive PopUp

  Scenario: Verify Log is Created in Case Log Tab on Archive Case
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "Case archived" Text is visible in Case Logs Tab

  Scenario: Verify that the user is not able to export or print the Case Notes for the archived case.
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    And User select Case Notes tab
    And User select User Notes tab
    And User click on User Notes Add New button
    And User Edit the information in Title and Description fields
    And User click on the Save button
    Then Verify the User Note should be added on User notes tab
    And User select Case Notes tab
    And User select Admin Notes tab
    And User click on Admin Add New button
    And User fill all the mandatory fields in Add Note PopUp
    And User click on the Save button
    Then Verify the Admin Note should be added on Admin notes tab
    And User click on ellipses and Select "Archive" Case
    And User click on "Proceed Anyway" From Archive PopUp
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "Case archived" Text is visible in Case Logs Tab
    And User select Case Notes tab
    And User select User Notes tab
    Then Verify the New, Details and Delete Button is Disabled on User Notes
    And User select Case Notes tab
    And User select Admin Notes tab
    Then Verify the New, Details and Delete Button is Disabled on Admin Notes

  Scenario: Verify that the button on Account Tab are Disable for the archived case.
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User click on ellipses and Select "Archive" Case
    And User click on "Proceed Anyway" From Archive PopUp
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "Case archived" Text is visible in Case Logs Tab
    And User Select Account Tab
    Then Verify Button on Account Tab are Disabled

  Scenario: Verify that the button on Costs Tab are Disable for the archived case.
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Costs tab
    Then Verify Button on Costs Tab are Disabled

  Scenario: Verify that the button on Plans/Program Tab are Disable for the archived case.
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User click on plans programs tab
    Then Verify Button on Plan Program Tab are Disabled

  Scenario: Verify that the button on Task/Appointments Tab are Disable for the archived case.
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User Select Tasks Appointments Tab
    Then Verify Button on Tasks Appointments Tab are Disabled

  Scenario: Verify that the button on Goals Tab are Disable for the archived case.
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User Select Tasks Appointments Tab
    Then Verify Button on Goals Tab are Disabled

  Scenario: Verify HomePage Billing Button is Disabled on Selecting Archive Case
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    And User Verify HomePage Billing Button is Disabled

  Scenario Outline: Verify the "Restored Archived Case" option is not displayed while disabling this permission "Can Archive/Restore cases"
    When User Click on Menu Icon
    And User Click on Admins Option
    And User Click on Admins "Manage User" Option
    Then User click on search button from Manage User
    And User select "Name" from search criteria dropdown
    And User enter Name to Search
    And User click on search button from "Manage User" search popup
    Then User verify the Email Address of searched Name
    And User click on "User Modify" Tab from Manage User page
    Then User "<Permission>" "Can Archive/Restore Cases" CheckBox From User Modify Page
    And User Click on Menu Icon
    And User Click on Case List Option
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    Then User click on ellipses and verify "Restore Archived" Case "<Permission>"
    Examples:
      |Permission|
      |Disabled  |
      |Enabled   |

  Scenario: Verify Restore Archive Case PopUp Buttons Functionality
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    And User click on ellipses and Select "Restore Archived" Case
    And User click on "Cancel" From Restore Archive PopUp
    And User click on ellipses and Select "Restore Archived" Case
    And User click on "Cross Button" From Restore Archive PopUp

  Scenario: Verify Create New Case Button From Restore Archive Case PopUp
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    And User click on ellipses and Select "Restore Archived" Case
    And User click on "Create New Case" From Restore Archive PopUp
    And User click on ellipses and Select "Restore Archived" Case
    And User click on "Restore Archived Case" From Restore Archive PopUp

  Scenario: Verify Log is Created in Case Log Tab on Restore Archive Case
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "Case restored from archive" Text is visible in Case Logs Tab

  Scenario: Verify Delete Case PopUp Buttons Functionality
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Restore Archive - New Case"
    And User click on search button from search popup
    And User verify the case type id "Restore Archive - New Case"
    And User click on ellipses and Select "Delete" Case
    And User click on "Cancel" From Delete PopUp
    And User click on ellipses and Select "Delete" Case
    And User click on "Cross Button" From Delete PopUp
    And User click on ellipses and Select "Delete" Case
    And User click on "Proceed Anyway" From Delete PopUp
    Then User Verify Case is Deleted

  Scenario: Verify that Alert message is not showing, if we set Deletion date over 30 days.
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    When User select Settings tab
    And User Enable the "Exclude case from Automated Archival/Deletion"
    And User enter Deletion Date "30 Days Later"
    And User Click on Settings Save Button
    Then Verify No "Deletion" Alert Message is Displayed
    #And User Remove "Deletion" Date Filter

  Scenario: Verify that Alert message is showing, if we set Deletion date within 30 days.
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    When User select Settings tab
    And User Enable the "Exclude case from Automated Archival/Deletion"
    And User enter Deletion Date "Within 30 Days"
    And User Click on Settings Save Button
    Then Verify "Deletion" Alert Message is Displayed
    #And User Remove "Deletion" Date Filter

  Scenario: Verify that Alert message is not showing, if we set Archival date over 30 days.
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    When User select Settings tab
    And User Enable the "Exclude case from Automated Archival/Deletion"
    And User enter Archival Date "30 Days Later"
    And User Click on Settings Save Button
    Then Verify No "Archival" Alert Message is Displayed
    #And User Remove "Archival" Date Filter

  Scenario: Verify that Alert message is showing, if we set Archival within 30 days.
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Regression"
    And User click on search button from search popup
    And User verify the case type id "Regression"
    When User select Settings tab
    And User Enable the "Exclude case from Automated Archival/Deletion"
    And User enter Archival Date "Within 30 Days"
    And User Click on Settings Save Button
    Then Verify "Archive" Alert Message is Displayed
    And User Remove "Archival" Date Filter
    And User Remove "Deletion" Date Filter
    And User Click on Settings Save Button

  Scenario: Verify when the user double click on any record it opens the correct one
    When User "double click" on case list
    And Verify case is opened in full screen mode
    Then User click on Back Arrow Button

  Scenario: Verify that the case list full and half-screen buttons functionality
    When User "Case Listing View" on case list
    Then Verify "Case Listing View" is enabled
    When User "Case Details View" on case list
    Then Verify "Case Details View" is enabled