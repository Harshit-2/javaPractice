package com.company;

public class CWH_84_Ch_14_ThrowVsThrows {
    public static int divide(int a, int b) throws ArithmeticException {
        // Made By Harry
        return a / b;
    }

    public static void main(String[] args) {

        // Shivam - uses divide function created by Harry
        try {
            int c = divide(6, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
