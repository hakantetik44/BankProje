package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_003BerrinKosePage extends gmiBankPage {

    @FindBy(id = "account-menu")
    public WebElement userButton;
    @FindBy (xpath = "//*[.='Register']")
    public WebElement registerButton;
    @FindBy (id = "firstPassword")
    public WebElement firstPassBox;
    @FindBy (xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement messageUnderTextBox;
    @FindBy (id = "secondPassword")
    public WebElement secondPassBox;
    @FindBy (xpath = "(//li[@class='point'])[1]")
    public WebElement line1;
    @FindBy (xpath = "(//li[@class='point'])[2]")
    public WebElement line2;
    @FindBy (xpath = "(//li[@class='point'])[3]")
    public WebElement line3;
    @FindBy (xpath = "(//li[@class='point'])[4]")
    public WebElement line4;
    @FindBy (xpath = "(//li[@class='point'])[5]")
    public WebElement line5;
}

