package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomersAksuPage;

public class CustomerAksuStep {
    CustomersAksuPage customersAksuPage = new CustomersAksuPage();

    @When("User clicks my operations drop down")
    public void userClicksMyOperationsDropDown() {
        customersAksuPage.myOperationsDrpDwn.click();
    }

    @And("User clicks manage accounts")
    public void userClicksManageAccounts() {
        customersAksuPage.manageAccounts.click();
    }

    @Then("User should see all account types and balance populated")
    public void userShouldSeeAllAccountTypesAndBalancePopulated() {




    }

    @And("User clicks view button")
    public void userClicksViewButton() {
        customersAksuPage.viewButton.click();
    }

    @Then("user should view transactions")
    public void userShouldViewTransactions() {
    }
}
