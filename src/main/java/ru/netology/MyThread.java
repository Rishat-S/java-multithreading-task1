package ru.netology;

public class MyThread extends Thread {

    public MyThread(ThreadGroup threadGroup, String thName) {
        super(threadGroup, thName);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
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
