package com.epam.multithreading.startthread;


public class DaemonDemo {
    public static void main(String[] args) {
        DaemonOrNo usual = new DaemonOrNo();
        DaemonOrNo daemon = new DaemonOrNo();
        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        System.out.println("последний оператор main");
    }

}
