@ReadCountries
  Feature:
    Background:
      Scenario: US_025_TC_002-System should allow to create new countries using api end point
                "https://www.gmibank.com/api/tp-countries" if not created already

     Given User can Just create each country 1 by 1

       # And user verifies the user "<username>" does not exists in the database
       # When user creates a new user "<ssn>" "<firstname>" "<lastname>" "<address>" "<mobile>" "<username>" "<email>" "<password>"
       # Then user verifies the user had been created in the database
       # Then user deletes the user "<username>"
  #ramazan abinin yukardaki commandliler