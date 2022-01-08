package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.CountryUs25;
import utilities.Authentication;
import utilities.ConfigReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_025MuhammetYusufBuyuk {
    Response response;
    String bearerToken = ConfigReader.getProperty("api_bearer_token");
    CountryUs25[]country;
    String fileNameCountry = ConfigReader.getProperty("fileNameCountry");



    @Given("Kayit sahiplerinin Api end pointe gidecek  {string} datalari alacak.")
    public void kayit_sahiplerinin_Api_end_pointe_gidecek_datalari_alacak(String url) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

    }

  /*  @Given("Kayit sahiplerinin datalarini alir.")
    public void kayit_sahiplerinin_datalarini_alir() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        country = obj.readValue(response.asString(), Country[].class);

        for (int i = 0; i < country.length; i++)

            if (country[i].getName() != null)
                System.out.println(country[i].getName());


    }
*/



//     @Given("Kayit sahiplerinin tüm datalarini tek tek onaylar")
//    public void kayit_sahiplerinin_tüm_datalarini_tek_tek_onaylar() throws IOException {
//
//        List<String> expectedName = new ArrayList<>();
//        ObjectMapper obj = new ObjectMapper();
//        country = obj.readValue(response.asString(), Country[].class);
//
//        for (int i = 0; i < country.length; i++){
//            expectedName.add(country[i].getName());
//
//        }
//        List<String> actualNames = ReadTxt.returnCountryNameList(fileNameCountry);
//        Assert.assertTrue("ISIMLER ESLESMIYOR", actualNames.containsAll(expectedName));

//    }

    @And("kullanici api end point {string} den {string} ve {string} kullanarak ulke olusturur")
    public void kullaniciApiEndPointDenVeKullanarakUlkeOlusturur(String url, String country, String name) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().body("{\""+country+"\":\""+name+"\"}")
                .post(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        System.out.println("{\""+country+"\":\""+name+"\"}");
    }


    @And("kullanici {string} endpointinde olusturulan ulkeleri dogrular")
    public void kullaniciEndpointindeOlusturulanUlkeleriDogrular(String url) {
        //   WriteToTxt.saveAllCountry(fileNameCountry,country);

        List<String> expectedName = new ArrayList<>();
        expectedName.add("parisli");
        expectedName.add("hakkarili");
        expectedName.add("trabzonlumuyubu");
//            List<String> actualIDs = ReadTxt.returnCountryNameList(fileNameCountry);
        response = given().headers(
                        "Authorization",
                        "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get(url);
        JsonPath json = response.jsonPath();
        List<String> actualName= json.getList("name");
        for (String w: expectedName) {
            Assert.assertTrue("Countrys is not match",actualName.contains(w));
        }
        }
}



