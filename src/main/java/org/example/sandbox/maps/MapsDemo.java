package org.example.sandbox.maps;

import java.util.*;

public class MapsDemo {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();

        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");

        for (Integer i : numbers.keySet()) {
            System.out.println(i + ": " + numbers.get(i));
        }

        System.out.println("\n" + "Using lambdas:");
        numbers.forEach((key, value) -> System.out.println(key + ": " + value));
        numbers.forEach((key, value) -> System.out.println((key + 1) + " " + value.toUpperCase()));

        System.out.println(numbers);

    }
}
