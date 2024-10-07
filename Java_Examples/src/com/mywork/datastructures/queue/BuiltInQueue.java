package com.mywork.datastructures.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class BuiltInQueue {
    public static void main(String args[]) {

        Queue<Integer> pQueue
                = new PriorityQueue<>();

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of
        // the PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
    }
}
