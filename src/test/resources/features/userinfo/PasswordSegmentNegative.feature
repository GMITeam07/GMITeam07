@NegativePasswordSegment
Feature: sign in feature

  Background:
    Given user logs in with valid credentials "validuser_username" "validuser_password"

  @NegativePassword
  Scenario Outline: The user should not be able to change the password on the home page.

    And user clicks the login dropdown
    And user selects the password option
    And User enters current password "<password>"
    And user enters new password "<newpassword>"
    And user enters new password again for confirmation "<confirmpassword>"
    Then click save button
    Then User verifies that "<succesmessage>" is not displyed


    Examples:
      | password  | newpassword | confirmpassword | succesmessage     |
      | S123456s? | S123456s?   | S123456s?       | Password changed! |
