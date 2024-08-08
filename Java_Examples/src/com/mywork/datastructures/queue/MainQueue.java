package com.mywork.datastructures.queue;

class MainQueue {
    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.printf("The front element of the queue is %d\n", q.peek());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        // to check whether the queue is empty or not
        if (q.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue is not empty");
        }
    }
}
