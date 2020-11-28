@Registration
Feature: Registration feature with scenario outline

Background: user is on the  new Registration Page

  Given user is on the GMIBank HomePage
  And user clicks on the Account Menu icon
  And user clicks on the Register viewbox

  Scenario Outline: TC_0046_testing the registration page with valid credentials in the GMI bank web page

    And user enters SSN number "<SSN>"
    And user enters firstName "<firstName>"
    And user enters lastName "<lastName>"
    And user enters address "<address>"
    And user enters mobile phone number "<mobilePhoneNumber>"
    And user enters username "<username>"
    And user enters email "<email>"
    Then user verifies there is no red boxes on the registration page

    Examples: test data for the registration page
      | SSN         | firstName | lastName | address                                   | mobilePhoneNumber | username   | email                 |
      | 001-67-9034 | John      | Kelly    | 24 Madisson Ave, Albany NY, 12203         | 138-537-9925      | JohnKelly  | JohnKelly@gmail.com   |
      | 165-02-4556 | john      | kelly    | 153 Lexington Ave Brooklyn NY, 11216      | 518-774-9558      | J.Kelly    | J.Kelly@outlook.com   |
      | 266-67-2156 | John1     | Kelly1   | 1 Farnsworth Dr FL, 62416                 | 888-600-1245      | JK2020     | JK2020@yahoo.com      |
      | 398-55-7669 | john6     | kelly6   | 55 Patterson Dr Delmar NY, 12357          | 714-924-3156      | John_Kelly | John_Kelly@hotmail.com|
      | 409-11-3198 | 9John     | 9Kelly   | 2452 State Route 9N NY, 12845             | 818-488-1261      | 9KellyKJ   | 9KellyKJ@sunyedu.com  |
      | 599-32-1167 | john?     | kelly?   | 145 Beach Street Boston MA,02150          | 518-456-6200      | JJK        | JJK@icloud.com        |
      | 621-78-9002 | John!     | Kelly!   | 710 Corporate Center Dr, Raleigh NC,27607 | 334-997-4607      | !Kelly!    | Kelly1453@gmail.com   |
      | 799-55-2189 | **john6   | **kelly6 | 3398 Piedmont Road,Atlanta GA, 30305      | 917-795-4607      | john       | john@outlook.com      |
      | 877-81-5643 | Joh_n!    | Kelly Jr | 3423Percy Priest Dr, Nashville TN,37214   | 212-226-7773      | johnK      | johnK@yahoo.com       |
      | 948-32-7896 | JJK       | Kelly    | 875 Greentree Road, Pittsburgh PA, 15220  | 617-942-9561      | JK_11      | JK_11@hvccedu.com    |

