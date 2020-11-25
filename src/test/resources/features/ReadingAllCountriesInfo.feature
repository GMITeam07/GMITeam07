@ReadCountriesAllInfo
  Feature: system should allow to read all countries info using api end point
    Background: TC_2101 and TC_2102 background
      Given user provides the api end point to set the response using "https://www.gmibank.com/api/tp-countries"
      And manipulate all countries' data

    @CountryDataTestTC_2101

      Scenario:TC_2101 read all countries you created and validate them from your data set
      And find out how many countries are and verify that there are 97 countries
      And verify sixth customers' country name is "TURKEY"
      Then user validates all data for countries'


    @TC_2102
      Scenario Outline: TC_2102 read all countries you created and validate them 1 by 1
      And user verifies first customer's country name is "UNITED STATES"
      And user verifies fourth customer's country name is "GERMANY"
      And user verifies fourteenth customer's country name is "Yunanistan"
      Then user verifies all countries 1 by 1 "<countryName>"

      Examples:
        | countryName    |
        | UNITED STATES  |
        | TURKEY         |
        | GERMANY        |
        | FRANCE         |
        | UNITED KINGDOM |
        | CANADA         |
        | AGOLA          |
        | Malta          |










