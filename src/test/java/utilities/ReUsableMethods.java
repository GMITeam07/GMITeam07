package utilities;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import pojos.Customer;

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

    public void createNewCustomer(String ssn,
                                  String firstname,
                                  String lastname,
                                  String middlename,
                                  String address,
                                  String mobilenumber,
                                  String username,
                                  String login){
        Customer customer=new Customer();
        customer.setAddress(address);


    }

    //AKSU SOR ONDAN SONRA PUSH ET
    public static void selectByIndex (WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void selectByValue (WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void selectByVisibleText (WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
}
