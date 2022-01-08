package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_006MuhammedYusufBuyukPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_006MuhammedYusufBuyuk {

    US_006MuhammedYusufBuyukPage page06 = new US_006MuhammedYusufBuyukPage();


    @Then("Kayıtlı bir Username bilgisini girer.")
    public void kayıtlı_bir_Username_bilgisini_girer() {
        page06.usernameBox.sendKeys("alikartal");
    }

    @Then("Kayıtlı bir password bilgisini girer.")
    public void kayıtlı_bir_password_bilgisini_girer() {
        page06.passwordBox.sendKeys("Ak123456+");

    }

    @Then("Singin ekranındaki sing in butonuna tıklar")
    public void singin_ekranındaki_sing_in_butonuna_tıklar() {
        page06.signInButton.click();
    }

    @Then("Ana sayfada sağ üstte bulunan user iconuna tıklar")
    public void ana_sayfada_sağ_üstte_bulunan_user_iconuna_tıklar() throws InterruptedException {
        Thread.sleep(1000);
        page06.kullaniciIconu.click();

    }

    @Then("user info linkine tıklanır.")
    public void user_info_linkine_tıklanır() {
        page06.userInfo.click();
    }


    @Then("Language dropbox ından türkçe dili seçilir ve kaydet butonuna basılır")
    public void language_dropbox_ından_türkçe_dili_seçilir_ve_kaydet_butonuna_basılır() {
        Select select=new Select(page06.langDropDown);
        select.selectByVisibleText("Türkçe");
        page06.saveButton.click();
        page06.ayarlarMesaji.isDisplayed();
        Select select1=new Select(page06.langDropDown);
        select1.selectByVisibleText("English");
        page06.kaydetButton.click();

    }

    @Then("First Name text box'ına farklı bir isim girilir ve kaydedilir")
    public void first_Name_text_box_ına_farklı_bir_isim_girilir_ve_kaydedilir() throws InterruptedException {

        Thread.sleep(3000);
        page06.firstNameTextBox.clear();
        page06.firstNameTextBox.sendKeys("ahmetttttttttttttt");
        page06.saveButton.click();
        Thread.sleep(3000);
        page06.firstNameTextBox.clear();
        page06.firstNameTextBox.sendKeys("ahmet");
        page06.saveButton.click();
    }

    @Then("Last Name text box'ına farklı bir isim girilir ve kaydedilir")
    public void last_Name_text_box_ına_farklı_bir_isim_girilir_ve_kaydedilir() throws InterruptedException {
        Thread.sleep(3000);
        page06.lasttNameTextBox.clear();
        page06.lasttNameTextBox.sendKeys("kayaaaaaaaaaaaaaa");
        page06.saveButton.click();
        Thread.sleep(3000);
        page06.lasttNameTextBox.clear();
        page06.lasttNameTextBox.sendKeys("kaya");
        page06.saveButton.click();

    }


    @Then("Email text box'ına farklı bir mail girilir ve kaydedilir")
    public void email_text_box_ına_farklı_bir_mail_girilir_ve_kaydedilir() {

        page06.resetEmailTextBox.sendKeys("ahmet@gmail.com");
    }

    @Then("{string}{string}{string} ve{string} bölümlerindeki kullanıcı bilgilerinin görünür olduğu kontrol edilir")
    public void veBölümlerindekiKullanıcıBilgilerininGörünürOlduğuKontrolEdilir(String first_name, String last_name, String email, String language) {

        Assert.assertEquals(first_name,page06.firstNameTextBox.getAttribute("value"));
        Assert.assertEquals(last_name, page06.lasttNameTextBox.getAttribute("value"));
        Assert.assertEquals(email,page06.emailTextBox.getAttribute("value"));
        Select select=new Select(page06.langDropDown);
        select.selectByVisibleText("English");
        Assert.assertEquals(language,page06.langDropDown.getAttribute("value"));
    }
}
