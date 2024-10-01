package com.company;

import java.util.ArrayDeque;

public class CWH_93_AdvancedJava_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);    // Throws exception
        ad1.offerFirst(10); // Does not throw exception
        System.out.println(ad1);
    }
}
