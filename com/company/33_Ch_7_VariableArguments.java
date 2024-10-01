package com.company;

public class CWH_33_Ch_7_VariableArguments {

//    static int sum(int a, int b) {
//        return a + b;
//    }
//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }

//    Better way is by using VarArgs
    static int sum(int ...arr) {
        //  Available as int [] arr;
        int result = 0;
        for (int a: arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(sum());
        System.out.println(sum(1,2));
        System.out.println(sum(2,3,4));
        System.out.println(sum(4,5,6,7));

    }
}
