package bt5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        File file = new File("country.csv");
        try {
            if (!file.exists()) file.createNewFile();
        } catch (IOException e) {
            System.out.println("file đã tồn tại");
        }
//        BufferedReader br = null;
//        try {
//            String line ;
//            br = new BufferedReader(new FileReader("country.csv"));
//            while ((line=br.readLine())!=null){
//                    prinkCountry(parseCsvLine(line));
//            }
//            System.out.println("done");
//        } catch (IOException e) {
//            System.out.println("Wrong");
//        }
//        finally {
//            try {
//                if(br!=null){
//                    br.close();
//                }
//            }catch (IOException E){
//                E.printStackTrace();
//            }
//        }
//        System.out.println(file.getAbsolutePath());
//    }
//    public  static List<String> parseCsvLine(String csvLine){
//        List<String> result = new ArrayList<>();
//        if(csvLine!=null){
//            String[] splitData = csvLine.split(",");
//            for(int i =0;i<splitData.length;i++){
//                result.add(splitData[i]);
//            }
//        }
//        return result;
//    }
//    public  static  void prinkCountry(List<String > country){
//        System.out.println( "Country [id= "
//                + country.get(0)
//                + ", code= " + country.get(1)
//                + " , name=" + country.get(2)
//                + "]");
//    }
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("country.csv"));

            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(file.getAbsolutePath());
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
    }

