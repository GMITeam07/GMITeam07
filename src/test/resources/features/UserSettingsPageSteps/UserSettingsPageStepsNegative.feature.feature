@UserSettings @NegativeTest
Feature: User tests the user info segment

  @usersettings @negativeTest @notgood
  Scenario Outline:TC_0008_0004_User tests the user info settings email textbox
  email should create a red message your email is required when empty
#  This is completed
    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user records current displaying UI user data "<username>"
    When user clears the email textbox
    Then user verifies an error message is under email textbox displayed contains "<youremailisrequired>"
    Examples:
      | username   | password  | youremailisrequired    |
      | team07user | S123456s? |your email is required |

  Scenario Outline:TC_0008_0005_User tests the user info settings email textbox
  email should not be empty
# This is completed
    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user records initial UI user data on User Settings Page "<username>"
    Then user retrieves initial Api user data "<username>"
    When user clears the email textbox
    Then user clicks on save button on User Settings Page
    Then user verifies successful saved message "<successfulsavedmessage>" is not displayed
    Then user retrieves current displaying Api User data "<username>"
    Then user verifies current displaying Api user data is same as initial Api user data
    Then user reinitialize the user data by UI

    Examples:
      | username   | password  | successfulsavedmessage |
      | team07user | S123456s? | Settings saved!         |

  Scenario Outline:TC_0008_0006_User tests the user info settings email textbox
  should not accept short less than 5 characters
#This is completed

    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user records initial UI user data on User Settings Page "<username>"
    Then user clears the email textbox
    When user enters a new short email "<invalidshortemail>"
    Then user verifies an error message is under email textbox displayed contains "<shortemailmessage>"
    When user clicks on save button on User Settings Page
    Then user verifies successful saved message "<successfulsavedmessage>" is not displayed
    Then user verifies an error message is under email textbox displayed contains "<shortemailmessage>"


    Examples:
      | username   | password  | invalidshortemail | shortemailmessage     | successfulsavedmessage |
      | team07user | S123456s? | a@sz              |at least 5 characters | Settings saved!        |



  Scenario Outline:TC_0008_0007_User tests the user info settings email textbox
  without extension, @ next to "." or unusual emails should not be accepted

  #passed completed
    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user records initial UI user data on User Settings Page "<username>"
    Then user clears the email textbox
    When user enters a new invalid email "<invalidemail>"
    Then user verifies an error message is under email textbox displayed contains "<thisfieldisinvalid>"
    Then user clicks on save button on User Settings Page
    Then user verifies successful saved message "<successfulsavedmessage>" is not displayed

    Examples:
      | username   | password  | invalidemail|thisfieldisinvalid     |successfulsavedmessage |
      | team07user | S123456s? | sadf@.gom   |This field is invalid |Settings saved!        |


  @usersettings @negativeTest
  Scenario Outline:TC_0008_0008_User tests the user info settings firstname textbox should not be empty
  firstname should not be empty and should give error message when empty
#completed....................
    When user is on the User Setings Page with valid username "<username>" and password "<password>"
    When user clears the firstname textbox
    Then user verifies an error message under firstname textbox is displayed contains "<yourfirstnameisrequired>"
    Then user clicks on save button on User Settings Page
    Then user verifies successful saved message "<successmessage>" is not displayed

    Examples:
      | username   | password  |yourfirstnameisrequired|successmessage|
      | team07user | S123456s? |Your first name is required|Settings saved!|

  @usersettings @negativeTest
  Scenario Outline:TC_0008_009_User tests the user info settings lastname textbox
  lastname should not be empty
#passed

    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    When user clears the lastname textbox
    Then user clicks on save button on User Settings Page
    Then user verifies an error message under lastname textbox is displayed contains "Your lastname is required"
    Then user verifies successful saved message "<successmessage>" is not displayed

    Examples:
      | username   | password  |successmessage|
      | team07user | S123456s? |Settings saved|


