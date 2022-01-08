package stepdefinitions;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.States;
import utilities.ApiUtility;
import utilities.ConfigReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;


import java.util.List;

import static io.restassured.RestAssured.given;
public class US_0022OnurEnesCelik {
    Response response;
    States [] states;
    JsonPath jsonPath;
    String fileName=ConfigReader.getProperty("fileNameStates");
    String fileName2=ConfigReader.getProperty("fileNameStatesID");
    String token=ApiUtility.takeeToken("Team70Admin","Team70+","https://www.gmibank.com/api/authenticate");
    List<String>actualName;
    List<Integer>actualId;

    @Given("User going to {string} api endpoint")
    public void user_going_to_api_endpoint(String endPoint) {
        response=given().
                headers("Authorization",
                        "Bearer "+token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).
                when().
                get(endPoint).
                then().
                contentType(ContentType.JSON).
                extract().
                response();




    }

    @Given("print this information in a data")
    public void print_this_information_in_a_data() {
        response.prettyPrint();

    }

    @Given("save this informations in a data")
    public void save_this_informations_in_a_data() {
        ObjectMapper mapper=new ObjectMapper();
        jsonPath =response.jsonPath();
        actualName =jsonPath.getList("name");
        actualId =jsonPath.getList("id");


        WriteToTxt.saveeDataInFileWithSSN(fileName,actualName);
        WriteToTxt.saveDataInFileWithID(fileName2,actualId);

        System.out.println("ACTUAL NAME LIST SIZE::"+actualName.size());
        System.out.println("ACTUAL ID LIST SIZE::"+actualId.size());

    }

    @Given("validate this informations in a data")
    public void validate_this_informations_in_a_data() {
        jsonPath =response.jsonPath();
        actualName =jsonPath.getList("name");
        actualId =jsonPath.getList("id");

        List<String>allName=ReadTxt.returnAllName(fileName);
        List<String>allID=ReadTxt.returnAllID(fileName2);

        System.out.println("NAME LIST SIZE:: "+allName.size());
        System.out.println("ID LIST SIZE:: "+allID.size());
        System.out.println("NAME LIST:: "+allName);
        System.out.println("ID LIST:: "+allID);

        Assert.assertEquals(allName.size(),actualName.size());

        for (int i=0; i<allID.size(); i++){
            Assert.assertEquals(allID.get(i),String.valueOf(actualId.get(i)));
        }


        for (int j=0; j<allName.size();j++){
            if (allName.get(j)!=null && actualName.get(j)!=null)
                Assert.assertEquals(allName.get(j),actualName.get(j));
        }



    }

}
