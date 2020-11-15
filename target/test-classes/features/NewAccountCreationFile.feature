  @signIn
  Feature: sign in feature
    Background:
     Given user logs in with valid credentials "validemployee_username" "validemployee_password"


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
      | BMO account | 55000   | Investing   | Suspended     | 2020-11-13 5:00 PM  | 2021-04-18 9:00 AM | random   |

    Scenario Outline:
      Given user logs in with valid credentials "<username>" "<password>"

      Examples:
        | username            | password            |
        | validadmin_username | validadmin_password |
