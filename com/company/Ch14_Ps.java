package com.company;

import java.util.Scanner;

// Answer 4 -->

//class CustomException extends Exception {
//    @Override
//    public String toString() {
//        return "Max tries reached";
//    }
//
//    @Override
//    public String getMessage() {
//        return "Max tries reached";
//    }
//}


public class CWH_Ch_14_Ps {

//    Answer 5 -->

    public static void index() throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int i = 0;
        while (i <= 5) {
            System.out.println("Enter array index");
            int x = sc.nextInt();
            try {
                System.out.println("Value at index " + x + " is --> " + arr[x]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Question 1 --> Write a java program to demonstrate syntax, logical & runtime errors

//        int a = 7     ==> Syntax Error

//        int age = 19;
//        int yearBorn = 2000-19;   ==> Logical Error

//        int a = 15;
//        int b = 0;
//        System.out.println(a/b);  ==> Runtime Error


//        Question 2 -->  Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.

//        int a = 100;
//        int b = 0;
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//            System.out.println("HaHa");
//        } catch (IllegalArgumentException e) {
//            System.out.println("HeHe");
//        }


//        Question 3 --> Write a program that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print "errors".

//        int [] arr = {10, 20, 30, 40, 50};
//            int i = 0;
//            boolean flag = true;
//            while (flag) {
//                if (i <= 5) {
//                    System.out.println("Enter array index");
//                    int x = sc.nextInt();
//                    try {
//                        System.out.println(arr[x]);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                } else {
//                    System.out.println("errors");
//                    flag = false;
//                }
//                i++;
//            }


//        Question 4 --> Modify program in Q3 to throw a custom Exception if max retries are reached.

//        int[] arr = {10, 20, 30, 40, 50};
//        int i = 0;
//        while (i <= 5) {
//            System.out.println("Enter array index");
//            int x = sc.nextInt();
//            try {
//                System.out.println("Value at index " + x + " is --> " + arr[x]);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            i++;
//        }
//        try {
//            throw new CustomException();
//        } catch (CustomException e) {
//            System.out.println(e.getMessage());
//        }


//        Question 5 --> Wrap the program in Q3 inside a method which throws your custom Exception.
//  ##################################################### incorrect #####################################################
        try {
            index();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
