package com.epam.multithreading.synchro;


public class SynchroMethodDemo {
    private String objID;
    public SynchroMethodDemo(String objID) {
        this.objID = objID;
    }
    public synchronized void doStuff(int val) {
        print("entering doStuff()");
        int num = val * 2 + objID.length();
        print("local variable num=" + num);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException x) {
        }
        print("leaving doStuff()");
    }
    public void print(String msg) {
        threadPrint("objID=" + objID + " - " + msg);
    }
    public static void threadPrint(String msg) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ": " + msg);
    }

}
