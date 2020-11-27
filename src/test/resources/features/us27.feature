@US_27
Feature: US_27 System should allow to delete states using api endpoint

  @TC_2701
  Scenario: TC_2701 before DELETE request
    Given User sends a GET request to REST API endpoint "https://www.gmibank.com/api/tp-states/25369"
    Then Before delete request HTTP Status Code should be "200"
    Then Before delete request response format should be "application/json"
    Then Before delete request id should be "25369"
    Then Before delete request name should be "Auvergne"

  @TC_2702
  Scenario: TC_2702 check DELETE request
    Given User sends a DELETE request to REST API endpoint "https://www.gmibank.com/api/tp-states/25369"
    Then After delete request HTTP Status Code should be "204"
    Then After delete request response format should be "application/json"
    Then After delete request response after delete should contain nothing