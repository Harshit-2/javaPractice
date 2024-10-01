package com.company;

import java.util.Date;

public class CWH_97_AdvancedJava_DateClass_3 extends Thread {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println("The number of milliseconds passed since Jan 1, 1970 :" + d.getTime());

    }
}
