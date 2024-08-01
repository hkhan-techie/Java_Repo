package com.mywork.designpatterns.behavioral;

import com.mywork.designpatterns.behavioral.observer.MobileApp;
import com.mywork.designpatterns.behavioral.observer.Observer;
import com.mywork.designpatterns.behavioral.observer.TVApp;
import com.mywork.designpatterns.behavioral.observer.WeatherDepartment;
import com.mywork.designpatterns.behavioral.strategy.CreditCardStrategy;
import com.mywork.designpatterns.behavioral.strategy.Item;
import com.mywork.designpatterns.behavioral.strategy.PayPalStrategy;
import com.mywork.designpatterns.behavioral.strategy.ShoppingCart;
import com.mywork.designpatterns.behavioral.template.GlassHouse;
import com.mywork.designpatterns.behavioral.template.HouseTemplate;
import com.mywork.designpatterns.behavioral.template.WoodenHouse;

public class BehavioralDesignPatterns {
    public static void main(String[] args) {
//        testObserverPattern();
//        testStrategyPattern();
        testTemplatePattern();
    }

    private static void testTemplatePattern() {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }

    private static void testStrategyPattern() {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PayPalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Hidayath", "1234567890123456", "321", "12/24"));
    }

    private static void testObserverPattern() {
        WeatherDepartment weatherDepartment = new WeatherDepartment();

        Observer phoneDisplay = new MobileApp();
        Observer tvDisplay = new TVApp();

        weatherDepartment.addObserver(phoneDisplay);
        weatherDepartment.addObserver(tvDisplay);

        // Simulating weather change
        weatherDepartment.setWeather("Sunny");
    }

}
