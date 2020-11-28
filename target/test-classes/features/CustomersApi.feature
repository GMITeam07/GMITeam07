@allCustomerData
  Feature: Test all customers' data
    Background: Api end point is being set in response
      Given user provides the api end point to set the response using "customer_api_url" ApiUrl

      @customerDataTest
      Scenario: validate all customers' data
        Given manipulate all customers' data
        Then user validates all data

      @customerDataTest1By1
    Scenario: validate all customers' data
        Given manipulate all customers' data
      Then user validates all data one by one