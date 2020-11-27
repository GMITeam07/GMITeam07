@US_25
Feature: US_25_ System should allow to create new countries using api end point
  @TC_2501
 Scenario Outline:  TC_2501 User can just create each country 1 by 1
    Given user verifies the country does not exists in database "<name>"
    When User send a POST request to create a country "<name>"
    And After creation HTTP Status Code should be "200"
    Then After creation user verifies the created country "<name>"

Examples:
  | name     |
  | Tanzania11 |
  #| Kambocya |
  #| Tanzania8 |
  #| Tanzania9 |
  #| Tanzania10 |