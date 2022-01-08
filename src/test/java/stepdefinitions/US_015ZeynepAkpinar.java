package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_015ZeynepAkpinarPage;
import utilities.Driver;

public class US_015ZeynepAkpinar {

    US_015ZeynepAkpinarPage zeynepAkpinarPage = new US_015ZeynepAkpinarPage();

    @When("Kullanici gmibank sayfasina gider ve basarili bir sekilde customer girisi yapar.")
    public void kullaniciGmibankSayfasinaGiderVeBasariliBirSekildeCustomerGirisiYapar() {
        zeynepAkpinarPage.GMIBankCustomerLogin();
        Driver.wait(3);
    }

    @When("Kullanici my accounts butonuna tiklar.")
    public void kullanici_my_accounts_butonuna_tiklar() {
        zeynepAkpinarPage.myaccountsbutonu.click();
        Driver.wait(3);
    }
    @When("Kullanici Customer Accounts sayfasini goruntuleyebilmelidir.")
    public void kullanici_Customer_Accounts_sayfasini_goruntuleyebilmelidir() {
        Assert.assertTrue(zeynepAkpinarPage.customeraccountbasligi.getText().contains("Customer Accounts"));
        Driver.wait(3);
    }

    @And("Kullanici account type kisimini goruntuleyebilmelidir.")
    public void kullaniciAccountTypeKisiminiGoruntuleyebilmelidir() {
        Assert.assertTrue(zeynepAkpinarPage.accounttypebasligi.getText().contains("Account Type"));
        Driver.wait(3);
    }

    @And("Kullanici account balance kisimini goruntuleyebilmelidir.")
    public void kullaniciAccountBalanceKisiminiGoruntuleyebilmelidir() {
        Assert.assertTrue(zeynepAkpinarPage.accountbalancebasligi.getText().contains("Account Balance"));
        Driver.wait(3);
    }


    @And("Kullanici hesap islemlerini gormek istedigi hesabin view transaction butonuna tiklar.")
    public void kullaniciHesapIslemleriniGormekIstedigiHesabinViewTransactionButonunaTiklar() {
        zeynepAkpinarPage.viewtransactionbuton1.click();
        Driver.wait(3);
        Assert.assertTrue(zeynepAkpinarPage.idbasligi.getText().contains("ID"));
        zeynepAkpinarPage.viewtransactionbuton2.click();
        Driver.wait(3);
    }

    @And("Kullanici description, date, amount, newbalance kisimlarini gorebilmelidir.")
    public void kullaniciDescriptionDateAmountNewbalanceKisimlariniGorebilmelidir() {
        Assert.assertTrue(zeynepAkpinarPage.descriptionbasligi.getText().contains("Description"));
        Driver.wait(3);
        Assert.assertTrue(zeynepAkpinarPage.datebasligi.getText().contains("Date"));
        Driver.wait(3);
        Assert.assertTrue(zeynepAkpinarPage.amountbasligi.getText().contains("Amount"));
        Driver.wait(3);
        Assert.assertTrue(zeynepAkpinarPage.newbalancebasligi.getText().contains("New Balance"));
    }
}
