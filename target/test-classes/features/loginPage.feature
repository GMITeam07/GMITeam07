@loginpage
Feature: Login Page
  Background:User is on the GMI login page
    Given User on the GMIBank Homepage
    When user clicks loginDrpDwn
    Then user clicks signinBtn

  @signin
  Scenario:US_004 - TC_001 User is on the login page
    And user enters valid username
    And user enters valid password
    And user click sign in button
    Then verify username on the login page

  @cancel
  Scenario:US_004 - TC_002 User is on the login page
    And user enters valid username
    And user enters valid password
    And There should be an option to cancel login
    And user clicks on the cancel button
    Then user verifies user is on the homepage

  @invalid_username
  Scenario:US_005 - TC_001 User is on the login page
    And user enters invalid username
    And user enters valid password
    And user clicks sign in button
    And user should get Failed to sign in message
    Then user verifies failed to signin message is displayed

   @invalid_password
  Scenario:US_005 - TC_002 User is on the login page
    And user enters valid username
    And user enters invalid password
    And user clicks sign in button
    And user should get Failed to sign in message
    Then user verifies failed to signin message is displayed

     @invalid_userandpassword
  Scenario:US_005 - TC_003 User is on the login page
    And user enters invalid username
    And user enters invalid password
    And user clicks sign in button
    And user should get Failed to sign in message
    Then user verifies failed to signin message is displayed
