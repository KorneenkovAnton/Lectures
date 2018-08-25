package com.epam.multithreading.synchro;


public class SynchroBlockDemoMain {
    public static void main(String[] args) {
        Runnable runA = new Runnable() {
            public void run() {
                SynchroBlockDemo.staticA();
            }
        };
        Thread threadA = new Thread(runA, "A");
        threadA.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException x) {
        }
        Runnable runB = new Runnable() {
            public void run() {
                SynchroBlockDemo.staticB();
            }
        };
        Thread threadB = new Thread(runB, "B");
        threadB.start();
    }
}
