@userInfoSettingUpdate
Feature: User Info Update

  Background: User logins GMIBank Home Page
    Then user logs in with valid credentials "validuser_username" "validuser_password"

    @invalidEmail
  Scenario Outline: System should not allow to make updates with invalid credentials

    And user clicks on User Account Menu
    When user selects the User Info option
    And user verifies the page displays text "User settings for [" text is displayed"
    And User enters first name "<firstname>"
    And User enters last name "<lastname>"
    And User enters invalid email"<invalid email>"
    And user clicks on save button
    Then User should see This field is invalid massage
    Then user clicks sign out button

    Examples:
      | firstname | lastname  |invalid email|
      | first_name | lasat_name |invalid_email1|
      | first_name | lasat_name |invalid_email2|
      | first_name | lasat_name |invalid_email3|



    @blankNameUpdate
  Scenario Outline: System should not allow to make updates with invalid credentials, And user blanks first name field

    And user clicks on User Account Menu
    When user selects the User Info option
    And user verifies the page displays text "User settings for [" text is displayed"
    And user clears the firstname textbox
    And User enters last name "<lastname>"
    And user enters valid email "<valid email>"
    And user clicks on save button
    Then user should see Your first name is required massage
      Then user clicks sign out button


    Examples:
      |lastname  |valid email|
      |lasat_name |valid_email|


    @blankLastnameUpdate
  Scenario Outline: System should not allow to make updates with invalid credentials, And User blanks last name field

    And user clicks on User Account Menu
    When user selects the User Info option
    And user verifies the page displays text "User settings for [" text is displayed"
    And User enters first name "<firstname>"
    And user clears the lastname textbox
    And user enters valid email "<valid email>"
    And user clicks on save button
    Then User should see Your last name is required massage
      Then user clicks sign out button


    Examples:
      | firstname |valid email|
      | first_name |valid_email|

      @selectLanguage
  Scenario: There should not be an option of any other language other than English or Turkish
    And user clicks on User Account Menu
    When user selects the User Info option
    When user verifies the page displays text "User settings for [" text is displayed"
    And user clicks Language drop down
    Then user should be see just English and Turkish language options


  Scenario : user logs into GMI Home Page
    Given user is on the GMIBank HomePage
    When user clicks on login Drop down menu
    Then user clicks on Sign in option
    And user enters a valid username "username"
    When user enters a valid password "password"
    And user clicks on sign in button
    Then user verifies successful login
