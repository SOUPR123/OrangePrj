Feature: Admin for orangehrm

  Background: common steps
    Given User Launch Chrome browser
    When User opens URL
    And User enters Email as "cred" and Password as "Valid"
    And Click on Login
    Then User can view Dashboad
    When User click on Admin Menu

  Scenario Outline: Add admin
    And click on Add new button
    Then User can view Admin page
    When User enter customer info
    And click on Save button
    Then close the browser

  Scenario Outline: Add Job Title
    And click on job menu item
    And click on job title item
    Then click on add option
    And click on save option
    And User enter job information
    Then close the browser
@general
  Scenario Outline: Edit General Information
    And click on Organization Item
    And click on General Information Item
    Then click on edit option
    When User edit the general Information
    And click save
    Then close the browser
