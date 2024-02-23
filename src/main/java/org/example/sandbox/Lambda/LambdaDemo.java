package org.example.sandbox.Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
            .sorted()
            .filter(x -> x.startsWith("c"))
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }

}
