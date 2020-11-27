package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CustomersUIPage;
import utilities.Driver;

import java.util.List;

public class CustomersUIStep {
    CustomersUIPage customersUIPage = new CustomersUIPage();

    @When("User clicks my operations drop down")
    public void userClicksMyOperationsDropDown() {
        customersUIPage.myOperationsDrpDwn.click();
    }

    @And("User clicks manage accounts")
    public void userClicksManageAccounts() {
        customersUIPage.manageAccounts.click();
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
    @And("User clicks My Accounts  and View Transaction")
    public void userClicksMyAccountsAndViewTransaction() {
        customersUIPage.myAccountsButton.click();
        customersUIPage.viewTransactionButton.click();
    }


    @Then("user should view transactions")
    public void userShouldViewTransactions() {
        List<WebElement> allTransactions = Driver.getDriver().findElements(By.xpath("(//tbody)[2]/tr"));

        String balanceAfterTransaction = "1350";
        for (WebElement transaction : allTransactions) {
            System.out.println(transaction.getText());

        }
        Assert.assertTrue("new balance after transfer not found ",allTransactions.get(0).getText().contains(balanceAfterTransaction));
    }
}
