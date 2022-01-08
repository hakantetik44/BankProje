package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.US_001OnurEnesPage;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US_001OnurEnesCelik {
    US_001OnurEnesPage us1=new US_001OnurEnesPage();
    @Given("kullanici {string} sayfasina giris yapar")
    public void kullanici_sayfasina_giris_yapar(String bank) {
        Driver.getDriver().get(ConfigReader.getProperty(bank));
    }


    @Given("LogIn simgesi gorunur hale gelir ve tiklar")
    public void log_in_simgesi_gorunur_hale_gelir_ve_tiklar() {
        Assert.assertTrue("menu account button is not displayed",us1.menuAccount.isDisplayed());
        us1.menuAccount.click();
    }
    @Then("SignIn ve Register seceneklerini gorur ve Register secenegine tiklar")
    public void sign_in_ve_register_seceneklerini_gorur_ve_register_secenegine_tiklar() {
        Assert.assertTrue("sign In button is not displayed",us1.signInButton.isDisplayed());
        Assert.assertTrue("register button is not displayed",us1.registerButton.isDisplayed());
        us1.registerButton.click();
    }
    @Then("Acilan sayfanin Register oldugunu dogrular ve sayfadaki elementleri kontrol eder")
    public void acilan_sayfanin_register_oldugunu_dogrular_ve_sayfadaki_elementleri_kontrol_eder() {
        Assert.assertEquals("you are not on the registration page",ConfigReader.getProperty("registrationTitle"),us1.registerPageTitle.getText());
        List<String> actualTitle = new ArrayList<String>();
        List<String> expectedTitle = new ArrayList<String>(Arrays.asList("ssn","firstname","lastname","address","mobilephone","username","email","firstPassword","secondPassword"));
        for (int i = 1; i <= 9; i++) {
            //actualTitle.add(Driver.getDriver().findElement(By.xpath("(//div[@class='form-group'])[" + i + "]")).getText());
            actualTitle.add(Driver.getDriver().findElement(By.xpath("(//input[@class='is-untouched is-pristine av-invalid form-control'])[" + i + "]")).getAttribute("name"));
        }
        Assert.assertEquals("registration title is not contains",expectedTitle,actualTitle);
    }
    @Then("SSN box'a tiklar ve gecerli {string} bilgisini girer")
    public void ssn_box_a_tiklar_ve_gecerli_bilgisini_girer(String ssn) {
        us1.ssnBox.sendKeys(ssn);
        us1.firstNameBox.click();
        Assert.assertNotEquals("SSN box does not accept this number --> "+ssn+" ",ConfigReader.getProperty("validAtribute"),us1.ssnBox.getAttribute("class"));
    }
    @Then("First name box'a tiklar")
    public void first_name_box_a_tiklar() {
        us1.firstNameBox.click();
    }
    @Then("Kullanici first name box'a tiklar ve gecerli {string} bilgisini girer")
    public void kullanici_first_name_box_a_tiklar_ve_gecerli_bilgisini_girer(String name) {
        us1.firstNameBox.sendKeys(name);
        us1.lastNameBox.click();
        Assert.assertNotEquals("first name box does not accept this name --> "+name+" ",ConfigReader.getProperty("validAtribute"),us1.firstNameBox.getAttribute("class"));
    }
    @Then("Ardindan Last name box'a tiklar")
    public void ardindan_last_name_box_a_tiklar() {
        us1.lastNameBox.click();
    }
    @Then("Kullanici last name box'a tiklar ve gecerli {string} bilgisini girer")
    public void kullanici_last_name_box_a_tiklar_ve_gecerli_bilgisini_girer(String surname) {
        us1.lastNameBox.sendKeys(surname);
        us1.adressBox.click();
        Assert.assertNotEquals("last name box does not accept this surname --> "+surname+" ",ConfigReader.getProperty("validAtribute"),us1.lastNameBox.getAttribute("class"));
    }
    @Then("Ardindan Adress name box'a tiklar")
    public void ardindan_Adress_name_box_a_tiklar() {
        us1.adressBox.click();
    }
    @Then("Kullanici adress box'a tiklar ve gecerli adress bilgisini girer")
    public void kullanici_adress_box_a_tiklar_ve_gecerli_adress_bilgisini_girer() {
        for (int i = 0; i < 2; i++) {
            us1.adressBox.clear();
            Faker faker = new Faker();
            String adres=String.valueOf(faker.country().countryCode3());
            us1.adressBox.sendKeys(adres);
            us1.phoneNumberBox.click();
            Assert.assertNotEquals("Adress box does not accept this type -->" + adres + " ", ConfigReader.getProperty("validAtribute"), us1.adressBox.getAttribute("class"));
        }
    }
    @Then("Ardindan Phone number box'a tiklar")
    public void ardindan_Phone_number_box_a_tiklar() {
        us1.phoneNumberBox.click();
    }
    @And("Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formatinda gecerli  {string} bilgisini girer")
    public void kullaniciPhoneNumberBoxATiklarVeAaaAaaAaaaFormatindaGecerliBilgisiniGirer(String phone) {
        us1.phoneNumberBox.sendKeys(phone);
        us1.userNameBox.click();
        Assert.assertNotEquals("phone number box does not accept this type -->" + phone + " ", ConfigReader.getProperty("validAtribute"), us1.phoneNumberBox.getAttribute("class"));
    }
    @Then("Ardindan Username box'a tiklar")
    public void ardindan_Username_box_a_tiklar() {
        us1.userNameBox.click();
    }
    @And("Kullanici Username box'a tiklar ve gecerli {string} bilgisini girer")
    public void kullaniciUsernameBoxATiklarVeGecerliBilgisiniGirer(String username) {
        us1.userNameBox.sendKeys(username);
        us1.emailBox.click();
        Assert.assertNotEquals("phone number box does not accept this type -->" + username + " ",ConfigReader.getProperty("validAtribute"),us1.userNameBox.getAttribute("class"));
    }
    @Then("Ardindan Email box'a tiklar")
    public void ardindanEmailBoxATiklar() {
        us1.emailBox.click();
    }
    @And("Kullanici Email box'a tiklar ve gecerli email bilgisini girer")
    public void kullaniciEmailBoxATiklarVeGecerliEmailBilgisiniGirer() {
        for (int i = 0; i < 2; i++) {
            us1.emailBox.clear();
            Faker faker = new Faker();
            String mail = faker.internet().emailAddress();
            us1.emailBox.sendKeys(mail);
            us1.firstPasswordBox.click();
            Assert.assertNotEquals("Adress box does not accept this type -->" + mail + " ", ConfigReader.getProperty("validAtribute"), us1.emailBox.getAttribute("class"));
        }
    }
    @Then("Ardindan new password boxa tiklar")
    public void ardindanNewPasswordBoxaTiklar() {
        us1.firstPasswordBox.click();
        Driver.scrollToElement(us1.emailBox);
    }
    @And("Kullanici new password box'a tiklar ve gecerli {string} bilgisini girer")
    public void kullaniciNewPasswordBoxATiklarVeGecerliBilgisiniGirer(String password) {
        us1.firstPasswordBox.sendKeys(password);
        us1.secondPassword.click();
        Assert.assertNotEquals("New password box does not accept this type -->"+password+" ",ConfigReader.getProperty("validAtribute"),us1.firstPasswordBox.getAttribute("class"));
    }
    @Then("Ardindan new password confirmation box'a tiklar")
    public void ardindanNewPasswordConfirmationBoxATiklar() {
        us1.secondPassword.click();
    }
    @And("Kullanici new password confirmation box'a tiklar ve gecerli {string} bilgisini girer")
    public void kullaniciNewPasswordConfirmationBoxATiklarVeGecerliBilgisiniGirer(String secondPassword) {
        us1.secondPassword.sendKeys(secondPassword);
        us1.secondPassword.click();
        Assert.assertNotEquals("New password confirmation box does not accept this type -->"+secondPassword+" ",ConfigReader.getProperty("validAtribute"),us1.secondPassword.getAttribute("class"));
    }
    @Then("Ardindan new password  box'a tiklar")
    public void ardindanNewPasswordBoxATiklar() {
        us1.firstPasswordBox.click();
    }
    @And("Kullanici adress box'a tiklar ve gecerli adress bilgisi girer")
    public void kullaniciAdressBoxATiklarVeGecerliAdressBilgisiGirer() {
        Faker faker = new Faker();
        String adres=String.valueOf(faker.country().countryCode3());
        us1.adressBox.sendKeys(adres);
        us1.phoneNumberBox.click();
        Assert.assertNotEquals("Adress box does not accept this type -->" + adres + " ", ConfigReader.getProperty("validAtribute"), us1.adressBox.getAttribute("class"));
    }
    @And("Kullanici Email box'a tiklar ve gecerli email bilgisi girer")
    public void kullaniciEmailBoxATiklarVeGecerliEmailBilgisiGirer() {
        Faker faker = new Faker();
        String mail = faker.internet().emailAddress();
        us1.emailBox.sendKeys(mail);
        us1.firstPasswordBox.click();
        Assert.assertNotEquals("Adress box does not accept this type -->" + mail + " ", ConfigReader.getProperty("validAtribute"), us1.emailBox.getAttribute("class"));
    }
    @Then("Kullanici register butonuna click yapar")
    public void kullaniciRegisterButonunaClickYapar() {
        us1.confirmButton.click();
        Driver.wait(3);
        Assert.assertTrue("your information can not saved",us1.confirmMessage.getAttribute("class").contains("success"));
    }
}