package com.epam.multithreading.synchro;


public class SynchroBlockDemo {
    public static synchronized void staticA() {
        System.out.println("entering staticA()");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException x) {
        }
        System.out.println("leaving staticA()");
    }
    public static void staticB() {
        synchronized (SynchroBlockDemo.class) {
            System.out.println("in staticB() : inside sync block");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException x) {
            }
        }
    }
}
