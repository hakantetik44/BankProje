package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pojos.CustomerMelekKutlu;
import utilities.PDFGenerator;


import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getQueryResultList;


public class US_30MelekKutlu {



    @Given("pdf kullanicisi db ile baglanti kurar  {string} , {string}, {string}")
    public void pdfKullanicisiDbIleBaglantiKurar(String url, String user, String password) {
        createConnection(url, user, password);
    }

    @And("pdf kullanicisi {string} sorgular")
    public void pdfKullanicisiSorgular(String query) {
            List<CustomerMelekKutlu> listOfCustomers = new ArrayList<>();

            List<List<Object>> list = getQueryResultList(query);
            for (int i = 0; i <= 5; i++) {
                CustomerMelekKutlu customer = new CustomerMelekKutlu();

                customer.setFirstName(list.get(i).get(1).toString());
                customer.setLastName(list.get(i).get(2).toString());
                customer.setMobilePhoneNumber(list.get(i).get(4).toString());
                customer.setCity(list.get(i).get(3).toString());
                customer.setSsn(list.get(i).get(3).toString());

                listOfCustomers.add(customer);

            }

            PDFGenerator.pdfGeneratorRowsAndCellsWithList("Customers  Data", listOfCustomers, "team70Customer.pdf");
        }

}
