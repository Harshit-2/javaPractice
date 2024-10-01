package com.company;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CWH_111_AdvancedJava2_FileHandling_7 {
    public static void main(String[] args) {
        // Reading a file
        File myFile = new File("cwh111file.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
