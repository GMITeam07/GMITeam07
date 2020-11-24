@SignIn
Feature: sign in feature
   Background:
     Given user logs in with valid credentials "validuser_username" "validuser_password"

  @GMIPasswordEditing
  Scenario Outline:TC_0009_0001_The user test the password levelchart on the home page
    status bar changes by password strenght

    When user clicks the login dropdown
    And user selects the password option
    And User enters current password "<password>"
    And user enters new password "<newpassword>"
    And user sees the level chart change accordingly



    Examples:
      | password   | newpassword |
      | S123456s?  | admin       |
      | S123456s?  | TechAdmin   |
      | S123456s?  | Admin3      |
      | S123456s?  | TechAdmin7! |




