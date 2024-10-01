package com.company;

class MyNewThr1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 10000) {
            System.out.println("Thank you: ");
            i++;
        }
    }
}

class MyNewThr2 extends Thread {

    public void run() {
        int i = 0;
        while (i <= 10000) {
            System.out.println("My Thank you: ");
            i++;
        }
    }
}

public class CWH_75_Ch_13_JavaThreadMethods_4 {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();

    }
}
