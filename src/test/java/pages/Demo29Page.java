package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Demo29Page {
    public Demo29Page() {
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

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement failedSigninMessage;

    @FindBy(id = "account-menu")
    public WebElement accountMenu;


    @FindBy(xpath = "//*[@id='account-menu']/div/a[1]/span")
    public WebElement userInfoDrpDnOption;

    @FindBy (id = "account-menu")
    public WebElement userAccountMenu;

    @FindBy (xpath = "//*[@id='account-menu']/div/a[3]/span")
    public WebElement signOutOptionBtn;

    @FindBy(xpath="//*[@id='account-menu']/div/a[2]/span")
    public WebElement registerDropDwnOption;

    @FindBy(xpath="//*[@id='admin-menu']/a/span")
    public WebElement administrtaionMenu;

    @FindBy(xpath="//*[@id='admin-menu']/div/a[1]/span")
    public WebElement userManagementDrpDwnOption;

    @FindBy(xpath="//*[@id='user-management-page-heading']/a/span")
    public WebElement createNewUserPageBtn;


}
