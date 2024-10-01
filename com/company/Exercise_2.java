
//  Create a simple Rock, Paper Scissors game in Java. (#Use Conditional Statements)
package com.company;
import java.util.Scanner;
import java.util.Random;

public class CWH_Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("0 --> Rock");
            System.out.println("1 --> Paper");
            System.out.println("2 --> Scissor");
            System.out.println("Enter your choice");
            int user = sc.nextInt();
            System.out.println("Your choice --> " + user);
            Random rand = new Random(); // instance of random class
            int upperbound = 3; // generate random values from 0-2
            int comp = rand.nextInt(upperbound);

            if (user > 2) {
                System.out.println("Enter a valid number");
            } else if (user == 0 & comp == 2) {
                System.out.println("Opponent's choice --> " + comp);
                System.out.println("You Won");
            } else if (comp == 0 & user == 2) {
                System.out.println("Opponent's choice --> " + comp);
                System.out.println("You Lost");
            } else if (user > comp) {
                System.out.println("Opponent's choice --> " + comp);
                System.out.println("You Won");
            } else if (user == comp) {
                System.out.println("Opponent's choice --> " + comp);
                System.out.println("Tie");
            } else {
                System.out.println("Opponent's choice --> " + comp);
                System.out.println("You Lost");
            }
        }
    }
}

// 1>0
// 2>1
// 0>2
