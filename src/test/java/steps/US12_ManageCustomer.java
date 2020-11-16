package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.ManageCustomerPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class US12_ManageCustomer {


    ManageCustomerPage manageCustomerPage = new ManageCustomerPage();


    @Given("go to gmibank.com home page")
    public void go_to_gmibank_com_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("gmibank_url"));
    }



    @Given("user clicks to My Operations drop down menu")
    public void user_clicks_to_my_operations_drop_down_menu() {

        manageCustomerPage.myOperations.click();

    }
    @And("user clicks to Manage Costumers")
    public void userClicksToManageCostumers() {
        manageCustomerPage.manageCostumer.click();


    }
    @Given("user clicks to last page button")
    public void user_clicks_to_last_page_button() {


        manageCustomerPage.lastPageButton.click();

    }
    @Then("a customer should show up at total nine head on account information of the customer")
    public void a_customer_should_show_up_at_total_nine_head_on_account_information_of_the_customer() {
        Assert.assertTrue(manageCustomerPage.headList.get(0).getText().contains("ID"));
        Assert.assertTrue(manageCustomerPage.headList.get(1).getText().contains("First Name"));
        Assert.assertTrue(manageCustomerPage.headList.get(2).getText().contains("Last Name"));
        Assert.assertTrue(manageCustomerPage.headList.get(3).getText().contains("Middle Initial"));
        Assert.assertTrue(manageCustomerPage.headList.get(4).getText().contains("Email"));
        Assert.assertTrue(manageCustomerPage.headList.get(5).getText().contains("Mobile Phone Number"));
        Assert.assertTrue(manageCustomerPage.headList.get(6).getText().contains("Phone Number"));
        Assert.assertTrue(manageCustomerPage.headList.get(7).getText().contains("Address"));
        Assert.assertTrue(manageCustomerPage.headList.get(8).getText().contains("Create Date"));
        Assert.assertTrue(manageCustomerPage.rowList.size()==10);

    }


    @Given("user clicks to View button.")
    public void user_clicks_to_view_button() {

        Driver.getDriver().navigate().refresh();
        manageCustomerPage.buttonWiew.click();

    }

    @Then("user should see an Edit Button.")
    public void user_should_see_an_edit_button() {

        Assert.assertTrue(manageCustomerPage.ButtonViewEdit.isDisplayed());

    }


    @Given("user goes back to manage costumers page")
    public void user_goes_back_to_manage_costumers_page() {

        Driver.getDriver().navigate().back();
        manageCustomerPage.lastPageButton.click();
    }

    @Then("user should see Edit button where all customer")
    public void user_should_see_edit_button_where_all_customer() {

      //  Assert.assertTrue(manageCustomerPage.buttonEdit.isDisplayed());
        Driver.verifyElementDisplayed(manageCustomerPage.buttonEdit);

    }

    @Given("user clicks to Edit button")
    public void user_clicks_to_edit_button() {
        Driver.waitForVisibility(manageCustomerPage.buttonEdit, 2);
        manageCustomerPage.buttonEdit.click();

    }

    @Given("user updates city Textbox {string}")
    public void user_updates_city_textbox(String string) {
        manageCustomerPage.cityUpdate.clear();
        manageCustomerPage.cityUpdate.sendKeys("cityName");

    }
    @Given("user clicks to Save button in the Edit Page")
    public void user_clicks_to_save_button_in_the_edit_page() {

        manageCustomerPage.ButtonEditSave.click();

    }
    @Then("user updates the user info in the Edit portal")
    public void user_updates_the_user_info_in_the_edit_portal() {

        Driver.waitForVisibility(manageCustomerPage.alertUpdate, 2);
        Assert.assertTrue(manageCustomerPage.alertUpdate.isDisplayed());

    }

    @Given("user verifies that a customer is registered with ID number")
    public void user_verifies_that_a_customer_is_registered_with_id_number() {
     //   Assert.assertTrue(manageCustomerPage.userDelete.isDisplayed());
        Driver.verifyElementDisplayed(manageCustomerPage.buttonDelete);
    }

    @Given("user clicks to Delete button")
    public void user_clicks_to_delete_button() {
        Driver.getDriver().navigate().refresh();
        manageCustomerPage.buttonDelete.click();
    }
    @Given("user sees a message if the user is sure about deletion")
    public void user_sees_a_message_if_the_user_is_sure_about_deletion() {

        Driver.waitForVisibility(manageCustomerPage.alertDeleteQuestion, 2);
        Assert.assertTrue(manageCustomerPage.alertDeleteQuestion.isDisplayed());
    }
    @Then("user can delete a customer")
    public void user_can_delete_a_customer() {
        manageCustomerPage.alertDeleteButton.click();
        Driver.waitForVisibility(manageCustomerPage.userDelete,10);
        Assert.assertFalse(manageCustomerPage.userDelete.isDisplayed());
    }


    @Then("user records customers info on the displayed UI page on the Manage Customer Page")
    public void userRecordsCustomersInfoOnTheDisplayedUIPageOnTheManageCustomerPage() {

//        String xpath="//tbody//tr["+row+"]//td["+clmn+"]";
        List<List<String>> list=new ArrayList<>();

        for (int row=1;row<=9;row++){
            List<String> columnList=new ArrayList<>();
            for (int column=1;column<=10;column++){
                String xpath="//tbody//tr["+row+"]//td["+column+"]";
                columnList.add(Driver.getDriver().findElement(By.xpath(xpath)).getText());
            }
            list.add(columnList);
        }
        list.stream().
                map(z->{return z.stream().map(t->t+" , ").collect(Collectors.joining());}).
                forEach(System.out::println);
    }

}


