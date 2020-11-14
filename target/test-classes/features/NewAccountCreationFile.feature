  @signIn
  Feature: sign in feature
  Background:
      Given user is logs in with valid credentials "<employee>" "<employee>"

  @CreateNewAccount
  Scenario Outline:US_013 - User should create a new account
      And user clicks on My Operations
      And user selects on Manage Accounts
      And user clicks on Create a New Account button
      And user enters a Description "<description>"
      And user enters a Balance "<balance>"
      And user selects Account Type "<accounttype>"
      And user selects Account Status Type "<accountstatus>"
      And user selects Create Date "<createdate>"
      And user selects a Closed Date "<closeddate>"
      And user selects Employee "<employee>"
      Then user clicks on Save Button

    Examples:
      | description | balance | accounttype | accountstatus | createdate          | closeddate         | employee |
      | Td account  | 150000  | Saving      | Active        | 2020-11-11 12:00 PM | 2029-12-10 4:00 PM | random   |