// FileWriter class is used with its write() method to write some content in a file.
// Do not forget to use the close() method when you're finished writing to a file.

package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CWH_111_AdvancedJava2_FileHandling_2 {
    public static void main(String[] args) {
        File myFile = new File("CWH_file1.txt");
        try {
            FileWriter fileWriter = new FileWriter("CWH_file1.txt");
            fileWriter.write("CodeWithHarry is one step solution for your all programming problems.\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
