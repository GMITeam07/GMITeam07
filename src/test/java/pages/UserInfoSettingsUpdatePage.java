package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserInfoSettingsUpdatePage {
    public UserInfoSettingsUpdatePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//a[@href='/account/settings']")
    public WebElement userInfo;

    @FindBy(id = "firstName")
    public WebElement firstNameTextBox;

    @FindBy(id = "lastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "langKey")
    public WebElement languageDrpDwn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath="//body//div//h2/span")
    public WebElement userSettingsText;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement lastNameInvalidFeedBack;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement firstNameInvalidFeedBack;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement emailNameInvalidFeedBack;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
    public WebElement singOut;


}
