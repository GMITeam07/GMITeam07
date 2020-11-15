package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManageCustomersPage {
    public ManageCustomersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "jh-create-entity")
    public WebElement CreateANewCustomer;
}
