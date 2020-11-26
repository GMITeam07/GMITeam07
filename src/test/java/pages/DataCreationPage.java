package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataCreationPage {
    @FindBy (xpath = "//*[@id='entity-menu']/a/span")
    public WebElement myOperationsButton;
    @FindBy (xpath = "//*[@id='entity-menu']/div/a[1]/span")
    public WebElement manageCustomerButton;
    @FindBy (xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/thead/tr/th[1]/span")
    public WebElement idTableHead;
    @FindBy (xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/thead/tr/th[2]/span")
    public WebElement firstNameTableHead;
    @FindBy (xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/thead/tr/th[3]/span")
    public WebElement lastNameTableHead;
    @FindBy(xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/thead/tr/th[4]/span")
    public WebElement middleInitialTableHead;
    @FindBy(xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/thead/tr/th[5]/span")
    public WebElement emailTableHead;
    @FindBy (xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/thead/tr/th[6]/span")
    public WebElement mobilePhoneNumberTableHead;
    @FindBy (xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/thead/tr/th[7]/span")
    public WebElement phoneNumberTableHead;
    @FindBy (xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/thead/tr/th[8]/span")
    public WebElement addressTableHead;
    @FindBy (xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/thead/tr/th[9]/span")
    public WebElement createDateTableHead;

    @FindBy (xpath = "//*[@id='jh-create-entity']/span")
    public WebElement createNewCustomerButton;
    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement firstName;
    @FindBy (xpath = "//input[@name='lastName']")
    public WebElement lastName;
    @FindBy (xpath = "//input[@name='middleInitial']")
    public WebElement middleInitial;
    @FindBy(xpath="//input[@name='email']")
    public WebElement email;
    @FindBy (xpath ="//input[@name='mobilePhoneNumber']")
    public WebElement mobilePhoneNumber;
    @FindBy (xpath ="//input[@name='phoneNumber']")
    public WebElement phoneNumber;
    @FindBy (xpath ="//input[@name='zipCode']")
    public WebElement zipCode;
    @FindBy (xpath ="//input[@name='address']")
    public WebElement address;
    @FindBy (xpath ="//input[@name='city']")
    public WebElement city;
    @FindBy (xpath ="//input[@name='ssn']")
    public WebElement ssn;
    @FindBy (xpath ="//input[@name='createDate']")
    public WebElement createDate;
    @FindBy (xpath ="//*[@id='tp-customer-account']/option[2]")
    public WebElement accountSelection;
    @FindBy (xpath ="//*[@id='zelleEnrolledLabel']/span")
    public WebElement zelleEnrolled;
    @FindBy (xpath ="//*[@id='save-entity']/span")
    public WebElement saveButton;
    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewAccountButton;
    @FindBy (xpath = "//*[@id='tp-account-description']")
    public WebElement descriptionBox;
    @FindBy (xpath ="//*[@id='tp-account-balance']")
    public WebElement balanceBox;
    @FindBy (xpath ="//*[@id='tp-account-accountType']")
    public WebElement accountType;
    @FindBy (xpath ="//*[@id='tp-account-accountStatusType']")
    public WebElement accountStatusType;
    @FindBy (xpath ="//*[@id='tp-account-createDate']")
    public WebElement createDateForAccount;
    @FindBy (xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[9]/div/a[1]/span/span")
    public WebElement viewButton;
    @FindBy (xpath ="//*[@id='app-view-container']/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[1]/a")
    public WebElement idButton;

}
