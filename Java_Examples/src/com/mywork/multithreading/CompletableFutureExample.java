package com.mywork.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        simple();
        chainOfOperations();
        runMultipleFuturesInParallel();
        exceptionHandling();
    }

    private static void simple() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello, world!");

        future.thenAccept(System.out::println);
    }

    private static void chainOfOperations() {
//        how to use CompletableFuture to chain multiple asynchronous operations together
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10)
                .thenApplyAsync(result -> result * 2)
                .thenApplyAsync(result -> result + 5);

        future.thenAccept(System.out::println);
    }

    private static void runMultipleFuturesInParallel() {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            // Some long-running operation

            return "Result 1";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            // Some long-running operation
            return "Result 2";
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            // Some long-running operation
            return "Result 3";
        });

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3);

        allFutures.thenRun(() -> {
            // All futures completed
            String result1 = future1.join();
            String result2 = future2.join();
            String result3 = future3.join();
            System.out.println(result1 + ", " + result2 + ", " + result3);
        });
    }

    private static void exceptionHandling() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10 / 0;
        });

        future.exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0; // Default value to return if there's an exception
        }).thenAccept(result -> {
            System.out.println("Result: " + result);
        });
    }
}
