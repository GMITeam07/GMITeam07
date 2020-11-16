@address
Feature: Address of customer can be created
  Background: User on customer new page
    Given user is on the GMIBank HomePage
    When user clicks on login Drop down menu
    Then user clicks on Sign in option
    And user enters a valid username "validuser_username"
    When user enters a valid password "validadmin_password"
    And user clicks on sign in button
    Then user click my operations dropdown menu
    Then user click on manage customers icon
    Then click on create a new customer button

    Scenario: Address as street and number should be blank and user should see the error the message
      And user leaves the address part blank
      Then user should see an error message under address

    Scenario: City box should be blank and user should see the error the message
      And user leaves the city part blank
      Then user should see an error message under city

    Scenario: State should be blank and user should see the error the message
      And user leaves the state part blank
      Then user should see an error message under state

  Scenario: Country should be blank and user should see the error the message
      And user does not choose any country from the dropdown menu
      Then user should see an error message under country
