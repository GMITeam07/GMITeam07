@SSN_Search
Feature: SSN UI Test
  Background: User on customer new page
    Given user logs in with valid credentials "validuser_username" "validadmin_password"
    Then user click my operations dropdown menu
    Then user click on manage customers icon
    Then click on create a new customer button

  Scenario Outline: User can search for a new applicant by their SSN and see all their registration info populated
    And user write the ssn "<ssn>"
    Then click on search button
    Then user verifies registration info populated

    Examples:
      | ssn         |
      | 222-22-2222 |


  Scenario: User leaves SSN part blank and user should see the error message
    And user clears the ssn text box on User Edit or Create Customer Page
    Then click on search
    Then user should see the error message
