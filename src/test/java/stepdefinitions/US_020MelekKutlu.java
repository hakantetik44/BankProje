package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.CustomerMelekKutlu;
import utilities.ConfigReader;
import utilities.ReadTxt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import static io.restassured.RestAssured.given;

    public class US_020MelekKutlu {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Properties properties;
        Response response;
        String token;
        List<Object> customerId;


        @Given("Sistem  endpoint ile token alir  {string}")
        public void sistemEndpointIleTokenAlir(String string) {

            response = given().
                    headers("Authorization", "Bearer " + ConfigReader.getProperty("token"),
                            "Content_Type", ContentType.JSON, "Accept", ContentType.JSON).
                    when().
                    get(string).
                    then().
                    contentType(ContentType.JSON).
                    extract().
                    response();
            //response.prettyPrint();

        }

        @Then("Sistem aldigi datalari okur {string}")
        public void sistemAldigiDatalariOkur(String endpoint_customer) {
            Response response = given().accept(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token")).when().get(endpoint_customer);

            response.prettyPrint();

        }

        @Then("Sistem Customer datalarini verify eder")
        public void sistemCustomerDatalariniVerifyEder() throws IOException {


            ObjectMapper objectMapper=new ObjectMapper();

            CustomerMelekKutlu[] customerMelekKutlu=objectMapper.readValue(response.asString(),CustomerMelekKutlu[].class);

            List<String> customerList=new ArrayList<>();
            for (int i = 0; i <customerMelekKutlu.length ; i++) {
                customerList.add(String.valueOf(customerMelekKutlu[i].getFirstName()+ " , "+customerMelekKutlu[i].getLastName()+" , "+customerMelekKutlu[i].getSsn()));
            }
            System.out.println(customerList);
            System.out.println(".....................................");


            WriteToTxt.saveDataInFileAllCustomersInfo3("CustomerList",customerMelekKutlu);
            List<String > readtxtCustomer= ReadTxt.returnCustomerList("CustomerList");
            Assert.assertEquals("not match", customerList,readtxtCustomer);
            System.out.println("Customer First Name , Last Name and SSn validation is Succesfull");

            List<String> customerSSNlist = new ArrayList<>();
            for (int i = 0; i <customerMelekKutlu.length ; i++) {
                customerSSNlist.add(String.valueOf(customerMelekKutlu[i].getSsn()));
            }
            WriteToTxt.saveDataInFileWithSSN("CustomerSSNList", customerMelekKutlu);

            List <String> readTxtCustomerSSN = ReadTxt.returnCustomerSNNList("CustomerSSNList");

            System.out.println(readTxtCustomerSSN);

            Assert.assertEquals("not match",readTxtCustomerSSN,customerSSNlist);

            System.out.println("===============================================");

            System.out.println("Custumer SSn Validation is succesfull");

        }


    }
