package com.mywork.multithreading;

public class ExtendThread extends Thread {

    public void run() {
        try {

            System.out.println(
                    "Thread " + Thread.currentThread().threadId()
                            + " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
