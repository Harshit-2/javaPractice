package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_AdvancedJava_JavaTimeDateFormatter extends Thread {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date is : " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // This is the format

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date after formatting : " + myDate);
    }
}
