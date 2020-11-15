Feature: Address of customer can be created
  Background: User on customer new page
    Given user is on GMI web site
    And user login to the account
    Then user click my operations dropdown menu
    Then user click on manage customers icon
    Then click on create a new customer button

    Scenario: Address as street and number should be blank and user should see the error the message
      And user leaves the address part blank
      Then user should see an error message

    Scenario: City box should be blank and user should see the error the message
      And user leaves the city part blank
      Then user should see an error message

    Scenario: Address as street and number should be blank and user should see the error the message
      And user leaves the state part blank
      Then user should see an error message

  Scenario: Address as street and number should be blank and user should see the error the message
    And user does not choose any country from the dropdown menu
    Then user should see an error message
