package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class US_019BerrinKosePage extends gmiBankPage{

        @FindBy(css ="#account-menu")
        public WebElement accountMenu;

        @FindBy(id="login-item")
        public WebElement signIn;

        @FindBy(xpath = "//input[contains(@id,'username')]")
        public WebElement username;

        @FindBy(xpath = "//input[contains(@id,'password')]")
        public WebElement password;

        @FindBy(xpath = "//*[@class='btn btn-primary']")
        public WebElement signinButton;

        @FindBy(xpath ="//button[@type='submit']")
        public WebElement submit;

        @FindBy(id ="entity-menu")
        public WebElement myOperations;

        @FindBy  (xpath = "//span[contains(text(),'Manage Accounts')]")
        public WebElement manageAccounts;

        @FindBy(xpath = "//span[contains(text(),'Create a new Account')]")
        public WebElement newAccount;

        @FindBy(xpath = "//input[@name='description']")
        public WebElement description;

        @FindBy(id = "tp-account-balance")
        public WebElement balance;

        @FindBy(id = "tp-account-accountType")
        public WebElement accountType;

        @FindBy(id = "tp-account-accountStatusType")
        public WebElement accountStatusType;

        @FindBy(id="tp-account-employee")
        public WebElement employee;

        @FindBy(id="save-entity")
        public WebElement saveButton;


        @FindBy(xpath ="//div[@class='Toastify__toast-body']")

        public WebElement verifyTransactionYazisi;



}







