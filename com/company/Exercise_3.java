package com.company;
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.exit;

// Create a class Game, which allows a user to play "Guess the Number" game once.

//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc. to get this task done!

class Game {
    int number;
    int counter = 1;
    int comp;
    public Game() {
        Random rand = new Random();
        int upperbound = 101;
        comp = rand.nextInt(upperbound);
//        System.out.println("Random number chosen --> " + comp);
    }
    public void takeUserInput() {
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            isCorrectNumber();
            counter++;
    }
    public void isCorrectNumber() {
        int i = 1;
        do {
            i++;
            if (number > 100) {
                System.out.println("Enter a valid number");
                break;
            } else if (number > comp) {
                System.out.println("Choose a lower number");
                break;
            } else if (number < comp) {
                System.out.println("Choose a higher number");
                break;
            } else if (comp == number) {
                System.out.println("Yes you guessed it right, it was --> " + comp);
                System.out.println("Total Guesses --> " + getNoOfGuesses());
                exit(0);
            } else {
                System.out.println("Enter a valid number");
                break;
            }
        } while (i <= comp);
    }

    public void setNoOfGuesses(int z) {
        counter = z;
    }
    public int getNoOfGuesses()
    {
        return counter;
    }
}


public class CWH_Exercise_3 {
    public static void main(String[] args) {
        System.out.println("You can start by making a guess of any number from 0 - 100\n\tALL THE BEST");
        Game obj = new Game();
        for (int i = 1; i <= obj.comp; i++) {
            obj.takeUserInput();
        }
        obj.isCorrectNumber();
        obj.setNoOfGuesses(obj.counter);
//        System.out.println("Total Guesses --> " + obj.getNoOfGuesses());
    }
}
