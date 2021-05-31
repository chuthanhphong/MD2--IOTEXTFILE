package bt3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo1  {
    public static void readandwrite(File filecsource, File fileclone) throws IOException{
    FileReader file1 = new FileReader(filecsource);
    FileWriter file2 = new FileWriter(fileclone);
    int count=0;
    while ((count=file1.read())!=-1){
        file2.write(count);
    }
    file1.close();
    file2.close();
}

    public static void main(String[] args) throws  IOException {
        File file = new File("achuong3.txt");
        File file2 = new File("achuong4.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            if(!file2.exists()){
                file.createNewFile();
            }
            demo1.readandwrite(file,file2);
            System.out.println("done");
        }catch (Exception e){
            System.out.println("file đã tồn tại/not found");
        }
    }



}
