package com.epam.multithreading.timeunit;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;


public class MyThread implements Callable<Integer> {
    public int count = 0;
    public Integer call() {
        for (int i = 0; i < 1000000; i++) {
            count++;
            try {
                TimeUnit.MICROSECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return count;
    }

}
