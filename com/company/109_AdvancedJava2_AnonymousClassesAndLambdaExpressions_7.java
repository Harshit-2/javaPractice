package com.company;

@FunctionalInterface
interface DemoAno1 {
    void meth1(int a);
}

public class CWH_109_AdvancedJava2_AnonymousClassesAndLambdaExpressions_7 {
    public static void main(String[] args) {

        // Lambda Expressions
        DemoAno1 obj = (a) -> {
            System.out.println("I am method 1 from this lambda " + a);
        };
        obj.meth1(6);
    }
}
