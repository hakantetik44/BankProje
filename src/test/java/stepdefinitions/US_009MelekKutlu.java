package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_009MelekKutluPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_009MelekKutlu {
    US_009MelekKutluPage us_009MelekKutluPage =new US_009MelekKutluPage();

    @Given("mkullanici gmibank login sayfasina gitmeli")
    public void mkullanici_gmibank_login_sayfasina_gitmeli() {
        Driver.getDriver().get(ConfigReader.getProperty("GmiBankUrl1"));
    }

    @Then("musername box {string} girilmeli")
    public void musername_box_girilmeli(String string) {
        us_009MelekKutluPage.username.sendKeys(ConfigReader.getProperty("GMIBankname"));
    }

    @Then("mpassword box {string} girilmeli")
    public void mpassword_box_girilmeli(String string) {
        us_009MelekKutluPage.password.sendKeys(ConfigReader.getProperty("GMIBankpassword"));
    }






    @Then("msign in click yapabilmeli")
    public void msign_in_click_yapabilmeli() {
        us_009MelekKutluPage.signInButton.click();
    }










    @Then("mmy operations click yapabilmeli")
    public void mmy_operations_click_yapabilmeli() {

        us_009MelekKutluPage.myOperations.click();
    }

    @Then("mmanage customers click yapabilmeli")
    public void mmanage_customers_click_yapabilmeli() {

        us_009MelekKutluPage.manageCustomers.click();
    }

    @Then("mcreate a new customer click yapabilmeli")
    public void mcreate_a_new_customer_click_yapabilmeli() {

        us_009MelekKutluPage.createANewCustomer.click();
    }

    @Then("mSSN {string} girilmeli")
    public void mssn_girilmeli(String string) {

        us_009MelekKutluPage.ssnBox.sendKeys("541-01-4572");
    }

    @Then("msearch button a click yapabilmeli")
    public void msearch_button_a_click_yapabilmeli() {
        us_009MelekKutluPage.search.click();
    }

    @Then("msuccess search verify")
    public void msuccess_search_verify() {
        Driver.wait(2);
        System.out.println(us_009MelekKutluPage.successMessage.getText());
        boolean tiklanabilir = us_009MelekKutluPage.search.isEnabled();
        System.out.println(tiklanabilir);
    }

    @Then("mfirstname box value getirmeli")
    public void mfirstname_box_value_getirmeli() {
        Driver.wait(2);
        System.out.println(us_009MelekKutluPage.firstName.getAttribute("value"));
    }

    @Then("mlastname box una value getiremli")
    public void mlastname_box_una_value_getiremli() {
        Driver.wait(2);
        System.out.println(us_009MelekKutluPage.lastName.getAttribute("value"));
    }

    @Then("mmiddle initial box una girilmeli")
    public void mmiddle_initial_box_una_girilmeli() {
        us_009MelekKutluPage.middle.sendKeys("A");
    }

    @Then("memail box value getirmeli")
    public void memail_box_value_getirmeli() {
        Driver.wait(2);
        System.out.println(us_009MelekKutluPage.emailBox.getAttribute("value"));
    }

    @Then("mmobile phone number value getiremli")
    public void mmobile_phone_number_value_getiremli() {
        Driver.wait(2);
        System.out.println(us_009MelekKutluPage.mobilePhoneNumber.getAttribute("value"));
    }

    @Then("mphone number box ayni no girilmeli")
    public void mphone_number_box_ayni_no_girilmeli() {
        Driver.wait(2);
        us_009MelekKutluPage.phoneNumber.sendKeys("012-312-5487");
    }

    @Then("mzip code box una zip code girilemli")
    public void mzip_code_box_una_zip_code_girilemli() {
        us_009MelekKutluPage.postaKodu.sendKeys("35400");
    }

    @Then("madress box value getirmeli")
    public void madress_box_value_getirmeli() {
        Driver.wait(2);
        System.out.println(us_009MelekKutluPage.adres.getAttribute("value"));
    }

    @Then("mcity box una sehir girilmeli")
    public void mcity_box_una_sehir_girilmeli() {
        us_009MelekKutluPage.sehir.sendKeys("izmir");
    }

    @Then("mphone ssn box value getirmeli")
    public void mphone_ssn_box_value_getirmeli() {
        Driver.wait(2);
        System.out.println(us_009MelekKutluPage.ssn.getAttribute("value"));
    }

    @Then("mcreate date box value getirmeli")
    public void mcreate_date_box_value_getirmeli() {
        Driver.wait(2);
        System.out.println(us_009MelekKutluPage.tarih.getAttribute("value"));
    }

    @Then("mcountry box una ulke girilmeli")
    public void mcountry_box_una_ulke_girilmeli() {
        us_009MelekKutluPage.ulke.sendKeys("TR");
    }

    @Then("mstate box una state girilmeli")
    public void mstate_box_una_state_girilmeli() {
        us_009MelekKutluPage.state.sendKeys("yes");
    }

    @Then("musers box una kullanici adi girilmeli")
    public void musers_box_una_kullanici_adi_girilmeli() {
        us_009MelekKutluPage.user.click();
    }

    @And("maccount box undan account secilmeli")
    public void maccount_Box_Undan_Account_Secilmeli() {
        us_009MelekKutluPage.account.click();
    }

    @Then("msave button ununa click yapmali")
    public void msave_button_ununa_click_yapmali() {
        us_009MelekKutluPage.savebutton.click();
    }

    @Then("myeni musteri create ettigi verify edilmeli")
    public void myeni_musteri_create_ettigi_verify_edilmeli() {
        Assert.assertTrue( us_009MelekKutluPage.savemessage.isDisplayed());
    }

}