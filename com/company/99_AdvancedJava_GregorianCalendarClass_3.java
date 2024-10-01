package com.company;

import java.util.GregorianCalendar;

public class CWH_99_AdvancedJava_GregorianCalendarClass_3 extends Thread {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Calendar : " + c.getTime());

        System.out.println("The hashcode for this calendar is : " + c.hashCode());
    }
}
