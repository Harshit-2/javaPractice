package com.company;

import java.util.ArrayList;

public class CWH_110_AdvancedJava2_JavaGenerics_2 {
    public static void main(String[] args) {
        // With Java Generics :

        ArrayList<Integer> myArrayList = new ArrayList();
        myArrayList.add(10);  //Integer value
//        myArrayList.add("Harry Bhai!"); //String value    // Will throw an Error
//        myArrayList.add(20.4); //Double value             // Will throw an Error
        System.out.println(myArrayList);
    }
}
