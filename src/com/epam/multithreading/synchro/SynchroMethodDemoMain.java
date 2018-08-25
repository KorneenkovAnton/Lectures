package com.epam.multithreading.synchro;


public class SynchroMethodDemoMain {
    public static void main(String[] args) {
        final SynchroMethodDemo ooim = new SynchroMethodDemo("obj1");
        Runnable runA = new Runnable() {
            public void run() {
                ooim.doStuff(3);
            }
        };
        Thread threadA = new Thread(runA, "threadA");
        threadA.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException x) {
        }
        Runnable runB = new Runnable() {
            public void run() {
                ooim.doStuff(7);
            }
        };
        Thread threadB = new Thread(runB, "threadB");
        threadB.start();
    }

}
