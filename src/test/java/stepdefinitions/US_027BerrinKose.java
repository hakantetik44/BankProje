package stepdefinitions;



import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class US_027BerrinKose {

    Response response;

    @Given("kullanici gmibank apiden {string} stateleri okur")
    public void kullanici_gmibank_apiden_stateleri_okur(String url) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearer_token"),
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
        response.prettyPrint();

    }

    @Given("kullanici state icin api end point {string} den {string} ve {string} kullanarak state olusturur")
    public void kullanici_state_icin_api_end_point_den_ve_kullanarak_state_olusturur(String endPoint, String id, String name) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearer_token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().body("{\"countryId\": " + id + ",\"name\": \"" + name + "\"}")
                .post(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

    }

    @Given("kullanici state icin api end point {string} den {string} ve {string} kullanarak guncelleme yapar")
    public void kullanici_state_icin_api_end_point_den_ve_kullanarak_guncelleme_yapar(String endPoint, String id, String name) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearer_token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().body("{\"id\": " + id + ",\"name\": \"" + name + "\"}")
                .put(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

    }

    @Given("kullanici endpoint {string} ve id ile {string} state siler")
    public void kullanici_endpoint_ve_id_ile_state_siler(String url, String id) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearer_token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .delete(url + id)
                .then()
                .extract()
                .response();

    }
}
/*

       response = given().accept(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token"))
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        jsonPath= response.jsonPath();
        String stateId = jsonPath.getString("id");

        Assert.assertFalse("State is not deleted",stateId.contains("61746"));
        System.out.println("State is deleted");

    }


*/



