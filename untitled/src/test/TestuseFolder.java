package test;

import java.io.File;

public class TestuseFolder {
    public static void main(String[] args) {
        File dir = new File("D:\\Module2\\IOTEXTFILE");
        File[] children = dir.listFiles();
        for(File file: children){
            System.out.println(file.getAbsolutePath());
        }
        System.out.println();
        System.out.println("String[] list(): ");
        String [] path = dir.list();
        for(String paths : path){
            System.out.println(paths);
        }
    }








}
