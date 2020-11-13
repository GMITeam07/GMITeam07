package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class PasswordSegment {
    public PasswordSegment(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement dropdown;

    @FindBy(id = "login-item")
    public WebElement  SignIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//a[@href='account/password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmNewPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sabeButton;

}
