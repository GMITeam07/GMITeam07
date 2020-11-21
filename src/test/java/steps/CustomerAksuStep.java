package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CustomersAksuPage;
import utilities.Driver;

import java.util.List;

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

        List<WebElement> accountTypes = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[4]"));
        List<WebElement> balances = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[3]"));

        for (int i = 0; i < accountTypes.size(); i++){
            System.out.print("Account Type : " + accountTypes.get(i).getText());
            System.out.println("   =====>   Balance : " + balances.get(i).getText());

        }

       }

    @And("User clicks view button")
    public void userClicksViewButton() {
        customersAksuPage.viewButton.click();
    }

    @Then("user should view transactions")
    public void userShouldViewTransactions() {


    }
}
