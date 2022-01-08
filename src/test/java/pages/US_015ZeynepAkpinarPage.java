package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US_015ZeynepAkpinarPage {

    public US_015ZeynepAkpinarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public void GMIBankCustomerLogin(){

        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));

        US_015ZeynepAkpinarPage zeynepAkpinarPage = new US_015ZeynepAkpinarPage();

        zeynepAkpinarPage.item.click();

        zeynepAkpinarPage.loginbutonu.click();

        zeynepAkpinarPage.usernamekutusu.sendKeys(ConfigReader.getProperty("GMIBankCustomerUsername"));

        zeynepAkpinarPage.passwordkutusu.sendKeys(ConfigReader.getProperty("GMIBankCustomerPassword"));

        zeynepAkpinarPage.submitbutonu.click();
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement item;

    @FindBy (xpath = "//a[@href='/login']")
    public WebElement loginbutonu;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernamekutusu;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordkutusu;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitbutonu;

    @FindBy (xpath = "(//a[@href='#'])[2]")
    public WebElement myoperationsbutonu;

    @FindBy (xpath = "//a[@href='/customer/tp-customer-accounts/117102']")
    public WebElement myaccountsbutonu;

    @FindBy (xpath = "//h2[text()='Customer Accounts']")
    public WebElement customeraccountbasligi;

    @FindBy (xpath = "//th[text()='Account Type']")
    public WebElement accounttypebasligi;

    @FindBy (xpath = "//th[text()='Account Balance']")
    public WebElement accountbalancebasligi;

    @FindBy (xpath = "(//button[text()='View Transaction'])[1]")
    public WebElement viewtransactionbuton1;

    @FindBy (xpath = "(//button[text()='View Transaction'])[2]")
    public WebElement viewtransactionbuton2;

    @FindBy (xpath = "//th[text()='Description']")
    public WebElement descriptionbasligi;

    @FindBy (xpath = "//th[text()='Date']")
    public WebElement datebasligi;

    @FindBy (xpath = "//th[text()='Amount']")
    public WebElement amountbasligi;

    @FindBy (xpath = "//th[text()='New Balance']")
    public WebElement newbalancebasligi;

    @FindBy (xpath = "//span[text()='ID']")
    public WebElement idbasligi;



}
