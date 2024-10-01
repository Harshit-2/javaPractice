package com.company;
import java.util.Scanner;  // Importing  the Scanner class

public class CWH_05_Ch_1_TakingInput_4 {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();   // to take one word string      --> next()
        String str = sc.nextLine(); // to take multiple word string --> nextLine()
        System.out.println(str);
    }
}