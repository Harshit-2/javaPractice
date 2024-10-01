package com.company;

class InvalidInputException extends Exception {
    public String toString() {
        return "Cannot add 8 and 9";
    }
}

class CannotDivideWithZero extends Exception {
    public String toString() {
        return "Cannot divide with Zero";
    }
}

class MaxInputException extends Exception {
    public String toString() {
        return "Maximum limit reached";
    }
}

class MaxMultiplierReached extends Exception {
    public String toString() {
        return "Maximum multiplication limit reached";
    }
}

class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a + b;
    }

    double sub(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    double mul(double a, double b) throws MaxMultiplierReached, MaxInputException {
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplierReached();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a * b;
    }

    double div(double a, double b) throws CannotDivideWithZero, MaxInputException {
        if (b == 0) {
            throw new CannotDivideWithZero();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a / b;
    }
}

// You have to create a custom calculator with following operations:
//         1. + -> Addition
//         2. - -> Subtraction
//         3. * -> Multiplication
//         4. / -> Division
//         which throws the following exceptions:
//         1. Invalid input Exception eg: 8 & 9
//         2. Cannot divide by 0 Exception
//         3. Max Input Exception if any of the inputs is greater than 100000
//         4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000

public class CWH_Exercise_6 {
    public static void main(String[] args) throws InvalidInputException, CannotDivideWithZero, MaxInputException, MaxMultiplierReached {
        CustomCalculator cal = new CustomCalculator();
        System.out.println(cal.add(34, 56));
        System.out.println(cal.sub(2134, 64));
        System.out.println(cal.mul(12, 200000));
        System.out.println(cal.div(88, 100001));

    }
}