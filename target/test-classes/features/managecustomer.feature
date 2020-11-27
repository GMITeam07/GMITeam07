@managecustomer
Feature: US_18 tests

  Background: user anters gmibank homepage then reaches create new costomers link
    Given user logs in with valid credentials "validemployee_username" "validemployee_password"
    And user clicks to My Operations drop down menu
    And user clicks to Manage Costumers

  @TC_01
  Scenario: tc1801 user should show the account information of the customer First Name
    Given     ADMIN can select First Name, Last Name, Middle Initial, Email, Mobile Phone Nummer, Phone Nummer, Address,Date updated
    Then      user logs out

  @TC_02
  Scenario: tc1802 There should be a View option where customer can be navigated to all customer info and see  edit button there
    Given     ADMIN should show Edit Button and verify valid
    Then      user logs out

  @TC_03
  Scenario:  There should be an Edit button where all customer information
  can be populated
    Given     ADMIN should write and new the Email address
    And       ADMIN click Save Button
    Then      ADMIN verifies translation not found[gmiBankBackendApp.tPCustomer.updated
    Then      user logs out


  @TC_04
  Scenario:  The Edit portal can allow user to create or update the user info
    Given     ADMIN  should write and new the Phone Nummer
    And       ADMIN click Save Button
    Then      ADMIN  verifies translations not found[gmiBankBackendApp.tPCustomer.updated
    Then      user logs out


  @TC_05
  Scenario:   User can delete a customer, but seeing a message if the user is
  sure about deletion
    Given     ADMIN should write and new the Address
    Then      user logs out











