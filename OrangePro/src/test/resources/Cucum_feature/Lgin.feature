Feature: Login for orangehrm
@Test1
  Scenario Outline: Login functionality with valid Credentials
    Given User Launch Chrome browser
    When User opens URL
    And User enters Email as "<Filename>" and Password as "<Key>"
    And Click on Login
    Then Page Title should be "OrangeHRM"
    And click on Logout link
    Then close the browser

    Examples: 
      | Filename | Key   |
      | cred     | Valid |

  Scenario Outline: Login with Invalid Credentials
    Given User Launch Chrome browser
    When User opens URL
    And User enters Email as "<Filename>" and Password as "<Key>"
    And Click on Login
    Then User can view a message "Invalid credentials"

    Examples: 
      | Filename | Key     |
      | cred     | Invalid |
