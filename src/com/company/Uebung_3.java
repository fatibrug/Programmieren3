package com.company;

import java.io.File;

public class Uebung_3 {

    public static void main(String[] args) {

        File filedir = new File("C:\\");

        listFilesAndDirectoriesWithSubFolders(filedir.getAbsolutePath());
    }


    private static void listFilesAndDirectoriesWithSubFolders(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if(list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                //rekrusiver Aufruf
                System.out.println("Dir: " + f.getAbsoluteFile());
            } else {
                System.out.println("File: " + f.getAbsoluteFile());
            }


        }

    }

}