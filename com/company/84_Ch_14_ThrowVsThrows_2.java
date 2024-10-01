package com.company;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class CWH_84_Ch_14_ThrowVsThrows_2 {

    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        try {
            double ar = area(-6);
            System.out.println(ar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thnx");
    }
}
