package stepdefinitions;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_021Countries;
import utilities.ConfigReader;
import utilities.WriteToTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_021SunaKaplanhan {
    Response response;
    JsonPath jsonPath;
    US_021Countries[] countries;

    String fileName = ConfigReader.getProperty("fileNameofCountryName");

    @Given("SunaKullanici gmibank api {string} ulke bilgilerine gider")
    public void sunaKullanici_gmibank_apiden_ulke_bilgilerini_okur(String url) {

        response = given().
                headers("Authorization", "Bearer " + ConfigReader.getProperty("api_bearer_token"), "Content-Type",
                        ContentType.JSON, "Accept", ContentType.JSON).
                when().
                get(url).
                then().
                contentType(ContentType.JSON).extract().response();
        response.prettyPrint();


    }


    @And("SunaKulanici ulke datalarini alir")
    public void sunakulaniciUlkeDatalariniAlir() throws IOException {

        jsonPath = response.jsonPath();

        ObjectMapper objectMapper = new ObjectMapper();
        countries = objectMapper.readValue(response.asString(), US_021Countries[].class);

        for (int i = 0; i < countries.length; i++) {

            if (countries[i].getName() != null)
                System.out.println(countries[i].getName());

        }
    }

    @And("SunaKullanici ulke datalarini kaydeder")
    public void sunakullaniciUlkeDatalariniKaydeder() {

        WriteToTxt.saveDataInFileWithCountryAllData(fileName, countries);

    }

    @And("SunaKullanici ulke datalarini validate eder")
    public void sunakullaniciUlkeDatalariniValidateEder() {


        List<String> expectedCountryNames = new ArrayList<>();
        expectedCountryNames.add("Galler");
        expectedCountryNames.add("Alamanya");
        expectedCountryNames.add("France");

        List<String> listname = jsonPath.getList("name");
        // System.out.println(listname);
        Assert.assertTrue("name kaydi yok", listname.contains("Galler"));

    }
}





