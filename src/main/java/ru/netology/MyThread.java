package ru.netology;

public class MyThread implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2500);
                System.out.printf("I am Thread %s", Thread.currentThread().getName() + ". Hello everyone!\n");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.printf("Thread %s ended.\n", Thread.currentThread().getName());
        }
    }
}
