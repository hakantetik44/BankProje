package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_016ZeynepAkpinarPage {

    public US_016ZeynepAkpinarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
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

    @FindBy (xpath = "//a[text()='My Accounts']")
    public WebElement myaccountsbutonu;

    @FindBy (xpath = "//th[text()='Account Type']")
    public WebElement accounttype;

    @FindBy (xpath = "//th[text()='Account Balance']")
    public WebElement accountbalance;

    @FindBy (xpath = "//td[text()='124010']")
    public WebElement typeid1;

    @FindBy (xpath = "//td[text()='124011']")
    public WebElement typeid2;

    @FindBy (xpath = "//a[text()='Transfer Money']")
    public WebElement transfermoneybutonu;

    @FindBy (xpath = "//select[@name='fromAccountId']")
    public WebElement fromsekmesi;

    @FindBy (xpath = "//select[@name='toAccountId']")
    public WebElement tosekmesi;

   @FindBy (xpath = "//input[@name='balance']")
   public WebElement balancekutusu;

   @FindBy (xpath = "//textarea[@name='description']")
    public WebElement descriptionkutusu;

   @FindBy (xpath = "//button[@id='make-transfer']")
    public WebElement maketransferbutonu;

   @FindBy (xpath = "//option[@value='124010']")
    public WebElement hesap1;

    @FindBy (xpath = "(//option[@value='124011'])[1]")
    public WebElement hesap2;

    @FindBy (xpath = "(//option[@value='124011'])[2]")
    public WebElement hesapp2;

    @FindBy (xpath = "//div[text()='Transfer is succesfull']")
    public WebElement transfergerceklestimesaji;

    @FindBy (xpath = "//div[text()='translation-not-found[error.Balanceexceed]']")
    public WebElement transfergerceklesemediuyarisi;

    @FindBy (xpath = "//div[text()='This field is required.']")
    public WebElement bosbırakılamazuyariyazisi;
}
