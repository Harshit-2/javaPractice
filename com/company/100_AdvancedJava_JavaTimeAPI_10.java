package com.company;

import java.time.LocalTime;

public class CWH_100_AdvancedJava_JavaTimeAPI_10 extends Thread {
    public static void main(String[] args) {
        LocalTime t = LocalTime.of(15, 28, 19);
        System.out.println("Time before : " + t);

        LocalTime t1 = t.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + t1);
    }
}
