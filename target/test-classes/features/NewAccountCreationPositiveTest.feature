@NewAccountCreationPositive
  Feature: sign in feature
    Background:
     Given user logs in with valid credentials "validemployee_username" "validemployee_password"


  @PositiveCreateNewAccount
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
      And user clicks on Save Button
     Then user verifies that account is created



    Examples:
      | description        | balance | accounttype | accountstatus | createdate          | closeddate         | employee |
      | Td account         | 150000  | Saving      | Active        | 2020-11-11 12:00 PM | 2029-12-10 4:00 PM | random   |
      #| BMO account        | 55000   | Investing   | Suspended     | 2020-11-13 5:00 PM  | 2021-04-18 9:00 AM | random   |
      #| Ottawa account     | 35000   | Checking    | Closed        | 2020-11-15 12:00 PM | 2020-12-10 4:00 PM | random   |
      #| Halifax account    | 455000  | Investing   | Suspended     | 2020-11-13 9:00 PM  | 2022-07-20 7:00 AM | random   |
      #| Edmonton account   | 50000   | Saving      | Active        | 2020-11-20 12:00 PM | 2029-12-10 4:00 PM | random   |
      #| Salary account     | 90000   | Checking    | Suspended     | 2020-11-13 5:00 PM  | 2021-04-18 9:00 AM | random   |
      #| Toronto account    | 7750000 | Saving      | Active        | 2020-11-11 12:00 PM | 2029-12-10 4:00 PM | random   |
      #| America account    | 5125000 | Investing   | Suspended     | 2020-11-24 7:00 PM  | 2021-04-20 9:00 AM | random   |
     #| Active account     | 3570000 | Saving      | Active        | 2020-11-11 10:00 PM | 2029-12-10 2:00 PM | random   |
      #| CreditCard Account | 12500   | Credit_Card | Active        | 2020-11-13 5:00 PM  | 2021-04-18 1:00 AM | random   |

    Scenario Outline:
      Given user logs in with valid credentials "<username>" "<password>"

      Examples:
        | username            | password            |
        | validadmin_username | validadmin_password |
