package com.company;

import java.io.File;
import java.util.Scanner;

public class create_directory {

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Directory Name, which should be created");
        String path = scanner.next();
        System.out.println("New Direktory: " + path);

        File file = new File(path);
        boolean created = file.mkdirs();

        if (created){
            System.out.println("Directory has been created");
        }else {
            System.out.println("Directory has NOT been creted");
        }

    }


}
