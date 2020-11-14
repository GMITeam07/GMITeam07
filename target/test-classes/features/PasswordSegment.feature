@GMIPasswordEditing
Feature: sign in feature
  Background:
    Given user is logs in with valid credentials "<employee>" "<employee>"

  Scenario: The user should be able to change the password on the home page.
    When user click the sighIn dropdown
    And user select the password dropdown
    And User enter current password "<password>"
    And user enter new password "<new password>"
    And user enter new password again for confirmation "<confirm password>"
    Then click save button

    |password  | |new password| |confirm password|
    |TechAdmin8| |Admin2      | |Admin2          |

  Scenario: The user should not be able to change the password on the home page.
    When user click the sighIn dropdown
    And user select the password dropdown
    And User enter current password "<password>"
    And user enter new password "<new password>"
    And user enter new password again for confirmation "<confirm password>"
    Then click save button

      |password  | |new password| |confirm password|
      |TechAdmin8| |Admin2      | |Admin2          |
