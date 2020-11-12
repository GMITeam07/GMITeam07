@loginpage
Feature: Login Page

  Scenario Outline: user logs into GMI Home Page
    Given User is on the GMIBank HomePage
    When user clicks on login Drop down menu
    Then user clicks on Sign in option
    And user enters a valid username "<username>"
    When user enters a valid password "<password>"
    And user clicks on sign in button
    Then user verifies successful login
#    Then user is logs in with valid credentials "<username>" "<password>"

    Examples:
      | username            |password|
      |validadmin_username|validadmin_password|



  @cancel
  Scenario:US_004 - TC_002 User is on the login page
    And user enters valid username
    And user enters valid password
    And There should be an option to cancel login
    And user clicks on the cancel button
    Then user verifies user is on the homepage


