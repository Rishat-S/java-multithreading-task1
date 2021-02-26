package ru.netology;

public class MyThread extends Thread {

    public MyThread(String s) {
        this.setName(s);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("I am Thread %s", Thread.currentThread().getName() + ". Hello everyone!\n");
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("Thread %s ended.\n", getName());
        }
    }
}
