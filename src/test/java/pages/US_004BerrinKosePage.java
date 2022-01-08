package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_004BerrinKosePage extends gmiBankPage {

    @FindBy(id = "account-menu")
    public WebElement accountmenu;

    @FindBy(id = "login-item")
    public WebElement login;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signinButton;

    @FindBy(xpath = "//*[@class='btn btn-secondary']")
    public WebElement cancelbutton;

    @FindBy(xpath="//div[@class='container-fluid view-container']")
    public WebElement anasayfa;

    @FindBy(xpath="//span[text()='Sign out']")
    public WebElement singoutbutonu;
}

