package com.mywork.methodreference;

import java.util.function.BiFunction;

interface Perform{
    void doIt();
}
public class StaticMethodReference {

    public static void printSomething(){
        System.out.println("Hello, this is static method.");
    }

    public static void ThreadStatus(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        Perform perform = StaticMethodReference::printSomething;
        perform.doIt();

        Thread t2=new Thread(StaticMethodReference::ThreadStatus);
        t2.start();

        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }
}