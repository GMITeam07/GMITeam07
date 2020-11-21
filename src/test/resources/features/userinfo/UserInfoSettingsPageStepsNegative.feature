@UserSettings @NegativeTest
Feature: User tests the user info segment

#-----------------------------------------------------------------------------
  @usersettings @negativeTest @ramazan
  Scenario Outline:TC_0004_User tests the user info settings email textbox
  email should create a red message your email is required when empty

    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user records current displaying UI user data "<username>"
    When user clears the email textbox
    Then user clicks on email text box on User Settings Page
    Then user verifies an error message is under email textbox displayed contains "<youremailisrequired>"
    Examples:

      | username       | password  | youremailisrequired    |
      | team07user     | S123456s? | Your email is required |
#      | team07admin    | S123456s? | Your email is required |
#      | team07manager  | S123456s? | Your email is required |
#      | team07customer | S123456s? | Your email is required |
#      | team07employee | S123456s? | Your email is required |

    #-----------------------------------------------------------------------------
  @usersettings @negativeTest
  Scenario Outline:TC_0005_User tests the user info settings email textbox
  email should not be empty

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

      | username       | password  | successfulsavedmessage |
      | team07user     | S123456s? | Settings saved!        |
      | team07admin    | S123456s? | Settings saved!        |
      | team07manager  | S123456s? | Settings saved!        |
      | team07customer | S123456s? | Settings saved!        |
      | team07employee | S123456s? | Settings saved!        |

#-----------------------------------------------------------------------------
  @usersettings @negativeTest
  Scenario Outline:TC_0006_User tests the user info settings email textbox
  should not accept short less than 5 characters

    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user records initial UI user data on User Settings Page "<username>"
    Then user clears the email textbox
    When user enters a new short email "<invalidshortemail>"
    Then user verifies an error message is under email textbox displayed contains "<shortemailmessage>"
    When user clicks on save button on User Settings Page
    Then user verifies successful saved message "<successfulsavedmessage>" is not displayed
    Then user verifies an error message is under email textbox displayed contains "<shortemailmessage>"


    Examples:

      | username       | password  | invalidshortemail | shortemailmessage     | successfulsavedmessage |
      | team07user     | S123456s? | a@sz              | at least 5 characters | Settings saved!        |
      | team07admin    | S123456s? | @t.c              | at least 5 characters | Settings saved!        |
      | team07manager  | S123456s? | t.cd              | at least 5 characters | Settings saved!        |
      | team07customer | S123456s? | bgdf              | at least 5 characters | Settings saved!        |
      | team07employee | S123456s? | 1234              | at least 5 characters | Settings saved!        |
      | team07user     | S123456s? | a1b2              | at least 5 characters | Settings saved!        |


#-----------------------------------------------------------------------------
  @usersettings @negativeTest
  Scenario Outline:TC_0007_User tests the user info settings email textbox
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

      | username       | password  | invalidemail | thisfieldisinvalid    | successfulsavedmessage |
      | team07user     | S123456s? | sadf@.com    | This field is invalid | Settings saved!        |
      | team07admin    | S123456s? | bsr@gzom     | This field is invalid | Settings saved!        |
      | team07manager  | S123456s? | b@morz.      | This field is invalid | Settings saved!        |
      | team07customer | S123456s? | @dom.com     | This field is invalid | Settings saved!        |
      | team07employee | S123456s? | maritt.com   | This field is invalid | Settings saved!        |
      | team07user     | S123456s? | maritt.com@  | This field is invalid | Settings saved!        |


    #-----------------------------------------------------------------------------
  @usersettings @negativeTest
  Scenario Outline:TC_0008_User tests the user info settings firstname textbox should not be empty
  firstname should not be empty and should give error message when empty
  #completed....................
    When user is on the User Setings Page with valid username "<username>" and password "<password>"
    When user clears the firstname textbox
    Then user clicks on firstname textbox
    Then user clicks on save button on User Settings Page
    Then user verifies an error message under firstname textbox is displayed contains "<yourfirstnameisrequired>"
    Then user verifies successful saved message "<successmessage>" is not displayed

    Examples:
      | username       | password  | yourfirstnameisrequired     | successmessage  |
      | team07user     | S123456s? | Your first name is required | Settings saved! |
      | team07admin    | S123456s? | Your first name is required | Settings saved! |
      | team07manager  | S123456s? | Your first name is required | Settings saved! |
      | team07customer | S123456s? | Your first name is required | Settings saved! |
      | team07employee | S123456s? | Your first name is required | Settings saved! |


    #-----------------------------------------------------------------------------
  @usersettings @negativeTest
  Scenario Outline:TC_0009_User tests the user info settings lastname textbox
  lastname should not be empty
  #passed

    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    When user clears the lastname textbox
    Then user clicks on save button on User Settings Page
    Then user verifies an error message under lastname textbox is displayed contains "Your lastname is required"
    Then user verifies successful saved message "<successmessage>" is not displayed

    Examples:

      | username       | password  | successmessage  |
      | team07user     | S123456s? | Settings saved! |
      | team07admin    | S123456s? | Settings saved! |
      | team07manager  | S123456s? | Settings saved! |
      | team07customer | S123456s? | Settings saved! |
      | team07employee | S123456s? | Settings saved! |

    #-----------------------------------------------------------------------------
  @usersettings @negativeTest
  Scenario Outline: TC_0010_sample for excel data

    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user enters the excel path "src/test/resources/excelfiles/UserSettingsPageTestData.xlsx" sheet name "sheet1"
    Then user clears the firstname textbox
    Then user enters a valid row <rowno> firstname "<firstname>" lastname "<lastname>"
    Then user logs out

    Examples:
      | username   | password  | rowno | firstname | lastname |
      | team07user | S123456s? | 0     | firstname | lastname |
      | team07user | S123456s? | 1     | firstname | lastname |
      | team07user | S123456s? | 2     | firstname | lastname |
