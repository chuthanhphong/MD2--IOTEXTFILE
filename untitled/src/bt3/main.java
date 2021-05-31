package bt3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        Readandwrite readandwrite = new Readandwrite();
        try {
            List<String > list = new ArrayList<String>();
            readandwrite.readFile("achuong.txt",list);
            readandwrite.writeFile("achuong2.txt",list);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
