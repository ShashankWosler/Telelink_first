@sanityTest
Feature: Validating of the Smoke Test

  Background:
    Given User is on Login Page
    Then User Login with the Valid Credential

  @TC_2
    @sn
  Scenario Outline: Verify that user can create a new case as a company type and validate that created case
    When User click on +case button
    And User click on Business Division dropdown get "NAT" value from dropdown
    And User click on Service Contract dropdown get "NAT-Clone@CTP" value from dropdown
    And User select case type "<Type of Case>" to add
    And User fill the Cases Type Form of "<Type of Case>"
    And User fill the Employment Details Form of "<Type of Case>"
    And User fill the Referral Details Form
    And User fill the Bill To Company Form
    And User fill the Save Form
    Then User Verify the case is created and should be visible in case list "<Type of Case>"
    Examples:
      |Type of Case|
      |  Company  |
      |  Individual  |

  Scenario Outline: Verify input fields of company and individual case type
   When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "<Type of Case>"
    And User click on search button from search popup
    And User verify the case type id "<Type of Case>"
    And User click on client tab
    Then User verify the mandatory fields of client form
    Examples:
      |Type of Case|
      |  Company  |
      |  Individual  |

    @T_12
      @sn
      Scenario: Verify User is able to create Standard billing from case list "+ Billing" Button without plan and validate the newly Created cost is displayed under Case List>Cost tab.
      When User click on search button from HomePage
      And User Select Newly Created "Case"
      And User click on search button from search popup
      And User Click on +Billing button
      And User Select "Standard cost (included in regular batch invoice run)" from Select your invoice type dropdown
      And User Select "CTP408 : Accommodation Management" Option from the Billing dropdown
      And User Click on Submit button
      And User select Costs tab
      And Verify that new Created "Cost" is listed in Cost list under Costs Tab
      And User select Case Notes tab
      And User select Case Log tab
      Then Verify that Newly created billing ID of should be visible in Case logs


 @sanity
 @TC_1-29
 Scenario: User is able to create an admin note on the Admin notes tab
   When User select any case from the case list
   And User select Case Notes tab
   And User select Admin Notes tab
   And User click on Admin Add New button
   And User fill all the mandatory fields in Add Note PopUp
   And User click on the Save button
   Then Verify the Admin Note should be added on Admin notes tab


  @TC_1-653
  Scenario: Verify that the Details button functionality on the admin notes tab
    When User select any case from the case list
    And User select Case Notes tab
    And User select Admin Notes tab
    And User select any Admin Notes from the admin list
    And User click on the Admin Details button
    And User Edit the information in Title and Description fields
    And User click on the Save button

   @TC_1-28
   Scenario: Verify that the Details button functionality on the user notes tab
     When User select any case from the case list
     And User select Case Notes tab
     And User select User Notes tab
     And User click on the User Notes Details button
     And User Edit the information in Title and Description fields
     And User click on the Save button
     Then Verify the User Note should be added on User notes tab

  @TC_1-820
   Scenario: Verify that newly created User note and Admin note logs are displaying on the Case log tab
       When User select any case from the case list
       And User select Case Notes tab
       And User select User Notes tab
       And User click on User Notes Add New button
       And User fill all the mandatory fields in Add Note PopUp
       And User click on the Save button
       And User select Case Log tab
       Then Verify the newly created notes logs should be created on the case logs tab

   @TC_1-655
    Scenario: Verify the search feature functionality on the Case Note/ all sub-tabs
    When User select any case from the case list
    And User select Case Notes tab
    And User select User Notes tab
    And User click on the by Dropdown on User Notes Tab
    And User Select Title Option from By DropDown
    And User Enter the keyword on the search box according to the filter option selected in the by dropdown
    And User click on the Find button
    Then Verify the Search Result

  @TC_1-657
  Scenario: Disable and Arranging the sequence of Case Notes all sub-tabs column by using field view edit button
    When User select any case from the case list
    And User select Case Notes tab
    And User select User Notes tab
    And User click on the Field Edit button From User Notes Tab
    And User select the required custom field on the enabled side
    And User Use the arrow key for the order of the position needed
    And User click on the Disable button
    Then User click on the Apply button

  @TC_1-656
  Scenario: Enable and Arranging the sequence of Case Notes all sub-tabs columns by using the field view edit button
    When User select any case from the case list
    And User select Case Notes tab
    And User select User Notes tab
    And User click on the Field Edit button From User Notes Tab
    And User select the required custom field on the disabled side
    And User click on the Enable button
    And User Use the arrow key for the order of the position needed
    Then User click on the Apply button

  @TC_1-654
  Scenario: Verify the details button on the Case Notes case tab
    When User select any case from the case list
    And User select Case Notes tab
    And User select Case Log tab
    And User select any Case log from the list
    And User click on the Case Log Details button
    And User Check and View the Add Note PopUp
    Then User click on the Close button Add Note PopUp

  @TC_1-658
  Scenario: To verify the Report Selection Criteria on the Case Note Tab
    When User select any case from the case list
    And User select Case Notes tab
    And User select Case Log tab
    And User Go to the Report Selection Criteria, Select Date Range from DropDown
    And User Select the date From and To
    And User Sort it by Ascending order
    And User Select Note type from the dropdown
    And User click on the print-preview button
    And User click on the Export button
    Then Go to the report
    And User download option and download the desired format









