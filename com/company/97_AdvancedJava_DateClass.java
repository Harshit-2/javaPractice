package com.company;

import java.util.Date;

public class CWH_97_AdvancedJava_DateClass extends Thread {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("The current date is : " + d);

        Date d1 = new Date(1621709639111L);
        System.out.println("The date calculated form milliseconds is : " + d1);

    }
}
