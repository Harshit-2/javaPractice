package com.company;

import java.util.LinkedList;

public class CWH_92_AdvancedJava_LinkedList_3 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(66);
        System.out.println("L1 Linked list before: " + l1);

        l1.set(2, 10); //changes element present at 2nd index (33 changed to 10)
        System.out.println("L1 Linked list after: " + l1);

    }
}
