package com.mywork.methodreference;

import java.util.function.BiFunction;

interface Execute{
    void perform();
}

public class InstanceMethodReference {
    public void saySomething(){
        System.out.println("Hello, this is non-static method.");
    }
    public static void main(String[] args) {
        InstanceMethodReference methodReference = new InstanceMethodReference();
        Execute execute = methodReference::saySomething;
        execute.perform();

        // Referring non-static method using anonymous object
        Execute execute2 = new InstanceMethodReference()::saySomething;
        // Calling interface method
        execute2.perform();

        BiFunction<Integer, Integer, Integer> adder = new Arithmetic2()::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}

class Arithmetic2{
    public int add(int a, int b){
        return a+b;
    }
}
