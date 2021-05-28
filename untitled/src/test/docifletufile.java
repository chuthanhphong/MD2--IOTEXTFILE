package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class docifletufile {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("achuong.txt");
        int i = -1;
        while ((i = is.read()) != -1) {
            System.out.println((char) i);
        }
        is.close();


    }
}
