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

    @FindBy(xpath = "//div//ul//li//a[@href='#']")
    public WebElement accountIcon;
    @FindBy(xpath = "//li[@id=\"account-menu\"]//div//a[2]//span")
    public WebElement registerDropdown;
    @FindBy(xpath = "//form//div//input[@id='ssn']")
    public WebElement sSN;
    @FindBy(xpath = "//*[@id='register-form']/div[1]/div[@class='invalid-feedback']")
    public WebElement ssnErrorMessage;
    @FindBy(xpath = "//form//div//input[@id='firstname']")
    public WebElement regFirstName;

    @FindBy(xpath = "//*[@id='register-form']/div[2]/div[@class='invalid-feedback']")
    public WebElement firstNameErrorMessage;
    @FindBy(xpath = "//form//div//input[@id='lastname']")
    public WebElement regLastName;
    @FindBy(xpath = "//*[@id='register-form']/div[3]/div[@class='invalid-feedback']")
    public WebElement lastNameErrorMessage;
    @FindBy(xpath = "//form//div//input[@id='address']")
    public WebElement regAddress;
    @FindBy(xpath = "//form//div//input[@id='mobilephone']")
    public WebElement regMobilePhone;
    @FindBy(xpath = "//*[@id='register-form']/div[5]/div[@class='invalid-feedback']")
    public WebElement phoneNumberErrorMessage;
    @FindBy(xpath = "//form//div//input[@id='username']")
    public WebElement regUsername;
    @FindBy(xpath = "//*[@id='register-form']/div[6]/div[@class='invalid-feedback']")
    public WebElement usernameErrorMessage;
    @FindBy(xpath = "//form//div//input[@id='email']")
    public WebElement regEmail;
    @FindBy(xpath = "//*[@id='register-form']/div[7]/div[@class='invalid-feedback']")
    public WebElement emailErrorMessage;
    @FindBy(xpath = "//form//div//input[@id='firstPassword']")
    public WebElement registerNewPassword;
    @FindBy(xpath = "//form//div//input[@id='secondPassword']")
    public WebElement registerPasswordConfirmation;
    @FindBy(xpath = "//form//button[@id='register-submit']")
    public WebElement registerButton;

}
