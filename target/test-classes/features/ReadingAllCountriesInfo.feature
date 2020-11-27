@US_21
  Feature: system should allow to read all countries info using api end point
    Background: TC_2101 and TC_2102 background
      Given user provides the api end point to set the response using "https://www.gmibank.com/api/tp-countries"


   @TC_2101

      Scenario:TC_2101 read all countries you created and validate them from your data set
      And compare Database and API country numbers
      Then user validates all data for countries'


    @TC_2102
      Scenario Outline: TC_2102 read all countries you created and validate them 1 by 1

          Given user verifies all countries one by one "<countryName>"

      Examples:
        | countryName |
        | Malta8      |
       # | TURKEY         |
       # | GERMANY        |
       # | FRANCE         |
       # | UNITED KINGDOM |
       # | CANADA         |
       # | AGOLA          |











