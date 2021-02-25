package ru.netology;

public class Main {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("main group");
        Thread mt1 = new Thread(threadGroup, new MyThread());
        Thread mt2 = new Thread(threadGroup, new MyThread());
        Thread mt3 = new Thread(threadGroup, new MyThread());
        Thread mt4 = new Thread(threadGroup, new MyThread());

        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadGroup.interrupt();
        System.out.println("Ended all threads.");


    }
}
