package bt3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Readandwrite {
   public List<String> readFile(String filepath){
       List<String> list = new ArrayList<>();
       File file = new File(filepath);
       try {
           BufferedReader reader = new BufferedReader(file);
           String line = "";
       }
   }
}
