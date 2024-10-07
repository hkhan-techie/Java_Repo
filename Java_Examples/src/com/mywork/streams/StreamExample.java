package com.mywork.streams;

import com.mywork.functionalinterface.Product;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //Intermediate operations
        // Map implementation
        System.out.println("\nmap");
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);
        System.out.println("min :" + numbers.stream().min(Integer::compareTo).get());
        System.out.println("min :" + numbers.stream().max(Integer::compareTo).get());
        System.out.println("sum :" + numbers.stream().reduce(Integer::sum).get());

        // Filter implementation
        System.out.println("\nfilter");
        List<String> names = Arrays.asList("John", "Raj", "Abdul");
        List<String> result = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);

        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "Laptop", 25000f, "Electronics"));
        list.add(new Product(3, "Adapter", 300f, "Accessories"));
        list.add(new Product(2, "Cable", 150f, "Cables"));
        List<Product> sorted = list.stream().filter(product -> product.getPrice() == 150f).toList();
        System.out.println(sorted);

        // Sorted implementation
        System.out.println("\nsorted");
        List<String> result2 = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result2);

        //Parallel
        System.out.println("\nParallel");
        List<Integer> parallel = numbers.stream().parallel().map(x -> x + 10).toList();
        System.out.println(parallel);

        // Terminal operations
        // Collect implementation
        System.out.println("\nset");
        Set<Integer> square2 = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(square2);

        //forEach implementation
        System.out.println("\nforEach");
        numbers.stream().map(x -> x * x).forEach(System.out::println);

        // reduce implementation
        List<Integer> number2 = Arrays.asList(2, 3, 4, 5);
        Integer even = number2.stream().filter(x -> x % 2 == 0).reduce(Integer::sum).orElse(0);
        System.out.println("\nreduce:" + even);

        // Get the sum of squares of even numbers from the list.
        int sum = number2.stream().filter(x -> x % 2 == 0).map(x -> x * x).reduce(0, Integer::sum);
        System.out.println("sum of squares of even numbers: " + sum);

        //partitioningBy
        System.out.println("\npartitioningBy");
        //We can partition a stream into two – based on whether the elements satisfy certain criteria or not.
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
        Map<Boolean, List<Integer>> isEven = intList.stream().collect(
                Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(isEven);

        //groupingBy
        //groupingBy() offers advanced partitioning – where we can partition the stream into more than just two groups.
        System.out.println("\ngroupingBy");
        Map<Character, List<Product>> groupByAlphabet = list.stream().collect(
                Collectors.groupingBy(e -> e.getName().charAt(0)));
        System.out.println(groupByAlphabet);

    }
}
