package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class  US_017HuseyinKarahanPage {
    public US_017HuseyinKarahanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement signIn;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement SignInButton;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(id ="admin-menu")
    public WebElement adminmenu;

    @FindBy(xpath = "//span[.='Administration']")
    public WebElement adminmaneger;

    @FindBy(xpath = "//span[.='User management']")
    public WebElement userManagement;

    ////a[@href='/admin/user-management/miquel/edit']
    @FindBy(xpath ="//a[@href='/admin/user-management/abidin/edit']")
     public WebElement editButton;

    @FindBy(xpath ="//option[.='ROLE_ADMIN']")
    public WebElement roleAdmin;

    @FindBy(xpath ="//option[.='ROLE_USER']")
    public WebElement roleUser;

    @FindBy(xpath ="//option[.='ROLE_EMPLOYEE']")
    public WebElement roleEmployee;

    @FindBy(xpath ="//option[.='ROLE_MANAGER']")
    public WebElement roleManager;

    @FindBy(xpath ="//option[.='ROLE_CUSTOMER']")
    public WebElement roleCustomer;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;

    @FindBy(id = "firstName")
    public  WebElement firstNameInput;

    //a[@href='/admin/user-management/miquel/delete']
    @FindBy(xpath = "//span[.='Delete']")
    public WebElement deleteButton;

    //button[@class='btn btn-danger']/span[.='Delete']
    @FindBy(xpath = "//button/span[.='Delete']")
    public WebElement deleteButton2;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement internalServerError;

    @FindBy(id="authorities")
    public WebElement selectProfil;

    public void clickSignIn(){
        signIn.click();
    }
    public void clickSignInButton(){
        SignInButton.click();
    }
    public void enterUsername(){
        username.sendKeys(ConfigReader.getProperty("CustomerUsername"));
    }
    public void enterPassword(){
        password.sendKeys(ConfigReader.getProperty("CustomerPassword"));
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void clickadminmenu(){
        adminmenu.click();

    }
    public void clickadminmaneger() throws InterruptedException {
        Thread.sleep(3000);
        adminmaneger.click();
    }
    public void clickuserManagement(){
        userManagement.click();
    }
    public void clickEditButton(){
        editButton.click();
    }
    public void clickRoleUser(){
        Assert.assertTrue(roleUser.isDisplayed());
        roleUser.click();
    }
    public void clickRoleAdmin(){
        Assert.assertTrue(roleAdmin.isDisplayed());
        roleAdmin.click();
    }
    public void clickRoleEmployee(){
        Assert.assertTrue(roleEmployee.isDisplayed());
        roleEmployee.click();
    }

    public void clickRoleManager(){
        Assert.assertTrue(roleManager.isDisplayed());
        roleManager.click();
    }

    public void clickRoleCustomer(){
        Assert.assertTrue(roleCustomer.isDisplayed());
        roleCustomer.click();
    }
    public void clickSaveButton(){
        saveButton.click();
    }

    public void changeInput(){
        firstNameInput.clear();
        firstNameInput.sendKeys("huseyin");

    }
    public void clickDeleteButton(){
            deleteButton.click();

    }
  public void clickDeleteButton2()throws InterruptedException{
        Thread.sleep(5000);
        deleteButton2.click();
  }

  public void assertInternal(){
        Driver.wait(2);
        Assert.assertTrue(internalServerError.isDisplayed());
  }
  public void silmeSonrasiBasariliSilmeYazisi(){
        Assert.assertEquals("A user is deleted", internalServerError.getText());
  }


}
