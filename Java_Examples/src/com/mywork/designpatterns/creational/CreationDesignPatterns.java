package com.mywork.designpatterns.creational;

import com.mywork.designpatterns.creational.builder.*;
import com.mywork.designpatterns.creational.factory.EPlan;
import com.mywork.designpatterns.creational.factory.EPlanFactory;
import com.mywork.designpatterns.creational.singleton.SingletonPattern;

public class CreationDesignPatterns {
    public static void main(String[] args) {
        testSingletonPattern();
        testFactoryPattern();
        testBuilderPattern();
    }

    private static void testBuilderPattern() {
        Food breakFast = new BreakFast("Idli Vada", 1, 50.0);
        Drink teaCoffee = new TeaCoffe("Tea", 1, 10.0);
        FoodPackage foodPackage = new FoodPackage.FoodPackageBuilder(breakFast).setDrink(teaCoffee).build();
        System.out.println(foodPackage.getFood().toString());
        System.out.println(foodPackage.getDrink().toString());
    }

    private static void testSingletonPattern() {
        SingletonPattern singletonPattern = SingletonPattern.getLazyInstance();
        singletonPattern.performSomeOperation();
        SingletonPattern singletonPattern1 = SingletonPattern.getLazyInstance();
        singletonPattern1.performSomeOperation();
    }

    private static void testFactoryPattern() {
        EPlanFactory EPlanFactory = new EPlanFactory();
        String planName = "COMMERCIAL";
        int units = 100;
        EPlan p = EPlanFactory.getEPlan(planName);
        System.out.println("PlanName : " + planName + " Units : " + units);
        System.out.println("Rate : " + p.getRate());
        System.out.println("Bill amount : " + p.calculateBill(units));
    }
}

