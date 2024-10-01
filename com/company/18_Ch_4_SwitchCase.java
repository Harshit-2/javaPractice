package com.company;

public class CWH_18_Ch_4_SwitchCase {
    public static void main(String[] args) {
        String var = "Saurabh";


        switch (var) {
            case "Shubham":
                System.out.println("You are going to become an Adult!");
            break;
            case "Saurabh":
                System.out.println("You are going to join a Job!");
            break;
            case "Vishaka":
                System.out.println("You are going to get retired!");
            break;
            default:
                System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");
    }
}
