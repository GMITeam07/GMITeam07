package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.NewAccountCreationPage;

public class NewAccountCreationFileSteps {

    NewAccountCreationPage newAccountPage = new NewAccountCreationPage();

    LoginPage loginPage = new LoginPage();


    @Given("user clicks on My Operations")
    public void user_clicks_on_My_Operations() {
        newAccountPage.myOperations.click();

    }

    @Given("user selects on Manage Accounts")
    public void user_selects_on_Manage_Accounts() {
        newAccountPage.manageAccounts.click();
    }

    @Given("user clicks on Create a New Account button")
    public void user_clicks_on_Create_a_New_Account_button() {
        newAccountPage.createNewAccount.click();

    }

    @Given("user enters a Description {string}")
    public void user_enters_a_Description(String string) {
        newAccountPage.descriptionBox.sendKeys("Td Account");

    }
    @And("user enters a Balance {string}")
    public void userEntersABalance(String arg0) {

        newAccountPage.balanceBox.sendKeys("$150000");

    }

    @Given("user selects Account Type {string}")
    public void user_selects_Account_Type(String string) {
        Select accountType = new Select(newAccountPage.accountTypeBox);
        accountType.selectByIndex(1);

    }

    @Given("user selects Account Status Type {string}")
    public void user_selects_Account_Status_Type(String string) {
        Select accountStatus = new Select(newAccountPage.accountStatusTypeBox);
        accountStatus.selectByIndex(0);
    }

    @And("user selects Create Date {string}")
    public void userSelectsCreateDate(String arg0) {
        newAccountPage.createDateBox.sendKeys("2020-11-11 12:00 PM");
    }

    @And("user selects a Closed Date {string}")
    public void userSelectsAClosedDate(String arg0) {
        newAccountPage.closedDateBox.sendKeys("2029-12-14 4:00 PM");
    }


    @And("user selects Employee {string}")
    public void userSelectsEmployee(String arg0) {
        Select employee = new Select(newAccountPage.employeeBox);
        employee.selectByIndex(0);

    }

    @Given("user clicks on Save Button")
    public void user_clicks_on_Save_Button() {
        newAccountPage.saveButton.click();
    }

    //Driver.closeDriver();

}
