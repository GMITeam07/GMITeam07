@CreateNewCountries

Feature: System should allow to create new countries using api end point if not created already
  Background: TC_2501
    Given user provides the api end point to set the response using by "https://www.gmibank.com/api/tp-countries"

     @NewCountries
    Scenario Outline: TC_2501 User can Just create each country 1 by 1
       Given user is on the Create Customer Page with valid credentials "validemployee_username" "validemployee_password"
       And user verifies the country "<countryName>" does not exist in database
       And user clicks on My Operations button
       And user clicks on Create a New Customer button
       When user creates a new customer with new country "<ssn>" "<firstname>" "<lastname>" "<middleinitial>" "<email>" "<mobile>" "<zipcode>" "<address>" "<city>" "<country>" "<state>"
       Then user clicks on save button
       Then user verifies the country had been created in database "<countryName>"
       #  Then user deletes the country "<countryName>"

       Examples:
         | countryName | ssn          | firstname | lastname | middleinitial | email          | mobile       | zipcode | address      | city      | country     | state |
         | Egypt       | 234-048-8705 | Hale      | Hug      | HH            | hh@gmail.com   | 789-045-7321 | 1450    | jonny st     | NorthYork | Egypt       | ST    |
         | Afghanistan | 167-387-3402 | Anna      | Cute     | AC            | ac@email.com   | 129-876-1457 | 4567    | St Johns     | AFG       | Afghanistan | AF    |
         | Chile       | 580-123-1430 | Rocky     | Ses      | TS            | ts@hotmail.com | 329-098-1344 | 9087    | Sirsokagi st | chili     | Chile       | CH    |