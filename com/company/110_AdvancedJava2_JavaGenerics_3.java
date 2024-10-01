package com.company;

import java.util.ArrayList;

public class CWH_110_AdvancedJava2_JavaGenerics_3 {
    public static void main(String[] args) {
        // Without Java Generics :

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  //Integer value
        myArrayList.add("Harry Bhai!"); //String value
        myArrayList.add(20.4); //Double value

//        int x = myArrayList.get(0);     // Will throw an Error because we've not typecasted the object into the integer type
        int x = (int) myArrayList.get(0); //b=object typecasted into integer
        System.out.println(x);
    }
}
