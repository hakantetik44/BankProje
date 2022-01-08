package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_018SunaKaplanhanPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_018SunaKaplanhan {

    US_018SunaKaplanhanPage us_018SunaKaplanhanPage = new US_018SunaKaplanhanPage();

    @When("US018 Admin  olarak Gmibank anasayfasina gider")
    public void us018_admin_olarak_gmibank_anasayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));
    }

    @When("US018 Giris butonuna tiklar")
    public void us018_giris_butonuna_tiklar() throws InterruptedException {
        us_018SunaKaplanhanPage.girisButonu.click();
        Thread.sleep(3000);

    }

    @When("US018 Sign in butonuna tiklar")
    public void us018_sign_in_butonuna_tiklar() throws InterruptedException {
        us_018SunaKaplanhanPage.ilkSignInButonu.click();
        Thread.sleep(3000);

    }

    @When("US018 Gecerli bir Adminusarname girer")
    public void us018_gecerli_bir_adminusarname_girer() {

        us_018SunaKaplanhanPage.username.sendKeys(ConfigReader.getProperty("GmiBankAdminUsername"));

    }

    @When("US018 Gecerli bir Adminpassword girer")
    public void us018_gecerli_bir_adminpassword_girer() {
        us_018SunaKaplanhanPage.password.sendKeys(ConfigReader.getProperty("GmiBankAdminPasswort"));

    }

    @When("US018 Sign in ekranindaki sign in butonuna tiklar")
    public void us018_sign_in_ekranindaki_sign_in_butonuna_tiklar() throws InterruptedException {
        us_018SunaKaplanhanPage.ikinciSignInButonu.click();
        Thread.sleep(2000);

    }

    @Then("US018 My Operations dropdown a tiklar")
    public void us018_my_operations_dropdown_a_tiklar() throws InterruptedException {
        us_018SunaKaplanhanPage.myOperations.click();
        Thread.sleep(2000);

    }

    @Then("US018 Manage Customers e tiklar")
    public void us018_manage_customers_e_tiklar() {

        us_018SunaKaplanhanPage.manageCustomers.click();
    }

    @Then("US018 Admin bu alana giris yetkisinin olmadigini gorur")
    public void us018_admin_bu_alana_giris_yetkisinin_olmadigini_gorur() {

        us_018SunaKaplanhanPage.adminNotAuthorizedYazisi.isDisplayed();

    }
    @When("US018 sayfayi kapatir")
    public void us018_sayfayi_kapatir() {

        Driver.closeDriver();
    }

    @When("US018 Admin Administration butonuna tiklar")
    public void us018_admin_administration_butonuna_tiklar() {

        us_018SunaKaplanhanPage.administrationMenu.click();

    }

    @Then("US018 Admin User Management butonuna tiklar")
    public void us018_admin_user_management_butonuna_tiklar() {
        us_018SunaKaplanhanPage.userManagement.click();

    }

    @Then("US018 View butonunun gorulebilirligini test eder")
    public void us018_view_butonunun_gorulebilirligini_test_eder() {

        Assert.assertTrue(us_018SunaKaplanhanPage.viewButonu.isDisplayed());

    }

    @Then("US018 View butonuna tiklar")
    public void us018_view_butonuna_tiklar() {

        us_018SunaKaplanhanPage.viewButonu.click();

    }

    @Then("US018 musteri bilgilerini gorur")
    public void us018_musteri_bilgilerini_gorur() {
        us_018SunaKaplanhanPage.kullaniciBilgileri.isDisplayed();

    }

    @Then("US018 musteri bilgileri sayfasinda Edit butonunu gorur")
    public void us018_musteri_bilgileri_sayfasinda_edit_butonunu_gorur() {

        Assert.assertFalse(us_018SunaKaplanhanPage.editButonuEnabled.contains("Edit"));

    }

    @Then("US018 Edit butonunun gorulebilirligini test eder")
    public void us018_edit_butonunun_gorulebilirligini_test_eder() {

        Assert.assertTrue(us_018SunaKaplanhanPage.editButonu.isDisplayed());

    }

    @Then("US018 Edit butonuna tiklar")
    public void us018_edit_butonuna_tiklar() {
        us_018SunaKaplanhanPage.editButonu.click();


    }

    @Then("US018 Admin onceden olusturulmus bir musteri bilgisinde degisiklik yapar")
    public void us018_admin_onceden_olusturulmus_bir_musteri_bilgisinde_degisiklik_yapar() throws InterruptedException {

        us_018SunaKaplanhanPage.EditFirstNameTextBox.clear();
        Thread.sleep(3000);
        us_018SunaKaplanhanPage.EditFirstNameTextBox.sendKeys("Reyhan");
        Thread.sleep(3000);


    }

    @Then("US018 Save butonuna tiklar")
    public void us018_save_butonuna_tiklar() {

        us_018SunaKaplanhanPage.EditSaveButton.click();

    }

    @Then("US018 basarili update yazisini gorur")
    public void us018_basarili_update_yazisini_gorur() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(us_018SunaKaplanhanPage.EditUpdateBasariliYazisi.isDisplayed());
        Thread.sleep(3000);


    }

    @Then("US018 Admin delete butonuna tiklar")
    public void us018_admin_delete_butonuna_tiklar() {

        us_018SunaKaplanhanPage.AdminUserManagementDeleteButonu.click();

    }

    @Then("US018 Admin silmeden once eminmisiniz yazisini gorur")
    public void us018_admin_silmeden_once_eminmisiniz_yazisini_gorur() throws InterruptedException {

        Thread.sleep(3000);
        us_018SunaKaplanhanPage.AdminUserManagementDeleteUyarıYazisi.isDisplayed();

    }


}




