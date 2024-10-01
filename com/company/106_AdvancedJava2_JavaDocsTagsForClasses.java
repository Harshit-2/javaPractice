package com.company;

/**
 * <i>This is a simple documentation to show that HTML elements can be included in JavaDoc.</i>
 * @see <a href="https://www.codewithharry.com/videos/java-tutorials-for-beginners-1">Best Java Course Available For <b>Free</b></a>
 */

public class CWH_106_AdvancedJava2_JavaDocsTagsForClasses {

    /**
     * This method is used to return the division of two numbers
     *
     * @param a First parameter -  Integer
     * @param b Second parameter - Integer
     * @return Integer
     * @throws ArithmeticException if divided by 0
     */
    public int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}
