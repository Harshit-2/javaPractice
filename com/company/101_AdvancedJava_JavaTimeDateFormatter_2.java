package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_AdvancedJava_JavaTimeDateFormatter_2 extends Thread {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;// Formatting the date in the ISO format

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date in ISO format : " + myDate);
    }
}
