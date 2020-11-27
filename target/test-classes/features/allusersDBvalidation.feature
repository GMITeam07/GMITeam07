
Feature:All users' info (user, employee, manager and admin) should be retrieved
by database and validated
  Scenario Outline:
    Given user is on the New User Registration Page
    And user verifies the user "<username>" does not exists in the database
    When user creates a new user "<ssn>" "<firstname>" "<lastname>" "<address>" "<mobile>" "<username>" "<email>" "<password>"
    Then user verifies the user had been created in the database "<username>"
    Then user deletes the user "<username>"

    Examples:
      | username        | ssn         | firstname | lastname | address             | mobile       | email                 | password  |
      | team07admin1001 | 001-23-5101 | Johny     | Walker   | Whicky Street No 80 | 111-222-1122 | johnywalker@zmail.com | J123456j? |
    Examples:
      | username        | ssn         | firstname | lastname | address             | mobile       | email                 | password  |
      | team07admin1001 | 001-23-5101 | Johny     | Walker   | Whicky Street No 80 | 111-222-1122 | johnywalker@zmail.com | J123456j? |
