package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div//a[1]//span[.='User Info']")
    public WebElement userInfoDrpDnOption;

    @FindBy (id = "account-menu")
    public WebElement userAccountMenu;

    @FindBy (xpath = "//*[@id=\'entity-menu\']/a/span")
    public WebElement myOperations;
    @FindBy (xpath = "//*[@id=\'entity-menu\']/div/a[1]/span")
    public WebElement manageCustomers;

}
