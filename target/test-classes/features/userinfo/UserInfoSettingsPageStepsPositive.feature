@UserSettings  @PositiveTest
Feature: User tests the user info segment

  #-----------------------------------------------------------------------------
  @usersettings @positivetest
  Scenario Outline:TC_0001_User tests the user info settings page WebElements
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
<<<<<<< HEAD
      | username       | password  |
      | team07user     | S123456s? |
      | team07admin    | S123456s? |
      | team07manager  | S123456s? |
      | team07customer | S123456s? |
      | team07employee | S123456s? |

#-----------------------------------------------------------------------------
  @usersettings @positivetest
  Scenario Outline:TC_0002_User Info settings language drop down language options
  user tests that user settings language drop down options are editable

  #this test is passed completed
    Given user is on the User Setings Page with valid username "<username>" and password "<password>"
    Then user records initial UI user data on User Settings Page "<username>"
    Then user records initial API user data on User Settings Page "<username>"
    Then user records initial DB user data on User Settings Page "<username>"
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
    Then user creates a new customer "<ssn>" "<username>" "<lastnamne>"...
    Then user gets user from api "<ssn>"
    Then user compares created new customer over UI with retrieved api user
    Then user deletes new customer over api



    Examples:

      | username       | password  | firstlanguageselection | secondlanguageselection | successfulsavedmessage |
      | team07user     | S123456s? | Türkçe                 | English                 | Settings saved!        |
      | team07admin    | S123456s? | English                | Türkçe                  | Settings saved!        |
      | team07manager  | S123456s? | English                | Türkçe                  | Settings saved!        |
      | team07customer | S123456s? | Türkçe                 | English                 | Settings saved!        |
      | team07employee | S123456s? | Türkçe                 | English                 | Settings saved!        |

#-----------------------------------------------------------------------------
  @usersettings @positivetest
  Scenario Outline:TC_0003_User Info settings firstname,lastname, email textboxes must be editable

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

      | username       | password  | newfirstname | newlastname | newemail               | newlanguage | successfulsavedmessage |
      | team07user     | S123456s? | Jack         | Sparrow     | jacksparrow@timail.com | English     | Settings saved!        |
      | team07admin    | S123456s? | John         | Smith       | johnsmith09@zmail.zom  | Türkçe      | Settings saved!        |
      | team07manager  | S123456s? | mary         | Blacksmith  | maryhans@zmail.zom     | English     | Settings saved!        |
      | team07customer | S123456s? | Nancy        | Red         | nancyredss@zmail.zom   | Türkçe      | Settings saved!        |
      | team07employee | S123456s? | Erva         | Kit         | ervaska@zmail.zom      | English     | Settings saved!        |

