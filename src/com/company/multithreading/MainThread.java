package com.company.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class MainThread {
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        MyFirstThread myThread = new MyFirstThread();
        myThread.start();

        Thread thread = new Thread(new MyFirstRunnable());
        thread.start();

        //*********************


        for (int j = 0; j < 10_000; j++) {
            new MyThread().start();
        }
        Thread.sleep(500);
        //System.out.println(i);
        System.out.println(atomicInteger.get());
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            //i++;
            atomicInteger.incrementAndGet();
        }
    }
}
