@ReadCountriesAllInfo
  Feature: system should allow to read all countries info using api end point
    Background: TC_2101 and TC_2102 background
      Given user provides the api end point to set the response using "https://www.gmibank.com/api/tp-countries"
      And manipulate all countries' data

    @TC_2101

      Scenario:TC_2101 read all countries you created and validate them from your data set
      And find out how many countries are and verify that there are 20 countries
      And verify tenth customers' country name is "UNITED STATES"

  # @CountryDataTest
   #   Scenario: validate all countries' data
   #     Given manipulate all countries' data
   #     And user sets the data in correspondent files
   #     Then user validates all data for countries'


 #   @TC_2102
  #  Scenario: TC_2102 read all countries you created and validate them 1 by 1
  #    And verify first customer's country name is "UNITED KINGDOM"
  #    And verify fourth customer's country name is "UNITED STATES"
   #   And verify fourteen customer's country name is "GERMANY"
   #   And verify last customer's country name is "TURKEY"
