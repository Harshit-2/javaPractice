package com.company;

public class CWH_85_Ch_14_RealityOfFinally_2 {
    public static void main(String[] args) {
        try {
            System.out.println(50 / 0);
        } finally {
            System.out.println("Yes this is finally");
        }
    }
}
// ==> try can be executed with finally (without catch)
// ==> It will be executed completely, but you will also see an error as there is no catch block to handel the error occurred....
