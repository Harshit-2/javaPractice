// The Scanner class is used to read a file.
// It is important to enclose the method in a try-catch block to handle the IOException.

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CWH_111_AdvancedJava2_FileHandling_3 {
    public static void main(String[] args) {
        File myFile = new File("CWH_file1.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
