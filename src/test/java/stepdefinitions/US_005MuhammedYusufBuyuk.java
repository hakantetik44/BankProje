package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_005MuhammedYusufBuyukPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_005MuhammedYusufBuyuk {

    US_005MuhammedYusufBuyukPage page05 = new US_005MuhammedYusufBuyukPage();

    @When("Kullanici GmiBank sayfasina gider")
    public void kullanici_GmiBank_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));
    }

    @Then("SignIn butonuna tiklar.")
    public void signin_butonuna_tiklar() {
        page05.accountIcon.click();
        page05.signIn.click();

    }

    @Then("Yanlis Username bilgilerini girer.")
    public void yanlis_Username_bilgilerini_girer() {
        page05.usernameBox.sendKeys("mehmet");
    }

    @Then("Dogru password bilgilerini girer.")
    public void dogru_password_bilgilerini_girer() {
        page05.passwordBox.sendKeys("Ak123456+");
    }

    @Then("Singin ekranındaki sing in butonuna tıklar ve hata mesajini kontrol eder")
    public void singin_ekranındaki_sing_in_butonuna_tıklar_ve_hata_mesajini_kontrol_eder() {
        page05.singInButton.click();
        page05.girisHataMesaji.isDisplayed();

    }

    @Then("Sayfayi kapatilir.")
    public void sayfayi_kapatilir() {
        Driver.closeDriver();

    }


    @Then("Dogru Username bilgilerini girer.")
    public void dogru_Username_bilgilerini_girer() {
        page05.usernameBox.sendKeys("ahmet");
    }

    @Then("Yanlis password bilgilerini girer.")
    public void yanlis_password_bilgilerini_girer() {
        page05.passwordBox.sendKeys("Mk123456+");
    }

    @Then("Did you forget your password? linkine tıklanır ve Reset your password sayfasina yönlendirdigini kontrol eder")
    public void did_you_forget_your_password_linkine_tıklanır_ve_Reset_your_password_sayfasina_yönlendirdigini_kontrol_eder() {
        page05.didYouForgetLinki.click();
        String actualURL=Driver.getDriver().getCurrentUrl();
        String expectedURL="https://www.gmibank.com/account/reset/request";
        Assert.assertEquals("Parola yenileme sayfasina yonlendirmedi",expectedURL,actualURL);

    }

    @Then("Email textbox'ına sisteme kayitli email adresi girilir")
    public void email_textbox_ına_sisteme_kayitli_email_adresi_girilir() {
        page05.resetEmailTextBox.sendKeys("ahmet@gmail.com");
    }

    @Then("Reset password butonuna tıklanmasi")
    public void reset_password_butonuna_tıklanmasi() throws InterruptedException {
        page05.resetEmailButton.click();
        Thread.sleep(1000);
        page05.checkEmailMesaji.isDisplayed();

    }

    @Then("Register a new account linkine tıklanir Registration sayfasina yönlendirdigini kontrol eder")
    public void register_a_new_account_linkine_tıklanir_Registration_sayfasina_yönlendirdigini_kontrol_eder() throws InterruptedException {

        Thread.sleep(1000);
        page05.RegisterEmailLinki.click();
        Thread.sleep(1000);
        String actualURL=Driver.getDriver().getCurrentUrl();
        String expectedURL="https://www.gmibank.com/account/register";
        Assert.assertEquals("Register sayfasina yonlendirmedi",expectedURL,actualURL);


    }



}
