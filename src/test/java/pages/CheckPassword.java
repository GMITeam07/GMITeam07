package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckPassword {
    public CheckPassword() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ssn")
    public WebElement ssnTextBox;

    @FindBy (id = "firstname")
    public WebElement firstNameTextBox;

    @FindBy(id = "lastname")
    public WebElement lastNameTextBox;

    @FindBy (id = "address")
    public WebElement addressTextBox;

    @FindBy (id = "mobilephone")
    public WebElement mobilePhoneTextBox;

    @FindBy (id = "email")
    public WebElement emailTextBox;

    @FindBy (id = "firstPassword")
    public WebElement firstPasswordTextBox;

    @FindBy (id = "secondPassword")
    public WebElement secondPasswordTextBox;



}
