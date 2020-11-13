@@NegativeTest
Feature: User tests the user info segment

  Background: User is on the GMIBank Home Page
    Given User on the GMIBank Homepage

  Scenario Outline:TC_0008_0006_User tests the user info settings page WebElements
  user verifies the firstname, lastname, email and language options available
    And user enters a valid username "<username>"
    And user enters a valid password "<password>"
    And user click sign in button
    And user clicks on User Account Menu
    When user selects the User Info option
    Then user verifies the page displays text "User settings for [" text is displayed"
    Then user verifies "<username>" is written in message inside bracelets
    When user clears the email textbox
    Then user verifies an error message is displayed contains "Your email is required"
    Then user clears the email textbox
    When user enters a new email "<newshortemail>"
    Then user verifies an error message is displayed contains "at least 5 characters"
    Then user clears the email textbox
    When user enters a new email "<newinvalidemail>"
    Then user verifies an error message is displayed contains "This field is invalid"

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
    And user click sign in button
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

  Scenario Outline:TC_0008_0003_User Info settings firstname textbox must be editable

    And user enters a valid username "<username>"
    And user enters a valid password "<password>"
    And user click sign in button
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
