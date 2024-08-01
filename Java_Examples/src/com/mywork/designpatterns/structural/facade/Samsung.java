package com.mywork.designpatterns.structural.facade;

public class Samsung implements Mobile {
    @Override
    public void modelNo() {
        System.out.println("Model : Samsung Galaxy Flip");
    }

    @Override
    public void price() {
        System.out.println("Price : " + 100000);
    }
}
