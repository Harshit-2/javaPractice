package com.company;

import java.util.ArrayList;

public class CWH_91_AdvancedJava_ArrayList_6 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(3);

        System.out.println("L1 Array list : " + l1);
        System.out.println("The first occurrence of 3 in l1 is at index : " + l1.indexOf(3));
    }
}
