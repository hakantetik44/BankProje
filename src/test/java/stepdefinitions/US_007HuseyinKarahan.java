package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_007HuseyinKarahanPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_007HuseyinKarahan {
    US_007HuseyinKarahanPage huseyinKarahan = new US_007HuseyinKarahanPage();

    @Given("Kullanici URL ye tiklayarak gmibank  sayfasina gider")
    public void kullanici_URL_ye_tiklayarak_gmibank_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));
    }


    @Given("Kullanici menu sayfasinda person simgesine tiklar")
    public void kullanici_menu_sayfasinda_person_simgesine_tiklar() {
        huseyinKarahan.clickSignIn();
    }

    @Given("Kullanici person simgesinin altinda ki sign in sign in a tiklar")
    public void kullanici_person_simgesinin_altinda_ki_sign_in_sign_in_a_tiklar() {
        huseyinKarahan.clickSignInButton();
    }

    @Given("Kullanici gecerli bir kullanici adi girer")
    public void kullanici_gecerli_bir_kullanici_adi_girer() {
        huseyinKarahan.enterUsername();
    }

    @Given("Kullanici gecerli bir sifre girer")
    public void kullanici_gecerli_bir_sifre_girer() {
        huseyinKarahan.enterPassword();
    }

    @Given("Kullanici oturum acmak icin sign in button una tiklar")
    public void kullanici_oturum_acmak_icin_sign_in_button_una_tiklar() {
        huseyinKarahan.clickLoginButton();
    }

    @Given("Kullanici Olusturdugu hesap menusune tiklar")
    public void kullanici_Olusturdugu_hesap_menusune_tiklar() throws InterruptedException {
        huseyinKarahan.clickHesapMenu();
        Thread.sleep(2000);
    }

    @Given("Kullanici Hesap menusunde iconuna tiklar")
    public void kullanici_Hesap_menusunde_iconuna_tiklar() {
        huseyinKarahan.clickUserInfo();
    }

    @Given("Kullanici yeni geceersiz @ ve . isareti olmadan e-posta adresini girer")
    public void kullanici_yeni_geceersiz_ve_isareti_olmadan_e_posta_adresini_girer() {
        huseyinKarahan.enterInvalidEmail();
    }

    @Given("Kullanici save basar")
    public void kullanici_save_basar() {
        huseyinKarahan.clickSaveButton();
    }

    @Given("Kullanici hata mesajini dogrular")
    public void kullanici_hata_mesajini_dogrular() {
        huseyinKarahan.confirmErrorMessage();
    }

    //==========================================================================================================

    @And("Kullanici Hesap menusunde user info iconuna tiklar")
    public void kullaniciHesapMenusundeUserInfoIconunaTiklar() {
        huseyinKarahan.clickUserInfo();
    }

    @Then("Kullanici cıkan dil seceneklerinde  turkce ve english oldugunu gorur raporlara ilave etmek isterse SS alir")
    public void kullaniciCikanDilSeceneklerindeTurkceVeEnglishOldugunuGorurRaporlaraIlaveEtmekIsterseSSAlir() {
        huseyinKarahan.selectLanguageConfirm();

    }
}
