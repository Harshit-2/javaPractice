package com.company;

import java.util.Date;

public class CWH_97_AdvancedJava_DateClass_2 extends Thread {
    public static void main(String[] args) {
        Date d = new Date();

        Date d1 = new Date(2021, 12, 24);  //both dates are different
        System.out.println(d1.compareTo(d));
//        Checks for the equality of the two dates.
//        Returns 0 if the dates are equal; else, returns 1

    }
}
