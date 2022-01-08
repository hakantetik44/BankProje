package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import pages.US_011EsraKucukPage;
import pages.US_019BerrinKosePage;
import utilities.ConfigReader;
import utilities.DateUtil;
import utilities.Driver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class US_019BerrinKose {


    US_019BerrinKosePage us19_berrinKosePage = new US_019BerrinKosePage();


    @Given(": Kullanici oturum acmak icin admin sayfasina gider")
    public void kullaniciOturumAcmakIcinAdminSayfasinaGider() {
     Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));
        us19_berrinKosePage.accountMenu.click();
    }


    @Then("Kullanici login sayfasinda admin olarak oturum acar")
    public void kullaniciLoginSayfasindaAdminOlarakOturumAcar() {
        us19_berrinKosePage.signIn.click();

    }

    @And("Kullanici username kutusuna gecerli kullanici adini girer")
    public void kullaniciUsernameKutusunaGecerliKullaniciAdiniGirer() {
        us19_berrinKosePage.username.sendKeys(ConfigReader.getProperty("GMIBankValidUsername"));
    }

    @And("Kullanici password kutusunaa gecerli sifreyi girer")
    public void kullaniciPasswordKutusunaGecerliSifreyiGirer() {
        us19_berrinKosePage.password.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));
    }


    @And("Kullanici signin butonuna tiklar")
    public void kullaniciSigninButonunaTiklar() {
        us19_berrinKosePage.signinButton.click();
    }

    @Given("kullanici My Operations butonuna tiklar")
    public void kullaniciMyOperationsButonunaTiklar() {
        us19_berrinKosePage.myOperations.click();
    }

    @And("kullanici Manage Account butonuna tiklar")
    public void kullaniciManageAccountButonunaTiklar() {

        us19_berrinKosePage.manageAccounts.click();
    }

    @And("kullanici Create a new Account butonuna tiklar")
    public void kullaniciCreateANewAccountButonunaTiklar() {

        us19_berrinKosePage.newAccount.click();
    }

    @And("kullanici description kutusuna {string} yazar")
    public void kullaniciDescriptionKutusunaYazar(String arg0) {
        Driver.wait(2);
        us19_berrinKosePage.description.sendKeys("MyAccount002");
    }

    @And("kullanici balance kutusuna {string} yazar")
    public void kullaniciBalanceKutusunaYazar(String arg0) {
        us19_berrinKosePage.balance.sendKeys("550");
    }

    @And("kullanici Account Type Drop-down kutusundan {string} i secer")
    public void kullaniciAccountTypeDropDownKutusundanISecer(String arg0) {
        Select select = new Select(us19_berrinKosePage.accountType);
        select.selectByVisibleText("CREDIT_CARD");

    }

    @And("kullanici Account Status Type Drop-down kutusundan  {string}i secer")
    public void kullaniciAccountStatusTypeDropDownKutusundanISecer(String arg0) {
        Select select = new Select(us19_berrinKosePage.accountStatusType);
        select.selectByVisibleText("ACTIVE");
    }


    @And("kullanici Employee Drop-down kutusundan gecerli calisani secer")
    public void kullaniciEmployeeDropDownKutusundanGecerliCalisaniSecer() {
        Select select = new Select(us19_berrinKosePage.employee);
        select.selectByIndex(0);

    }

    @And("kullanici Save butonuna basar")
    public void kullaniciSaveButonunaBasar() {

        us19_berrinKosePage.saveButton.click();
    }

    @Then("verify transaction yazisini gorur")
    public void verifyTransactionYazisiniGorur() {
        Assert.assertTrue(us19_berrinKosePage.verifyTransactionYazisi.isDisplayed());
    }


}