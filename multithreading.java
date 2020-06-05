/**
* Multithreading practice
* 
* (c) Yaroslav Kasperovhych
* MIT License
* /


package com.company;

import java.util.concurrent.TimeUnit;

class MyRunnable implements Runnable {
    int counter = 1;

    @Override
    public void run() {
        // increment counter for 3 seconds
        for (long stop = System.nanoTime() + TimeUnit.SECONDS.toNanos(3); stop > System.nanoTime(); ) {
            counter++;
            System.out.println(String.format("Increasing counter in thread # %s, counter is %s", Thread.currentThread().getName(), counter));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        // Create and run 5 threads in different priorities
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(runnable, String.valueOf(i));
            thread.setPriority(i + 5);
            thread.start();
        }
    }
}

