package com.mywork.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EFCExample {
    public static void main(String[] args) {
        executorService();
        future();
        callableMethod();

    }

    private static void executorService() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submit tasks for execution
        executorService.submit(() -> {
            System.out.println("Task 1 executing");
        });

        executorService.submit(() -> {
            System.out.println("Task 2 executing");
        });

        executorService.submit(() -> {
            System.out.println("Task 3 executing");
        });

        // Shutdown the executor service
        executorService.shutdown();
    }

    private static void future() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Submit a task and obtain a Future object
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return "Hello, Future!";
        });

        // Perform other tasks while the computation is in progress
        System.out.println("Performing other tasks!!");
        // Wait for the result and retrieve it
        String result = null;
        try {
            result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);

        // Shutdown the executor service
        executorService.shutdown();
    }

    private static void callableMethod() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Submit a task and obtain a Future object
//        Future<Integer> future = executorService.submit(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                Thread.sleep(2000);
//                return 42;
//            }
//        });
        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return 42;
        });


        // Perform other tasks while the computation is in progress

        // Wait for the result and retrieve it
        Integer result = null;
        try {
            result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);

        // Shutdown the executor service
        executorService.shutdown();
    }
}
