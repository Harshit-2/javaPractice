package com.company;

import java.util.ArrayList;

public class CWH_91_AdvancedJava_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();  // Creates an ArrayList object of integer type
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5);  // inserts 5 at the 5th index in l1

        System.out.println(l1);
    }
}
