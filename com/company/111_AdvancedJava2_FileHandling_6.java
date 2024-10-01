package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class CWH_111_AdvancedJava2_FileHandling_6 {
    public static void main(String[] args) {
        // Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("This is our first file from this java course\nOkay now bye");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
