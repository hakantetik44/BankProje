package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.US_012HakanTetikPage;
import pages.gmiBankPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_012HakanTetik {

     US_012HakanTetikPage bankPage = new US_012HakanTetikPage();

    @Given("kullanicia gmibank login sayfasina gitmeli")
    public void kullanici_gmibank_login_sayfasina_gitmeli() {
        Driver.getDriver().get(ConfigReader.getProperty("GmiBankUrl"));
    }

    @Then("usernamea box {string} girilmeli")
    public void username_box_girilmeli(String string) {
        bankPage.username.sendKeys(ConfigReader.getProperty("GMIBank1"));
    }

    @Then("passworda box {string} girilmeli")
    public void password_box_girilmeli(String string) {
        bankPage.password.sendKeys(ConfigReader.getProperty("GMIBank2"));
    }

    @Then("signa in click yapabilmeli")
    public void sign_in_click_yapabilmeli() {

        bankPage.signInButton.click();
    }

    @Then("mya operations click yapabilmeli")
    public void my_operations_click_yapabilmeli() {

        bankPage.myOperations.click();
    }

    @Then("managea customers click yapabilmeli")
    public void manage_customers_click_yapabilmeli() {

        bankPage.manageCustomers.click();
    }

    @Then("createa a new customer click yapabilmeli")
    public void create_a_new_customer_click_yapabilmeli() {

        bankPage.createANewCustomer.click();
    }

    @Then("SSNa {string} girilmeli")
    public void ssn_girilmeli(String string) {

        bankPage.ssnBox.sendKeys("541-01-4572");
    }

    @Then("searcha button a click yapabilmeli")
    public void search_button_a_click_yapabilmeli() {
        bankPage.search.click();
    }

    @Then("successa search verify")
    public void success_search_verify() {
        Driver.wait(2);
        System.out.println(bankPage.successMessage.getText());
        boolean tiklanabilir = bankPage.search.isEnabled();
        System.out.println(tiklanabilir);
    }

    @Then("firstnamea box value getirmeli")
    public void firstname_box_value_getirmeli() {
        Driver.wait(2);
        System.out.println(bankPage.firstName.getAttribute("value"));
    }

    @Then("lastnamea box una value getiremli")
    public void lastname_box_una_value_getiremli() {
        Driver.wait(2);
        System.out.println(bankPage.lastName.getAttribute("value"));
    }

    @Then("middlea initial box una girilmeli")
    public void middle_initial_box_una_girilmeli() {
       bankPage.middle.sendKeys("C");
    }

    @Then("emaila box value getirmeli")
    public void email_box_value_getirmeli() {
        Driver.wait(2);
        System.out.println(bankPage.emailBox.getAttribute("value"));
    }

    @Then("mobilea phone number value getiremli")
    public void mobile_phone_number_value_getiremli() {
        Driver.wait(2);
        System.out.println(bankPage.mobilePhoneNumber.getAttribute("value"));
    }

    @Then("phonea number box ayni no girilmeli")
    public void phone_number_box_ayni_no_girilmeli() {
        Driver.wait(2);
        bankPage.phoneNumber.sendKeys("012-312-5487");
    }

    @Then("zipa code box una zip code girilemli")
    public void zip_code_box_una_zip_code_girilemli() {
        bankPage.postaKodu.sendKeys("43500");
    }

    @Then("adressa box value getirmeli")
    public void adress_box_value_getirmeli() {
        Driver.wait(2);
        System.out.println(bankPage.adres.getAttribute("value"));
    }

    @Then("citya box una sehir girilmeli")
    public void city_box_una_sehir_girilmeli() {
        bankPage.sehir.sendKeys("antep");
    }

    @Then("phonea ssn box value getirmeli")
    public void phone_ssn_box_value_getirmeli() {
        Driver.wait(2);
        System.out.println(bankPage.ssn.getAttribute("value"));
    }

    @Then("createa date box value getirmeli")
    public void create_date_box_value_getirmeli() {
        Driver.wait(2);
        System.out.println(bankPage.tarih.getAttribute("value"));
    }

    @Then("countrya box una ulke girilmeli")
    public void country_box_una_ulke_girilmeli() {
        bankPage.ulke.sendKeys("FR");
    }

    @Then("statea box una state girilmeli")
    public void state_box_una_state_girilmeli() {
        bankPage.state.sendKeys("paris");
    }

    @Then("usersa box una kullanici adi girilmeli")
    public void users_box_una_kullanici_adi_girilmeli() {
        bankPage.user.click();
    }

    @And("accounta box undan account secilmeli")
    public void account_Box_Undan_Account_Secilmeli() {
        bankPage.account.click();
    }

    @Then("savea button ununa click yapmali")
    public void save_button_ununa_click_yapmali() {
        bankPage.savebutton.click();
    }

    @Then("yenia musteri create ettigi verify edilmeli")
    public void yeni_musteri_create_ettigi_verify_edilmeli() {
        Assert.assertTrue(bankPage.savemessage.isDisplayed());
    }

    @Given("kullanicia manageCustomers sayfasındaki view kontrol eder")
    public void kullaniciManageCustomersSayfasındakiViewKontrolEder() {

        Assert.assertTrue(bankPage.viewcontainer.isDisplayed());


    }

    @And("kullanicia manageCustomers sayfasındaki edit kontrol eder")
    public void kullaniciManageCustomersSayfasındakiEditKontrolEder() {
        Assert.assertTrue(bankPage.editcontainer.isDisplayed());
    }

    @And("kullanicia manageCustomers sayfasındaki delete kontrol eder")
    public void kullaniciManageCustomersSayfasındakiDeleteKontrolEder() {
        Assert.assertTrue(bankPage.delete.isDisplayed());
    }
}
