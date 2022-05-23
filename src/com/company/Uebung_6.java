package com.company;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;


public class Uebung_6 {

    File dir = new File("C:\\Users\\s51634\\Desktop\\Neuer_Ordner");


    public static void main(String[] args) {


        public static void createFiles (File directory)throw IOException {
            for (int i = 0; i <= 10; i++) {
                File myUE6File = new File(directory.getAbulutPath() + "//" + ThreadLocalRandom.current().nextInt() + ".mp3");

                if (myUE6File.createNewFile()) {
                    System.out.println("File created: " + myUE6File.getAbsolutePath());
                } else {
                    System.out.println("File already exists.");

                }
            }
        }


        public static void renameFiles (File directory){
            if (directory.isDirectory()) {
                for (File oldFile : directory.listFiles()) {
                    File newFile = new File(oldFile.getParent() + "\\1" + oldFile.getName());
                    if (oldFile.renameTo(newFile)) {
                        System.out.println("Rename " + oldFile.getAbsolutePath() + "to: " + newFile.getAbsolutePath());
                    } else {
                        System.out.println("Sorry the file can't be renamed!");
                    }
                }
            }
        }

        public static void deliteFiles(File directory){
            if (directory.isDerectory()){
                for (File file : directory.listFiles()){
                    file.delete();
                    System.out.println("DELITED! " + file.getAbsolutePath());
                }
            }
        }
    }
}


