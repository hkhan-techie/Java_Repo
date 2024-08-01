package com.mywork.designpatterns.creational.singleton;

public class SingletonPattern {
//    //Early, instance will be created at load time
//    private static SingletonPattern obj = new SingletonPattern();
//public static SingletonPattern getInstance() {
//    return obj;
//}

    private static SingletonPattern obj = null;

    private SingletonPattern() {
    }

    public static SingletonPattern getLazyInstance() {
        if (obj == null) {
            System.out.println("obj is null");
            synchronized (SingletonPattern.class) {
                System.out.println("inside synchronized block");
                obj = new SingletonPattern();//instance will be created at request time
            }
        }
        System.out.println("returning obj");
        return obj;
    }

    public void performSomeOperation() {
        System.out.println("Performing some operation!!");
    }
}
