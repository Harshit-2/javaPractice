package com.company;

import java.util.Calendar;

public class CWH_98_AdvancedJava_TheCalendarClass_5 extends Thread {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(" The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR));

    }
}
