package com.company;

interface DemoAno {
    void meth1();
    void meth2();
}


public class CWH_109_AdvancedJava2_AnonymousClassesAndLambdaExpressions_6 {
    public static void main(String[] args) {
        // Anonymous Class
        DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2");
            }
        };
        obj.meth1();
        obj.meth1();
    }
}
