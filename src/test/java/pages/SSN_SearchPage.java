package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class SSN_SearchPage {
    public SSN_SearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement signInButton;

    @FindBy(id = "search-ssn")
    public WebElement SSN_SearchBox;

    @FindBy (className = "btn-secondary")
    public WebElement searchButton;

    @FindBy (id = "tp-customer-firstName")
    public WebElement customerFirstName;

    @FindBy (name = "lastName")
    public WebElement customerLastName;

    @FindBy (name = "email")
    public WebElement customerEmail;

    @FindBy (name = "phoneNumber")
    public WebElement customerPhoneNumber;

    @FindBy (name = "zipCode")
    public WebElement customerZipCode;

    @FindBy (name = "address")
    public WebElement customerAddress;

    @FindBy (name = "city")
    public WebElement customerCity;

    @FindBy (className = "tp-customer-state")
    public WebElement customerState;

    @FindBy (className = "tp-customer-country")
    public WebElement customerCountry;

    @FindBy (name = "ssn")
    public WebElement customerSSN;


    @FindBy (className = "Toastify__toast-body")
    public WebElement ssnErrorMessage;

    @FindBy (className = "invalid-feedback")
    public WebElement errorMessage;


}
