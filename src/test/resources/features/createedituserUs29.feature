
Feature:user tests create user page with database validation
Feature: user tests create user page with database validation

  Scenario Outline:user tests create user page with database validation
    Given .user is on the Create or edit a user Page with valid credentials "<username>" "<password>"

    Then .user verifies there is no such user in database "<newloginname>"
    Then .user enters new user data login "<newloginname>" "<newfirstname>" "<newlastname>" "<newemail>" "<newisactivated>" <newlanguage> "<newprofiles>"
    Then .user clicks save button on user edit page
    Then .user verifies the success message
    Then .user verifies the user had been created in the database "<newloginname>"



    Examples:
      | username            | password            | newloginname    | newfirstname | newlastname | newemail                   | newisactivated | newlanguage | newprofiles |
      | validadmin_username | validadmin_password | team07admin1004 | jackson      | smith       | team07admin1004@tmail.com | true           | 0           | ROLE_USER   |
