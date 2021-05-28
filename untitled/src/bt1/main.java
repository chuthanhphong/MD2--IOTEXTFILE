package bt1;

import java.io.*;
import java.util.Scanner;

public class main {
    public void readFileText(String Filepath){
        try{
            File file = new File(Filepath);
            if(!file.exists()){
                throw  new FileNotFoundException();
            }
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum =0;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
        System.out.println("Tổng  " + sum);
    }catch (Exception e){
            System.out.println("file không tồn tại /không có nội dung");
        }
}
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        main readfileex = new main();
        readfileex.readFileText(path);
    }





}
