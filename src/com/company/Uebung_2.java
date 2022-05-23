package com.company;

import java.io.File;

public class Uebung_2 {

    public static void main(String[] args) {


        File filedir = new File("C:\\");
        listf(filedir.getAbsolutePath());

    }

    private static void listf(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        for (File f: list) {
            if(f.isDirectory()){
                System.out.println("Dir: " + f.getAbsoluteFile());
            }else {
                System.out.println("File: " + f.getAbsoluteFile());
            }

        }
    }


}
