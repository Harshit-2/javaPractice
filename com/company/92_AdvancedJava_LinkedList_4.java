package com.company;

import java.util.LinkedList;

public class CWH_92_AdvancedJava_LinkedList_4 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(66);
        System.out.println("L1 Linked list before: " + l1);

        l1.addLast(100); //Inserting 100 at the end of L1
        System.out.println("L1 Linked list after inserting element at last index: " + l1);
    }
}
