package com.epam.multithreading.startthread;


public class DaemonOrNo extends Thread {
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("старт потока-демона");
                sleep(1000);
            } else {
                System.out.println("старт обычного потока");
                sleep(100);
            }
        } catch (InterruptedException e) {
            System.err.print("Error" + e);
        } finally {
            if (!isDaemon()){
                System.out.println("завершение обычного потока");
            }
            else
                System.out.println("завершение потока-демона");
        }
    }
}
