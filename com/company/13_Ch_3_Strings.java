//  In Java String is a class and also a data type. So you can use it with both types.
package com.company;
import java.util.Scanner;

public class CWH_13_Ch_3_Strings {
    public static void main(String[] args) {
        // String name = new String("Harry");   // String by creating class
        // String name = "Harry";   // String as Data Type
        // System.out.print("The name is: ");
        // System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is:%8.2f", a, b);    // 8.2 means it will take total of 8 spaces and will print the number up to 2 decimal places
        //System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);
    }
}

//        System.out.print() // No newline at the end
//        System.out.println() // Prints a new line at the end
//        System.out.printf()
//        System.out.format()

//                %d for int
//                %f for float
//                %c for char
//                %s for string