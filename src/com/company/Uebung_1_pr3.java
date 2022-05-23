package com.company;

import java.io.File;

public class Uebung_1_pr3 {

    public void fileInfo(File file){
        System.out.println("Does this file exist? " + file.exists());
        System.out.println("Name of the File " + file.getParent());
        System.out.println("Parent Directory of the File " + file.getPath());
        System.out.println("Is this a directory? " + file.isDirectory());
        System.out.println("Is this a file? " + file.isFile());
        System.out.println("Is this file readable " + file.canRead());
        System.out.println("Is this file writeable " + file.canWrite());
        System.out.println("File Size "  + file.getTotalSpace());



//        Create a method, which has a file as parameter
//        The method should print the following information of a file on the console:
//        - Does this file exist?
//        - Name of the File
//                - Parent Directory of the File
//        - Path to this File
//                - Is this a directory?
//        - Is this a file?
//        - Is this file readable?
//        - Is this File writeable
//        - File Size

    }
}
