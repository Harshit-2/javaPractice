package com.company;

import java.util.Calendar;

public class CWH_98_AdvancedJava_TheCalendarClass_3 extends Thread {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current date is : " + c.getTime());

        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : " + c.getTime());

        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : " + c.getTime());

        c.add(Calendar.MONTH, 2);
        System.out.println("After 2 months  : " + c.getTime());

    }
}
