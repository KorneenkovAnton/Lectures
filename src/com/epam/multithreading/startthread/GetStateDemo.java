package com.epam.multithreading.startthread;


public class GetStateDemo implements Runnable {

    public void run() {
        // Returns the state of this thread.
        Thread.State state = Thread.currentThread().getState();
        System.out.println(Thread.currentThread().getName() + " " + state);
    }
    public static void main(String args[]) {
        Thread th1 = new Thread(new GetStateDemo());
        th1.start();
        try {
            th1.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        // Returns the state of the thread.
        Thread.State state = th1.getState();
        System.out.println(th1.getName() + " " + state);
    }
}
