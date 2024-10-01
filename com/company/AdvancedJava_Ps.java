package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class CWH_AdvancedJava_Ps {
    public static void main(String[] args) {
//        Question 1 --> Create an ArrayList and store the names of ten students inside it. Print it using a for each loop.

//        Answer -->
//        ArrayList<String> l1 = new ArrayList<>();
//        l1.add("ChoYiHyun");
//        l1.add("ParkSooYoung");
//        l1.add("LeeSiYoung");
//        l1.add("Arin");
//        l1.add("SonYeJin");
//        l1.add("LeeJiEun");
//        l1.add("JoBoAh");
//        l1.add("HanSoHee");
//        l1.add("MoonGaYoung");
//        l1.add("HanHyoJo");
//        for (String e : l1) {
//            System.out.println(e);
//        }


//        Question 2 --> Use the Date class in Java to print the time in the following format : 21:47:02.

//        Answer -->
//        Date d1 = new Date();
//        System.out.println(d1.getHours() + ":" + d1.getMinutes() + ":" + d1.getSeconds());


//        Question 3 --> Repeat question number 2 using the Calendar class.

//        Answer -->
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));


//        Question 4 --> Repeat question number 2 using java.time API.

//        Answer -->
//        LocalDateTime l1 = LocalDateTime.now();
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
//        String str = df.format(l1);
//        System.out.println(str);


//        Question 5 --> Create a Set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored.

//        Answer -->
//        HashSet<Integer> hs = new HashSet<>();
//        hs.add(1);
//        hs.add(2);
//        hs.add(3);
//        hs.add(4);
//        hs.add(1);
//        hs.add(3);
//        hs.add(5);
//        System.out.println(hs);


    }
}
