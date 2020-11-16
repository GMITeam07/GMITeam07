package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PasswordSegmentPage {
    public PasswordSegmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id = "login-item")
    public WebElement signinOptionDrpDwn;

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement loginDrpDwn;



    @FindBy(xpath = "//*[@href='/account/password']")
    public WebElement passwordDropdown;


    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPassword;

    @FindBy (xpath = "//li[@style='background-color: rgb(255, 0, 0);']" )
    public WebElement levelChart;

    @FindBy (xpath = "//form//div//ul[@id='strengthBar']//li[1]" )
    public WebElement levelChartBar1;

    @FindBy (xpath = "//form//div//ul[@id='strengthBar']//li[2]" )
    public WebElement levelChartBar2;

    @FindBy (xpath = "//form//div//ul[@id='strengthBar']//li[3]" )
    public WebElement levelChartBar3;

    @FindBy (xpath = "//form//div//ul[@id='strengthBar']//li[4]" )
    public WebElement levelChartBar4;

    @FindBy (xpath = "//form//div//ul[@id='strengthBar']//li[5]" )
    public WebElement levelChartBar5;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    public WebElement confirmNewPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy (xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement popUpSave;
}
