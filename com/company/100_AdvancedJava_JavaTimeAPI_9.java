package com.company;

import java.time.LocalTime;

public class CWH_100_AdvancedJava_JavaTimeAPI_9 extends Thread {
    public static void main(String[] args) {
        LocalTime t = LocalTime.of(13, 18, 29);
        System.out.println("Time before : " + t);

        LocalTime t1 = t.plusHours(5);
        System.out.println("Time after adding 5 hours : " + t1);
    }
}
