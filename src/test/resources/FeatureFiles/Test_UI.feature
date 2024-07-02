@Test
Feature: Wosler Test Cases

  #  Background:
  #    Given User is on Login Page
  #    Then User Login with the Valid Credential
  @TC_01 @Smoke
  Scenario: Verify that user can login through valid credentials
    Given User is on Login Page
    Then User Login with the Valid Credential

  @TC_02
  Scenario: Verify that user can login through Invalid credentials
    Given User is on Login Page
    And User Login with the InValid Credential
    Then Verify the Error Message

  @TC_03
  Scenario: Verify that user can login through Invalid credentials
    Given User is on Login Page
    And User Login with the Valid Credential
    And User Navigate to Register Kiosk Page
    And User Enter Name and Click on Register
    And User Click on Check-in box
    And User enters Information
    And User Click on Connect to Assistant button
   #  Then Verify the "Permissions check" message

  @TC_04
  Scenario: Verify that user can Create New Account
    Given User is on Login Page
    And User Login with the Valid Credential
    And User Navigate to Account Page
    And User Enter Name and CompanyName
    And Click on Register
    And Verify the "New Account Created Successfully" message for New Account
    And Click on Account tab  
    And Seach Recent Created Account
    Then Update the Account
    
