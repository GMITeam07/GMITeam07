@allCustomerData
  Feature: Test all customers' data
    Background: Api end point is being set in response
      Given user provides the api end point to set the response using "customer_api_url"

      @customerDataTest
      Scenario: Validate all customers' data
        Given manipulate all customers' data
        And user sets the data in correspondent files
        Then user validates all data