package com.company;

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i < 4000) {
            System.out.println("I am a thread 1 not a threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i < 4000) {
            System.out.println("I am a thread 2 not a threat 2");
            i++;
        }
    }
}
public class CWH_71_Ch_13_JavaThreadUsingRuntimeInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

// Example:

//    class t1 implements Runnable{
//    @Override
//    public void run(){
//        System.out.println("Thread is running");
//        }
//    }

//    public class ClassName{
//        public static void main(String[] args) {
//            t1 obj1 = new t1();
//            Thread t = new Thread(obj1);
//            t.start();
//            }
//    }
