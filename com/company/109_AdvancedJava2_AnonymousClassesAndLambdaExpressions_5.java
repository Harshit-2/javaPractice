// Lambda Expressions :
// (parameter1, parameter2) -> { code to be executed }

package com.company;

@FunctionalInterface
interface LambaExp {
    void meth1(int a, int b);
}

public class CWH_109_AdvancedJava2_AnonymousClassesAndLambdaExpressions_5 {
    public static void main(String[] args) {

        LambaExp obj = (a, b) -> {
            System.out.println("The value of a and b is : " + a + "," + b);
        };
        obj.meth1(5, 10);
    }
}
