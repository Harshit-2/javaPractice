package com.company;

import java.io.File;
import java.io.IOException;

public class CWH_111_AdvancedJava2_FileHandling_5 {
    public static void main(String[] args) {
        // Code to create a new file

        File myFile = new File("cwh111file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
    }
}
