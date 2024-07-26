package com.mywork.multithreading;

public class MultithreadExample {

    public static void main(String[] args) {
        extendThread();
        implementsRunnable();
        waitNotify();
    }

    private static void waitNotify() {
        ExtendThread object1 = new ExtendThread();
        ExtendThread object2 = new ExtendThread();
        object1.start();
        object2.start();
        try {
            object1.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void implementsRunnable() {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                    = new Thread(new ImplementsRunnable());
            object.start();
        }
    }

    private static void extendThread() {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            ExtendThread object = new ExtendThread();
            object.start();
        }
    }
}
