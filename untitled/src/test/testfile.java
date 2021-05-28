package test;

import java.io.*;

public class testfile {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11};
        try {
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);
            for (int i = 0; i < arr.length; i++) {
                dout.writeInt(arr[i]);
                dout.close();
            }
        } catch (ArrayIndexOutOfBoundsException | IOException e) {
            System.out.println("mảng sai");
        }
    }
}



