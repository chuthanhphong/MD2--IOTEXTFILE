package test;

import java.io.*;

public class TestdataInputstream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream(args[0]);
            DataInputStream din = new DataInputStream(fin);
            while (true){
                System.out.println(din.readInt());
            }

        } catch (EOFException e) {
            System.out.println("null");
        } catch (IOException e) {
            System.out.println("none");
        }
    }
}
