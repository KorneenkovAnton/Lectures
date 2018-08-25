package com.epam.multithreading.synchro;


public class MyResource {
    boolean ready = false;
    synchronized void waitFor() throws Exception {
        System.out.println(Thread.currentThread().getName()
                + " is entering waitFor().");
        while (!ready)
            wait();
        System.out.println(Thread.currentThread().getName()
                + " resuming execution.");
    }
    synchronized void start() {
        ready = true;
        notify();
    }
}
