package utilities;

import com.sun.jmx.mbeanserver.Repository;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.apache.maven.shared.utils.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.RegistrationPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class ReUsableMethods {


    public static long timestampInSeconds() {
        /*This method generates a random String id   */
        long timeinMilisecs = System.currentTimeMillis();

        System.out.println(timeinMilisecs);
        return timeinMilisecs ;
    }

    public static String generateClientOrderId() {
        /*This method generates a random String id   */
        return "coid".concat(String.valueOf(System.currentTimeMillis()));
    }


    public static void createNewCustomer(String sSN,
                                             String firstName,
                                             String lastName,
                                             String address,
                                             String mobilePhoneNumber,
                                             String username,
                                             String email,
                                             String newPassword,
                                             String passwordConfirmation){

        Driver.getDriver().get(ConfigReader.getProperty("gmibank_url"));

        RegistrationPage register = new RegistrationPage();
        register.sSN.sendKeys(sSN);
        register.regFirstName.sendKeys(firstName);
        register.regLastName.sendKeys(lastName);
        register.regAddress.sendKeys(address);
        register.regMobilePhone.sendKeys(mobilePhoneNumber);
        register.regUsername.sendKeys(username);
        register.regEmail.sendKeys(email);
        register.registerNewPassword.sendKeys(newPassword);
        register.registerPasswordConfirmation.sendKeys(passwordConfirmation);




    }



}
