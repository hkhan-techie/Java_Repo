package com.mywork.java17features;

import java.util.HashMap;

public class Java17FeaturesExample {

    private static final String Car = "Car";
    private static final String Bike = "Bike";
    private static final String Cycle = "Cycle";
    private static final String Autorickshaw = "Autorickshaw";

    public static void main(String[] args) {
        textBlock();
        System.out.println(getDayOfWeek(1));
        System.out.println(getDayOfWeek1(2));
        System.out.println(improvedSwitch(Bike));
        patternMatchingInstance("Value");
        recordImplementation();
        sealedImplementation();
        helpfulNPE();
    }

    private static void textBlock() {
        // Earlier Java versions
        String builder = "{" +
                "\"name:\"" +
                "\"John Doe\"" +
                "}";
        System.out.println(builder);

        // Java 17 version
        String text = """
                  {
                    "name": "John Doe",
                    "age": 45,
                    "address": "Doe Street, 23, Java Town"
                  }
                """;
        System.out.println(text);

        String sql = """
                SELECT id, firstName, lastName \
                FROM Employee
                WHERE departmentId = "IT" \
                ORDER BY lastName, firstName""";
        System.out.println(sql);
    }

    // Traditional switch
    public static String getDayOfWeek(int dayNum) {
        String day;
        switch (dayNum) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid day";
        }
        return day;
    }

    // Java 12 switch
    //the case statements now use the new arrow operator (->) to specify the pattern and the result expression. It also eliminates the break statement at each case.
    public static String getDayOfWeek1(int dayNum) {
        return switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
    }

    private static String improvedSwitch(String vehicle) {
        return switch (vehicle) {

            case Car -> "four";

            case Bike, Cycle -> "two";

            case Autorickshaw -> "three";

            default -> {
                System.out.println("The vehicle could not be found.");
                yield "Unknown Vehicle";

            }
        };
    }

    private static void patternMatchingInstance(Object obj) {
        // Old way with pattern matching (Before Java 17)
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.length());
        }

        // New way with pattern matching (Since Java 17)
        if (obj instanceof String str) {
            System.out.println("Java 17: " + str.length());
        }
    }

    private static void helpfulNPE() {
        HashMap<String, String> grapes = new HashMap<>();
        grapes.put("key 1", "Value 1");
        grapes.put("key 2", "Value 2");
        grapes.put("key 3", null);
        var color = grapes.get("grape3").length();
    }

    private static void sealedImplementation() {
        Lion lion = new Lion();
        System.out.println(lion.getName());
        Tiger tiger = new Tiger();
        System.out.println(tiger.getName());
        Deer deer = new Deer();
        System.out.println(deer.getName());
    }

    private static void recordImplementation() {
        Fruit fruit = new Fruit("Apple", 100);
        System.out.println("Record Fruit price: " + fruit.price());
    }


}


