package com.mywork.designpatterns.structural.facade;

public class OnePlus implements Mobile {
    @Override
    public void modelNo() {
        System.out.println("Model : OnePlus Nord");
    }

    @Override
    public void price() {
        System.out.println("Price : " + 50000);
    }
}
