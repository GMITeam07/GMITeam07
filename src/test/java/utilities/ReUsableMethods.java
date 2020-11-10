package utilities;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

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


}
