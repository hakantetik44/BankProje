package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US_010ZeynepAkpinarPage {

    public US_010ZeynepAkpinarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void GMIBankEmployeeLogin(){

        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));

        US_010ZeynepAkpinarPage zeynepAkpinarPage = new US_010ZeynepAkpinarPage();

        zeynepAkpinarPage.item.click();

        zeynepAkpinarPage.loginbutonu.click();

        zeynepAkpinarPage.usernamekutusu.sendKeys(ConfigReader.getProperty("GMIBankValidUsername"));

        zeynepAkpinarPage.passwordkutusu.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));

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

    @FindBy (xpath = "//a[@href='/tp-customer']")
    public WebElement managecustomerbutonu;

    @FindBy (xpath = "//a[@id='jh-create-entity']")
    public WebElement newcustomerbutonu;

    @FindBy (xpath = "//input[@name='address']")
    public WebElement addresskutusu;

    @FindBy (xpath = "//div[text()='This field is required.']")
    public WebElement bosbırakılamazuyariyazisi;

    @FindBy (xpath = "//input[@name='city']")
    public WebElement citykutusu;

    @FindBy (xpath = "//select[@name='country.id']")
    public WebElement countrydropdown;

    @FindBy (xpath = "//input[@name='state']")
    public WebElement statekutusu;

    @FindBy (xpath = "//span[text()='Account']")
    public WebElement accountyazisi;

}
