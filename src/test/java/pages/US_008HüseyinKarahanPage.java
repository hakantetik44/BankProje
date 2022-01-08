package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US_008HüseyinKarahanPage {
    public US_008HüseyinKarahanPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPassword;

    @FindBy (id = "newPassword")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button/span[.='Save']")
    public WebElement kaydetButton;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement redPasswordbutton;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement OrangePasswordButton;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 255, 0);']")
    public WebElement yellowPasswordButton;

    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement greenPasswordButton;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement darkGreenPassword;

    public void clickPasswordButton(){
        passwordButton.click();
    }
    public void enterCurrentPassword(){
        currentPassword.sendKeys(ConfigReader.getProperty("CustomerPassword"));
    }

    public void enterNewPassword(){
        newPassword.sendKeys(ConfigReader.getProperty("Password"));
    }

    public void enterConfirmPassword(){
        confirmPassword.sendKeys(ConfigReader.getProperty("Password"));
    }

    public void SaveButtonTikla() {
        kaydetButton.click();
    }

    public void redpasswordkontrol(){
        newPassword.sendKeys(ConfigReader.getProperty("redpasswordControl"));


        Assert.assertTrue(redPasswordbutton.getAttribute("style").contains("rgb(255, 0, 0)"));
        Assert.assertTrue(OrangePasswordButton.getAttribute("style").contains("rgb(255, 153, 0)"));
        Assert.assertTrue(yellowPasswordButton.getAttribute("style").contains("rgb(255, 255, 0)"));
        Assert.assertTrue(greenPasswordButton.getAttribute("style").contains("rgb(153, 255, 0)"));
        Assert.assertTrue(darkGreenPassword.getAttribute("style").contains("rgb(0, 255, 0)"));

    }

    public void newPasswordKotrol(){
        //String newPassword = ConfigReader.getProperty("newPassword");
        //if(newPassword.contains(newPassword.toLowerCase()) && newPassword.contains(newPassword.toUpperCase())){
        //    System.out.println("true");
        // }
    }
}

