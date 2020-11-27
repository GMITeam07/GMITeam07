@CustomersPopulated
Feature: System should allow user to manage their account

  @accountTypesAndBalance
  Scenario: User should see all account types and balance populated
    Then user logs in with valid credentials "validcustomer_username" "validcustomer_password"
    When User clicks my operations drop down
    And User clicks manage accounts
    And User should see all account types and balance populated
    Then user logs out


  @allTransactions
  Scenario: User can view transaction
    Then user logs in with valid credentials "ali_customer07" "243456"
    When User clicks my operations drop down
    And User clicks My Accounts  and View Transaction
    And user should view transactions
    Then user logs out

