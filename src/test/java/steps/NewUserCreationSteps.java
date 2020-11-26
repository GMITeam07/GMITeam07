package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.DBUtilsNew;
import utilities.Driver;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class NewUserCreationSteps {
    RegistrationPage registrationPage=new RegistrationPage();


    @And("user verifies the user {string} does not exists in the database")
    public void userVerifiesTheUserDoesNotExistsInTheDatabase(String username) throws SQLException {
        String query="SELECT * FROM public.jhi_user WHERE login='"+username+"';";
        List queryResult=DBUtilsNew.getQueryAsAListOfMaps(query);
        Assert.assertTrue(queryResult.size()==0);

    }

    @When("user creates a new user {string} {string} {string} {string} {string} {string} {string} {string}")
    public void userCreatesANewUser(String ssn, String firstname, String lastname,
                                    String address, String mobile, String username,
                                    String email, String password) throws InterruptedException {

        Thread.sleep(5000);
        registrationPage.ssntextBox.click();
        registrationPage.ssntextBox.sendKeys(ssn);
        registrationPage.firstnametextBox.sendKeys(firstname);
        registrationPage.lastnamentextBox.sendKeys(lastname);
        registrationPage.addresstextBox.sendKeys(address);
        registrationPage.mobiletextBox.sendKeys(mobile);
        registrationPage.usernametextBox.sendKeys(username);
        registrationPage.emailtextBox.sendKeys(email);
        registrationPage.passwordtextBox.sendKeys(password);
        registrationPage.passwordConfirmation.sendKeys(password);
//        registrationPage.registerBtn.click();


    }

    @Then("user verifies the user had been created in the database {string}")
    public void userVerifiesTheUserHadBeenCreatedInTheDatabase(String username) throws SQLException {

        String query="SELECT * FROM public.jhi_user WHERE login='"+username+"';";

        List<Map<String,String>> queryResult=DBUtilsNew.getQueryAsAListOfMaps(query);

        queryResult.stream().map(t->t).forEach(System.out::println);

        Assert.assertTrue(queryResult.get(0).get("login").equalsIgnoreCase(username));
        System.out.println("firstname: "+queryResult.get(0).get("first_name"));
        System.out.println("lastname: "+queryResult.get(0).get("last_name"));

    }

    @Then("user deletes the user {string}")
    public void userDeletesTheUser(String arg0) {

    }

    @Then("user clicks on Create a new user button")
    public void userClicksOnCreateANewUserButton() {

    }


    @Then("user deletes the new user {string} from the database and verifies deletion")
    public void userDeletesTheNewUserFromTheDatabaseAndVerifiesDeletion(String username) throws SQLException {
        //deleting username from database
        String user_id=DBUtilsNew.getQueryAsAListOfMaps("SELECT id FROM Jhi_user WHERE login = '"+username+"'").get(0).get("user_id");
        String queryDeletion="DELETE FROM public.jhi_user WHERE login='"+username+"';";
        DBUtilsNew.executeQuery(queryDeletion);

        //verifiying deletion completed
        String queryForVerification="SELECT * FROM public.jhi_user WHERE login='"+username+"';";
        List<Map<String,String>> queryResult=DBUtilsNew.getQueryAsAListOfMaps(queryForVerification);
        Assert.assertTrue(queryResult.size()==0);


    }

    @Then("user verifies there is no such user in database {string}")
    public void userVerifiesThereIsNoSuchUserInDatabase(String username) throws SQLException {
        String queryForVerification="SELECT * FROM public.jhi_user WHERE login='"+username+"';";
        List<Map<String,String>> queryResult=DBUtilsNew.getQueryAsAListOfMaps(queryForVerification);
        Assert.assertTrue(queryResult.size()==0);

    }
}
