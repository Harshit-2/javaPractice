package com.company;

import java.time.LocalDate;

public class CWH_100_AdvancedJava_JavaTimeAPI_6 extends Thread {
    public static void main(String[] args) {
        LocalDate d = LocalDate.parse("2021-05-27");
        LocalDate d1 = LocalDate.parse("2021-05-26");
        LocalDate d2 = LocalDate.parse("2021-05-26");

        System.out.println(d1.equals(d));
        System.out.println(d2.equals(d1));
    }
}
