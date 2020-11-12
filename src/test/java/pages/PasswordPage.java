package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PasswordPage {
    public PasswordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/svg")
    public WebElement userIcon;

    @FindBy (className = "svg-inline--fa fa-sign-in-alt fa-w-16 fa-fw ")
    public WebElement register;

    @FindBy (id = "firstPassword")
    public WebElement firstPasswordButton;


}
