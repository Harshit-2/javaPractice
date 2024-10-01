package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_AdvancedJava_JavaTimeDateFormatter_5 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate1 = dt.format(df); // Creating date string using date and format
        String myDate2 = dt.format(df2); // Creating date string using date and format
        System.out.println(myDate1);
        System.out.println(myDate2);
    }
}

// For more info visit ==> https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
