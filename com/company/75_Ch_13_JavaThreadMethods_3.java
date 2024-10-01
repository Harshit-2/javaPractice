package com.company;

class CWH2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
    }
}

public class CWH_75_Ch_13_JavaThreadMethods_3 {
    public static void main(String[] args) {
        CWH2 t = new CWH2();
        t.start();
        t.interrupt();
        System.out.println("Main Thread");

    }
}
