package com.mywork.datastructures.queue;


//Creating A Linked List Node
class Node {
    int data;       // the integer data
    Node next;      // the pointer to the next node

    public Node(int data) {
        // this is used to set the data in the allocated node and return it
        this.data = data;
        this.next = null;
    }
}

public class QueueImpl {
    private Node rear = null, front = null;
    private int count = 0;

    // This function is used to dequeue the front element in the queue
    public int dequeue()
    // this function is used to delete the queue elements at the beginning
    {
        if (front == null) {
            System.out.println("\nQueueImpl is in Underflow condition");
            System.exit(-1);
        }

        Node temp = front;
        System.out.println("The element which you want to remove from the queue is: " + temp.data);

        // is used to point to the front to the next node
        front = front.next;

        // if the list becomes empty
        if (front == null) {
            rear = null;
        }

        // we are decreasing the count of nodes the  by 1
        count -= 1;

        // it is used to return the removed item
        return temp.data;
    }

    // this function is used to add an item to the queue
    public void enqueue(int item)
    // insertion of the elements at the end of the queue
    {
        // used to allocate a new node in a heap
        Node node = new Node(item);
        System.out.println("Inserting : " + item);

        // this is used to check a special case: when the queue is empty
        if (front == null) {
            // initialize both front and rear(nodes pointing at both the front and rear nodes)
            front = node;
            rear = node;
        } else {
            // update the rear pointer of the queue
            rear.next = node;
            rear = node;
        }

        // this is used to increase the node's count by 1
        count += 1;
    }

    // this function returns the top or the front/peek element in a queue
    public int peek() {
        // it is used to check for an empty queue
        if (front == null) {
            System.exit(-1);
        }

        return front.data;
    }

    // This function is used to check if the queue is empty or not
    public boolean isEmpty() {
        return rear == null && front == null;
    }

    // This function is used to return the size of the queue
    private int size() {
        return count;
    }
}

