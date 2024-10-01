package com.company;

public class CWH_96_AdvancedJava_DateAndTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());     // Gives no. of milliseconds passed since 1 Jan 1970
        System.out.println("Total no. of years passed since 1970 --> " + System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);
        System.out.println("Total no. of days passed since 1970 --> " + System.currentTimeMillis() / 1000 / 60 / 60 / 24);
        System.out.println("Total no. of hours passed since 1970 --> " + System.currentTimeMillis() / 1000 / 60 / 60);
        System.out.println("Total no. of minutes passed since 1970 --> " + System.currentTimeMillis() / 1000 / 60);
        System.out.println("Total no. of seconds passed since 1970 --> " + System.currentTimeMillis() / 1000);

    }
}
