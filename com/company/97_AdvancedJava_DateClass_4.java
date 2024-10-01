package com.company;

import java.util.Date;

public class CWH_97_AdvancedJava_DateClass_4 extends Thread {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println("The current time is : " + d.getTime());
        System.out.println("The current year is : " + d.getYear()); //22

    }
}
