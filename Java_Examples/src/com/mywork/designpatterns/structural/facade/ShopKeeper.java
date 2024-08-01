package com.mywork.designpatterns.structural.facade;

public class ShopKeeper {
    private final Mobile iphone;
    private final Mobile samsung;
    private final Mobile onePlus;

    public ShopKeeper() {
        iphone = new IPhone();
        samsung = new Samsung();
        onePlus = new OnePlus();
    }

    public void iphoneSale() {
        iphone.modelNo();
        iphone.price();
    }

    public void samsungSale() {
        samsung.modelNo();
        samsung.price();
    }

    public void onPlusSale() {
        onePlus.modelNo();
        onePlus.price();
    }
}
