package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_010ZeynepAkpinarPage;
import utilities.Driver;

public class US_010ZeynepAkpinar {

    US_010ZeynepAkpinarPage zeynepAkpinarPage = new US_010ZeynepAkpinarPage();

    Faker faker=new Faker();

    @When("Kullanici gmibank sayfasina gider ve basarili bir sekilde employee girisi yapar.")
    public void kullaniciGmibankSayfasinaGiderVeBasariliBirSekildeEmployeeGirisiYapar() {
        zeynepAkpinarPage.GMIBankEmployeeLogin();
        Driver.wait(3);
    }


    @Then("Kullanici my operation butonuna tıklar.")
    public void kullanici_my_operation_butonuna_tıklar() {
        zeynepAkpinarPage.myoperationsbutonu.click();
        Driver.wait(3);
    }

    @Then("Kullanici manage customers butonuna tıklar.")
    public void kullanici_manage_customers_butonuna_tıklar() {
        zeynepAkpinarPage.managecustomerbutonu.click();
        Driver.wait(3);
    }

    @Then("Kullanici create a new customers butonuna tıklar.")
    public void kullanici_create_a_new_customers_butonuna_tıklar() {
        zeynepAkpinarPage.newcustomerbutonu.click();
        Driver.wait(3);
    }

    @And("Kullanici address girmezse hata mesaji gormelidir.")
    public void kullaniciAddressGirmezseHataMesajiGormelidir() {
        zeynepAkpinarPage.addresskutusu.click();
        zeynepAkpinarPage.citykutusu.click();
        Assert.assertTrue(zeynepAkpinarPage.bosbırakılamazuyariyazisi.isDisplayed());
        Driver.wait(3);
    }

    @And("Kullanici address girer.")
    public void kullaniciAddressGirer() {
        zeynepAkpinarPage.addresskutusu.sendKeys(faker.address().fullAddress());
    }


    @And("Kullanici city girmezse hata mesaji gormelidir.")
    public void kullaniciCityGirmezseHataMesajiGormelidir() {
        zeynepAkpinarPage.citykutusu.click();
        zeynepAkpinarPage.addresskutusu.click();
        Assert.assertTrue(zeynepAkpinarPage.bosbırakılamazuyariyazisi.isDisplayed());
        Driver.wait(3);

    }

    @And("Kullanici city girer.")
    public void kullaniciCityGirer() {
        zeynepAkpinarPage.citykutusu.sendKeys(faker.address().city());
    }

    @And("Kullanici country secebilmelidir.")
    public void kullaniciCountrySecebilmelidir() {
        Select select = new Select(zeynepAkpinarPage.countrydropdown);
        zeynepAkpinarPage.countrydropdown.click();
        select.selectByIndex(3);
    }

    @And("Kullanici country secmezse hata mesaji gormelidir.")
    public void kullaniciCountrySecmezseHataMesajiGormelidir() {
        Select select = new Select(zeynepAkpinarPage.countrydropdown);
        zeynepAkpinarPage.countrydropdown.click();
        select.selectByIndex(0);
        Assert.assertTrue(zeynepAkpinarPage.bosbırakılamazuyariyazisi.isDisplayed());
    }

    @When("Kullanici country olarak USA secmis ise state testboxa state girmelidir.")
    public void kullanici_country_olarak_USA_secmis_ise_state_testboxa_state_girmelidir() {
        Select select = new Select(zeynepAkpinarPage.countrydropdown);
        zeynepAkpinarPage.countrydropdown.click();
        select.selectByIndex(71);
        Driver.wait(3);
        zeynepAkpinarPage.statekutusu.sendKeys(faker.address().state());
        Driver.wait(3);
    }

    @When("Kullanici county olarak USA disinda bir sey secti ise state textbox a tiklayamamalidir.")
    public void kullanici_county_olarak_USA_disinda_bir_sey_secti_ise_state_textbox_a_tiklayamamalidir() {
        Select select = new Select(zeynepAkpinarPage.countrydropdown);
        zeynepAkpinarPage.countrydropdown.click();
        select.selectByIndex(7);
        Driver.wait(3);
        Assert.assertFalse("state secilebiliyor",zeynepAkpinarPage.statekutusu.isSelected());

    }

    @When("Kullanici state girmezse hata mesaji almalidir.")
    public void kullanici_state_girmezse_hata_mesaji_almalidir() {
        zeynepAkpinarPage.statekutusu.clear();
        zeynepAkpinarPage.accountyazisi.click();
        Assert.assertTrue(zeynepAkpinarPage.bosbırakılamazuyariyazisi.isDisplayed());
    }


    @Then("ve sayfa kapanir.")
    public void veSayfaKapanir() {
        Driver.closeDriver();
    }
}
