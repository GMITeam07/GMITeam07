
@Registration_SSN
Feature: User tests the registration page

  Background: user is on the  new Registration Page

    Given user is on the GMIBank HomePage
    And user clicks on the Account Menu icon
    And user clicks on the Register viewbox

  Scenario Outline: TC_0047_testing the registration page with SSN numbers in the GMI bank web page

    And user enters special SSN number "<SSN>"
    Then user verifies there is no red boxes on the SSN checkbox in the Registration page

    Examples: test data for the SSN checkbox
      |SSN            |
      | 000-32-7896   |
      | 437-00-2891   |
      | 156-45-0000   |
      | 666-16-9923   |
      | 900-88-2299   |
      | 999-38-2190   |
      |               |


  @Registration_Firstname

  Scenario: TC_0048_user should provide valid name that contains chars and cannot be blank

    And user enter no Firstname ""
    Then user verifies there is no red boxes on the firstname checkbox in the Registration page


   @Registration_LastName
   Scenario: TC_0049_user should provide valid name that contains chars and cannot be blank

   And user enter no Lastname ""
   Then user verifies there is no red boxes on the lastname checkbox in the Registration page


  @Registration_MobilePhoneNumber

  Scenario: TC_0050_user should provide ten digit-long mobile phone number as a required field respecting the "-"

    And user enter ten digits phone number "000-000-0000"
    Then user verifies there is no red boxes on the Mobile Phone Number checkbox in the Registration page


  @Registration_Email

  Scenario Outline: TC_0051_User should provide a valid email format that contains "@", ".com" extensions

    And user enters email "<email>"
    Then user verifies there is no red boxes on the Email checkbox in the Registration page

    Examples: test data for the email checkbox
      |email               |
      | 0kellyjgmail.com   |
      | j_kelly_1894@yahoo |
      | jkj_hotmail.com    |


  @Registration_Username

    Scenario Outline: TC_0052_user can not use just digits for provide the username

      And user enters username "<username>"
      Then user verifies there is no red boxes on the Email checkbox in the Registration page

      Examples: test data for the username checkbox

      |username|
      |2346600 |
      |  000   |
      | 6666   |

