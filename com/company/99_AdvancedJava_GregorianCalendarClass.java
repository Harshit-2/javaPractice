package com.company;

import java.util.GregorianCalendar;

public class CWH_99_AdvancedJava_GregorianCalendarClass extends Thread {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2021));
        System.out.println(cal.isLeapYear(1900));
    }
}
