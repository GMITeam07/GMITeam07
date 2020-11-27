
@EditSingleUser

Feature:Admin can edit all user info  (admin, manager, employee and user)

  Scenario Outline:Admin can edit all user info  (admin, manager, employee and user)

    Given user is on the User Management Page with valid credentials "<username>" "<password>"
    Then user enters edit page of the user "<initiallogin>"
    Then user records initial UI user data on Create or Edit User Page "<initiallogin>"
    Then user retrieves initial user data from the api "<initiallogin>"
    Then user verifies the API UI user data is same "<initiallogin>"
<<<<<<< HEAD
    Then user enters new user data login "<newloginname>" "<newfirstname>" "<newlastname>" "<newemail>" "<newisactivated>" <newlanguage> "<newprofiles>"
=======
    Then user enters new user data login "<newloginname>" "<newfirstname>" "<newlastname>" "<newemail>" "<newisactivated>" "<newlanguage>" "<newprofiles>"
>>>>>>> origin/feature/nilgun
    When user clicks save button on user edit page
    Then user verifies the success message
    Then user verifies over API that user data changed with new datas "<newloginname>" "<newfirstname>" "<newlastname>" "<newemail>" "<newisactivated>" "<newlanguage>" "<newprofiles>"
#    Then user initializes the user data by API

    Examples:
      | username            | password  | initiallogin | newloginname | newfirstname | newlastname | newemail                   | newisactivated | newlanguage | newprofiles |
<<<<<<< HEAD
      | validadmin_username | S123456s? | firstuser    |              | jackson      | smith       | jacksonsmith1234@tmail.com | true           | 0     | ROLE_USER   |
=======
      | validadmin_username | S123456s? | firstuser    |              | jackson      | smith       | jacksonsmith1234@tmail.com | true           | English     | ROLE_USER   |
>>>>>>> origin/feature/nilgun
