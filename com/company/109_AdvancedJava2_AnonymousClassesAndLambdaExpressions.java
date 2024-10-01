package com.company;

@FunctionalInterface
interface Animal {
    void bark();
}

class Dog implements Animal {

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}

public class CWH_109_AdvancedJava2_AnonymousClassesAndLambdaExpressions {
    public static void main(String[] args) {
        Dog Bruno = new Dog();
        Bruno.bark();
    }
}
