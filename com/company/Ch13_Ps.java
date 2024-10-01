package com.company;

// Question 1 --> Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.

//class Gm extends Thread {
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println("Good Morning");
//        }
//    }
//}
//class Wel extends Thread {
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println("Welcome");
//        }
//    }
//}


// Question 2 -->  Add a step method in the welcome thread of question 1 to delay its execution for 200ms.

//class Gm extends Thread {
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println("Good Morning");
//        }
//    }
//}
//class Wel extends Thread {
//    @Override
//    public void run() {
//        while (true) {
//            try {
//                System.out.println("Welcome");
//                Thread.sleep(200);
//            }
//            catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
//}


// Question 3 --> Demonstrate gerPriority() and setPriority() methods in Java threads.

//class Thread1 extends Thread {
//    @Override
//    public void run() {
//        int i = 0;
//        while (i < 10000) {
//            System.out.println("Hello");
//            i++;
//        }
//    }
//}
//class Thread2 extends Thread {
//    @Override
//    public void run() {
//        int i = 0;
//        while (i < 10000) {
//            System.out.println("Hi");
//            i++;
//        }
//    }
//}


// Question 4 --> How do you get the state of a given thread in Java?

// Answer 4 -->  getState() method is used to get the state of a given thread in Java.

//class Thread1 extends Thread {
//    @Override
//    public void run() {
//        int i = 0;
//        while (i < 10000) {
//            System.out.println("Hello");
//            i++;
//        }
//    }
//}
//class Thread2 extends Thread {
//    @Override
//    public void run() {
//        int i = 0;
//        while (i < 10000) {
//            System.out.println("Hi");
//            i++;
//        }
//    }
//}


// Question 5: How do you get the reference to the current thread in Java?

// Answer 5: currentThread() method is used to reference the current thread in Java.

class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("Hello");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("Hi");
            i++;
        }
    }
}

public class CWH_Ch_13_Ps {
    public static void main(String[] args) {

//        Answer 1 -->
//        Gm t1 = new Gm();
//        Wel t2 = new Wel();
//
//        t1.start();
//        t2.start();
//    }

//        Answer 2 -->
//        Gm t1 = new Gm();
//        Wel t2 = new Wel();
//
//        t1.start();
//        t2.start();

//        Answer 3 -->
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//
//        t1.setPriority(6);
//        t2.setPriority(9);
//
//        System.out.println("Priority of Thread 1 --> " + t1.getPriority());
//        System.out.println("Priority of Thread 2 --> " + t2.getPriority());Thread1 t1 = new Thread1();

//        Answer 4 -->
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//
//        System.out.println("State of Thread 1 --> " + t1.getState());
//        t2.start();
//        System.out.println("State of Thread 2 --> " + t2.getState());
//
//        Answer 5 -->
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        System.out.println("Reference of Thread 1 --> " + Thread.currentThread().getState());
        System.out.println("Reference of Thread 2 --> " + Thread.currentThread());
    }
}
