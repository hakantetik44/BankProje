package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_011EsraKucukPage;
import pages.US_013EsraKucukPage;
import utilities.ConfigReader;
import utilities.DateUtil;
import utilities.Driver;

import java.util.List;

public class US_011EsraKucuk {
US_011EsraKucukPage gmiBankPage= new US_011EsraKucukPage();
US_013EsraKucukPage gmiBank13=new US_013EsraKucukPage();

Actions actions= new Actions(Driver.getDriver());

    @Given("Employee \"gmiBankUrl\"anasayfaya gider")
    public void employee_gmiBankUrl_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));



    }

    @Given("Signin butonunu tıklar")
    public void signin_butonunu_tıklar() {
        gmiBankPage.GMIBankLogin();
    }


    @Then("Username ve şifre ile giriş yapar")
    public void username_ve_şifre_ile_giriş_yapar() {
        gmiBankPage.gmibankUsernameKutusu.sendKeys(ConfigReader.getProperty("GMIBankValidUsername"));
        gmiBankPage.gmiBankPasswordKutusu.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));
        gmiBankPage.gmiBankSigInOkButonu.click();

    }
    @Then("My Operations butonuna tıklar")
    public void my_Operations_butonuna_tıklar() {
        gmiBankPage.myOperations.click();

    }
    @Then("Manage Customers butonuna tıklar")
    public void manage_Customers_butonuna_tıklar() {
        gmiBankPage.manageCustomers.click();

    }
    @Then("Create a new Customer butonuna tıklar")
    public void create_a_new_Customer_butonuna_tıklar() {
        gmiBankPage.createNewCustomer.click();

    }



    @Then("User dropdowndan kayıtlı bir kullanıcı adini sefer")
    public void user_dropdowndan_kayıtlı_bir_kullanıcı_adini_sefer() {
        Select select=new Select(gmiBankPage.selectUser);
        select.selectByIndex(2);

    }
    @Then("Account kısmından kayirli bir hesap adi secer")
    public void account_kısmından_kayirli_bir_hesap_adi_secer() {
        Select select=new Select(gmiBankPage.selectAccount);
        select.selectByIndex(2);

    }
    @Then("Zelle Enrolled kutucuğunu işaretler")
    public void zelle_Enrolled_kutucuğunu_işaretler() {
        gmiBankPage.zelleEnrolled.click();

    }
    @Then("Save butonuna tıklar")
    public void save_butonuna_tıklar() throws InterruptedException {
        gmiBankPage.saveButton.click();
        Thread.sleep(4000);
        Assert.assertTrue(gmiBankPage.internalServerError.isDisplayed());

    }


    @And("{string} kismina mevcut güncel tarihten daha eski bir tarih girilir")
    public void kisminaMevcutGüncelTarihtenDahaEskiBirTarihGirilir(String CreateDate) {
        gmiBankPage.createDate.sendKeys(CreateDate);

    }



    @And("Country dropdowndan ülke secilir")
    public void countryDropdowndanÜlkeSecilir() {
        Select select=new Select(gmiBankPage.selectCountry);
        select.selectByValue("24110");

    }

    @And("{string} {string}  {string} {string} {string} {string} {string} {string} {string}  {string} {string}  {string} bilgilerini girer")
    public void bilgileriniGirer(String Ssn, String FirstName, String LastName, String MiddleInitial, String Email, String MobilePhoneNumber, String PhoneNumber, String ZipCode, String Address, String City, String SsnIkinciGiris, String State) {

       gmiBankPage.searchSsn.sendKeys(Ssn);
       gmiBankPage.firstName.sendKeys(FirstName);
       gmiBankPage.lastName.sendKeys(LastName);
       gmiBankPage.middleInitial.sendKeys(MiddleInitial);
       gmiBankPage.eMail.sendKeys(Email);
       gmiBankPage.mobilePhone.sendKeys(MobilePhoneNumber);
       gmiBankPage.phoneNumber.sendKeys(PhoneNumber);
       gmiBankPage.zipCode.sendKeys(ZipCode);
       gmiBankPage.adress.sendKeys(Address);
       gmiBankPage.city.sendKeys(City);
       gmiBankPage.ssn1.sendKeys(SsnIkinciGiris);
       gmiBankPage.selectState.sendKeys(State);


    }



    @And("Kullanici bir tarih ay gün yil saat ve dakika olarak tarih girer")
    public void kullaniciBirTarihAyGünYilSaatVeDakikaOlarakTarihGirer() {

        gmiBankPage.createDate.sendKeys(US_011EsraKucukPage.todaysDateUS11());

    }

    @Then("Save butonuna tıklar ve beklenen sekliyle kayit yapildigini dogrular")
    public void saveButonunaTıklarVeBeklenenSekliyleKayitYapildiginiDogrular() {
        gmiBankPage.saveButton.click();
        Driver.wait(4);
        Assert.assertTrue(gmiBankPage.internalServerError.isDisplayed());
    }

    @And("User dropdown kismini bos birakir")
    public void userDropdownKisminiBosBirakir() {


    }

    @Given("kullanici Account kismindaki hesaplarin secilebilir oldugunu dogrular")
    public void kullaniciAccountKismindakiHesaplarinSecilebilirOldugunuDogrular() {
      actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
      Driver.wait(3);
        Select select=new Select(gmiBankPage.selectAccount);
      List<WebElement> listAccount= select.getOptions();
        for (WebElement E:listAccount) {
            Assert.assertTrue(E.isEnabled());


        }
    }

    @And("Zelle Enrolled kutucugunun secilebilir oldugu test edilir")
    public void zelleEnrolledKutucugununSecilebilirOlduguTestEdilir() {

        Assert.assertTrue(gmiBankPage.zelleEnrolled.isSelected());
    }

    @And("Manage Accounts butonuna tiklar")
    public void manageAccountsButonunaTiklar() {
        gmiBank13.manageAccount.click();
    }

    @And("Create a new Account butonuna tiklars")
    public void createANewAccountButonunaTiklars() {
        gmiBank13.createAccount.click();
    }

    @Given("Kullanici description bölümünü bos birakir ve bir alt bölümdeki balance kismina tiklar")
    public void kullaniciDescriptionBölümünüBosBirakirVeBirAltBölümdekiBalanceKisminaTiklar() {
        gmiBank13.description.sendKeys(""+Keys.ENTER);
        gmiBank13.balance.sendKeys("300"+Keys.TAB);
    }

    @And("Description alt kisminda {string} yazisinin göründügünü dogrular")
    public void descriptionAltKismindaYazisininGöründügünüDogrular(String field) {
      Driver.wait(3);
       String actualField= gmiBank13.descriptionRequiredField.getText();
        Assert.assertEquals(field,actualField);
    }



    @Given("Kullanici description kismina bir yazi girer")
    public void kullaniciDescriptionKisminaBirYaziGirer() {
        gmiBank13.description.sendKeys("transaktion for relatives"+ Keys.ENTER);
    }

    @When("Kullanici balance kismina dolar ibaresiyle birlikte bir miktar girmelidir")
    public void kullaniciBalanceKisminaDolarIbaresiyleBirlikteBirMiktarGirmelidir() {
        gmiBank13.balance.sendKeys("300 $"+Keys.ENTER);
    }

    @And("Kullanici Account Type dropdowndan bir hesap türü secer")
    public void kullaniciAccountTypeDropdowndanBirHesapTürüSecer() {
     Select select=new Select(gmiBank13.selectAccountType);
     select.selectByValue("SAVING");

    }

    @And("Kullanici Account Status Type dropdowndan bir statu secer")
    public void kullaniciAccountStatusTypeDropdowndanBirStatuSecer() {
        Select select=new Select(gmiBank13.accountStatusType);
        select.selectByValue("ACTIVE");

   }



    @And("Kullanici saves butonuna basar")
    public void kullaniciSavesButonunaBasar() {
        gmiBank13.saveButton.click();
    }

    @And("yapilan kayit sonucu dolar ibareli bir ücret kaydeldigi dogrulanir")
    public void yapilanKayitSonucuDolarIbareliBirÜcretKaydeldigiDogrulanir() {
        Assert.assertFalse("$ ibareli ücret kaydi yapilamiyor",gmiBank13.dolarSymbolAlert.isDisplayed());
    }

    @Given("Kullanici Account Type dropdownda yer alan hesaplarin secilebilir oldugunu dogrular")
    public void kullaniciAccountTypeDropdowndaYerAlanHesaplarinSecilebilirOldugunuDogrular() {

        Select select=new Select(gmiBank13.selectAccountType);
      List<WebElement> accountTypeList=  select.getOptions();
        boolean optionExists = false;
        for (WebElement e:accountTypeList) {
           if (e.isEnabled()){
               optionExists=true;
               break;

           }
        }
        Assert.assertTrue("Option x should exist", optionExists);
    }

    /*
    public void assertSelectedValue(String value)
    select = getSelect(mainSelect);
    List<WebElement> options = select.getOptions();
    boolean optionExists = false;
    for (WebElement e : options) {
        if (e.getText().equals(value)) {
           optionExists = true;
           break;
        }
    }
    assertTrue("Option x should exist", optionExists);
}
     */

    @Given("kullanici employee bölümünde calisan isimleri görüntülendigini dogrular")
    public void kullaniciEmployeeBölümündeCalisanIsimleriGörüntülendiginiDogrular() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select select=new Select(gmiBank13.selectEmployee);
      List<WebElement> liste=  select.getOptions();
      boolean optionExists=false;
        for (WebElement e: liste
             ) {
           if (e.getText().equals("username")){
               optionExists=true;
               break;

           }
        }
Assert.assertTrue("user name görünmeli ama görünmüyor", optionExists);
        Driver.wait(4);
    }

    @And("Kullanici createdate kismina gecerli güncel  {string} girer")
    public void kullaniciCreatedateKisminaGecerliGüncelGirer(String arg0) {
        Driver.wait(4);
        gmiBank13.createDate.sendKeys( US_011EsraKucukPage.todaysDateUS11());
    }

    @And("Kullanici closedate kismina gecerli güncel {string} girer")
    public void kullaniciClosedateKisminaGecerliGüncelGirer(String arg0) {
        Driver.wait(4);
        gmiBank13.createDate.sendKeys( US_011EsraKucukPage.todaysDateUS11());
    }

    @Then("Kullanici Sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();

    }
}
