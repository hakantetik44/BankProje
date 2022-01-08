package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_023Registrations;
import utilities.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_023ZeynepAkpinar {

    Response response;
    US_023Registrations [] registrations;
    Faker faker = new Faker();
    int expectedId;
    String fileName = ConfigReader.getProperty("fileNameOfRegistrations");


    @Given("Sistem API registrations end pointe gidip {string} datalari alacak")
    public void sistem_API_registrations_end_pointe_gidip_datalari_alacak(String url) {
        String token = ApiUtility.takeeToken("Team70Admin","Team70+","https://www.gmibank.com/api/authenticate");
        response = given().headers(
                        "Authorization",
                        "Bearer " +token,
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

        //response.prettyPrint();
    }

    @Given("Sistem tum registrations datalarini alir.")
    public void sistem_tum_registrations_datalarini_alir() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        registrations = obj.readValue(response.asString(),US_023Registrations[].class);

    }

    @Given("Sistem aldigi tum registrations datalarini okur.")
    public void sistem_aldigi_tum_registrations_datalarini_okur() {
        for (int i = 0; i<registrations.length; i++){
            System.out.println(registrations[i]);
        }

    }

    @Given("Sistem aldigi tum registrations datalarini kaydeder.")
    public void sistem_aldigi_tum_registrations_datalarini_kaydeder() {
        WriteToTxt.saveDataInFileWithRegistrations(fileName, registrations);

    }



    @Given("Sistem aldigi tum registrations datalarini dogrular.")
    public void sistem_aldigi_tum_registrations_datalarini_dogrular() {
        //Ssn kontrol
        List<String> actualRegSsn = new ArrayList<>();
        for (int i = 0; i<registrations.length; i++){
            actualRegSsn.add(registrations[i].getSsn());
        }

        List<String> expectedRegData = new ArrayList<>();
        expectedRegData.add("788-27-4255");
        expectedRegData.add("123-98-4561");
        expectedRegData.add("453-12-7873");
        expectedRegData.add("568-25-1236");
        expectedRegData.add("212-23-4567");

        Assert.assertTrue(actualRegSsn.containsAll(expectedRegData));

    }

    @Given("Sistem aldigi tum registrations datalarini tek tek dogrular {string}")
    public void sistem_aldigi_tum_registrations_datalarini_tek_tek_dogrular(String endpoint) {
        String token = ApiUtility.takeeToken("Team70Admin","Team70+","https://www.gmibank.com/api/authenticate");
        Map<Object, Object> expectedRegistration = new HashMap<>();

        expectedRegistration.put("ssn", faker.number().digit());
        expectedRegistration.put("firstName", faker.name().firstName());
        expectedRegistration.put("lastName", faker.name().lastName());
        expectedRegistration.put("address", faker.address().city());
        expectedRegistration.put("mobilePhoneNumber", faker.phoneNumber().phoneNumber());
        expectedRegistration.put("userId", faker.number().digit());
        expectedRegistration.put("userName", faker.name().username());
        expectedRegistration.put("email", faker.internet().emailAddress());
        expectedRegistration.put("createDate", null);

        response = given().headers(
                         "Authorization",
                         "Bearer " + token,
                         "Content-Type",
                         ContentType.JSON,
                         "Accept",
                        ContentType.JSON).
                when().
                body(expectedRegistration).
                post(endpoint);

        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
        int expectedId = jsonPath.getInt("id");


        response = given().headers(
                         "Authorization",
                         "Bearer " + token,
                        "Content-Type",
                         ContentType.JSON,
                         "Accept",
                         ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract().response();

        response.prettyPrint();

        Assert.assertEquals(expectedRegistration.get("ssn"), jsonPath.getString("ssn"));
        Assert.assertEquals(expectedRegistration.get("firstName"), jsonPath.getString("firstName"));
        Assert.assertEquals(expectedRegistration.get("lastName"), jsonPath.getString("lastName"));
        Assert.assertEquals(expectedRegistration.get("address"), jsonPath.getString("address"));
        Assert.assertEquals(expectedRegistration.get("mobilePhoneNumber"), jsonPath.getString("mobilePhoneNumber"));
        Assert.assertEquals(expectedRegistration.get("userId"), jsonPath.getString("userId"));
        Assert.assertEquals(expectedRegistration.get("userName"), jsonPath.getString("userName"));
        Assert.assertEquals(expectedRegistration.get("email"), jsonPath.getString("email"));
        Assert.assertEquals(expectedRegistration.get("createDate"), jsonPath.getString("createDate"));


    }


}
