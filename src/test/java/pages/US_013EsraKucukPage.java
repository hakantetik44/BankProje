package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;

public class US_013EsraKucukPage extends gmiBankPage {


    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement ilkGirisButonu;
    @FindBy (xpath = "//span[text()='Sign in']")
    public WebElement signInButonu;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement gmibankUsernameKutusu;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement gmiBankPasswordKutusu;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement gmiBankSigInOkButonu;

@FindBy(linkText = "Manage Accounts")
public WebElement manageAccount;

@FindBy(partialLinkText = "Create a new Account")
public WebElement createAccount;

@FindBy(xpath = "//div[@class='invalid-feedback']")
public  WebElement descriptionRequiredField;

@FindBy(xpath = "//input[@name='balance']")
public WebElement balance;

@FindBy(id = "tp-account-accountType")
public WebElement selectAccountType;

@FindBy(id = "tp-account-createDate")
public WebElement createDate;
@FindBy(id = "tp-account-accountStatusType")
public  WebElement accountStatusType;

@FindBy(id = "tp-account-closedDate")
public WebElement closeDate;

@FindBy(id = "tp-account-employee")
public WebElement selectEmployee;

@FindBy(id = "save-entity")
public WebElement saveButton;

@FindBy(xpath = "//input[@name='description']")
public WebElement description;

@FindBy(xpath = "//div[@class='invalid-feedback']")
public WebElement balanceInvalidFeedback;

    @FindBy (xpath = "//div[@class='invalid-feedback']")
    public WebElement dolarSymbolAlert;

    public void GMIBankLogin(){

        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));

        US_011EsraKucukPage gmiBankPage = new US_011EsraKucukPage();

        gmiBankPage.ilkGirisButonu.click();

        gmiBankPage.signInButonu.click();

        gmiBankPage.gmibankUsernameKutusu.sendKeys(ConfigReader.getProperty("GMIBankValidUsername"));

        gmiBankPage.gmiBankPasswordKutusu.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));

        gmiBankPage.gmiBankSigInOkButonu.click();


    }




}
