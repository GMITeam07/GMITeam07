package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MoneyTransferPage {

    public MoneyTransferPage (){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//ul//li[8]//a[@href='#']")
    public WebElement myOperations;

    @FindBy(xpath = "//*[@id='entity-menu']/div[1]/a[2]")
    public WebElement transferMoney;

    @FindBy(xpath = "//form/div[1]/select[@name='fromAccountId']")
    public WebElement fromDropdown;

    @FindBy(xpath = "//form/div[2]/select[@name='toAccountId']")
    public WebElement toDropdown ;

    @FindBy(xpath = "//div//input[@id='balance']")
    public WebElement balance;

    @FindBy(xpath = "//div[@class='form-group']//div//div//div//div")
    public WebElement balanceError;

    @FindBy(xpath = "//div//textarea[@id='description']")
    public WebElement description ;

    @FindBy(xpath = "//div[@class='text-danger form-group']//div//div")
    public WebElement descriptionError ;

    @FindBy(xpath = "//div//button[@id='make-transfer']")
    public WebElement makeTransferButton;

    @FindBy(xpath = "//div[@id=\"root\"]/div/div/div[1]/div")
    public WebElement successMessage;



}
