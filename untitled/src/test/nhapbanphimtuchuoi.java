package test;

import java.io.IOException;

public class nhapbanphimtuchuoi {
    public static void main(String[] args) throws IOException {
        while (true){
            System.out.println("nhập chuỗi kí tự");
            byte[]bytes = new byte[100];
            int length = System.in.read(bytes);
            String str = new String(bytes,0,length-1);
            if(str.equalsIgnoreCase("EXIT")){
                System.out.println("finished");
                break;
            }
            System.out.println("chuỗi nhận được " + str);
        }
    }
}
