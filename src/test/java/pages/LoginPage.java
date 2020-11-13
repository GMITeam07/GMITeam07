package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


    public  LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement loginDrpDwn;

    @FindBy(id = "login-item")
    public WebElement signinOptionDrpDwn;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signinSubmitButton;

    @FindBy(xpath = "//button[@tabindex='1']")
    public WebElement cancelButton;

    @FindBy(linkText = "Did you forget your password?")
    public WebElement forgetPasswordButton;

    @FindBy(linkText = "Register a new account")
    public WebElement registerNewAccountButton;

    @FindBy(css = "div[class='invalid-feedback']")
    public WebElement invalidFeedbackUsername;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement invalidFeedbackPassword;

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement failedSigninMessage;

    @FindBy (id = "account-menu")
    public WebElement accountMenu;
















    }



