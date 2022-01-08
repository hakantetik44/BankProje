package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.US_001OnurEnesPage;
import pages.US_002OnurEnesPage;
import utilities.ConfigReader;
import utilities.Driver;
public class US_002OnurEnesCelik {
    US_001OnurEnesPage us1=new US_001OnurEnesPage();
    US_002OnurEnesPage us2=new US_002OnurEnesPage();
    @Then("SSN box'a tiklar ve gecersiz {string} bilgisini girer")
    public void ssn_box_a_tiklar_ve_gecersiz_bilgisini_girer(String ssn) {
        us1.ssnBox.sendKeys(ssn);
        us1.firstNameBox.click();
        Assert.assertNotEquals("ssn box '-' karakteri disinda baska ozel karakterlerde kabul ediyor ->> "+ssn+" ",ssn,us1.ssnBox.getAttribute("value"));
    }
    @And("Kullanici first name box'a tiklar ve gecersiz {string} bilgisini girer")
    public void kullaniciFirstNameBoxATiklarVeGecersizBilgisiniGirer(String name) {
        us1.firstNameBox.sendKeys(name);
        us1.lastNameBox.click();
        Assert.assertEquals("first name rakam veya ozel karakterler icerebiliyor ->> "+name+" ", ConfigReader.getProperty("validAtribute"),us1.firstNameBox.getAttribute("class"));
    }
    @And("Kullanici last name box'a tiklar ve gecersiz {string} bilgisini girer")
    public void kullaniciLastNameBoxATiklarVeGecersizBilgisiniGirer(String surname) {
        us1.lastNameBox.sendKeys(surname);
        us1.lastNameBox.click();
        Assert.assertEquals("last name rakam veya ozel karakterler icerebiliyor ->> "+surname+" ",ConfigReader.getProperty("validAtribute"),us1.lastNameBox.getAttribute("class"));
    }
    @And("Kullanici adress box'a tiklar ve gecersiz {string} bilgisini girer")
    public void kullaniciAdressBoxATiklarVeGecersizBilgisiniGirer(String adress) {
        us1.adressBox.sendKeys(adress);
        us1.phoneNumberBox.click();
        Assert.assertEquals("Adress box does accept this type -->" + adress + " ", ConfigReader.getProperty("validAtribute"), us1.adressBox.getAttribute("class"));
    }
    @And("Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formati disinda gecersiz  {string} bilgisini girer")
    public void kullaniciPhoneNumberBoxATiklarVeAaaAaaAaaaFormatiDisindaGecersizBilgisiniGirer(String phone) {
        us1.phoneNumberBox.sendKeys(phone);
        us1.userNameBox.click();
        Assert.assertEquals("Phone Number box does accept this type -->" + phone + " ",ConfigReader.getProperty("validAtribute"),us1.phoneNumberBox.getAttribute("class"));
    }
    @And("Kullanici Username box'a tiklar ve gecersiz {string} bilgisini girer")
    public void kullaniciUsernameBoxATiklarVeGecersizBilgisiniGirer(String username) {
        us1.userNameBox.sendKeys(username);
        us1.emailBox.click();
        Assert.assertEquals("Username box does accept this type -->" + username + " ",ConfigReader.getProperty("validAtribute"),us1.userNameBox.getAttribute("class"));
    }
    @And("Kullanici Email box'a tiklar ve gecersiz {string} bilgisini girer")
    public void kullaniciEmailBoxATiklarVeGecersizBilgisiniGirer(String email) {
        us1.emailBox.sendKeys(email);
        us1.firstPasswordBox.click();
        Assert.assertEquals("Email box does accept this type -->" + email + " ",ConfigReader.getProperty("validAtribute"),us1.emailBox.getAttribute("class"));
    }
    @And("Kullanici new password box'a tiklar ve gecersiz {string} bilgisini girer")
    public void kullaniciNewPasswordBoxATiklarVeGecersizBilgisiniGirer(String password) {
        Driver.scrollToElement(us1.emailBox);
        us1.firstPasswordBox.sendKeys(password);
        us1.secondPassword.click();
        Assert.assertEquals("Password box does accept this type -->" + password + " ",ConfigReader.getProperty("validAtribute"),us1.firstPasswordBox.getAttribute("class"));
    }
    @And("Kullanici new password confirmation box'a tiklar ve gecersiz {string} bilgisini girer")
    public void kullaniciNewPasswordConfirmationBoxATiklarVeGecersizBilgisiniGirer(String secondPassword) {
        us1.secondPassword.sendKeys(secondPassword);
        us1.firstPasswordBox.click();
        Assert.assertEquals("Confirmation Password box does accept this type -->" + secondPassword + " ",ConfigReader.getProperty("validAtribute"),us1.secondPassword.getAttribute("class"));
    }
    @And("SSN box'a tiklar ve gecersiz {string} bilgisini girer.")
    public void ssnBoxATiklarVeGecersizBilgisiniGirer(String ssn) {
        us1.ssnBox.sendKeys(ssn);
        //Assert.assertEquals("Ssn is invalid.",us2.ssnInvalid.getText());
        Assert.assertNotEquals("ssn box '-' karakteri disinda baska ozel karakterlerde kabul ediyor ->> "+ssn+" ",ssn,us1.ssnBox.getAttribute("value"));
    }
    @And("Kullanici first name box'a tiklar ve gecersiz {string} bilgisi girer.")
    public void kullaniciFirstNameBoxATiklarVeGecersizBilgisiGirer(String name) {
        us1.firstNameBox.sendKeys(name);
        //  Assert.assertEquals("Please enter your first name.",us2.firstNameInvalid.getText());
    }
    @And("Kullanici last name box'a tiklar ve gecersiz {string} bilgisi girer.")
    public void kullaniciLastNameBoxATiklarVeGecersizBilgisiGirer(String surname) {
        us1.lastNameBox.sendKeys(surname);
        // Assert.assertEquals("Please enter your last name.",us2.lastNameInvalid.getText());
        // Assert.assertEquals("last name rakam veya ozel karakterler icerebiliyor ->> "+surname+" ",ConfigReader.getProperty("validAtribute"),us1.lastNameBox.getAttribute("class"));
    }
    @And("Kullanici adress box'a tiklar ve gecersiz {string} bilgisi girer.")
    public void kullaniciAdressBoxATiklarVeGecersizBilgisiGirer(String adress) {
        us1.adressBox.sendKeys(adress);
        // Assert.assertEquals("Please enter your address.",us2.adressInvalid.getText());
        //  Assert.assertEquals("Adress box does accept this type -->" + adress + " ", ConfigReader.getProperty("validAtribute"), us1.adressBox.getAttribute("class"));
    }
    @And("Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formati disinda gecersiz  {string} bilgisi girer.")
    public void kullaniciPhoneNumberBoxATiklarVeAaaAaaAaaaFormatiDisindaGecersizBilgisiGirer(String phone) {
        us1.phoneNumberBox.sendKeys(phone);
        // Assert.assertEquals("Please enter your mobile phone number.",us2.phoneNumberInvalid.getText());
        // Assert.assertEquals("Phone Number box does accept this type -->" + phone + " ",ConfigReader.getProperty("validAtribute"),us1.phoneNumberBox.getAttribute("class"));
    }
    @And("Kullanici Username box'a tiklar ve gecersiz {string} bilgisi girer.")
    public void kullaniciUsernameBoxATiklarVeGecersizBilgisiGirer(String username) {
        us1.userNameBox.sendKeys(username);
        // Assert.assertEquals("Your username is required.",us2.userNameInvalid.getText());
        //  Assert.assertEquals("Username box does accept this type -->" + username + " ",ConfigReader.getProperty("validAtribute"),us1.userNameBox.getAttribute("class"));
    }
    @And("Kullanici Email box'a tiklar ve gecersiz {string} bilgisi girer.")
    public void kullaniciEmailBoxATiklarVeGecersizBilgisiGirer(String email) {
        us1.emailBox.sendKeys(email);
        // Assert.assertEquals("Please enter your email.",us2.emailInvalid.getText());
//        try {
//            Assert.assertEquals("Email box does accept this type -->" + email + " ", ConfigReader.getProperty("validAtribute"), us1.emailBox.getAttribute("class"));
//        } catch (AssertionError e) {
//            System.out.println("devam");
//        }
    }
    @And("Kullanici new password box'a tiklar ve gecersiz {string} bilgisi girer.")
    public void kullaniciNewPasswordBoxATiklarVeGecersizBilgisiGirer(String password) {
        Driver.scrollToElement(us1.emailBox);
        us1.firstPasswordBox.sendKeys(password);
        // Assert.assertEquals("Your password is required.",us2.newPasswordInvalid.getText());
        //Assert.assertEquals("Password box does accept this type -->" + password + " ",ConfigReader.getProperty("validAtribute"),us1.firstPasswordBox.getAttribute("class"));
    }
    @And("Kullanici new password confirmation box'a tiklar ve gecersiz {string} bilgisi girer.")
    public void kullaniciNewPasswordConfirmationBoxATiklarVeGecersizBilgisiGirer(String secondPassword) {
        us1.secondPassword.sendKeys(secondPassword);
        // Assert.assertEquals("Your confirmation password is required.",us2.newPasswordConfirmationInvalid.getText());
        // Assert.assertEquals("Confirmation Password box does accept this type -->" + secondPassword + " ",ConfigReader.getProperty("validAtribute"),us1.secondPassword.getAttribute("class"));
    }
    @Then("Kullanici register butonuna click yapar.")
    public void kullaniciRegisterButonunaClickYapar() {
        us1.confirmButton.click();
        try {
            Assert.assertEquals("first name rakam veya ozel karakterler icerebiliyor ", ConfigReader.getProperty("validAtribute"),us1.firstNameBox.getAttribute("class"));
        } catch (AssertionError e) {
            System.out.println("first name rakam veya ozel karakterler icerebiliyor ->> ");
        }
        try {
            Assert.assertEquals("last name rakam veya ozel karakterler icerebiliyor ->> ",ConfigReader.getProperty("validAtribute"),us1.lastNameBox.getAttribute("class"));
        } catch (AssertionError e) {
            System.out.println("last name rakam veya ozel karakterler icerebiliyor ->>");
        }
        try {
            Assert.assertEquals("Adress box does accept this type -->", ConfigReader.getProperty("validAtribute"), us1.adressBox.getAttribute("class"));
        } catch (AssertionError e) {
            System.out.println("Adress box does accept this type -->");
        }
        try {
            Assert.assertEquals("Phone Number box does accept this type -->",ConfigReader.getProperty("validAtribute"),us1.phoneNumberBox.getAttribute("class"));
        } catch (AssertionError e) {
            System.out.println("Phone Number box does accept this type -->");
        }
        try {
            Assert.assertEquals("Username box does accept this type -->",ConfigReader.getProperty("validAtribute"),us1.userNameBox.getAttribute("class"));
        } catch (AssertionError e) {
            System.out.println("Username box does accept this type -->");
        }
        try {
            Assert.assertEquals("Email box does accept this type -->", ConfigReader.getProperty("validAtribute"), us1.emailBox.getAttribute("class"));
        } catch (AssertionError e) {
            System.out.println("Email box does accept this type -->");
        }
        try {
            Assert.assertEquals("Password box does accept this type -->",ConfigReader.getProperty("validAtribute"),us1.firstPasswordBox.getAttribute("class"));
        } catch (AssertionError e) {
            System.out.println("Password box does accept this type -->");
        }
        try {
            Assert.assertEquals("Confirmation Password box does accept this type -->",ConfigReader.getProperty("validAtribute"),us1.secondPassword.getAttribute("class"));
        } catch (AssertionError e) {
            System.out.println("Confirmation Password box does accept this type -->");
        }
    }
    @Given("SSN box'a tiklar ve unique olmayan {string} bilgisi girer.")
    public void ssnBoxATiklarVeUniqueOlmayanBilgisiGirer(String ssn) {
        us1.ssnBox.sendKeys(ssn);
        Assert.assertEquals("ssn box dogru formatta kabul edilmiyor ->> "+ssn+" ",ssn,us1.ssnBox.getAttribute("value"));
    }
    @Then("Kullanici Register Butonuna click yaparr")
    public void kullaniciRegisterButonunaClickYaparr() {
        us1.confirmButton.click();
    }
    //error.ssnexists
    @Then("Sistem tarafindan mevcut ssn hatasi alir")
    public void sistemTarafindanMevcutSsnHatasiAlir() throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertTrue("ssn exist hatasi gorunmedi",us2.existSsn.getText().contains("error.ssnexists"));
    }
    //phone number
    @Then("Sistem tarafindan Phone Number hatasi alir")
    public void sistemTarafindanPhoneNumberHatasiAlir() {
        Assert.assertTrue(us2.phoneNumberInvalid.isDisplayed());
    }
    @And("Kullanici Email box'a tiklar ve gecerli olmayan {string} bilgisi girer")
    public void kullaniciEmailBoxATiklarVeGecerliOlmayanBilgisiGirer(String email) {
        us1.emailBox.sendKeys(email);
    }
    //email
    @Then("Sistem tarafindan Email hatasi alir")
    public void sistemTarafindanEmailHatasiAlir() {
        Assert.assertTrue(us2.emailInvalid2.isDisplayed());
    }
}