package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class CWH_98_AdvancedJava_TheCalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());

        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone().getID());
    }
}
