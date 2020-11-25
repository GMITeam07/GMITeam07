package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

    @FindBy(xpath="//*[@id='ssn']")
    public WebElement ssntextBox;

    @FindBy(xpath="//input[@id='firstname']")
    public WebElement firstnametextBox;

    @FindBy(xpath="//input[@id='lastname']")
    public WebElement lastnamentextBox;

    @FindBy(xpath="//input[@id='address']")
    public WebElement addresstextBox;

    @FindBy(xpath="//input[@id='mobilephone']")
    public WebElement mobiletextBox;

    @FindBy(xpath="//input[@id='username']")
    public WebElement usernametextBox;

    @FindBy(xpath="//input[@id='email']")
    public WebElement emailtextBox;

    @FindBy(xpath="//input[@id='firstPassword']")
    public WebElement passwordtextBox;

    @FindBy(xpath="//input[@id='secondPassword']")
    public WebElement passwordConfirmation;

    @FindBy(xpath="//button[@id='register-submit']")
    public WebElement registerBtn;



}
