@allApplicants
Feature: Test all applicants' data
  Background: Api end point is being set in response
    Given user provides the api endpoint to set the response using "applicants_api_url"

  @applicantsDataTest
  Scenario: validate all applicants' data
    Given manipulate all applicants' data
    Then user validates all applicants data

  @applicantsDataTest1By1
  Scenario: validate all applicants' data
    Given manipulate all applicants' data
    Then user validates all applicants data one by one