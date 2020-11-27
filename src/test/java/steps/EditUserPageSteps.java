package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.CreateEditUserPage;
import pojos.User;
import utilities.ApiUtils;
import utilities.Driver;

public class EditUserPageSteps {
    private User initialUIUser=new User();
    private User initialAPIUser=new User();
    private User initialDBUser=new User();

    private User editedUIUser=new User();
    private User editedAPIUser=new User();
    private User editedDBUser=new User();

    CreateEditUserPage createEditUserPage=new CreateEditUserPage();

    @Then("user enters edit page of the user {string}")
    public void user_enters_edit_page_of_the_user(String loginname) {
        
        
    }


    @Then("user records initial UI user data on Create or Edit User Page {string}")
    public void user_records_initial_ui_user_data_on_create_or_edit_user_page(String loginname) {

        initialUIUser.setLogin(createEditUserPage.loginname.getAttribute("value"));
        initialUIUser.setFirstName(createEditUserPage.firstname.getAttribute("value"));
        initialUIUser.setLastName(createEditUserPage.lastname.getAttribute("value"));

    }

    @Then("user retrieves initial user data from the api {string}")
    public void user_retrieves_initial_user_data_from_the_api(String loginname) {
        initialAPIUser= ApiUtils.getUserByLogin(loginname);
        
    }
    @Then("user retrieves initial user data from database {string}")
    public void user_retrieves_initial_user_data_from_database(String loginname) {

        
    }

    @Then("user enters new user data login {string} {string} {string} {string} {string} {int} {string}")
    public void user_enters_new_user_data_login(String loginname, String firstname, String lastname, String email, String isactivate, int language, String profiles) {
            createEditUserPage.loginname.sendKeys(loginname);
            createEditUserPage.firstname.sendKeys(firstname);
            createEditUserPage.lastname.sendKeys(lastname);
            createEditUserPage.email.sendKeys(email);
            Driver.selectCheckBox(createEditUserPage.activated,true);
            Driver.selectByIndex(createEditUserPage.authorities,language);


    }
    @When("user clicks save button on user edit page")
    public void user_clicks_save_button_on_user_edit_page() {
        createEditUserPage.saveSubmitBtn.click();
        
    }
    @Then("user verifies the success message")
    public void user_verifies_the_success_message() {
        Driver.waitForVisibility(createEditUserPage.successMessage,3);
        
    }
    @Then("user records edited UI user data on Create or Edit User Page {string}")
    public void user_records_edited_ui_user_data_on_create_or_edit_user_page(String string) {
        editedUIUser.setLogin(createEditUserPage.loginname.getAttribute("value"));
        editedUIUser.setFirstName(createEditUserPage.firstname.getAttribute("value"));
        editedUIUser.setLastName(createEditUserPage.lastname.getAttribute("value"));


    }
    @Then("user retrieves edited user data from the api {string}")
    public void user_retrieves_edited_user_data_from_the_api(String newloginname) {
        editedAPIUser=ApiUtils.getUserByLogin(newloginname);
        
    }
    @Then("user retrieves edited user data from database {string}")
    public void user_retrieves_edited_user_data_from_database(String string) {
        
        
    }

    @Then("user verifies edited UI user data is same as {string} {string} {string} {string} {string} {string} {string}")
    public void user_verifies_edited_ui_user_data_is_same_as(String newlogin, String newfirstname,
                                                             String newlastname, String newemail,
                                                             String newisactivated,String language, String newprofiles) {


    }
    @Then("user verifies edited Api user data is same as {string} {string} {string} {string} {string} {string} {string}")
    public void user_verifies_edited_api_user_data_is_same_as(String newlogin, String newfirstname,
                                                              String newlastname, String newemail,
                                                              String newisactivated,String language, String newprofiles) {
        Assert.assertTrue(editedAPIUser.getLogin()==newlogin);
        Assert.assertTrue(editedAPIUser.getFirstName()==newfirstname);
        Assert.assertTrue(editedAPIUser.getLastName()==newlastname);


    }
    @Then("user verifies edited DB user data is same as {string} {string} {string} {string} {string} {string} {string}")
    public void user_verifies_edited_db_user_data_is_same_as(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        
        createEditUserPage.loginname.clear();
        createEditUserPage.loginname.sendKeys(initialUIUser.getLogin());
    }

    @Then("user verifies over API that user data changed with new datas {string} {string} {string} {string} {string} {string} {string}")
    public void userVerifiesOverAPIThatUserDataChangedWithNewDatas(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        
    }

    @Then("user verifies the API UI user data is same {string}")
    public void userVerifiesTheAPIUIUserDataIsSame(String arg0) {

    }

    @Then("user deletes the new user {string} from the database")
    public void userDeletesTheNewUserFromTheDatabase(String username) {

    }
}
