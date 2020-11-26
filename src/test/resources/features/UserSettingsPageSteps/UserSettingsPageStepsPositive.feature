@UserSettings  @PositiveTest
Feature: User tests the user info segment

  Scenario Outline:TC_0008_0001_User tests the user info settings page WebElements
  user verifies the firstname, lastname, email and language options must be available
#this test is passed completed
    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user verifies firstname textbox is available
    Then user verifies lastname textbox is available
    Then user verifies email textbox is available
    Then user verifies language drop down menu has "English" and "Türkçe" options
    Then user logs out

    @usersettings
    Examples:
      | username    | password  |
      | team07admin | S123456s? |
#      | validadmin_username    |
#      | validuser_username     |
#      | validuser_username     |
#      | validmanager_username  |
#      | validmanager_username  |
#      | validemployee_username |
#      | validemployee_username |
#      | validcustomer_username |
#      | validcustomer_username |
#      | validjoker_username    |
#      | validjoker_username    |


  Scenario Outline:TC_0008_0002_User Info settings language drop down language options
  user tests that user settings language drop down options are editable

  #this test is passed completed
    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user records initial UI user data on User Settings Page "<username>"
    Then user selects the "<firstlanguageselection>" on language drop down
    Then user clicks on save button on User Settings Page
    Then user verifies successful saved message "<successfullsavedmessage>" is displayed
    And user logs out
    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user verifies firstselected language dropdown option is "<firstlanguageselection>"
    Then user selects the "<secondlanguageselection>" on language drop down
    Then user clicks on save button on User Settings Page
    Then user verifies successful saved message "<successfullsavedmessage>" is displayed
    Then user logs out
    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user verifies firstselected language dropdown option is "<secondlanguageselection>"
    Then user selects the initial language on language drop down
    Then user clicks on save button on User Settings Page
    Then user verifies successful saved message "<successfullsavedmessage>" is displayed
    Then user logs out


    Examples:
      | username    | password  | firstlanguageselection | secondlanguageselection | successfullsavedmessage |
      | team07admin | S123456s? | English                | Türkçe                  | Settings saved!         |
#      | validadmin_username    | validadmin_password    | Türkçe                 | English                 | Settings saved!         |
#      | validuser_username     | validuser_password     | English                | Türkçe                  | Settings saved!         |
#      | validuser_username     | validuser_password     | Türkçe                 | English                 | Settings saved!         |
#      | validmanager_username  | validmanager_password  | English                | Türkçe                  | Settings saved!         |
#      | validmanager_username  | validmanager_password  | English                | Türkçe                  | Settings saved!         |
#      | validemployee_username | validemployee_password | Türkçe                 | English                 | Settings saved!         |
#      | validemployee_username | validemployee_password | English                | Türkçe                  | Settings saved!         |
#      | validcustomer_username | validcustomer_password | Türkçe                 | English                 | Settings saved!         |
#      | validcustomer_username | validcustomer_password | English                | Türkçe                  | Settings saved!         |
#      | validjoker_username    | validjoker_password    | English                | Türkçe                  | Settings saved!         |
#      | validjoker_username    | validjoker_password    | Türkçe                 | English                 | Settings saved!         |


  Scenario Outline:TC_0008_0003_User Info settings firstname,lastname, email textboxes must be editable
  User Info settings firstname,lastname, email textboxes must be editable and verifies on UI and Api
  #   this test is passed completed
  #   This feature completed with datas

    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user records initial UI user data on User Settings Page "<username>"
    When user retrieves initial Api user data "<username>"
    When user enters new user data "<newfirstname>" "<newlastname>" "<newemail>" "<newlanguage>"
    Then user clicks on save button on User Settings Page
    Then user verifies successful saved message "<successfulsavedmessage>" is displayed
    Then user logs out
    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user records current displaying UI user data "<username>"
    Then user retrieves current displaying Api User data "<username>"
    Then user verifies current displaying UI user data is same as new UI user data tobe registered
    Then user verifies current displaying Api user data is same as initial Api user data
    Then user verifies current displaying Api user data is same as current displaying UI data
    Then user reinitialize the user data by UI
    Then user clicks on save button on User Settings Page
    Then user verifies successful saved message "<successfulsavedmessage>" is displayed
    Then user logs out

    Examples:
      | username    | password  | newfirstname | newlastname | newemail                   | newlanguage | successfulsavedmessage |
      | team07admin | S123456s? | Jackson      | Smith       | jacksonsmith0102@zmail.com | English     | Settings saved!        |
#      | validadmin_username    | validadmin_password    | Jackson      | White       | jacksonwhite0102@zmail    | Türkçe      | Settings saved!        |
#      | validuser_username     | validuser_password     | Marlton      | Eastwood    | marltoneastwood0102@zmail | English     | Settings saved!        |
#      | validuser_username     | validuser_password     | Johanson     | Claus       | johansonclaus0102@zmail   | Türkçe      | Settings saved!        |
#      | validmanager_username  | validmanager_password  | George       | Smith       | georgesmith0102@zmail     | English     | Settings saved!        |
#      | validmanager_username  | validmanager_password  | nancy        | Ebeling     | nancyebeling0102@zmail    | Türkçe      | Settings saved!        |
#      | validemployee_username | validemployee_password | Mary         | Hans        | MaryHans0102@zmail        | English     | Settings saved!        |
#      | validemployee_username | validemployee_password | Howard       | Carp        | howardcorp0102@zmail      | Türkçe      | Settings saved!        |
#      | validcustomer_username | validcustomer_password | Traver       | Nicholson   | travernicholson0102@zmail | English     | Settings saved!        |
#      | validcustomer_username | validcustomer_password | Brian        | Smith       | briansmith@zmail          | Türkçe      | Settings saved!        |
#      | validjoker_username    | validjoker_password    | Jose         | Smith       | josesmith0102@zmail       | English     | Settings saved!        |
#      | validjoker_username    | validjoker_password    | Chris        | Black       | chrisblack0102@zmail      | Türkçe      | Settings saved!        |

  Scenario Outline: sample for excel data

    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user enters the excel path "src\test\resources\excelfiles\UserSettingsPageTestData.xlsx" sheet name "sheet1"
    Then user clears the firstname textbox
    Then user enters a valid row <rowno> firstname "<firstname>" lastname "<lastname>"
    Then user logs out


    Examples:
      | username   | password  | rowno | firstname | lastname |
      | team07user | S123456s? | 0     | firstname | lastname |
      | team07user | S123456s? | 1     | firstname | lastname |
      | team07user | S123456s? | 2     | firstname | lastname |