package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US_017HuseyinKarahanPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US_017HuseyinKarahan {
US_017HuseyinKarahanPage huseyinKarahan=new US_017HuseyinKarahanPage();

    @Given("Huseyin admin gmibank sayfasina  gider")
    public void huseyin_admin_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));
    }

    @Given("Huseyin menu  sayfasindaki person  simgesine tiklar")
    public void huseyin_menu_sayfasindaki_person_simgesine_tiklar() {
            huseyinKarahan.clickSignIn();
        }

    @Given("Huseyin sign in baglantisina tiklar")
    public void huseyin_sign_in_baglantisina_tiklar() {
         huseyinKarahan.clickSignInButton();

    }
    @Given("Huseyin acilan sayfadan username kutusuna gecerli bir kullanici adi yazar")
    public void huseyin_acilan_sayfadan_username_kutusuna_gecerli_bir_kullanici_adi_yazar() {
           huseyinKarahan.enterUsername();

    }
    @Given("Huseyin acilan sayfadan password  kutusuna gecerli bir sifre yazar")
    public void huseyin_acilan_sayfadan_password_kutusuna_gecerli_bir_sifre_yazar() {
             huseyinKarahan.enterPassword();
    }
    @Given("Huseyin sign in buttonuna tiklar")
    public void huseyin_sign_in_buttonuna_tiklar(){
            huseyinKarahan.clickLoginButton();
    }
    @Given("Huseyin acilan sayfadan administration buttonuna  tiklar")
    public void huseyin_acilan_sayfadan_administration_buttonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        huseyinKarahan.clickadminmaneger();


    }
    @Given("Huseyin menuden user manegment baglantisina tiklar")
    public void huseyin_menuden_user_manegment_baglantisina_tiklar() {
        //huseyinKarahan.clickadminmaneger();
        huseyinKarahan.clickuserManagement();
    }
    @When("Huseyin acilan sayfadan kayitli kullanicilardan herhangi birinin  edit buttonuna  tiklar")
    public void huseyin_acilan_sayfadan_kayitli_kullanicilardan_herhangi_birinin_edit_buttonuna_tiklar() {
           huseyinKarahan.clickEditButton();
    }
    @Given("Huseyin profillerden {string}, {string},{string},{string} seceneklerinden birisini secebilir")
    public void huseyin_profillerden_seceneklerinden_birisini_secebilir(String profil1, String profil2, String profil3, String profil4) {
         if(profil1.equals("user")){
           huseyinKarahan.clickRoleUser();
            System.out.println("true");
        }else{
            System.out.println("error");
        }
    }
    @Given("Huseyin Save buttonuna tiklar")
    public void huseyin_Save_buttonuna_tiklar() {
//huseyinKarahan.clickSaveButton();
    }
    @Given("Huseyin Kullanici bilgilerine ulastigini dogrular")
    public void huseyin_Kullanici_bilgilerine_ulastigini_dogrular() {
    //    huseyinKarahan.assertInternal();

    }


    @Given("Huseyin admin kayitli kisinin profil böümünde {string}, {string},{string},{string} ün görülebilir oldugunu dogrular")
    public void huseyin_admin_kayitli_kisinin_profil_bolumunde_un_gorulebilir_oldugunu_dogrular(String string, String string2, String string3, String string4) {
        {
            Select select=new Select(huseyinKarahan.selectProfil);
            List<WebElement> listAccount= select.getOptions();
            for (WebElement E:listAccount)
                Assert.assertTrue(E.isDisplayed());

        }

    }
    @Given("Huseyin  Sayfayi kapatir")
    public void huseyin_Sayfayi_kapatir() {
        //Driver.closeDriver();

    }
    @Given("Huseyin Acilan sayfada kullanicilardan birinin ismini degistirir")
    public void huseyin_Acilan_sayfada_kullanicilardan_birinin_ismini_degistirir() {
        huseyinKarahan.changeInput();


    }
    @Given("Huseyin Save buttonuna basar")
    public void huseyin_Save_buttonuna_basar() throws InterruptedException{
        Thread.sleep(5000);
        huseyinKarahan.clickSaveButton();

    }
    @Given("Huseyin Degisikligin gerceklestigini dogrular")
    public void huseyin_Degisikligin_gerceklestigini_dogrular() {
        huseyinKarahan.assertInternal();

    }
    @Given("Huseyin Kullanicilardan bir manager secer ve sil buttonuna tiklar")
    public void huseyin_Kullanicilardan_bir_manager_secer_ve_sil_buttonuna_tiklar() {
      huseyinKarahan.clickDeleteButton();

    }
    @Given("Huseyin silme islemini onayla butonuna tiklar")
    public void huseyin_silme_islemini_onayla_butonuna_tiklar() throws InterruptedException {
        huseyinKarahan.clickDeleteButton2();
    }
    @Given("Huseyin silme isleminin onaylandigi yazisini gorur")
    public void huseyin_silme_isleminin_onaylandigi_yazisini_gorur() {
        huseyinKarahan.silmeSonrasiBasariliSilmeYazisi();

    }

    @Given("Huseyin Kullanicilardan admin secer ve kullanicilardan birinin edit buttonuna tiklar")
    public void huseyinKullanicilardanAdminSecerVeKullanicilardanBirininEditButtonunaTiklar() {
                huseyinKarahan.clickEditButton();
    }
    @Given("Huseyin profillerden {string} secenegini secer")
    public void huseyin_profillerden_secenegini_secer(String profil){
        switch (profil){
            case "user":
                huseyinKarahan.clickRoleUser();
                huseyinKarahan.clickSaveButton();
                huseyinKarahan.assertInternal();
                Driver.closeDriver();
                break;
            case "employee":
                huseyinKarahan.clickRoleEmployee();
                huseyinKarahan.clickSaveButton();
                huseyinKarahan.assertInternal();
                Driver.closeDriver();
                break;
            case "manager":
                huseyinKarahan.clickRoleManager();
                huseyinKarahan.clickSaveButton();
                huseyinKarahan.assertInternal();
                Driver.closeDriver();
                break;
            case "admin":
                huseyinKarahan.clickRoleAdmin();
                huseyinKarahan.clickSaveButton();

                Driver.closeDriver();
                break;
            case "customer":
                huseyinKarahan.clickRoleCustomer();
                huseyinKarahan.clickSaveButton();
                huseyinKarahan.assertInternal();
                Driver.closeDriver();
                break;
        }
    }
}
