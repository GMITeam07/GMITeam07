package utilities;

import pojos.Country2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class WriteToTxtIbr {
        public static void saveDataInFile(String fileName, Country2[] country)  {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                for (int i=0;i<country.length;i++)
                    writer.append(country[i].getName()+",\n");
                writer.close();
            } catch(Exception e){
            }
        }
        public static void saveDataInFileWithName(String fileName, Country2 country)  {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                writer.append(country.getName());
                writer.close();
            } catch(Exception e){
            }
        }


        public static void saveDataInFileWithAllCountryInfo(String fileName, List<Map<String, Object>> country)  {
//            try {
//                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//                for (int i =0; i<country.length;i++){
//                    writer.append(country[i].getName());
//                    if(country[i].getClass() != null)
//                        writer.append(country[i].getClass().getName());
//                    if(country[i].getStates() != null)
//                        writer.append(country[i].getClass().getName());
//                }
//                writer.close();
//            } catch(Exception e){
//            }
        }
        public static void saveAllStates(String fileName, Country2[] states)  {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                for (int i=0; i<states.length; i++)
                    writer.append(states[i].getName()+" , "+states[i].getId()+"\n");
                writer.close();
            } catch(Exception e){
            }
        }
        public static void saveAllStates2(String fileName, Country2[] states)  {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                for (int i=0; i<states.length; i++)
                    writer.append(states[i].getName()+" , "+states[i].getId()+"\n");
                writer.close();
            } catch(Exception e){
            }
        }
    }


