package utilities;

import pojos.Country2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
public class WriteToTxt {
    public static void saveDataInFileWithPojo(String fileName, List<Country2> country) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i <country.size() ; i++) {
                writer.append(country.get(i).getName() + " , " + country.get(i).getStates()+ country.get(i).getId() + "\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }
    public static void saveDataInFileWithJsonListString(String fileName, List<String> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append( json + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }
    public static void saveDataInFileWithJsonListMap(String fileName, List<Map<String,Object>> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < json.size(); i++) {
                writer.append(json.get(i).get("Name") + " , " + json.get(i).get("States") + " , " + json.get(i).get("Id") + "\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }}
