package com.mywork.datastructures.stack;

import java.util.ArrayList;

public class StackDS {
    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty() {
        return (list.isEmpty());
    }

    public void push(int data) {
        list.add(data);
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public int peek() {
        if (isEmpty())
            return -1;
        return list.get(list.size() - 1);
    }
}
