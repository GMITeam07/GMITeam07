@loginPageNegativeTest
Feature: Login page should not be accessible with invalid credentials

  Scenario Outline: User is on the GMIBank HomePage
    Given user is on the GMIBank HomePage
    When user clicks on login Drop down menu
    Then user clicks on Sign in option
    And user enters a username "<username>"
    When user enters a password "<password>"
    And user clicks on sign in button
    And user should get Failed to sign in message
    Then user verifies failed to signin message is displayed
#    Then user is logs in with valid credentials "<username>" "<password>"

Examples:
| username            |password|
|invalidadmin_username|validadmin_password|
|validadmin_username|invalidadmin_password|
|invalidadmin_username|invalidadmin_password|











#  @invalid_username
#Scenario:US_005 - TC_001 User is on the login page
#And user enters invalid username
#And user enters valid password
#And user clicks sign in button
#And user should get Failed to sign in message
#Then user verifies failed to signin message is displayed
#
#@invalid_password
#Scenario:US_005 - TC_002 User is on the login page
#And user enters valid username
#And user enters invalid password
#And user clicks sign in button
#And user should get Failed to sign in message
#Then user verifies failed to signin message is displayed
#
#@invalid_userandpassword
#Scenario:US_005 - TC_003 User is on the login page
#And user enters invalid username
#And user enters invalid password
#And user clicks sign in button
#And user should get Failed to sign in message
#Then user verifies failed to signin message is displayed
