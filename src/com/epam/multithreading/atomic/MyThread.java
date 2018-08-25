package com.epam.multithreading.atomic;


import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable {
    public static AtomicInteger count = new AtomicInteger(0);
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            count.getAndAdd(1);
        }
        System.out.println(count);
    }

}
