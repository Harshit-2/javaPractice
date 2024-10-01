// createNewFile() method is used to create a new file.

package com.company;

import java.io.File;
import java.io.IOException;

public class CWH_111_AdvancedJava2_FileHandling {
    public static void main(String[] args) {
        File myFile = new File("CWH_file1.txt");    // Specify the name of the file
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
