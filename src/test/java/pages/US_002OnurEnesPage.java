package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class US_002OnurEnesPage {
    public US_002OnurEnesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[text()='Ssn is invalid.']")
    public WebElement ssnInvalid;
    @FindBy(xpath = "//div[text()='translation-not-found[error.ssnexists]']")
    public WebElement existSsn;
    @FindBy(xpath = "//div[text()='Please enter your first name.']")
    public WebElement firstNameInvalid;
    @FindBy(xpath = "//div[text()='Please enter your last name.']")
    public WebElement lastNameInvalid;
    @FindBy(xpath = "//div[text()='Please enter your address.']")
    public WebElement adressInvalid;
    @FindBy(xpath = "//div[text()='Please enter your mobile phone number.']")
    public WebElement phoneNumberInvalid;
    @FindBy(xpath = "//div[text()='Your username is required.']")
    public WebElement userNameInvalid;
    @FindBy(xpath = "//div[text()='Please enter your email.']")
    public WebElement emailInvalid;
    @FindBy(xpath = "//div[text()='Your email is invalid.']")
    public WebElement emailInvalid2;
    @FindBy(xpath = "//div[text()='Your password is required.']")
    public WebElement newPasswordInvalid;
    @FindBy(xpath = "//div[text()='Your confirmation password is required.']")
    public WebElement newPasswordConfirmationInvalid;
    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement confirmButton;
}