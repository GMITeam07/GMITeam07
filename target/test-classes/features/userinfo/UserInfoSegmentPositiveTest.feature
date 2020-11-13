@UserInfo  @PositiveTest
Feature: User tests the user info segment

  Background: User is on the GMIBank Home Page
    Given user is on the GMIBank HomePage
    Then user clicks on login Drop down menu
    Then user clicks on Sign in option

  Scenario Outline:TC_0008_0001_User tests the user info settings page WebElements
  user verifies the firstname, lastname, email and language options available

    And user enters a valid username "<username>"
    And user enters a valid password "<password>"
    And user clicks on sign in button
    And user clicks on User Account Menu
    When user selects the User Info option
    Then user verifies the page displays text "User settings for [" text is displayed"
    Then user verifies "<username>" is written in message inside bracelets
    Then user verifies firstname textbox is available
    Then user verifies lastname textbox is available
    Then user verifies email textbox is available
    Then user verifies the language dropdown menu exists

    Examples:
      | username            | password            |
      | validadmin_username | validadmin_password |

  Scenario Outline:TC_0008_0002_User Info settings language drop down
  must have 2, "English" and "Türkçe" editable options

    And user enters a valid username "<username>"
    And user enters a valid password "<password>"
    And user clicks on sign in button
    And user clicks on User Account Menu
    When user selects the User Info option
    Then user verifies the page displays text "User settings for [" text is displayed"
    Then user verifies "<username>" is written in message inside bracelets
    Then user verifies language drop down menu has "English" and "Türkçe" options
    Then user gets the user data from UI
    When user retrieves the user info "<username>" by api
    Then user verifies the user data is same as api data
    Then user retrieves the user info "<username>" by database
    Then user verifies the user data is same as database data
    Then user selects language "<language>"
    Then user clicks on save button
    Then user verifies success message is displayed "<successmessage>"
    Then user
    Then user retrieves the user info "<username>" by api
    Then user retrieves the user info "<username>" by database
    Then user verifies the user language "<language>"is same as api
    Then user verifies the user language "<language>"is same as database

    Examples:
      | username            | password            |language|
      | validadmin_username | validadmin_password |English|
      | validadmin_username | validadmin_password |Turkish|

  @usersettings
  Scenario Outline:TC_0008_0003_User Info settings firstname textbox must be editable
  user edits the firstname and verifies changes over api and database
    And user enters a valid username "<username>"
    And user enters a valid password "<password>"
    And user clicks on sign in button
    And user clicks on User Account Menu
    When user selects the User Info option
    Then user verifies the page displays text "User settings for [" text is displayed"
    Then user verifies "<username>" is written in message inside bracelets
    Then user clears the firstname textbox
    Then user enters a new firstname "<newfirstname>"
    Then user clicks on save button
    Then user verifies success message is displayed "<successmessage>"
    Then user refreshes the page
    Then user verifies the UI firstname is same as "<newfirstname>"
    When user retrieves the user info "<username>" by database
    Then user verifies the api firstname "firstname" is same as "<newfirstname>"
    Then user verifies the user data is same as database data
    When user retrieves the user info "<username>" by api
    Then user verifies the database firstname "firstname" is same as "<newfirstname>"
    Then user verifies the user data is same as api data
    Then user clears the firstname textbox
    Then user enters the initial firstname to firstname textbox
    Then user clicks on save button
    Then user verifies success message is displayed "<successmessage>"

    Examples:
      | username            | password            | newfirstname | successmessage  |
      | validadmin_username | validadmin_password | jackson      | Settings saved! |


  @usersettings
  Scenario Outline:TC_0008_0004_User Info settings lastname textbox must be editable
  user edits the lastname and verifies changes over api and database
    And user enters a valid username "<username>"
    And user enters a valid password "<password>"
    And user clicks on sign in button
    And user clicks on User Account Menu
    When user selects the User Info option
    Then user verifies the page displays text "User settings for [" text is displayed"
    Then user verifies "<username>" is written in message inside bracelets
    Then user clears the lastname textbox
    Then user enters a new lastname "<newlastname>"
    Then user clicks on save button
    Then user verifies success message is displayed "<successmessage>"
    Then user refreshes the page
    Then user verifies the lastname is same as "<newlastname>"
    When user retrieves the user info "<username>" by database
    Then user verifies the api lastname "lastname" is same as "<newlastname>"
    Then user verifies the user data is same as database data
    When user retrieves the user info "<username>" by api
    Then user verifies the database lastname "lastname" is same as "<newlastname>"
    Then user verifies the user data is same as api data
    Then user clears the lastname textbox
    Then user enters the initial lastname to lastname textbox
    Then user clicks on save button
    Then user verifies success message is displayed "<successmessage>"

    Examples:
      | username            | password            | newlastname | successmessage  |
      | validadmin_username | validadmin_password | jackson      | Settings saved! |

  @usersettings
  Scenario Outline:TC_0008_0005_User Info settings email textbox must be editable
    user edits the email and verifies changes over api and database

    And user enters a valid username "<username>"
    And user enters a valid password "<password>"
    And user clicks on sign in button
    And user clicks on User Account Menu
    When user selects the User Info option
    Then user verifies the page displays text "User settings for [" text is displayed"
    Then user verifies "<username>" is written in message inside bracelets
    Then user clears the email textbox
    Then user enters a new email "<newemailname>"
    Then user clicks on save button
    Then user verifies success message is displayed "<successmessage>"
    Then user refreshes the page
    Then user verifies the email is same as "<newemailname>"
    When user retrieves the user info "<username>" by database
    Then user verifies the api email "email" is same as "<newemailname>"
    Then user verifies the user data is same as database data
    When user retrieves the user info "<username>" by api
    Then user verifies the database email "email" is same as "<newemailname>"
    Then user verifies the user data is same as api data
    Then user clears the email textbox
    Then user enters the initial email to email textbox
    Then user clicks on save button
    Then user verifies success message is displayed "<successmessage>"

    Examples:
      | username            | password            | newemailname | successmessage  |
      | validadmin_username | validadmin_password | jackson@zmail.com      | Settings saved! |
