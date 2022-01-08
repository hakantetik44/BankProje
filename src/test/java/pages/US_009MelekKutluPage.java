package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_009MelekKutluPage extends gmiBankPage{

    @FindBy(id = "username")
    public WebElement username;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement password;





    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;










    @FindBy(id = "entity-menu")
    public WebElement myOperations;

    @FindBy(xpath= "//span[text() = 'Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(id = "jh-create-entity")
    public WebElement createANewCustomer;

    @FindBy(id = "search-ssn")
    public WebElement ssnBox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement search;

    @FindBy(className = "Toastify__toast-body")
    public WebElement successMessage;

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(id="tp-customer-middleInitial")
    public WebElement middle;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "mobilePhoneNumber")
    public WebElement mobilePhoneNumber;

    @FindBy(name = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "tp-customer-zipCode")
    public WebElement postaKodu;

    @FindBy(id = "tp-customer-address")
    public WebElement adres;

    @FindBy(name="city")
    public WebElement sehir;

    @FindBy(name="ssn")
    public WebElement ssn;

    @FindBy(name="ssn")
    public WebElement tarih;

    @FindBy(id="tp-customer-country")
    public WebElement ulke;

    @FindBy(name="state")
    public WebElement state;

    @FindBy(id="tp-customer-user")
    public WebElement user;

    @FindBy(name="accounts")
    public WebElement account;

    @FindBy(id="save-entity")
    public WebElement savebutton;

    @FindBy(id="save-entity")
    public WebElement savemessage;
}
