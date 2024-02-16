package org.example.sandbox.generics;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        Box<String> box1 = new Box<>();
        Box<Double> box2 = new Box<>();

        box.setContents(1);
        box1.setContents("Hello");
        box2.setContents(2.0);

        System.out.println(box);
        System.out.println(box1);
        System.out.println(box2);

        List<Integer> numbers = new Random()
                .ints(1, 500)
                .distinct()
                .limit(100)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        numbers.forEach(System.out::println);

        Crate<Box<Integer>> crate = new Crate<>();

        numbers.forEach(number -> crate.addBox(new Box<>(number)));

        System.out.println(crate);

    }
}
