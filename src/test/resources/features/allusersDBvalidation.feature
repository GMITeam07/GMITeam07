
Feature:All users' info (user, employee, manager and admin) should be retrieved
by database and validated
  Scenario:
    Given user is on the New User Registration Page
    Then user clicks on Register drop down option
    And user verifies the user "<username>" does not exists in the database
    When user creates a new user "<ssn>" "<firstname>" "<lastname>" "<address>" "<mobile>" "<username>" "<email>" "<password>"
    Then user verifies the user had been created in the database
    Then user deletes the user "<username>"

