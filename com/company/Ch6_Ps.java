package com.company;
import java.util.Scanner;

public class CWH_Ch6_Ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Question 1 --> Create an array of 5 floats and calculate their sum.

//        float sum = 0;
//        float arr [] = {10.5f, 20.5f, 30.5f, 40.5f, 50.5f};
//
//        for(float element : arr)
//        {
//            sum =sum + element;
//        }
//        System.out.println("Sum --> " + sum);

        //               OR

//        for (int i = 0; i < arr.length; i++)
//        {
//            sum += arr[i];
//        }
//        System.out.println("Sum --> " + sum);


//        Question 2 --> Write a program to find out whether a given integer is present in an array or not.

//        int arr[] = {10, 20, 30, 40, 50};
//        System.out.println("Enter Value");
//        int num = sc.nextInt();
//        boolean isInArray = false;
//        for(float element:arr)
//        {
//            if(num == element)
//            {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray)
//        {
//            System.out.println("The value is present in the array");
//        }
//        else
//        {
//            System.out.println("The value is NOT present in the array");
//        }


//        Question 3 --> Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

//        float avg = 0, x = 0;
//       float physicsMarks [] = {90.5f, 56.3f, 87.9f, 48.7f, 86.0f};
//       for (float element:physicsMarks) {
//           x += element;
//           avg = x/ physicsMarks.length;
//       }
//        System.out.printf("Average marks --> %.2f", avg);


//        Question 4 --> Create a Java program to add two matrices of size 2x3.


//        int [][] mat1 = {{1, 2, 3},
//                         {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                         {3, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                           {0, 0, 0}};
//
//        for (int i = 0; i < mat1.length; i++)
//        {
//            for (int j = 0; j < mat1[i].length; j++)
//            {
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        Question 5 --> Write a Java program to reverse an array.

//        int arr [] = {1, 2, 3, 4, 5};
//        for (int i = arr.length - 1; i >= 0; i--)
//        {
//            System.out.println(arr[i]);
//        }

          //                OR

          // ✪ ************* IMPORTANT ************* (By Swapping) ✪

//        int [] arr = {1, 21, 3, 4, 5, 34, 67};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);      // floorDiv --> gives greatest integer (i.e. number before decimal)
//        int temp;
//
//        for(int i=0; i<n; i++){
//            // Swap a[i] and a[l-1-i]     // l --> length of array
//            // a   b   temp
//            // |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//
//        for(int element: arr){
//            System.out.print(element + " ");
//        }


//        Question 6 --> Write a Java program to find the maximum element in an array.

//        int arr [] = {1, -2, 3, 40, 5};
//        int max = Integer.MIN_VALUE;    // Minimum value a integer can hold
//
//        for (int e: arr)
//        {
//            if (e > max)
//            {
//                max = e;
//            }
//        }
//        System.out.println("Maximum --> " + max);


//        Question 7 --> Write a Java program to find the minimum element in an array.

//        int arr [] = {10, 2, 63, -40, 59};
//        int min = Integer.MAX_VALUE;
//        for (int e: arr)
//        {
//            if (e < min)
//            {
//                min = e;
//            }
//        }
//        System.out.println("Minimum --> " + min);


//        Question 8 --> Write a Java program to find whether an array is sorted or not.

//        boolean isSorted = true;
//        int [] arr = {1, 2, 3, 4, 5, 34, 67};
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("The Array is sorted");
//        }
//        else{
//            System.out.println("The Array is not sorted");
//        }




    }
}
