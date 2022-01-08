package utilities;

import pojos.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
public class WriteToTxt {


/*
    public static void saveDataInFile(String fileName, Customer[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0;i<customers.length;i++)
                writer.append(customers[i].getSsn()+",\n");
            writer.close();
        } catch(Exception e){
        }
    }
 */


    /*
    public static void saveDataInFileWithSSN(String fileName, Customer customer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(customer.getSsn());
            writer.close();
        } catch(Exception e){
        }
    }
     */
/*
    public static void saveDataInFileWithSSN(String fileName, Customer[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length ; i++) {
                writer.append(customers[i].getSsn()+",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }
 */
/*
    public static void saveDataInFileWithSSN(String fileName, Customer8[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length ; i++) {
                writer.append(customers[i].getSsn()+",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }
 */
/*
    public static void saveDataInFileWithSSN(String fileName, Customer7[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length ; i++) {
                writer.append(customers[i].getSsn()+",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }
 */
/*
    public static void saveDataInFileWithSSN(String fileName, Customer6[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length ; i++) {
                writer.append(customers[i].getSsn()+",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }
 */
/*
    public static void saveDataInFileWithSSN(String fileName, Customer5[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length ; i++) {
                writer.append(customers[i].getSsn()+",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }
 */
    public static void saveDataInFileWithSSN(String fileName, Users[] user)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < user.length ; i++) {
                writer.append(user[i].getSsn()+",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }
    public static void saveDataInFileWithCountry(String fileName, UserCountry[] user)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < user.length ; i++) {
                writer.append(user[i].getName()+",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }




/*
    public static void saveDataInFileWithSSN(String fileName, Customer3[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length ; i++) {
                writer.append(customers[i].getSsn()+",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }
 */



/*
    public static void saveDataInFileWithUserInfo(String fileName, Customer customer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(customer.getUser().getFirstName());
            writer.close();
        } catch(Exception e){
        }
    }
 */


    /*
        public static void saveDataInFileWithAllCustomerInfo(String fileName, Customer[] customers)  {
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
     */

/*
    public static void saveAllStates(String fileName, States[] states)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0; i<states.length; i++)
                writer.append(states[i].getName()+" , "+states[i].getId()+"\n");
            writer.close();
        } catch(Exception e){
        }
    }
 */
/*
    public static void saveAllStates2(String fileName, States[] states)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0; i<states.length; i++)
                writer.append(states[i].getName()+" , "+states[i].getId()+"\n");
            writer.close();
        } catch(Exception e){
        }
    }
 */
/*
    public static void saveAllCustomers(String fileName, Customer[]customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0; i<customers.length; i++) {
                writer.append(customers[i].getSsn() + "," + customers[i].getFirstName() + ",");
                if(customers[i].getCountry() != null)
                    writer.append(customers[i].getCountry().getName() + "," + customers[i].getCountry().getId() + ",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }
 */
/*
    public static void saveAllCustomer(String fileName, Customer customer,String password,String username)  {
        try {
//            String name ="C:\\Users\\sam\\IdeaProjects\\GMIBank\\src\\test\\resources\\test_data\\CustomerInfo.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(password + "," +username+","+ customer.getFirstName() + ",");
            writer.append(customer.getLastName() + "," + customer.getSsn() + ",");
            writer.append(customer.getAddress() + "," + customer.getEmail() + ","+customer.getMobilePhoneNumber()+"\n");
            writer.close();
        } catch(Exception e){
        }
    }
 */
    public static void saveAllCustomersComingFromDB(String fileName, List<Object> allCustomer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0; i<allCustomer.size(); i++) {
                writer.append(allCustomer.get(i) + ",\n" );
            }
            writer.close();
        } catch(Exception e){
        }
    }
    public static void saveDifferentInfoFromDB(String fileName, List<Object> data)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0; i<data.size(); i++) {
                writer.append(data.get(i) + ",\n" );
            }
            writer.close();
        } catch(Exception e){
        }
    }
    public static void saveAccountInfo(String fileName, String description)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(description + ",\n" );
            writer.close();
        } catch(Exception e){
        }
    }
    public static void saveCustomerInfo ( List <String> items){
        String fileLocation = "location";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation, true));
            for (int i = 0; i < items.size(); i++) {
                writer.append(items.get(i)+"\n");
            }
        }catch (Exception e){
        }
    }
    public static void saveRegistrantData(String fileName, Registrant registrant)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(registrant.getPassword()+","+ registrant.getUsername()+",");
            writer.append(registrant.getFirstname()+","+ registrant.getLastname()+",");
            writer.append(registrant.getSsn()+","+ registrant.getPhonenumber()+",");
            writer.append(registrant.getAddress()+","+ registrant.getEmail()+",\n");
            writer.close();
        } catch(Exception e){
        }
    }
/*
    public static void saveDataInFileWithSSN(String fileName, Customer4[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length ; i++) {
                writer.append(customers[i].getSsn()+",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }

 */
/*
    public static void saveRegistrantData(String fileName, Registrant2 registrant2)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(registrant2.getPassword()+","+ registrant2.getUsername()+",");
            writer.append(registrant2.getFirstname()+","+ registrant2.getLastname()+",");
            writer.append(registrant2.getSnn()+","+ registrant2.getPhonenumber()+",");
            writer.append(registrant2.getAddress()+","+ registrant2.getEmail()+",\n");
            writer.close();
        } catch(Exception e){

        }
    }
 */

    public static void saveDataInFileWithCountryAllData(String fileName, US_021Countries[] countries) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < countries.length; i++)
                if (countries[i] != null) {
                    writer.append(countries[i].getName() + ",");
                    writer.append(countries[i].getId() +",");
                    writer.append(countries[i].getStates() + "\n");
                }
            writer.close();
        } catch (Exception e) {
        }
    }




    public static void saveDataInFileWithCountry(String fileNameCountry, CountryUs25[] country)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameCountry, true));
            for (int i = 0; i < country.length ; i++) {
                writer.append(country[i].getId()+",\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }


    public static void saveDataInFileWithRegistrations(String fileName, US_023Registrations[] user)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < user.length ; i++) {
                writer.append(user[i].getId()+","+ user[i].getSsn()+","+
                        user[i].getFirstName()+","+ user[i].getLastName()+","+
                        user[i].getAddress()+","+ user[i].getMobilePhoneNumber()+","+
                        user[i].getUserId()+","+ user[i].getUserName()+","+
                        user[i].getEmail()+","+ user[i].getCreateDate()+",\n");
            }


            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveeDataInFileWithSSN(String fileName, List<String> states)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0; i<states.size(); i++) {
                writer.append(states.get(89)+" ");
                writer.append(states.get(i) + ",\n" );

            }

            //  writer.write();
           writer.close();
        } catch(Exception e){

        }
    }

    public static void saveDataInFileWithID(String fileName, List<Integer> states)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0; i<states.size(); i++) {
                writer.append(states.get(i) + ",\n" );

            }
            //  writer.write();

            writer.close();
        } catch(Exception e){
        }
    }



}

