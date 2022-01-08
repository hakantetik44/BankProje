package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_018SunaKaplanhanPage {

    public US_018SunaKaplanhanPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath =  "(//li[@class='dropdown nav-item'])[2]")
    public WebElement girisButonu;

    @FindBy (xpath = "(//*[span='Sign in'])[1]")
    public WebElement ilkSignInButonu;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath= "//button[@class='btn btn-primary']")
    public WebElement ikinciSignInButonu;

    @FindBy(xpath = "//*[text()='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//*[text()='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement adminNotAuthorizedYazisi;

    @FindBy(xpath = "//li[@id='admin-menu']")
    public WebElement administrationMenu;


    @FindBy(xpath = "//*[span='User management']")
    public WebElement userManagement;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[1]")
    public WebElement viewButonu;

    @FindBy(xpath = "//dl[@class='jh-entity-details']")
    public WebElement kullaniciBilgileri;

    @FindBy(xpath = "//div[@class='view-routes']")
    public List<WebElement> editButonuEnabled;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editButonu;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement EditFirstNameTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement EditSaveButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement EditUpdateBasariliYazisi;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement AdminUserManagementDeleteButonu;

    @FindBy(xpath = "//span[text()='Confirm delete operation']")
    public WebElement AdminUserManagementDeleteUyarıYazisi;


}

