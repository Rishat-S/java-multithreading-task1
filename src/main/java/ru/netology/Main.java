package ru.netology;

public class Main {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("main group");

        Thread mt1 = new MyThread("1");
        Thread mt2 = new MyThread("2");
        Thread mt3 = new MyThread("3");
        Thread mt4 = new MyThread("4");

        System.out.println("Creating Threads...");
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();

        try {
            Thread.sleep(15000);
            mt1.interrupt();
            mt2.interrupt();
            mt3.interrupt();
            mt4.interrupt();
            System.out.println("Terminating all threads.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
