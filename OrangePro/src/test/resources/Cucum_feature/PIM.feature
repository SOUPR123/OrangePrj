Feature: Admin for orangehrm

  Background: common steps
    Given User Launch Chrome browser
    When User opens URL
    And User enters Email as "cred" and Password as "Valid"
    And Click on Login
    Then User can view Dashboad
    When User click on PIM Menu

  Scenario Outline: Add PIM
    And click on Add  button
    Then User can view PIM page
    When User enter employee information
    And click on Save option
    Then close the browser
