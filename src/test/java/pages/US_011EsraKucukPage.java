package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class US_011EsraKucukPage extends gmiBankPage  {


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

@FindBy(id="tp-customer-createDate")
public WebElement createDate;

    @FindBy(id="search-ssn")
    public WebElement searchSsn;

    @FindBy(id="tp-customer-firstName")
    public WebElement firstName;

    @FindBy(id="tp-customer-lastName")
    public WebElement lastName;


    @FindBy(id="tp-customer-email")
    public WebElement eMail;

    @FindBy(id="tp-customer-mobilePhoneNumber")
    public WebElement mobilePhone;

@FindBy(linkText = "My Operations")
public WebElement myOperations;

@FindBy(partialLinkText = "Manage Customers")
public WebElement manageCustomers;

@FindBy(partialLinkText = "Create a new Customer")
public WebElement createNewCustomer;

    @FindBy(id="tp-customer-phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id="tp-customer-zipCode")
    public WebElement zipCode;
    @FindBy(id = "tp-customer-city")
    public WebElement city;

    @FindBy(id="tp-customer-address")
    public WebElement adress;

    @FindBy(id="tp-customer-ssn")
    public WebElement ssn1;

    @FindBy(id="tp-customer-country")
    public WebElement selectCountry;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement internalServerError;

    @FindBy(id="tp-customer-state")
    public WebElement selectState;

    @FindBy(id="tp-customer-user")
    public WebElement selectUser;

    @FindBy(id="tp-customer-zelleEnrolled")
    public WebElement zelleEnrolled;

@FindBy(id = "save-entity")
public  WebElement saveButton;

@FindBy(id = "tp-customer-account")
public WebElement selectAccount;
@FindBy(id = "tp-customer-middleInitial")
public WebElement middleInitial;



    public void GMIBankLogin(){

        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));

        US_011EsraKucukPage gmiBankPage = new US_011EsraKucukPage();

        gmiBankPage.ilkGirisButonu.click();

        gmiBankPage.signInButonu.click();

        gmiBankPage.gmibankUsernameKutusu.sendKeys(ConfigReader.getProperty("GMIBankValidUsername"));

        gmiBankPage.gmiBankPasswordKutusu.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));

        gmiBankPage.gmiBankSigInOkButonu.click();


}

    public static String todaysDateUS11(){
        String today = new SimpleDateFormat("dd-MM-yyyy hh:mm").format(new Date());
        return today;
    }

    }
