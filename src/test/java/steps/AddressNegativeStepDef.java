package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.ManageCustomersPage;
import pages.SSN_SearchPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class AddressNegativeStepDef {

    SSN_SearchPage ssnSearchPage = new SSN_SearchPage();
    HomePage home = new HomePage();
    ManageCustomersPage customersPage = new ManageCustomersPage();

    @Then("user leaves the address part blank")
    public void user_leaves_the_address_part_blank() {
        ssnSearchPage.customerAddress.sendKeys("" + Keys.ENTER);

    }

    @Then("user should see an error message under address")
    public void user_should_see_an_error_message_under_address() {
        Assert.assertTrue(ssnSearchPage.errorMessage.isDisplayed());
    }

    @Then("user leaves the city part blank")
    public void user_leaves_the_city_part_blank() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        home.manageCustomers.click();
        customersPage.CreateANewCustomer.click();
        ssnSearchPage.customerCity.sendKeys("" + Keys.ENTER);
    }

    @Then("user should see an error message under city")
    public void user_should_see_an_error_message_under_city() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(ssnSearchPage.errorMessage.isDisplayed());
    }

    @Then("user leaves the state part blank")
    public void user_leaves_the_state_part_blank() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ssnSearchPage.customerState.sendKeys("" + Keys.ENTER);
    }

    @Then("user should see an error message under state")
    public void user_should_see_an_error_message_under_state() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(ssnSearchPage.errorMessage.isDisplayed());
    }

    @Then("user does not choose any country from the dropdown menu")
    public void user_does_not_choose_any_country_from_the_dropdown_menu() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ssnSearchPage.customerCountry.sendKeys("" + Keys.ENTER);
    }

    @Then("user should see an error message under country")
    public void user_should_see_an_error_message_under_country() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(ssnSearchPage.errorMessage.isDisplayed());
    }

}
