package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement MyOperationsOption;

    @FindBy (xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement ManageCustomersOption;
}
