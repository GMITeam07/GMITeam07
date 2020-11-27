package pages;

import jdk.nashorn.api.scripting.ScriptObjectMirror;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserManagementPage {

    public UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
     @FindBy(xpath = "//li[@id='admin-menu']")
    public WebElement administration;
    @FindBy(xpath = "//a[@href='/admin/user-management']")
    public WebElement UsermanagemantDropdown;

    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement createNewUserButton;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement login;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='activated']")
    public WebElement activated;

    @FindBy(id = "langKey")
    public WebElement language;

    @FindBy(id = "authorities")
    public WebElement profile;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath="//*[@id='root']/div/div/div[1]/div/div/div[1]")
    public WebElement successMessage;

    @FindBy(xpath = "//a[@href='/admin/user-management/example22']")
    public WebElement viewInfo;

    @FindBy(xpath = "//li[@class='page-item disabled']")
    public WebElement lastPage;

    @FindBy(xpath = "//span[text()='View'][1]")
    public  WebElement buttonWiew;

    @FindBy(xpath = "//dl[@class='jh-entity-details']")
    public WebElement viewUserInfo;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm'][1]")
    public  WebElement buttonEdit;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement ediLogin;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm'][1]")
    public  WebElement buttonDelete;

    @FindBy(linkText = "»»")
    public WebElement lastPageButton;

    @FindBy(xpath = "//a[@href='/admin/user-management/harryp/delete']")
    public WebElement deleteHarry;



}
