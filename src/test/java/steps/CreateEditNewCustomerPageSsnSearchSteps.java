package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ManageCustomersPage;
import pages.SSN_SearchPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class CreateEditNewCustomerPageSsnSearchSteps {

    HomePage home = new HomePage();
    ManageCustomersPage manageCustomersPage = new ManageCustomersPage();
    SSN_SearchPage ssnSearchPage = new SSN_SearchPage();

    @Then("user click my operations dropdown menu")
    public void user_click_my_operations_dropdown_menu() throws InterruptedException {
        home.myOperations.click();
    }

    @Then("user click on manage customers icon")
    public void user_click_on_manage_customers_icon() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        home.manageCustomers.click();
        Thread.sleep(2000);
    }
    @Then("click on create a new customer button")
    public void click_on_create_a_new_customer_button() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        manageCustomersPage.CreateANewCustomer.click();
    }
    @Then("user write the ssn {string}")
    public void user_write_the_ssn(String string) throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ssnSearchPage.SSN_SearchBox.sendKeys(string);
    }
    @Then("click on search button")
    public void click_on_search_button() throws InterruptedException {
        ssnSearchPage.searchButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(ssnSearchPage.customerFirstName.getText());

    }
    @Then("user verifies registration info populated")
    public void user_verifies_registration_info_populated() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        SoftAssert soft = new SoftAssert();
//        soft.assertEquals(ssnSearchPage.customerFirstName.getAttribute("value"), "John");
//        soft.assertEquals(ssnSearchPage.customerLastName.getAttribute("value"), "Stone");
//        soft.assertEquals(ssnSearchPage.customerEmail.getAttribute("value"), "21asd@sda.com");
//        soft.assertEquals(ssnSearchPage.customerAddress.getAttribute("value"), "1234 Street No 8 City State 70000");
//        soft.assertAll();
        Assert.assertTrue(ssnSearchPage.customerFirstName.
                getAttribute("value").equalsIgnoreCase( "John"));
    }

//    @Then("user does not write the ssn")
//    public void user_does_not_write_the_ssn() {
//
//    }

    @Then("click on search")
    public void click_on_search() {
       ssnSearchPage.searchButton.click();
    }
    @Then("user should see the error message")
    public void user_should_see_the_error_message() {
        Assert.assertTrue(Driver.waitForVisibility(ssnSearchPage.ssnErrorMessage,3).isDisplayed());

    }


    @And("user clears the ssn text box on User Edit or Create Customer Page")
    public void userClearsTheSsnTextBoxOnUserEditOrCreateCustomerPage() {

        ssnSearchPage.SSN_SearchBox.clear();
//        ssnSearchPage.SSN_SearchBox.sendKeys("");

    }
}
