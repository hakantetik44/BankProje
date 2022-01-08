package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US_007HuseyinKarahanPage {
      public US_007HuseyinKarahanPage() {
        PageFactory.initElements(Driver.getDriver(),this);
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

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement hesapMenu;

    @FindBy(xpath = "//span[.='User Info']")
    public WebElement userInfo;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement epostaInput;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    //@FindBy(xpath = "//div[@class='invalid-feedback']")

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement selectLanguage;

    @FindBy(xpath = "//option[@value='en']")
    public WebElement en;

    @FindBy(xpath = "//option[@value='tr']")
    public WebElement tr;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessage;





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
    public void clickHesapMenu()throws InterruptedException{
        Thread.sleep(2000);
        hesapMenu.click();
    }
    public void clickUserInfo(){
        userInfo.click();
    }
    public void enterInvalidEmail(){
        epostaInput.clear();
        epostaInput.sendKeys("gmibankproje");
    }
    public void clickSaveButton(){
        saveButton.click();
    }
    public void confirmErrorMessage(){
        if(errorMessage.getText().equals("This field is invalid")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
    public void selectLanguageConfirm(){
        selectLanguage.click();

        //Assert.assertEquals(en.getText(),"English");
        if (en.getText().equals("English")){
            System.out.println("PASS");
        }else {
            System.out.println("Fail");
        }


        //Assert.assertEquals(tr.getText(),"Türkçe");
        if (tr.getText().equals("Türkçe")){
            System.out.println("PASS");
        }else {
            System.out.println("Fail");
        }

    }
}

