package com.company;

import java.util.Calendar;

public class CWH_98_AdvancedJava_TheCalendarClass_4 extends Thread {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getWeeksInWeekYear());
    }
}
