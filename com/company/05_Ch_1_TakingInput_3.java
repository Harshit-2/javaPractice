package com.company;
import java.util.Scanner;  // Importing  the Scanner class

public class CWH_05_Ch_1_TakingInput_3 {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        boolean b1 = sc.hasNextInt();   // to check if it is integer or not
        System.out.println(b1);
    }
}