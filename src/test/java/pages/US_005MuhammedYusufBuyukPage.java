package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class US_005MuhammedYusufBuyukPage {


    public US_005MuhammedYusufBuyukPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountIcon;

    @FindBy (xpath = "//a[@id='login-item']")
    public WebElement signIn;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordBox ;

    @FindBy (xpath = "//button[@type='submit']") //---------------------
    public WebElement singInButton;

    @FindBy(xpath = "//span[text()='Did you forget your password?']")
    public WebElement didYouForgetLinki;

    @FindBy (xpath = "//strong[text()='Failed to sign in!']")
    public WebElement girisHataMesaji;

    @FindBy (xpath = "//span[text()='Reset password']")
    public WebElement resetEmailButton;

    @FindBy (xpath = "//span[text()='Register a new account']")
    public WebElement RegisterEmailLinki;

    @FindBy (xpath = "//div[text()='Check your emails for details on how to reset your password.']")
    public WebElement checkEmailMesaji;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement resetEmailTextBox;



}
