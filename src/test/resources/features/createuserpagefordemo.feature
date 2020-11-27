

  Feature: user tests create user page with database validation

    Scenario Outline:user tests create user page with database validation
      Given user is on the Create or edit a user Page with valid credentials "<username>" "<password>"
      Then user verifies there is no such user in database "<newloginname>"
      Then user enters new user data login "<newloginname>" "<newfirstname>" "<newlastname>" "<newemail>" "<newisactivated>" <newlanguage> "<newprofiles>"
      Then user clicks save button on user edit page
      Then user verifies the success message
      Then user verifies the user had been created in the database "<newloginname>"
#      Then user deletes the new user "<newloginname>" from the database and verifies deletion

      Examples:
        | username            | password            | newloginname    | newfirstname | newlastname | newemail                  | newisactivated | newlanguage | newprofiles   |
        | validadmin_username | validadmin_password | team07admin1021 | Smith21      | smith21     | team07admin1021@tmail.com | true           | 0           | ROLE_USER     |
#        | validadmin_username | validadmin_password | team07admin1022 | Smith22      | smith22     | team07admin1022@tmail.com | true           | 1           | ROLE_ADMIN    |
#        | validadmin_username | validadmin_password | team07admin1023 | Smith23      | smith23     | team07admin1023@tmail.com | FALSE          | 1           | ROLE_EMPLOYEE |
#        | validadmin_username | validadmin_password | team07admin1023 | Smith24      | smith24     | team07admin1024@tmail.com | true           | 0           | ROLE_MANAGER  |
#        | validadmin_username | validadmin_password | team07admin1024 | Smith25      | smith25     | team07admin1025@tmail.com | FALSE          | 1           | ROLE_CUSTOMER |