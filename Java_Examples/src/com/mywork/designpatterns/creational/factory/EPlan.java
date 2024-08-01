package com.mywork.designpatterns.creational.factory;

public abstract class EPlan {
    public double rate;

    public abstract Double getRate();

    public Double calculateBill(int units) {
        return units * rate;
    }
}
