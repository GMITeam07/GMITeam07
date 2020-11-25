package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class NewAccountCreationPage {

    public NewAccountCreationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement signInIcon;
    @FindBy(id = "login-item")
    public WebElement signinBtn;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;
    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myOperations;
    @FindBy(xpath = "//a[@href='/tp-account']")
    public WebElement manageAccounts;
    @FindBy(id = "jh-create-entity")
    public WebElement createNewAccount;
    @FindBy(id = "tp-account-description")
    public WebElement descriptionBox;
    @FindBy(id = "tp-account-balance")
    public WebElement balanceBox;
    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeBox;
    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusTypeBox;
    @FindBy(id = "tp-account-createDate")
    public WebElement createDateBox;
    @FindBy(id = "tp-account-closedDate")
    public WebElement closedDateBox;
    @FindBy(id = "tp-account-employee")
    public WebElement employeeBox;
    @FindBy(id = "save-entity")
    public WebElement saveButton;
    @FindBy(xpath= "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement accountcreated;

}
