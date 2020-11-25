package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='account-menu']/div/a[1]/span")
    public WebElement userInfoDrpDnOption;

    @FindBy (id = "account-menu")
    public WebElement userAccountMenu;

    @FindBy (xpath = "//*[@id='account-menu']/div/a[3]/span")
    public WebElement signOutOptionBtn;

    @FindBy(xpath="//*[@id='account-menu']/div/a[2]/span")
    public WebElement registerDropDwnOption;

    @FindBy(xpath="//*[@id='admin-menu']/a/span")
    public WebElement administrtaionMenu;

    @FindBy(xpath="//*[@id='admin-menu']/div/a[1]/span")
    public WebElement userManagementDrpDwnOption;

    @FindBy(xpath="//*[@id='user-management-page-heading']/a/span")
    public WebElement createNewUserPageBtn;




}
