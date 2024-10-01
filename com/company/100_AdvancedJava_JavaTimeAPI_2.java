package com.company;

import java.time.Clock;

public class CWH_100_AdvancedJava_JavaTimeAPI_2 extends Thread {
    public static void main(String[] args) {
        Clock cl = Clock.systemUTC();
        System.out.println(cl.instant());
    }
}

// For more info visit ==> https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/Clock.html#tick(java.time.Clock,java.time.Duration)