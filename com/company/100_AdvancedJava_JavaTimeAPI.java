package com.company;

import java.time.Clock;

public class CWH_100_AdvancedJava_JavaTimeAPI extends Thread {
    public static void main(String[] args) {
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
    }
}
