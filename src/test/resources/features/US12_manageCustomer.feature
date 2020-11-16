@US12
Feature: An Employee can manage Customer
  Background:
    Given user is logs in with valid credentials "validemployee_username" "validemployee_password"
    And user clicks to My Operations drop down menu
    And user clicks to Manage Costumers

  @US12TC01
  Scenario:All customers should show up on manage customers module populating the account information of the customer
    And user clicks to last page button
    Then a customer should show up at total nine head on account information of the customer
    Then user records customers info on the displayed UI page on the Manage Customer Page



  @US12TC02
  Scenario:There should be a View option where customers can be navigated to all customer info and see edit button there
    And user clicks to View button.
    Then user should see an Edit Button.

  @US12TC03
  Scenario:user should see Edit button where all customers information can be populated
    And user goes back to manage costumers page
    Then user should see Edit button where all customer

  @US12TC04
  Scenario:There should be Edit button where all customers on the Edit portal can allow user to create or update the user info
    And user clicks to Edit button
    And user updates city Textbox "cityName"
    And user clicks to Save button in the Edit Page
    Then user updates the user info in the Edit portal

  @US12TC05
  Scenario:User can delete a customer, but seeing a message if the user is sure about deletion
    And user verifies that a customer is registered with ID number
    And user clicks to Delete button
    And user sees a message if the user is sure about deletion
    Then user can delete a customer
