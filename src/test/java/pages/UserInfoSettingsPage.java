package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInfoSettingsPage {
    @FindBy(xpath="//body//div//h2/span")
    public WebElement userSettingsText;

    @FindBy(xpath="//body//div//h2/span/strong")
    public WebElement loginNameText;

    @FindBy(xpath="//form//div//input[@name='firstname']")
    public WebElement firstnameTextBox;

    @FindBy(xpath="//form//div//input[@name='lastname']")
    public WebElement lastnameTextBox;

    @FindBy(xpath="//form//div//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath="//div//select[@id='langKey']")
    public WebElement languageDrpDwn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement saveBtn;

    @FindBy(xpath="//form//div[.='Your first name is required.']")
    public WebElement firstnameRequiredText;

    @FindBy(xpath="//form//div[.='Your last name is required.']")
    public WebElement lastnameRequiredText;

    @FindBy(xpath="//form//div[.='Your email is required.']")
    public WebElement emailRequiredText;

    @FindBy(partialLinkText = "at least 5 characters")
    public WebElement emailAtLeast5CharactersText;

    @FindBy(partialLinkText = "This field is invalid")
    public WebElement emailThisFieldIsInvalidText;

    @FindBy(xpath = "//div//div//span/strong")
    public WebElement settingsSavedMessageAlert;

    @FindBy(xpath = "//div/button[@aria-label='close']")
    public WebElement settingsSavedMessageAlertCloseBtn;



}
