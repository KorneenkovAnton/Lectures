package com.epam.multithreading.synchro;


public class WaitNotifyDemo {
    public static void main(String args[]) throws Exception {
        MyResource sObj = new MyResource();
        new MyThread("MyThread", sObj);
        for (int i = 0; i < 10; i++) {
            Thread.sleep(50);
            System.out.print(".");
        }
        sObj.start();
    }
}
