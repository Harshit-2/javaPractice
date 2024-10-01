package com.company;

import java.util.ArrayDeque;

public class CWH_93_AdvancedJava_ArrayDeque_6 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);

        ad1.pollLast(); //deletes 19    // Does not throw exception
        ad1.removeLast(); //deletes 91  // Throws exception

        System.out.println(ad1);
    }
}

// For more info visit ==> https://docs.oracle.com/en/java/javase/17/docs/api//java.base/java/util/Deque.html