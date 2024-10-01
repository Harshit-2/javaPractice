package com.company;

import java.util.HashSet;

public class CWH_95_AdvancedJava_HashSet_5 {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(16);
        myHashSet.add(33);
        myHashSet.add(78);
        myHashSet.add(19);
        myHashSet.add(29);
        myHashSet.add(10);

        System.out.println("The size of myHashSet is : " + myHashSet.size());
    }
}
