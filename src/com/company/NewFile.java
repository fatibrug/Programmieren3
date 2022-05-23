package com.company;

import java.io.File;
import java.io.IOException;

public class NewFile {

    public static void main(String[] args) throws IOException {

        String fileSeperator = System.getProperty("file.separator");
        System.out.println("File Separator: " + fileSeperator);

        File file = new File("C:\\Users\\s51634\\Desktop\\text.txt");
        File file2 = new File("C: " + fileSeperator + " Users " + fileSeperator + "s51634 " + fileSeperator +
                " Desktop" + fileSeperator + " text.txt");
        File html = new File("test.html");

        System.out.println(file.getName());
        if (file.createNewFile()) {
            System.out.println("New File! ");
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getParentFile());
        } else {
            System.out.println("Already exists: ");

        }
    }
}