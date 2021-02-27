package ru.netology;

public class Main {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("thread group");
        Runnable th = new MyThread();

        Thread mt1 = new Thread(threadGroup,th, "1");
        Thread mt2 = new Thread(threadGroup,th, "2");
        Thread mt3 = new Thread(threadGroup,th, "3");
        Thread mt4 = new Thread(threadGroup,th, "4");

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
