package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerCreationPage {

    @FindBy(xpath="//input[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath="//input[@id='firstname']")
    public WebElement firstname;

    @FindBy(xpath="//input[@id='lastname']")
    public WebElement lastname;

    @FindBy(xpath="//input[@id='address']")
    public WebElement address;

    @FindBy(xpath="//input[@id='mobilephone']")
    public WebElement mobile;

    @FindBy(xpath="//input[@id='username']")
    public WebElement usernametextBox;

    @FindBy(xpath="//input[@id='email']")
    public WebElement email;

    @FindBy(xpath="//input[@id='firstPassword']")
    public WebElement passwordtextBox;

    @FindBy(xpath="//input[@id='secondPassword']")
    public WebElement passwordConfirmation;

    @FindBy(xpath="//button[@id='register-submit']")
    public WebElement registerBtn;

}
