package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.US_010ZeynepAkpinarPage;
import pages.US_016ZeynepAkpinarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_016ZeynepAkpinar {

    US_016ZeynepAkpinarPage zeynepAkpinarPage = new US_016ZeynepAkpinarPage();

    @Given("Kullanici {string} sayfasina giris yapar.")
    public void kullanici_sayfasina_giris_yapar(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
        Driver.wait(3);
    }

    @Given("Kullanici giris itemine tiklar.")
    public void kullanici_giris_itemine_tiklar() {
        zeynepAkpinarPage.item.click();
        Driver.wait(3);
        zeynepAkpinarPage.loginbutonu.click();
        Driver.wait(3);
    }

    @Given("Kullanici username kutusuna gecerli {string} girer.")
    public void kullanici_username_kutusuna_gecerli_girer(String username) {
        zeynepAkpinarPage.usernamekutusu.sendKeys(username);
        Driver.wait(3);
    }

    @Given("Kullanici password kutusuna gecerli {string} girer.")
    public void kullanici_password_kutusuna_gecerli_girer(String password) {
        zeynepAkpinarPage.passwordkutusu.sendKeys(password);
        Driver.wait(3);
        zeynepAkpinarPage.submitbutonu.click();
        Driver.wait(3);
    }

    @And("Kullanici My operation butonuna tıklar.")
    public void kullaniciMyOperationButonunaTiklar() {
        zeynepAkpinarPage.myoperationsbutonu.click();
        Driver.wait(3);
    }

    @And("Kullanici My accounts butonuna tiklar.")
    public void kullaniciMyAccountsButonunaTiklar() {
        zeynepAkpinarPage.myaccountsbutonu.click();
        Driver.wait(3);
    }

    @Given("Kullanici Customer Accounts sayfasinda kendisi için tanimlanan en az iki hesap turunu ve bakiyesini gormelidir.")
    public void kullanici_Customer_Accounts_sayfasinda_kendisi_için_tanimlanan_en_az_iki_hesap_turunu_ve_bakiyesini_gormelidir() {
        Assert.assertTrue(zeynepAkpinarPage.accounttype.isDisplayed());
        Driver.wait(2);
        Assert.assertTrue(zeynepAkpinarPage.accountbalance.isDisplayed());
        Driver.wait(2);
        Assert.assertTrue(zeynepAkpinarPage.typeid1.isDisplayed());
        Driver.wait(2);
        Assert.assertTrue(zeynepAkpinarPage.typeid2.isDisplayed());
    }


    @And("Kullanici Transfer Money butonuna tıklar.")
    public void kullaniciTransferMoneyButonunaTıklar() {
        zeynepAkpinarPage.transfermoneybutonu.click();
        Driver.wait(3);
    }

    @And("Kullanici From sekmesinden transfer yapacagi hesabi secebilmelidir.")
    public void kullaniciFromSekmesindenTransferYapacagiHesabiSecebilmelidir() {
        Assert.assertTrue(zeynepAkpinarPage.fromsekmesi.isDisplayed());
        zeynepAkpinarPage.fromsekmesi.click();
        Driver.wait(3);
        Assert.assertTrue(zeynepAkpinarPage.hesap1.isDisplayed());
        zeynepAkpinarPage.hesap1.click();
    }

    @And("Kullanici To sekmesinden transferin yapilacagi hesabi secebilmelidir.")
    public void kullaniciToSekmesindenTransferinYapilacagiHesabiSecebilmelidir() {
        Assert.assertTrue(zeynepAkpinarPage.tosekmesi.isDisplayed());
        zeynepAkpinarPage.tosekmesi.click();
        Driver.wait(3);
        Assert.assertTrue(zeynepAkpinarPage.hesapp2.isDisplayed());
        zeynepAkpinarPage.hesapp2.click();
    }

    @And("Kullanici Balance kutusuna transfer etmek istedigi {string}miktarini girer.")
    public void kullaniciBalanceKutusunaTransferEtmekIstedigiMiktariniGirer(String balance) {
        Assert.assertTrue(zeynepAkpinarPage.balancekutusu.isDisplayed());
        zeynepAkpinarPage.balancekutusu.click();
        Driver.wait(3);
        zeynepAkpinarPage.descriptionkutusu.click();
        Driver.wait(3);
        Assert.assertTrue(zeynepAkpinarPage.bosbırakılamazuyariyazisi.isDisplayed());
        Driver.wait(3);
        zeynepAkpinarPage.balancekutusu.sendKeys(balance);
        Driver.wait(3);

    }

    @And("Kullanici Description kutusuna transfer islemi icin {string} girer.")
    public void kullaniciDescriptionKutusunaTransferIslemiIcinGirer(String description) {
        Assert.assertTrue(zeynepAkpinarPage.descriptionkutusu.isDisplayed());
        zeynepAkpinarPage.descriptionkutusu.click();
        Driver.wait(3);
        zeynepAkpinarPage.balancekutusu.click();
        Driver.wait(3);
        Assert.assertTrue(zeynepAkpinarPage.bosbırakılamazuyariyazisi.isDisplayed());
        Driver.wait(3);
        zeynepAkpinarPage.descriptionkutusu.sendKeys(description);
        Driver.wait(3);
    }

    @And("Kullanici MakeTransfer butonuna tiklar.")
    public void kullaniciMakeTransferButonunaTiklar() {
        zeynepAkpinarPage.maketransferbutonu.click();
        Driver.wait(3);
    }

    @And("Kullanici paranin transfer edildigine dair basari mesajini gormelidir.")
    public void kullaniciParaninTransferEdildigineDairBasariMesajiniGormelidir() {
        Assert.assertTrue(zeynepAkpinarPage.transfergerceklestimesaji.isDisplayed());
    }

    @And("Kullanici paranin transfer edilemedigine dair uyari mesajini gormelidir.")
    public void kullaniciParaninTransferEdilemedigineDairUyariMesajiniGormelidir() {
        Assert.assertTrue(zeynepAkpinarPage.transfergerceklesemediuyarisi.isDisplayed());
    }


    @And("Kullanici Balance kutusuna transfer etmek istedigi para {string} miktarini girer.")
    public void kullaniciBalanceKutusunaTransferEtmekIstedigiParaMiktariniGirer(String balance) {
        zeynepAkpinarPage.balancekutusu.sendKeys(balance);

    }

    @And("Kullanici Description kutusuna transfer islemi icin aciklama {string}girer.")
    public void kullaniciDescriptionKutusunaTransferIslemiIcinAciklamaGirer(String description) {
        zeynepAkpinarPage.descriptionkutusu.sendKeys(description);
    }
}
