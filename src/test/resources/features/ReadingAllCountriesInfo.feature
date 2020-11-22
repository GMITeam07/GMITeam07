@ReadCountriesAllInfo
  Feature: Validate all Countries' info


 @ApiCountries
      Scenario: US_021_TC_001-System should allow to read all countries info using api end point
                "https://www.gmibank.com/api/tp-countries"

      Given Read all countries you created and validate them from your data set
      Then Read all countries you created and validate them 1 by 1