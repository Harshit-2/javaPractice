package com.company;

// Question 1 --> Create a class and a method with deprecated annotation. What is its effect on program execution?

// Solution -->

//class MyDeprecated {
//    @Deprecated
//    void meth1() {
//        System.out.println("I am a deprecated method");
//    }
//}


// Question 2 --> Suppress the warning generated in question number 2.

// Solution -->

//class MyDeprecated {
//    @Deprecated
//    void meth1() {
//        System.out.println("I am a deprecated method");
//    }
//}


// Question 3 --> Create an interface and generate an instance from it.

// Solution -->

//interface MyInterface {
//    public void display();
//}


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CWH_Ch_16_AdvancedJava2_Ps {
    //    Answer 2 -->
//    @SuppressWarnings("deprecation")

    public static void main(String[] args) {

//        Answer 1 -->
//        MyDeprecated md = new MyDeprecated();
//        md.meth1();
//        There is no as such special effect on the program of deprecated annotation. The only thing is that compiler generated a waning if we use deprecated method or class in our program.

//        Answer 2 -->
//        MyDeprecated md = new MyDeprecated();
//        md.meth1();

//        Answer 3 -->
//        MyInterface mi = new MyInterface() {
//            @Override
//            public void display() {
//                System.out.println("I am an interface");
//            }
//        };

//         Question 4 --> Write a Java program to generate a multiplication table of a given number and write it to a file.

//        Solution -->

        Scanner sc = new Scanner(System.in);
        StringBuilder table = new StringBuilder();
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            table.append(n).append(" * ").append(i).append(" = ").append(n * i).append("\n");
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table.toString());
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
