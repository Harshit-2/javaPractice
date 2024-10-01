package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CWH_99_AdvancedJava_GregorianCalendarClass_2 extends Thread {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Date before rolling : " + c.getTime());

        c.roll(Calendar.MONTH, true);
        c.roll(Calendar.DATE, false);
        c.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling : " + c.getTime());
    }
}
