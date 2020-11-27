package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.MoneyTransferPage;
import utilities.Driver;

public class MoneyTransfer_StepDefinitions {

    MoneyTransferPage moneyTransferPage = new MoneyTransferPage();

    //Testing transfer money without red alerts

    @When("user clicks on the My Operations viewbox")
    public void user_clicks_on_the_my_operations_viewbox() { moneyTransferPage.myOperations.click();

    }

    @When("user clicks on the Transfer Money viewbox")
    public void user_clicks_on_the_transfer_money_viewbox() {
//        moneyTransferPage.myOperations.click();
//        moneyTransferPage.transferMoney.click();

       Driver.clickWithJS(moneyTransferPage.transferMoney);

    }
    @When("user selects the first account as From dropdown")
    public void user_selects_the_first_account_as_from_dropdown() throws InterruptedException {
        moneyTransferPage.fromDropdown.click();
        System.out.println(Driver.getSelectDropDownOptions(moneyTransferPage.fromDropdown));
        Driver.selectByIndex(moneyTransferPage.fromDropdown,0);
        Driver.selectRandomTextFromDropdown(moneyTransferPage.fromDropdown);

    }
    @When("user selects the second account as To dropdown")
    public void user_selects_the_second_account_as_to_dropdown() {
        moneyTransferPage.toDropdown.click();
        System.out.println(Driver.getSelectDropDownOptions(moneyTransferPage.toDropdown));
        Driver.selectByIndex(moneyTransferPage.toDropdown,0);
        Driver.selectRandomTextFromDropdown(moneyTransferPage.toDropdown);

    }

    @When("user writes a balance that they want to proceed with")
    public void user_writes_a_balance_that_they_want_to_proceed_with() { moneyTransferPage.balance.sendKeys("30");

    }
    @When("user writes a description for money transfer")
    public void user_writes_a_description_for_money_transfer() { moneyTransferPage.description.sendKeys("deposit");

    }
    @Then("user clicks on the Make Transfer button")
    public void user_clicks_on_the_Make_Transfer_button(String string) { moneyTransferPage.makeTransferButton.click();

    }

    @Then("user checks success validating message")
    public void user_checks_success_validating_message() { moneyTransferPage.successMessage.isDisplayed();

    }

    //testing transfer money with red alerts


    @When("user leaves empty the balance checkbox")
    public void user_leaves_empty_the_balance_checkbox() { moneyTransferPage.balance.sendKeys("");

    }

    @When("user leaves empty the description checkbox")
    public void user_leaves_empty_the_description_checkbox() { moneyTransferPage.description.sendKeys("");

    }
    @Then("user should see red alerts under the balance and description checkboxes")
    public void user_should_see_red_alerts_under_the_balance_and_description_checkboxes() {

        org.testng.Assert.assertTrue(Driver.waitForVisibility(moneyTransferPage.balanceError,2).
                getText().
                toLowerCase().
                contains("This field is required."));


        org.testng.Assert.assertTrue(Driver.waitForVisibility(moneyTransferPage.descriptionError,2).
                getText().
                toLowerCase().
                contains("This field is required."));

    }




}
