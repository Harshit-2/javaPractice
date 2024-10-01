package com.company;

import java.util.ArrayList;

public class CWH_110_AdvancedJava2_JavaGenerics {
    public static void main(String[] args) {
        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  //Integer value
        myArrayList.add("Harry Bhai!"); //String value
        myArrayList.add(20.4); //Double value
        System.out.println(myArrayList);
    }
}
