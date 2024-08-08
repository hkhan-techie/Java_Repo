package com.mywork.datastructures.stack;

public class StackImplExample {
    public static void main(String[] args) {
        StackDS s = new StackDS();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            System.out.println(s.pop());
        }
    }
}

