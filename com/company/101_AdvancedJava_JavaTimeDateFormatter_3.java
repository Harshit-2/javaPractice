package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_AdvancedJava_JavaTimeDateFormatter_3 extends Thread {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;

        String myDate = dt.format(df);
        System.out.println("Date in ISO_WEEK_DATE Format  : " + myDate);
    }
}
