@LoginUser
Feature: sign in feature

  Background:
    Given user logs in with valid credentials "validadmin_username" "validadmin_password"


  @UserManagement
  Scenario Outline:US_017_TC001_Admin can manage the all user
    When Admin clicks the Administration button
    And Admin select the usermangement dropdown
    When Admin clicks the Crete a new button
    And Admin enters a login "<username>"
    And Admin enters a FirstName "<FirstName>"
    And Admin enters a LastName "<lastName>"
    And Admin enters a Email "<email>"
    And Admin click the activeted button
    And Admin selects the language
    And Admin selects the role "<role>"
    Then Admin clicks the save button


    Examples:
      | username | FirstName | lastName  | email                    | role          |
      | HarryP   | Harry     | Potter    | Harry_Potter@gmail.com   | ROLE_ADMIN    |
      | WilliamJ | William   | Jay       | WilliamJay@gmail.com     | ROLE_EMPLOYEE |
      | KateW    | Kate      | Windbrook | Kate_Windbrook@gmail.com | ROLE_MANAGER  |
      | JoeD     | Joe       | Day       | Joe_Day@gmail.com        | ROLE_USER     |



