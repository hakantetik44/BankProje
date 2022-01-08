package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_003BerrinKosePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_003BerrinKose {

    US_003BerrinKosePage us003BerrinKosePage=new US_003BerrinKosePage();
    @And("Kullanici bankasitesine gider")
    public void kullaniciBankasitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));

    }

    @Given("user butonuna tiklaraa")
    public void user_butonuna_tiklaraa() {

        us003BerrinKosePage.userButton.click();
    }

    @Given("registration sayfasina tiklaraa")
    public void registration_sayfasina_tiklaraa() {

        us003BerrinKosePage.registerButton.click();
    }

    @Given("Password kutusuna tiklaraa")
    public void password_kutusuna_tiklaraa() {

   us003BerrinKosePage.firstPassBox.click();
    }

    @Given("kullanici bir tane kucuk harfi password kutusuna girer")
    public void kullanici_bir_tane_kucuk_harfi_password_kutusuna_girer() {
    us003BerrinKosePage.firstPassBox.sendKeys(ConfigReader.getProperty("kucukharf"));

    }

    @Then("kullanici password strength renginin kirmizi oldugunu gorur")
    public void kullanici_password_strength_renginin_kirmizi_oldugunu_gorur() {

        Assert.assertTrue(us003BerrinKosePage.line1.isDisplayed());
    }

    @Given("kullanici bir tane buyuk harfi onceki sifrenin ardindan  password kutusuna girer")
    public void kullanici_bir_tane_buyuk_harfi_onceki_sifrenin_ardindan_password_kutusuna_girer() {
        us003BerrinKosePage.firstPassBox.sendKeys(ConfigReader.getProperty("ikincigirilensifre"));
    }
    @Then("kullanici password strength renginin turuncu oldugunu gorur")
    public void kullanici_password_strength_renginin_turuncu_oldugunu_gorur() {
        Assert.assertTrue(us003BerrinKosePage.line2.isDisplayed());
    }
    @Given("kullanici bir tane rakami onceki sifrenin ardindan password kutusuna girer")
    public void kullanici_bir_tane_rakami_onceki_sifrenin_ardindan_password_kutusuna_girer() {
        us003BerrinKosePage.firstPassBox.sendKeys(ConfigReader.getProperty("ucuncugirilensifre"));
    }
    @Then("kullanici password strength renginin sari oldugunu gorur")
    public void kullanici_password_strength_renginin_sari_oldugunu_gorur() {
        Assert.assertTrue(us003BerrinKosePage.line3.isDisplayed());
    }

    @Given("kullanici bir tane ozel karakteri onceki sifrenin ardindan password kutusuna girer")
    public void kullanici_bir_tane_ozel_karakteri_onceki_sifrenin_ardindan_password_kutusuna_girer() {
        us003BerrinKosePage.firstPassBox.sendKeys(ConfigReader.getProperty("dorduncugirilensifre"));
    }
    @Then("kullanici password strength renginin acik yesil oldugunu gorur")
    public void kullanici_password_strength_renginin_acik_yesil_oldugunu_gorur() {
        Assert.assertTrue(us003BerrinKosePage.line4.isDisplayed());
    }

    @Given("Kullanici sifresini {int} karaktere tamamladiginda Password Strengh renginin koyu yesile dondugunu gorur.")
    public void Kullanici_sifresini_karaktere_tamamladiginda_password_strengh_renginin_koyu_yesile_dondugunu_gorur(Integer int1) {
        us003BerrinKosePage.firstPassBox.sendKeys(ConfigReader.getProperty("sifrenintamami"));

    }
    @Given("Kullanici sifresini {int} karaktere tamamlar")
    public void kullanici_sifresini_karaktere_tamamlar(Integer int1) {
        Assert.assertTrue(us003BerrinKosePage.line5.isDisplayed());
    }
    @Given("Kullanici confirmation textbox kutusuna tiklar")
    public void kullanici_confirmation_textbox_kutusuna_tiklar() {
   us003BerrinKosePage.secondPassBox.click();
    }
    @Then("kullanici confirmation textbox kutusuna {int} karakterden olusan sifreyi girer")
    public void kullanici_confirmation_textbox_kutusuna_karakterden_olusan_sifreyi_girer(Integer int1) {
    us003BerrinKosePage.secondPassBox.sendKeys("sifrenintamami");
    }


}
