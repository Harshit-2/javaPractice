package com.company;

import java.util.ArrayDeque;

public class CWH_93_AdvancedJava_ArrayDeque_3 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);

        System.out.println(ad1.getFirst());     // Throws exception
        System.out.println(ad1.peekFirst());    // Does not throw exception
    }
}
