@GMIPasswordEditing
Feature: sign in feature
  Background:
    Given user is logs in with valid credentials "<User>" "<User>"

  Scenario Outline: The user should be able to change the password on the home page.
    And user clicks the sighIn dropdown
    And user selects the password dropdown
    And User enters current password "<password>"
    And user enters new password "<new password>"
    And user sees the level chart change accordingly
    And user enters new password again for confirmation "<confirm password>"
    Then click save button

    Examples:
      | password   | new password |  confirm password |
      | TechAdmin8 | Admin2       |   Admin2          |
      | TechAdmin8 | TechAdmin2!  |   TechAdmin2!     |
      | TechAdmin8 | Admin#4      |   Admin#4         |
  @NegativePassword
  Scenario Outline: The user should not be able to change the password on the home page.
      And user clicks the sighIn dropdown
      And user selects the password dropdown
      And User enters current password "<password>"
      And user enters new password "<new password>"
      And user sees the level chart change accordingly
      And user enters new password again for confirmation "<confirm password>"
      Then click save button

    Examples:
      | password   |   new password |   confirm password |
      | TechAdmin8 |   TechAdmin8   |   TechAdmin8       |

