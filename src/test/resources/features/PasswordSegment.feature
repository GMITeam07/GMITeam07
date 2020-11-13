@GMIPasswordEditing
Feature: Password Segment Editing

  Background: : user logs into GMI Home Page
    Given user is on the GMIBank HomePage
    When user clicks on login Drop down menu
    Then user clicks on Sign in option
    And user enters a valid username "<username>"
    When user enters a valid password "<password>"
    And user clicks on sign in button

  Scenario: The user should be able to change the password on the home page.
    Then user logs in with valid credentials "<username>" "<password>"
    When user click the sighIn dropdown
    And user select the password dropdown
    And User enter current password
    And user enter new password
    And user enter new password again for confirmation
    Then click save button