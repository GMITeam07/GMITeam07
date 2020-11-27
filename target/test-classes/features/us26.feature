@US_26
Feature: US_26 System should allow to update countries using api end point
  "https://www.gmibank.com/api/tp-countries"

  @TC_2601
  Scenario: TC_2601 User can just update each country 1 by 1
    Given User sends a GET request to api endpoint "https://www.gmibank.com/api/tp-countries/"
    And   User finds out the size of the country list
    Then  User sends a Put request to api endpoint "https://www.gmibank.com/api/tp-countries" as "Van"