package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_014SunaKaplanhanPage {
    public US_014SunaKaplanhanPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
    //@FindBy (xpath="(//a[@class='dropdown-toggle nav-link'])[1]")
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement girisButonu;

    //@FindBy (xpath = "(//*[span='Sign in'])[0]")
    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement ilkSignInButonu;

    @FindBy (xpath="//input[@name= 'username']")
    public WebElement username;

    @FindBy (xpath="//input[@name= 'password']")
    public WebElement password;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement ikinciSignInButonu;

    @FindBy (id= "entity-menu")
    public WebElement myOperations;

    @FindBy (xpath = "//*[span='Manage Accounts']")
    public WebElement manageAccounts;

    @FindBy (xpath = "//*[span='Create a new Account']")
    public WebElement createAccount;

    @FindBy (xpath= "(//input[@id='tp-account-description'])[1]")
    public WebElement descriptionKutusu;

    @FindBy (xpath= "(//input[@id='tp-account-balance'])[1]")
    public WebElement balanceKutusu;


    @FindBy (xpath="(//select[@id='tp-account-accountType'])[1]")
    public WebElement accountTypeDropDown;

    @FindBy (xpath="(//select[@id='tp-account-accountStatusType'])[1]")
    public WebElement accountStatusTypeDropDown;

    @FindBy (xpath="(//input[@id='tp-account-createDate'])[1]")
    public WebElement createDate;

    @FindBy (xpath="(//input[@id='tp-account-closedDate'])[1]")
    public WebElement closedDate;

    @FindBy (xpath = "//*[span='Save']")
    public WebElement saveButonu;

    @FindBy (xpath = "//*[span='ID']")
    public WebElement basariliKayitElementi;

    @FindBy (xpath="(//select[@id='tp-account-employee'])[1]")
    public WebElement employeeDropDown;


}
