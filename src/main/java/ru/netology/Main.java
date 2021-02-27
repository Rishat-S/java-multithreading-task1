package ru.netology;

public class Main {
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
            Thread.sleep(15000);
            threadGroup.interrupt();
            System.out.println("Terminating all threads.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
