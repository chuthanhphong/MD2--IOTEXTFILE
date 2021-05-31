package bt3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Readandwrite {
    public List<String> readFile(String filepath,List<String> list) throws IOException {

        File file = new File(filepath);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            reader.close();
        }catch (Exception e){
            System.out.println("file not found");
        }
        return list;
    }
    public void writeFile(String filepath, List<String > list) throws IOException {
        File file = new File(filepath);
        try {
            System.out.println("số ký tự trong file là " + list.size());
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String element: list){
                writer.write(element);
                writer.newLine();
            }
            writer.close();
            System.out.println("write successfully");
        }catch (Exception e){
            System.out.println("file is exist");
        }
    }
}
