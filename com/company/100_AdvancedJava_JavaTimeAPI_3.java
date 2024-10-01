package com.company;

import java.time.Duration;
import java.time.LocalTime;

public class CWH_100_AdvancedJava_JavaTimeAPI_3 extends Thread {
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00'
        System.out.println(d1.isNegative());

        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

        System.out.println(d2.isNegative());
    }
}
