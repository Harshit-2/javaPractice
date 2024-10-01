package com.company;

import java.io.File;

public class CWH_111_AdvancedJava2_FileHandling_8 {
    public static void main(String[] args) {
        // Deleting a file
        File myFile = new File("cwh111file.txt");
        if (myFile.delete()) {
            System.out.println("I have deleted: " + myFile.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
