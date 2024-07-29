package com.mywork.multithreading;

public class ImplementsRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(
                    "Runnable Thread " + Thread.currentThread().getId()
                            + " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
