package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
public class US_24HuseyinKarahan_States {

    Response response;

    @Given("Kullanici api end point {string} den {string} ve {string} kullanarak state olusturur")
    public void kullanici_api_end_point_den_ve_kullanarak_state_olusturur(String url, String id, String name) {

     response=given().headers("Authorization","Bearer "+ ConfigReader.getProperty("api_bearer_token"),
             "Content-Type", ContentType.JSON,"Accept", ContentType.JSON).
             when().body("{\""+ id + "\":\"" +name+"\"}").post(url).
             then().contentType(ContentType.JSON).extract().response();

     response.prettyPrint();












    }




}
