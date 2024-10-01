// Creating Anonymous class by implementing an interface :

package com.company;

@FunctionalInterface
interface Human1 {
    void walk();
}

public class CWH_109_AdvancedJava2_AnonymousClassesAndLambdaExpressions_4 {
    public static void main(String[] args) {
        Human1 John = new Human1() {
            @Override
            public void walk() {
                System.out.println("John walks.");
            }
        };
        John.walk();
    }
}
