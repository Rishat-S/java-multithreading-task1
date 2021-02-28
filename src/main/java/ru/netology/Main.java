package ru.netology;

import java.util.concurrent.TimeUnit;

public class Main {

    public static final int DELAY_FOR_THREADS_EXEC = 10;

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("thread group");

        Thread mt1 = new MyThread(threadGroup, "1");
        Thread mt2 = new MyThread(threadGroup, "2");
        Thread mt3 = new MyThread(threadGroup, "3");
        Thread mt4 = new MyThread(threadGroup, "4");

        System.out.println("Creating Threads...");
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();

        try {
            TimeUnit.SECONDS.sleep(DELAY_FOR_THREADS_EXEC);
            threadGroup.interrupt();
            mt1.join();
            mt2.join();
            mt3.join();
            mt4.join();
            System.out.println("Terminating all threads.");
            threadGroup.destroy();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
