package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.jsoup.helper.DataUtil;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_014SunaKaplanhanPage;
import utilities.ConfigReader;
import utilities.Driver;


public class US_014SunaKaplanhan {
    US_014SunaKaplanhanPage us_014SunaKaplanhanpage=new US_014SunaKaplanhanPage();

    @When("kullanici Gmibank anasayfasina gider")
    public void kullanici_gmibank_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));

    }

    @When("Giris butonunaa tiklar")
    public void giris_butonunaa_tiklar() {
        us_014SunaKaplanhanpage.girisButonu.click();
    }

    @When("Sign in butonunaa tiklar")
    public void sign_in_butonunaa_tiklar() {
        us_014SunaKaplanhanpage.ilkSignInButonu.click();

    }

    @When("Gecerli bir usarnamee girer")
    public void gecerli_bir_usarnamee_girer() {
        us_014SunaKaplanhanpage.username.sendKeys(ConfigReader.getProperty("GMIBankValidUsername"));
    }

    @When("Gecerli bir passwordd girer")
    public void gecerli_bir_passwordd_girer() {
        us_014SunaKaplanhanpage.password.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));
    }

    @When("Sign in ekranindaki sign in butonunaa tiklar")
    public void sign_in_ekranindaki_sign_in_butonunaa_tiklar() {
        us_014SunaKaplanhanpage.ikinciSignInButonu.click();

    }

    @Then("My Operations dropdownn a tiklar")
    public void my_operations_dropdownn_a_tiklar() {
        us_014SunaKaplanhanpage.myOperations.click();

    }

    @Then("My Accounts secerr ve tiklar")
    public void my_accounts_secerr_ve_tiklar() {
        us_014SunaKaplanhanpage.manageAccounts.click();

    }

    @Then("Create anew Account butonunaa tiklar")
    public void create_anew_account_butonunaa_tiklar() {

        us_014SunaKaplanhanpage.createAccount.click();
    }

    @Then("Description text boxx i doldurulur")
    public void description_text_boxx_i_doldurulur() {

        us_014SunaKaplanhanpage.descriptionKutusu.sendKeys(ConfigReader.getProperty("AccountDescription"));

    }

    @Then("Balance textt Box i doldurulur")
    public void balance_textt_box_i_doldurulur() {
        us_014SunaKaplanhanpage.balanceKutusu.sendKeys(ConfigReader.getProperty("Balance"));

    }

    @Then("Account Type dropdowndann bir hesap tipi secilir")
    public void account_type_dropdowndann_bir_hesap_tipi_secilir() {

        Select select=new Select(us_014SunaKaplanhanpage.accountTypeDropDown);
        select.selectByVisibleText("INVESTING");
    }

    @Then("Account Status Type Dropdown dan bir hesapp statu tipi secilir")
    public void account_status_type_dropdown_dan_bir_hesapp_statu_tipi_secilir() {

        Select select=new Select(us_014SunaKaplanhanpage.accountStatusTypeDropDown);
        select.selectByVisibleText("SUESPENDED");

    }

    @Then("Create date box undan hesabin olusturuldugu tarihtenn onceki  bir tarih girilir")
    public void create_date_box_undan_hesabin_olusturuldugu_tarihtenn_onceki_bir_tarih_girilir() {
        us_014SunaKaplanhanpage.createDate.sendKeys(ConfigReader.getProperty("CreateErkenDate")+ Keys.TAB + ConfigReader.getProperty("CreateErkenTime"));

    }

    @Then("Closed date box una bir tarihh girilir")
    public void closed_date_box_una_bir_tarihh_girilir() {
        us_014SunaKaplanhanpage.closedDate.sendKeys(ConfigReader.getProperty("ClosedErkenDate")+ Keys.TAB + ConfigReader.getProperty("ClosedErkenTime"));

    }

    @Then("Savee butonunaa tiklar")
    public void savee_butonunaa_tiklar() {
        us_014SunaKaplanhanpage.saveButonu.click();

    }

    @Then("kayitt yapilamadigini gorur")
    public void kayitt_yapilamadigini_gorur() {

        Assert.assertTrue(us_014SunaKaplanhanpage.basariliKayitElementi.isDisplayed());

        //Bu adimda Bug var

    }
    @Then("sayfayi kapatirr")
    public void sayfayi_kapatirr() {
        Driver.closeDriver();

    }
    @Then("Create date box una hesabin olusturuldugu tarihle ayni tarih  girilir")
    public void create_date_box_una_hesabin_olusturuldugu_tarihle_ayni_tarih_girilir() {
        us_014SunaKaplanhanpage.createDate.sendKeys(ConfigReader.getProperty("CreateGuncelDate")+ Keys.TAB + ConfigReader.getProperty("CreateGuncelTime"));

    }
    @Then("Closed date box una hesabin olusturuldugu tarihe uygun bir tarih girilir")
    public void closed_date_box_una_hesabin_olusturuldugu_tarihe_uygun_bir_tarih_girilir() {
        us_014SunaKaplanhanpage.closedDate.sendKeys(ConfigReader.getProperty("ClosedGuncelDate")+ Keys.TAB + ConfigReader.getProperty("ClosedGuncelTime"));

    }
    @Then("kayit yapilabildigini gorur")
    public void kayit_yapilabildigini_gorur() {
        Assert.assertTrue(us_014SunaKaplanhanpage.basariliKayitElementi.isDisplayed());

    }

    @Then("Create date box una herhangi bir data girilmez")
    public void create_date_box_una_herhangi_bir_data_girilmez() {
        us_014SunaKaplanhanpage.createDate.clear();
    }
    @Then("Closed date box una herhangi bir data girilmez")
    public void closed_date_box_una_herhangi_bir_data_girilmez() {
        us_014SunaKaplanhanpage.closedDate.clear();

    }
    @Then("Create date box una gün,ay, yıl, saat ve dakika formatinda tarih girilir")
    public void create_date_box_una_gün_ay_yıl_saat_ve_dakika_formatinda_tarih_girilir() throws InterruptedException {
        us_014SunaKaplanhanpage.createDate.sendKeys("22/12/2021" + Keys.TAB + "15:59");
        Thread.sleep(2000);
        String actualDate = us_014SunaKaplanhanpage.createDate.getAttribute("value");
        System.out.println(actualDate);
        String expectedDAte = "2021-12-22T15:59";


    }
    @Then("Closed date box una gün,ay, yıl, saat ve dakika formatinda tarih girilir")
    public void closed_date_box_una_gün_ay_yıl_saat_ve_dakika_formatinda_tarih_girilir() throws InterruptedException {
        us_014SunaKaplanhanpage.createDate.sendKeys("22/12/2026" + Keys.TAB + "15:59");
        Thread.sleep(2000);
        String actualDate = us_014SunaKaplanhanpage.createDate.getAttribute("value");
        System.out.println(actualDate);
        String expectedDAte = "2026-12-22T15:59";

    }
    @Then("Kullanıcı Employee dropdown'ından bir employee seçer")
    public void kullanıcı_employee_dropdown_ından_bir_employee_seçer() {
        Select select=new Select(us_014SunaKaplanhanpage.employeeDropDown);
        select.getFirstSelectedOption();


    }

    @Then("kayit yapilamadigini gorur")
    public void kayitYapilamadiginiGorur() {
        Assert.assertFalse(us_014SunaKaplanhanpage.employeeDropDown.isSelected());
    }
}
