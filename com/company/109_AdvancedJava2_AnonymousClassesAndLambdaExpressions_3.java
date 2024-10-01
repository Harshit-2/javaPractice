// Creating Anonymous class by extending a class :

package com.company;

abstract class Vehicle {
    abstract void drive();
}

public class CWH_109_AdvancedJava2_AnonymousClassesAndLambdaExpressions_3 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle() {
            @Override
            void drive() {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();
    }
}
