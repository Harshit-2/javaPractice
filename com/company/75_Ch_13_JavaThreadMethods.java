package com.company;

import java.io.*;
import java.lang.Thread;

   public class CWH_75_Ch_13_JavaThreadMethods {
       public static void main(String[] args)
       {
           try {
               for (int i = 1; i <= 10; i++) {
                   Thread.sleep(2000);
                   System.out.println(i);
               }
           }
           catch (Exception e) {
               System.out.println(e);
           }
       }
}
