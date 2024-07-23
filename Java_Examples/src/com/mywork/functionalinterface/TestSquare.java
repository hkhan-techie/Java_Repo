package com.mywork.functionalinterface;

public class TestSquare implements Square{
    @Override
    public int calculate(int x) {
        return x*x;
    }
}
