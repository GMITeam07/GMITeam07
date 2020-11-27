package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomersAksuPage {

    public CustomersAksuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "entity-menu")
    public WebElement myOperationsDrpDwn;
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[2]/span")
    public WebElement manageAccounts;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[9]/div/a[1]/span")
    public WebElement viewButton;




}