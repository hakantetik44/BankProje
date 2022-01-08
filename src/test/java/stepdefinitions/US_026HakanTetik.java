package stepdefinitions;

import io.cucumber.java.en.And;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.cucumber.java.en.Given;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import org.junit.Assert;
import utilities.ApiUtility;
import utilities.ConfigReader;

public class US_026HakanTetik {
    Response response;


    @Given("use api end take token and go to endpoint")
    public Response useApiEndTakeTokenAndGoToEndpoint() {

        String token = ApiUtility.takeToken("Team70Admin", "Team70+", "https://www.gmibank.com/api/authenticate");


        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get("https://www.gmibank.com/api/tp-countries")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
        return response;
    }

    @And("use post new country verify new country")
    public void usePostNewCountryVerifyNewCountry() {
        System.out.println("---------------.........----------------------\n");
        String token= ApiUtility.takeToken("Team70Admin","Team70+","https://www.gmibank.com/api/authenticate");

        HashMap<String, Object> country = new HashMap<>();



        country.put("name", "Fransa23");
        country.put("states", null);

        response = given().headers("Authorization",
                        "Bearer " + ConfigReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .body(country)
                .post("https://www.gmibank.com/api/tp-customers")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();


        Assert.assertEquals("Country Name :", country.get("name"),"Fransa23");

    }
}