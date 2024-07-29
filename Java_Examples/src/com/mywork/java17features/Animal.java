package com.mywork.java17features;

public sealed class Animal permits Lion, Tiger, Deer {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
