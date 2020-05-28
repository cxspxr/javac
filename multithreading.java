package com.company;

import java.util.concurrent.TimeUnit;

class MyRunnable implements Runnable {
    int counter = 1;

    @Override
    public void run() {
        for (long stop = System.nanoTime() + TimeUnit.SECONDS.toNanos(3); stop > System.nanoTime(); ) {
            counter++;
            System.out.println(String.format("Increasing counter in thread # %s, counter is %s", Thread.currentThread().getName(), counter));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(runnable, String.valueOf(i));
            thread.setPriority(i + 5);
            thread.start();
        }
    }
}

