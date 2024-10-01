package com.company;

public class CWH_33_Ch_7_VariableArguments_2 {

    static int sum(int x, int ...arr) {     // Making at least one argument compulsory in VarArg
        //  Available as int [] arr;
        int result = x;
        for (int a: arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {

        // System.out.println(sum());   // --> This will give error
        System.out.println(sum(10));
        System.out.println(sum(1,2));
        System.out.println(sum(2,3,4));
        System.out.println(sum(4,5,6));

    }
}
