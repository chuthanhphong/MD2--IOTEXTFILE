package bt2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readfile (String filepath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filepath);
            if(!file.exists()){
                throw  new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line=br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.out.println("file không tồn tại/không có nội dung");
        }
        return numbers;
    }
    public void writefile(String filepath, int max){
        try {
            FileWriter writer12 = new FileWriter(filepath,true);
            BufferedWriter bufferedReader = new BufferedWriter(writer12);
            bufferedReader.write("giá trị lớn nhất" +max);
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }





}
