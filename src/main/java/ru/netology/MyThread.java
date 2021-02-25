package ru.netology;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("I am %s", Thread.currentThread().getName() + ". Hello everyone!\n");
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("Thread %s ended.\n", Thread.currentThread().getName());
        }
    }
}
