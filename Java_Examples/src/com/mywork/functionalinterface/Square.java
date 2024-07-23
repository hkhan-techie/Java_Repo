package com.mywork.functionalinterface;

@FunctionalInterface
interface Square {
    int calculate(int x);

    default void print(int result) {
        System.out.println(result);
    }
}
