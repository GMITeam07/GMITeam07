package utilities;

import pojos.Customer;
import pojos.State;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {

    public static List<Customer> returnCustomer(String filePath){
        List<Customer>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("Customers.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                Customer customer = new Customer();
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                String [] each = line.split(",");
                customer.setFirstName(each[0]);
                customer.setLastName(each[1]);
                customer.setEmail(each[2]);
                customer.setSsn(each[3]);
                all.add(customer);
            }
            String everything = sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
    public static List<Customer> returnCustomerSNN(String filePath){
        List<Customer>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Customer customer = new Customer();
                customer.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(customer);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
    public static List<Customer> readTxtData(String filePath)throws  Exception{
        List<Customer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            Customer customer = new Customer();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
//                customer.setSsn(line);
            }
            String everything = sb.toString();
            customer.setSsn(everything);
            list.add(customer);
        } finally {
            br.close();
        }
        return list;
    }
    public static List<State> returnAllStates(String filePath){
        List<State>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                State state = new State();
                String [] allLine = line.split(",");
                int id = Integer.parseInt(allLine[1].trim());
                state.setId(id);
                state.setName(allLine[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(state);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
    public static List<String> returnCustomerSNNList(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Customer customer = new Customer();
                customer.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(customer.getSsn());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
    public static List<State> returnAllStates2(String filePath){
        List<State>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                State states = new State();
                states.setName(line.split(",")[0].trim());
                states.setId(Integer.parseInt(line.split(",")[1].trim()));
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(states);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
    public static List<String> returnAllStates3(String filePath){
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

    public static List<String> returnApplicantsData(String filePath, String type){
        List<String>all = new ArrayList<>();
        int selectType = 0;

        switch (type) {
            case "id":
                selectType = 0;
                break;
            case "ssn":
                selectType = 1;
                break;
            case "firstname":
                selectType = 2;
                break;
            case "lastname":
                selectType = 3;
                break;
            case "address":
                selectType = 4;
                break;
            case "phonenumber":
                selectType = 5;
                break;
            case "userid":
                selectType = 6;
                break;
            case "email":
                selectType = 7;
                break;
        }
        try(BufferedReader br = new BufferedReader(new FileReader("User.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                    String temp = "";
                    temp =line.split(",")[selectType].trim();
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                    all.add(temp);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return all;
        }

}
