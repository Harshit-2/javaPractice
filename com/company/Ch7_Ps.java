package com.company;
import java.util.Scanner;

public class CWH_Ch7_Ps {
//    Question 1 --> Write a Java method to print the multiplication table of a number n.

//    static void multiplicationTable(int n)
//    {
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println(n + " * " + i + " = " + n*i);
//        }
//    }


//    Question 2 --> Write a program using functions to print the following pattern:
//    *
//    *   *
//    *   *   *
//    *   *   *   *

//    static void pattern()
//    {
//        for (int i = 0; i <= 4; i++)
//        {
//            for (int j = 0; j < i; j++)
//            {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }


//    Question 3 --> Write a recursive function to calculate the sum of first n natural numbers.

//    static int sum(int n) {
//        if (n == 1) {
//            return 1;
//        } else {
//            return (n + sum(n - 1));
//        }
//    }


//    Question 4 --> Write a function to print the following pattern:
//            *   *   *   *
//            *   *   *
//            *   *
//            *

//    static void pattern()
//    {
//        for (int i = 4; i > 0; i--)
//        {
//            for (int j = i; j > 0; j--)
//            {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }


//    Question 5 --> Write a function to print the nth term of the Fibonacci series using recursion.
//         0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

//    static int fib(int n)
//    {
//        if (n == 1)     //  n is position
//        {
//            return 0;
//        }
//        else if (n == 2)
//        {
//            return 1;
//        }
//        else {
//            return (fib(n - 2) + fib (n - 1));
//        }
//    }

//    Question 6 --> Write a function to find the average of a set of numbers passed as arguments.

//    static float avg(float... arr)
//    {
//        float average = 0, x = 0;
//        for (float e : arr)
//        {
//            x += e;
//            average = x / arr.length;
//        }
//        return average;
//    }


//    Question 7 --> Repeat problem 4 using Recursion.

//    static void pattern(int n)
//    {
//        if (n > 0)
//        {
//            pattern(n-1);
//            for (int i = 0; i < n; i++)
//            {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }


//        Question 8 --> Repeat problem 2 using Recursion. ##################################################################################################

//    static void pattern(int n)
//    {
//        if (n > 0)
//        {
//            pattern(n-1);
//            for (int i = n; i < 0; i--)
//            {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }


//    Question 9 --> Write a function to convert Celsius temperature into Fahrenheit.

//    static float temp(float t) {
//            return ((t*9/5)+32);
//    }


//    Question 10 --> Repeat problem 3 using an iterative approach.

//    static int sum(int n)
//    {
//        int addition = 0;
//        for (int i = 1; i <= n; i++)
//        {
//            addition +=i;
//        }
//        return addition;
//    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Answer 1 -->
//        System.out.println("Enter a number");
//        int x = sc.nextInt();
//        System.out.println("Multiplication Table of " + x + " is -->");
//        multiplicationTable(x);

//        Answer 2 -->
//        pattern();

//        Answer 3 -->
//        System.out.println("Enter a number");
//        int x = sc.nextInt();
//        System.out.println("Sum of first " + x + " natural numbers is --> " + sum(x));

//        Answer 4 -->
//        pattern();

//        Answer 5 -->
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        System.out.println(num + " term in Fibonacci series is --> " + fib(num));

//        Answer 6 -->
//        System.out.println(avg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

//        Answer 7 -->
//        pattern(4);

//        Answer 8 -->
//        pattern(4);

//        Answer 9 -->
//        System.out.println("Enter Temperature in Celsius");
//        int x = sc.nextInt();
//        System.out.println("Temperature in Fahrenheit is --> " + temp(x) + " C");

//        Answer 10 -->
//        System.out.println("Enter a number");
//        int x = sc.nextInt();
//        System.out.println("Sum of first " + x + " natural numbers is --> " + sum(x));


    }
}
