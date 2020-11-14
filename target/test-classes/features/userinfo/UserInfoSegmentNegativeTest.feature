@NegativeTest
Feature: User tests the user info segment

<<<<<<< HEAD
  Background: User is on the GMIBank Home Page
    Given user is on the GMIBank HomePage
    Then user clicks on login Drop down menu
    Then user clicks on Sign in option

  Scenario Outline:TC_0008_0006_User tests the user info settings email textbox
  email should not be empty, should not accept . extension and should not accept without @ sign

    And user enters a valid username "<username>"
    And user enters a valid password "<password>"
    And user clicks on sign in button
=======
  Scenario Outline:TC_0008_0006_User tests the user info settings email textbox
  email should not be empty, should not accept . extension and should not accept without @ sign

    And user logs in with valid credentials "<username>" "<password>"
>>>>>>> main
    And user clicks on User Account Menu
    When user selects the User Info option
    Then user verifies the page displays text "User settings for [" text is displayed"
    Then user verifies "<username>" is written in message inside bracelets
    When user clears the email textbox
    Then user verifies an error message is under email textbox displayed contains "Your email is required"
    Then user clears the email textbox
    When user enters a new invalid email "<newshortemail>"
    Then user verifies an error message under email textbox is displayed contains "at least 5 characters"
    Then user clears the email textbox
    When user enters a new invalid email "<newinvalidemail>"
    Then user verifies an error message under email textbox is displayed contains "This field is invalid"

    Examples:
      | username            | password            |newshortemail|newinvalidemail|
      | validadmin_username | validadmin_password |asdf         |asa@.zom      |

  Scenario Outline:TC_0008_0007_User tests the user info settings email textbox should not be empty
  email should not be empty and should give error message when empty

<<<<<<< HEAD
    And user enters a valid username "<username>"
    And user enters a valid password "<password>"
    And user clicks on sign in button
=======
    And user logs in with valid credentials "<username>" "<password>"
>>>>>>> main
    And user clicks on User Account Menu
    When user selects the User Info option
    Then user verifies the page displays text "User settings for [" text is displayed"
    Then user verifies "<username>" is written in message inside bracelets
    When user clears the firstname textbox
    Then user verifies an error message under firstname textbox is displayed contains "Your firstname is required"

    Examples:
      | username            | password            |
      | validadmin_username | validadmin_password |

  Scenario Outline:TC_0008_0008_User tests the user info settings email textbox
  email should not be empty, should not accept . extension and should not accept without @ sign

<<<<<<< HEAD
    And user enters a valid username "<username>"
    And user enters a valid password "<password>"
    And user clicks on sign in button
=======
    And user logs in with valid credentials "<username>" "<password>"
>>>>>>> main
    And user clicks on User Account Menu
    When user selects the User Info option
    Then user verifies the page displays text "User settings for [" text is displayed"
    Then user verifies "<username>" is written in message inside bracelets
    When user clears the lastname textbox
    Then user verifies an error message under lastname textbox is displayed contains "Your lastname is required"

    Examples:
      | username            | password            |
      | validadmin_username | validadmin_password |


