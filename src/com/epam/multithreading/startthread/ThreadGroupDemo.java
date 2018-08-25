package com.epam.multithreading.startthread;


public class ThreadGroupDemo {
    public static void main(String[] args){

        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");
        MyThread ob1 = new MyThread("One", groupA);
        MyThread ob2 = new MyThread("Two", groupA);
        MyThread ob3 = new MyThread("Three", groupB);
        MyThread ob4 = new MyThread("Four", groupB);
        System.out.println("\nHere is output from list():");
        groupA.list();
        groupB.list();
        System.out.println("Suspending Group A");
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);

        for (int i = 0; i < tga.length; i++) {
            ((MyThread) tga[i]).suspendMe();
        }
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Exception in Main thread");
        }
        System.out.println("Main thread exiting.");
    }
}


