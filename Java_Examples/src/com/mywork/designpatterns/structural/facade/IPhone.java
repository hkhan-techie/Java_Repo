package com.mywork.designpatterns.structural.facade;

public class IPhone implements Mobile {
    @Override
    public void modelNo() {
        System.out.println("Model : IPhone 16");
    }

    @Override
    public void price() {
        System.out.println("Price : " + 150000);
    }
}
