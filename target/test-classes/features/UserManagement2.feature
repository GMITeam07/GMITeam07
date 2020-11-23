@LoginUser2
Feature: sign in feature

  Background:
    Given user logs in with valid credentials "validadmin_username" "validadmin_password"

  @UserManagement2
  Scenario Outline:US_O17_TC002_Admin can view edit and delete all user info
    When Admin clicks the Administration
    And Admin selects the usermangement dropdown
    Examples:
      |  |