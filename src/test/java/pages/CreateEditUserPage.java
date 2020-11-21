package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateEditUserPage {

    public CreateEditUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//input[@id='login']")
    public WebElement loginname;

    @FindBy(xpath="//input[@id='firstname']")
    public WebElement firstname;

    @FindBy(xpath="//input[@id='lastname']")
    public WebElement lastname;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement saveSubmitBtn;

    @FindBy(xpath="//*[@id='root']/div/div/div[1]/div/div/div[1]")
    public WebElement successMessage;


}
