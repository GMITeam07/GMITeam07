@loginpage
Feature: Login Page
  @signin
  Scenario:US_004 - TC_001 User is on the login page
    Given user is on the GMI bank login page
    And user enters valid username
    And user enters valid password
    And user click sign in button
    Then There should be an option to cancel login

  Scenario:US_005 - TC_001 User is on the login page
    Given user is on the GMI bank login page
    And user enters invalid username
    And user enters valid password
    And user click sign in button
    Then user should get Failed to sign in message

  Scenario:US_005 - TC_002 User is on the login page
    Given user is on the GMI bank login page
    And user enters valid username
    And user enters invalid password
    And user click sign in button
    Then user should get Failed to sign in message

  Scenario:US_005 - TC_003 User is on the login page
    Given user is on the GMI bank login page
    And user enters invalid username
    And user enters invalid password
    And user click sign in button
    Then user should get Failed to sign in message
