

  Feature: user tests create user page with database validation

    Scenario Outline:user tests create user page with database validation
      Given user is on the Create or edit a user Page with valid credentials "<username>" "<password>"
      Then user verifies there is no such user in database "<newloginname>"
      Then user enters new user data login "<newloginname>" "<newfirstname>" "<newlastname>" "<newemail>" "<newisactivated>" <newlanguage> "<newprofiles>"
      Then user clicks save button on user edit page
      Then user verifies the success message
      Then user verifies the user had been created in the database "<newloginname>"
      Then user deletes the new user "<newloginname>" from the database and verifies deletion

      Examples:
        | username            | password            | newloginname    | newfirstname | newlastname | newemail                  | newisactivated | newlanguage | newprofiles   |
        | validadmin_username | validadmin_password | team07admin10121 | Smith21      | smith21     | team07admin10121@tmail.com | true           | 0           | ROLE_USER     |
        | validadmin_username | validadmin_password | team07admin10122 | Smith22      | smith22     | team07admin10122@tmail.com | true           | 1           | ROLE_ADMIN    |
        | validadmin_username | validadmin_password | team07admin10123 | Smith23      | smith23     | team07admin10123@tmail.com | FALSE          | 1           | ROLE_EMPLOYEE |
        | validadmin_username | validadmin_password | team07admin10123 | Smith24      | smith24     | team07admin10124@tmail.com | true           | 0           | ROLE_MANAGER  |
        | validadmin_username | validadmin_password | team07admin10124 | Smith25      | smith25     | team07admin10125@tmail.com | FALSE          | 1           | ROLE_CUSTOMER |

    @BurdanCalistirmayin
    Scenario:user tests create user page with database validation
      Given user is on the Create or edit a user Page with valid credentials "team07admin" "S123456s?"