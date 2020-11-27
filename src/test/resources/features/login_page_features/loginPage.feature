@loginpage
Feature: Login Page

  Scenario:user logs into GMI Home Page
    Given user is on the GMIBank HomePage
    When user clicks on login Drop down menu
    Then user clicks on Sign in option
    And user enters a valid username "username"
    When user enters a valid password "password"
    And user clicks on sign in button
    Then user verifies successful login

<<<<<<< HEAD:src/test/resources/features/login_page_features/loginPage.feature
    Examples:
      | username            |password|
      |validadmin_username|validadmin_password|
=======
    #Examples:
      #| username            |password|
      #|validadmin_username|validadmin_password|


>>>>>>> main:src/test/resources/features/loginPage.feature
