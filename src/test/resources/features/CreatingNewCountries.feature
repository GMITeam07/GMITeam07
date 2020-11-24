@ReadCountries
  Feature:
    Background:
      Scenario: US_025_TC_002-System should allow to create new countries using api end point
                "https://www.gmibank.com/api/tp-countries" if not created already

     Given User can Just create each country 1 by 1