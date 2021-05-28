package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Stream;

public class nhapkitu {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while (true){
            System.out.println("nhập 1 tí tự");
           int ch = is.read();
            if (ch == 'q') {
                System.out.println("Finished");
                    break;
            }
            is.skip(2);
            System.out.println("ký tự nhận được " + (char)ch);


        }
    }
}
