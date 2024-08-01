package com.mywork.designpatterns.behavioral.observer;

public class TVApp implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("TVApp: Weather updated - " + weather);
    }
}
