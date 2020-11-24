package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSettingsPage {
    public UserSettingsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="settings-title")
    public WebElement userSettingsText;

    @FindBy(xpath="//*[@id='settings-title']//span//strong")
    public WebElement loginNameText;

    @FindBy(id="firstName")
    public WebElement firstnameTextBox;

    @FindBy(id="lastName")
    public WebElement lastnameTextBox;

    @FindBy(xpath="//form//div//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath="//div//select[@id='langKey']")
    public WebElement languageDrpDwn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement saveBtn;

    @FindBy(xpath="//form/div[1][@class='text-danger form-group']/div[@class='invalid-feedback']")
    public WebElement firstnameErrorMessageText;

    @FindBy(xpath="//form[@id='settings-form]/div[2][@class='text-danger form-group']/div[@class='invalid-feedback']")
    public WebElement lastnameErrorMessage;

    @FindBy(xpath="//form[@id='settings-form]/div[3][@class='text-danger form-group']/div[@class='invalid-feedback']")
    public WebElement emailErrorMessages;

    @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/div/div[1]/span/strong")
    public WebElement settingsSavedsuccessfullyMessageAlert;

    @FindBy(xpath = "//div/button[@aria-label='close']")
    public WebElement settingsSavedMessageAlertCloseBtn;


}
