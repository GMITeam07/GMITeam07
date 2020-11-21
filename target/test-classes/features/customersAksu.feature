@CustomersPopulated
  Feature: System should allow user to manage their account

    Background: User logins GMIBank Home Page
      Then user logs in with valid credentials "validcustomer_username" "validuser_password"

    @accountTypesAndBalance
    Scenario: User should see all account types and balance populated
        When User clicks my operations drop down
        And User clicks manage accounts
        And User should see all account types and balance populated
        Then user logs out




    Scenario: User can view transaction
      When User clicks my operations drop down
      And User clicks manage accounts
      And User clicks view button
      And user should view transactions
  #    Then user logs out

