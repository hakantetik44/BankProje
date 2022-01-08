package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_001OnurEnesPage {
    public   US_001OnurEnesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "account-menu")
    public WebElement menuAccount;
    @FindBy(xpath = "//*[*='Register']")
    public WebElement registerButton;
    @FindBy(xpath = "//a[*='Sign in']")
    public WebElement signInButton;
    @FindBy(xpath = "//h1[@id='register-title']")
    public WebElement registerPageTitle;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnBox;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameBox;
    @FindBy(xpath = "//input[@*='lastname']")
    public WebElement lastNameBox;
    @FindBy(xpath = "//input[@id='address']")
    public WebElement adressBox;
    @FindBy(xpath = "//input[@id='mobilephone']")
    public WebElement phoneNumberBox;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameBox;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;
    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement firstPasswordBox;
    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement secondPassword;
    @FindBy(xpath = "//div[text()='Ssn is invalid.']")
    public WebElement ssnInvalid;
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
    @FindBy(xpath = "//div[text()='Your password is required.']")
    public WebElement newPasswordInvalid;
    @FindBy(xpath = "//div[text()='Your confirmation password is required.']")
    public WebElement newPasswordConfirmationInvalid;
    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement confirmButton;
    @FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--success']")
    public WebElement confirmMessage;
    @FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--error']")
    public WebElement invalidMessage;
}