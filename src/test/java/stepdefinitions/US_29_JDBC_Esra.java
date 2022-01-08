package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pojos.US_29_EsraJdbcCustomer;
import utilities.DatabaseConnector;
import utilities.DatabaseUtilityEsra;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.io.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class US_29_JDBC_Esra extends DatabaseUtilityEsra {


    private static ResultSet users, countries, states;
    public static String usersData="select   first_name, last_name,email, created_by from public.jhi_user;";
    private final List<Object> listUserInfo = new ArrayList<>();

    private static String countryQuery="select * from tp_country";
    private static List<String> listForCountry=new ArrayList<>();
    private  List<String> expectedCountryList=new ArrayList<>();

    private static String statesQuery="select * from public.tp_state";
    private static List<String> listForStates=new ArrayList<>();
    private  List<String> expectedUsaStateList=new ArrayList<>();

    @When("gmibank.com adresinin databaseine baglanir")
    public void gmibank_com_adresinin_databaseine_baglanir() throws SQLException {
        createConnection();

    }



    @Given("customers bilgileri alinir ve kaydedilir")
    public void customers_bilgileri_alinir_ve_kaydedilir() throws SQLException {

       // String query="select * from public.jhi_user";
      //  System.out.println("users emails"+ getColumnData(query,"email"));
      //  System.out.println("users LOGIN_names"+ getColumnData(query,"login"));
      //  System.out.println("users FIRSTNAMES"+ getColumnData(query,"first_name"));
        users = DatabaseConnector.getResultSet(usersData);

        ResultSetMetaData rsmd = users.getMetaData();
        System.out.println("Total Columns :" + rsmd.getColumnCount());
        System.out.println("Column Name of 1st Column :" + rsmd.getColumnName(1));

        while (users.next()) {
            String firstname = users.getString("first_name");
            String lastname=users.getString("last_name");
            String email=users.getString("email");
            String created_by=users.getString("created_by");
            listUserInfo.add(firstname);
            listUserInfo.add(lastname);
            listUserInfo.add(email);
            listUserInfo.add(created_by);

        }
     //  System.out.println(listUserInfo);
        System.out.println("==========================================");

    //    String userNamefile="src/test/java/test_data/DB1user_Name_file.txt";
   //     saveCustomerSsn(userNamefile,listUserInfo);

        List<String>expectedUserInfo=new ArrayList<>();
        expectedUserInfo.add("Mason");
        expectedUserInfo.add("Change");
        expectedUserInfo.add("jesse.moore@yahoo.com");
        expectedUserInfo.add("anonymousUser");
        System.out.println(listUserInfo);
        Assert.assertTrue("hata",listUserInfo.containsAll(expectedUserInfo));


    }


    public static void saveDataInFileWithAllCustomerInfo(String fileName, US_29_EsraJdbcCustomer[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i =0; i<customers.length;i++){
                writer.append(customers[i].getFirstName()+" , "+customers[i].getLastName()+"\n");
                if(customers[i].getUser() != null)
                    writer.append(customers[i].getUser().getFirstName());
                if(customers[i].getCountry() != null)
                    writer.append(customers[i].getCountry().getName());
            }
            writer.close();
        } catch(Exception e){

        }
    }


    public static void saveCustomerSsn(String fileName,List<Object>ssn){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(fileName,true));

            for (int i = 0; i < ssn.size(); i++) {

                writer.append(ssn.get(i).toString()+",\n");
            }writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Given("kaydedilen bilgiler ile requierementlarda verilen expected data karsilastirilip dogrulanir")
    public void kaydedilen_bilgiler_ile_requierementlarda_verilen_expected_data_karsilastirilip_dogrulanir() {
        String userNamefile="src/test/java/test_data/DBuser_Name_file.txt";

   //     List<String>actualUserInfofromReadTxt= returnAllUsersInfo(userNamefile);



    }


    public static List<String> returnAllUsersInfo(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                String temp = "";
                temp =line.split(",")[0].trim();
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(temp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }




    @Given("country bilgileri alinir ve kaydedilir")
    public void country_bilgileri_alinir_ve_kaydedilir() throws SQLException {
        countries=DatabaseConnector.getResultSet(countryQuery);

        while (countries.next()) {
            String countryName= countries.getString("name");
            listForCountry.add(countryName);
        }
        System.out.println("*****************");
      //  System.out.println(listForCountry);



    }
    @Given("kaydedilen country bilgileri ile requierementlarda verilen expected data karsilastirilip dogrulanir")
    public void kaydedilen_country_bilgileri_ile_requierementlarda_verilen_expected_data_karsilastirilip_dogrulanir() {

        expectedCountryList.add("ANGOLA");
        expectedCountryList.add("Poland");
        expectedCountryList.add("FRANCE");
        expectedCountryList.add("Kuzey Kore");
        System.out.println(listForCountry);
        System.out.println(expectedCountryList);

        Assert.assertTrue("doesnt contain the country",listForCountry.containsAll(expectedCountryList));


    }



    @Given("eyalet bilgileri alinir ve kaydedilir")
    public void eyalet_bilgileri_alinir_ve_kaydedilir() throws SQLException {
states=DatabaseConnector.getResultSet(statesQuery);


while (states.next()){
String statesNames=states.getString("name");
listForStates.add(statesNames);

}
        System.out.println("all states of USA : "+listForStates);

    }
    @Given("kaydedilen eyalet bilgileri ile requierementlarda verilen expected data karsilastirilip dogrulanir")
    public void kaydedilen_eyalet_bilgileri_ile_requierementlarda_verilen_expected_data_karsilastirilip_dogrulanir() {
List expectedUsaStateList=asList("Virginia","WASHINGTONN_DC","ARIZONA","ohio","Texas","NJ","NY","Dallas","Utah","NorthSouthCarolina","Massachusetts","Kansas","FL");

        System.out.println(listForStates);
        System.out.println("==================");
        System.out.println(expectedUsaStateList);
Assert.assertTrue("they are not matching",listForStates.containsAll(expectedUsaStateList));
DatabaseConnector.closeConnection();
    }


}
