package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.util.List;

public class ManageCustomerPage {

    public ManageCustomerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement dropDownAccount;

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public  WebElement password;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement accountSignIn;

    @FindBy(id = "jhi-confirm-delete-tPCustomer")
    public WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[1]/h5/span")
    public WebElement deleteAlert;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement buttonSignin;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myOperations;
    @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement manageCostumer;
    @FindBy(xpath = "//tbody//tr[5]/td")
    public List<WebElement> rowList;
    @FindBy(xpath = "//thead//th")
    public List<WebElement> headList;

    @FindBy(xpath = "//span[text()='View']")
    public  WebElement buttonWiew;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm'][1]")
    public  WebElement buttonEdit;
    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public  WebElement buttonDelete;
    @FindBy(xpath = "//span[text()='Edit']")

    public  WebElement ButtonViewEdit;
    @FindBy(id = "tp-customer-city")
    public  WebElement cityUpdate;
    @FindBy(xpath = "//span[text()='Save']")
    public  WebElement ButtonEditSave;

    @FindBy(xpath = "//div[contains(text(),'updated')]")
    public WebElement alertUpdate;

    @FindBy(xpath = "//span[text()='Confirm delete operation']")
    public WebElement alertDeleteQuestion;

    @FindBy(linkText = "7393")
    public  WebElement userDelete;
    @FindBy(id = "jhi-confirm-delete-tPCustomer")
    public WebElement alertDeleteButton;

    @FindBy(linkText = "»»")
    public WebElement lastPageButton;
}
