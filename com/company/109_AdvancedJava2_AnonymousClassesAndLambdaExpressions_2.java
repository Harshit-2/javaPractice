// Now same with Anonymous class

package com.company;

@FunctionalInterface
interface Animal1 {
    void bark();
}

public class CWH_109_AdvancedJava2_AnonymousClassesAndLambdaExpressions_2 {
    public static void main(String[] args) {
        Animal1 Bruno = new Animal1() {
            @Override
            public void bark() {
                System.out.println("Dog barks!");
            }
        };
        Bruno.bark();
    }
}

//    The Anonymous class in Java can be created by two ways :

        // By extending a class
        // By implementing an interface
        // Let's take an example for both ways listed above.