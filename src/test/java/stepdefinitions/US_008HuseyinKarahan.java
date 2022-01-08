package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_007HuseyinKarahanPage;
import pages.US_008HüseyinKarahanPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_008HuseyinKarahan {

    US_007HuseyinKarahanPage huseyinKarahan = new US_007HuseyinKarahanPage();
    US_008HüseyinKarahanPage huseyinKarahan2 = new US_008HüseyinKarahanPage();

    @Given("Kullanici gmibank sayfasina gider")
    public void kullanici_gmibank_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));
    }

    @Given("Kullanici ana menudeki person Simgesine tiklar")
    public void kullanici_ana_menudeki_person_Simgesine_tiklar() {
        huseyinKarahan.clickSignIn();
    }

    @Given("Kullanici Sign in butonuna tiklar")
    public void kullanici_Sign_in_butonuna_tiklar() {
        huseyinKarahan.clickSignInButton();
    }

    @Given("Kullanici gecerli kullanici adini girer")
    public void kullanici_gecerli_kullanici_adini_girer() {
        huseyinKarahan.enterUsername();

    }

    @Given("Kullanici gecerli sifreyi girer")
    public void kullanici_gecerli_sifreyi_girer() {
        huseyinKarahan.enterPassword();

    }

    @Given("Kullanici oturum ac dugmesine Sign in e tiklar")
    public void kullanici_oturum_ac_dugmesine_Sign_in_e_tiklar() {
        huseyinKarahan.clickLoginButton();

    }

    @Given("Kullanici kullanici menusu simgesine tiklatir")
    public void kullanici_kullanici_menusu_simgesine_tiklatir() throws InterruptedException {
        huseyinKarahan.clickHesapMenu();

    }

    @Given("Kullanici password ikonuna  tiklar")
    public void kullanici_password_ikonuna_tiklar() {
        huseyinKarahan2.clickPasswordButton();
    }

    @Given("Kullanici mevcut sifreyi \\(currant password)  girer")
    public void kullanici_mevcut_sifreyi_currant_password_girer() {
        huseyinKarahan2.enterCurrentPassword();
    }

    @Given("Kullanici  gecerli yeni sifreyi girer")
    public void kullanici_gecerli_yeni_sifreyi_girer() {
        huseyinKarahan2.enterNewPassword();
        // Assert.assertTrue(huseyinKarahan2.redPasswordbutton.getAttribute("style").contains("rgb(255, 0, 0)"));
    }

    @Given("Kullanici yeni sifre onaylar.")
    public void kullanici_yeni_sifre_onaylar() {
        huseyinKarahan2.enterConfirmPassword();
    }

    @Given("Kullanici kaydet ikonuna tiklar.")
    public void kullanici_kaydet_ikonuna_tiklar() {
        huseyinKarahan2.SaveButtonTikla();
    }

    @Then("Kullanici sifrenin basariyla degistigini  gorur")
    public void kullanici_sifrenin_basariyla_degistigini_gorur() {

    }

    //===================================================================

    @Given("Kullanici Sifreyi Buyuk harf, kucuk harf, rakam, noktalama isaretleri, kullanarak olusturmali")
    public void kullanici_Sifreyi_Buyuk_harf_kucuk_harf_rakam_noktalama_isaretleri_kullanarak_olusturmali() {
        huseyinKarahan2.newPasswordKotrol();
    }

    @Given("Kullanici bir buyuk harf girer ve guvenlik seviye cubugunun  degistigini gorur.")
    public void kullanici_bir_buyuk_harf_girer_ve_guvenlik_seviye_cubugunun_degistigini_gorur() {
        huseyinKarahan2.redpasswordkontrol();
    }

}