package com.company;

import java.time.LocalDate;

public class CWH_100_AdvancedJava_JavaTimeAPI_7 extends Thread {
    public static void main(String[] args) {
        LocalDate d = LocalDate.parse("2021-05-27");
        System.out.println(d.withYear(2001));
    }
}

// For more info visit ==> https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalDate.html#EPOCH