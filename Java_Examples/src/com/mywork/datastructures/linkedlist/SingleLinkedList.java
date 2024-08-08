package com.mywork.datastructures.linkedlist;

/*
    Singly Linked List implementation.
 */
public class SingleLinkedList {

    Node head;

    // Method to insert a new node
    public static SingleLinkedList insert(SingleLinkedList list,
                                          int data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse till the last node
            // and insert the newNode there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the newNode at last node
            last.next = newNode;
        }
        return list;
    }

    // Method to print the SingleLinkedList.
    public static void printList(SingleLinkedList list) {
        Node currNode = list.head;
        System.out.print("SingleLinkedList: ");
        // Traverse through the SingleLinkedList
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // Method to delete a node in the SingleLinkedList by data/value
    public static SingleLinkedList deleteByData(SingleLinkedList list,
                                                int data) {
        Node currNode = list.head;
        Node prev = null;

        //If head node itself contains the data to be deleted
        if (currNode != null && currNode.data == data) {
            list.head = currNode.next; // Changed head
            System.out.println(data + " found and deleted");
            return list;
        }

        /** If the data is somewhere other than at head
         Search for the data to be deleted,
         keep track of the previous node
         as it is needed to change currNode.next */
        while (currNode != null && currNode.data != data) {
            // If currNode does not hold data
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        /** If the data was present, it should be at currNode
         Therefore the currNode shall not be null
         */
        if (currNode != null) {
            // Since the data is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;
            System.out.println(data + " found and deleted");
        }

        /**The data is not present
         If data was not present in linked list
         currNode should be null */
        if (currNode == null) {
            // Display the message
            System.out.println(data + " not found");
        }
        return list;
    }

    // Method to create a Singly linked list with n nodes
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList = insert(singleLinkedList, 10);
        singleLinkedList = insert(singleLinkedList, 9);
        singleLinkedList = insert(singleLinkedList, 8);
        singleLinkedList = insert(singleLinkedList, 7);
        singleLinkedList = insert(singleLinkedList, 6);

        printList(singleLinkedList);

        // Delete node with value 10
        // In this case the key is ***at head***
        deleteByData(singleLinkedList, 10);
        printList(singleLinkedList);

        // Delete node with value 7, which is in between
        deleteByData(singleLinkedList, 7);
        printList(singleLinkedList);

        // Delete node with value 5
        // In this case the key is ***not present***
        deleteByData(singleLinkedList, 5);
        printList(singleLinkedList);
    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}

