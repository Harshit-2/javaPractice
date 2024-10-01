package com.company;

class MyNewThr3 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyNewThr4 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My Thank you: ");
        }
    }
}

public class CWH_75_Ch_13_JavaThreadMethods_5 {
    public static void main(String[] args) {
        MyNewThr3 t1 = new MyNewThr3();
        MyNewThr4 t2 = new MyNewThr4();
        t1.start();
        t2.start();

    }
}

// For more info visit ==> https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Thread.html