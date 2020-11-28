@money_transfer
Feature: Money Transfer

  Scenario: user make money transfer successfully
    Given user is on the GMIBank HomePage
    When user clicks on login Drop down menu
    Then user clicks on Sign in option
    And user enters a valid username "jkelly"
    When user enters a valid password "John.123"
    And user clicks on sign in button
    And user verifies successful login
    And user clicks on the My Operations viewbox
    And user clicks on the Transfer Money viewbox
    And user selects the first account as From dropdown
    And user selects the second account as To dropdown
    And user writes a balance that they want to proceed with
    And user writes a description for money transfer
#    Then user clicks on the Make Transfer button
#    Then user checks success validating message


@money_transfer_negative

 Scenario: user can not leave empty balance and description checkboxes
  Given user is on the GMIBank HomePage
  When user clicks on login Drop down menu
  Then user clicks on Sign in option
  And user enters a valid username "jkelly"
  When user enters a valid password "John.123"
  And user clicks on sign in button
  And user verifies successful login
  And user clicks on the My Operations viewbox
  And user clicks on the Transfer Money viewbox
  And user selects the first account as From dropdown
  And user selects the second account as To dropdown
  And user leaves empty the balance checkbox
  And user leaves empty the description checkbox
  Then user should see red alerts under the balance and description checkboxes



