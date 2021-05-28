package test;

import java.io.DataOutput;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws IOException {
     File file = new File("D:\\Module2\\IOTEXTFILE\\achuong.txt");
     file.createNewFile();
     if(file.exists()){
         System.out.println("file exist" + file.exists());
         System.out.println("File hidden" + file.isHidden());
         System.out.println("simple name " + file.getName());
         System.out.println(file.getAbsolutePath());
         System.out.println("file lenght" + file.length() + "byte");
         long Lastmodifier = file.lastModified();
         Date Lastmodiferbye = new Date(Lastmodifier);
         System.out.println("Lastmodifier" + Lastmodiferbye);
     }
    }
}
