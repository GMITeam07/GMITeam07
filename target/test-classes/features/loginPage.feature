
Feature: Login Page
  @loginpage
    Scenario:
 # Scenario Outline: user logs into GMI Home Page
    Given user is on the GMIBank HomePage
    When user clicks on login Drop down menu
    Then user clicks on Sign in option
  #  And user enters a valid username "<username>"
   # When user enters a valid password "<password>"
    And user enters a valid username "username"
    When user enters a valid password "password"
    And user clicks on sign in button
    Then user verifies successful login


 #   Examples:
  #    | username            |password|
   #   |validadmin_username|validadmin_password|

Scenario: user is logs in with valid credentials "username" "password"
  Then user is logs in with valid credentials "username" "password"

