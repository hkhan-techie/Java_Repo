package com.mywork.java17features;

public record Fruit(String name, int price) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }
}
