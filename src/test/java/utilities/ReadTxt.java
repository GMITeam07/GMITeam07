package utilities;

import pojos.Country2;
import pojos.State;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {
    public static List<Country2> returnCountry(String filePath){
        List<Country2>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
//                Country2 country = new Country2();
//                sb.append(line);
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//                String [] each = line.split(",");
//                country.setName(each[0]);
//                country.setStates(each[1]);
//                all.add(country);
            }
            String everything = sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
    public static List<Country2> returnCountryName(String filePath){
        List<Country2>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Country2 country = new Country2();
                country.setName(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(country);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
    public static List<Country2> readTxtData(String filePath)throws  Exception{
        List<Country2> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            Country2 country = new Country2();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                //  country.setName(line);
            }
            String everything = sb.toString();
            country.setName(everything);
            list.add(country);
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
    public static List<Country2> readTextData(String filePath) throws IOException {
        List<Country2> list = new ArrayList<>();


        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            Country2 country = new Country2();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                country.setName(line);

                list.add(country);
            }
            String everything = sb.toString();
        } finally {
            br.close();
        }
        return list;

    }}