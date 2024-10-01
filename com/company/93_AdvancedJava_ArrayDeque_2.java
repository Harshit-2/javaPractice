package com.company;

import java.util.ArrayDeque;

public class CWH_93_AdvancedJava_ArrayDeque_2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addLast(5);     // Throws exception
        ad1.offerLast(10);  // Does not throw exception

        System.out.println(ad1);
    }
}
