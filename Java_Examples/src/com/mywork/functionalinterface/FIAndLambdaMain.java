package com.mywork.functionalinterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class FIAndLambdaMain {
    public static void main(String[] args) {
        ananymousClass();
        functionalInterfaceAndLambda();
        squareFI();
        testSquare();
        sortProducts();
        inBuiltFunctionalInterface();

    }

    private static void inBuiltFunctionalInterface() {
        //Supplier FI
        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);
        int randomValue = randomNumberSupplier.get();
        //Generates a random integer between 0 and 99
        System.out.println(randomValue);

        // Consumer FI
        Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Hello, Welcome to Functional interface!!");

        // Function FI
        Function<Integer, String> intToString = num -> "Number: " + num;
        String result = intToString.apply(42);
        System.out.println(result);

        // Predicate FI
        Predicate<Integer> isEven = num -> num % 2 == 0;
        boolean result1 = isEven.test(8); // true
        System.out.println(result1);

        // UnaryOperator FI
        UnaryOperator<Integer> square = num -> num * num;
        int result2 = square.apply(5); // 25
        System.out.println(result2);

    }

    private static void ananymousClass() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created using ananymousClass");
            }
        }).start();
    }

    private static void functionalInterfaceAndLambda() {
        // lambda expression to create the object
        new Thread(() -> {
            System.out.println("New thread created using functional interface and lambda expression");
        }).start();
    }

    private static void squareFI() {
        int a = 10;
        Square s = (int x) -> x * x;
        int ans = s.calculate(a);
        System.out.println(ans);
    }

    private static void testSquare() {
        TestSquare testSquare = new TestSquare();
        int result = testSquare.calculate(20);
        System.out.println("Result: " + result);
    }

    private static void sortProducts() {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "Laptop", 25000f, "Electronics"));
        list.add(new Product(3, "Adapter", 300f, "Accessories"));
        list.add(new Product(2, "Cable", 150f, "Cables"));
        System.out.println("Sorting on the basis of name...");
        // implementing lambda expression
        list.sort(Comparator.comparing(p -> p.name));
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

    }
}
