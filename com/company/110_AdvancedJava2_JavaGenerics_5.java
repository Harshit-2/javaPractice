package com.company;

import java.util.ArrayList;

class MyGeneric1<T1> {
    int val;
    private T1 t1;

    public MyGeneric1(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class CWH_110_AdvancedJava2_JavaGenerics_5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(54);
        arrayList.add(643);

        int a = (int) arrayList.get(0);
        MyGeneric1<String> g1 = new MyGeneric1(23, "MyString is my string ");
        String str = g1.getT1();
        System.out.println(str);
    }
}
