package com.company;

import java.util.Scanner;

//  Question 1 is in CWH_Ch12_Ps in VS Code

//  Question 2 --> Use a build-in package in java to write a class which displays a message ( by using sout ) after taking input from the user

class Data{
    String str;
    public void getData() {
        System.out.println("Enter a Message...");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
    }
    public void setData() {
        System.out.println(str);
    }
}


// Question 3 & 4 are in CWH_Ch12_Ps_Question_3 and CWH_Ch12_Ps_Question_4 respectively in VS Code



public class CWH_Ch12_Ps {
    public static void main(String[] args) {
        Data d = new Data();
        d.getData();
        d.setData();
    }
}
