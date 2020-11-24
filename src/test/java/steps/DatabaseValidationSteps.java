package steps;

import io.cucumber.java.en.Given;
import utilities.ApiUtils;
import utilities.DBUtilsNew;

import java.sql.SQLException;
import java.util.List;

public class DatabaseValidationSteps {

    @Given("user retrieves all user info from the database")
    public void user_retrieves_all_user_info_from_the_database() throws SQLException {
       List usersDB= DBUtilsNew.getUsersAsListOfMap();
       List usersAPI= ApiUtils.getUsersAsList("");
    }

}
