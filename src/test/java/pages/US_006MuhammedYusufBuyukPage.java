package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_006MuhammedYusufBuyukPage {
    public US_006MuhammedYusufBuyukPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountIcon;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='Did you forget your password?']")
    public WebElement didYouForgetLinki;

    @FindBy (xpath = "//strong[text()='Failed to sign in!']")
    public WebElement girisHataMesaji;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement resetEmailTextBox;

    @FindBy (xpath = "//span[text()='Reset password']")
    public WebElement resetEmailButton;

    @FindBy (xpath = "//span[text()='Register a new account']")
    public WebElement RegisterEmailLinki;

    @FindBy (xpath = "//div[text()='Check your emails for details on how to reset your password.']")
    public WebElement checkEmailMesaji;

    @FindBy (xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement kullaniciIconu;

    @FindBy (xpath = "//span[text()='User Info']")
    public WebElement userInfo;

    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement firstNameTextBox;

    @FindBy (xpath = "//input[@id='lastName']")
    public WebElement lasttNameTextBox;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy (xpath = "//span[text()='Save']")
    public WebElement  saveButton;

    @FindBy (xpath = "//span[text()='Kaydet']")
    public WebElement  kaydetButton;

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement langDropDown;

    @FindBy (xpath ="//strong[text()='Settings saved!']")
    public WebElement  ayarlarMesaji;

}
