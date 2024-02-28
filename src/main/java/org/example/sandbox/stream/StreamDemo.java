package org.example.sandbox.stream;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Java");
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        // intermediate operations
        // map
        List<Integer> square = numbers
            .stream()  // monad
            .map(x -> x * x)
            .collect(Collectors.toList());
        square.forEach(System.out::println);;
        // filter
        List<String> result = names
            .stream()
            .filter(s -> s.endsWith("tion"))
            .collect(Collectors.toList());
        result.forEach(System.out::println);

        // sorted
        List<String> result2 = names
            .stream()
            .sorted()
            .collect(Collectors.toList());
        result2.forEach(System.out::println);

        // terminal operations
        // collect
        Set<Integer> squared = numbers
            .stream()
            .map(x -> x * x)
            .collect(Collectors.toSet());
        squared.forEach(System.out::println);

        // forEach
        numbers.stream()
            .map(x -> x * x)
            .forEach(System.out::println);
        numbers.forEach(System.out::println);

        // reduce
        int evenSum = numbers
            .stream()
            .filter(evenOnlyPredicate)
            .reduce(0, (Integer acc, Integer x) -> acc + x);

        System.out.println("Even sum: " + evenSum);

        // int stream
        int totalSum = IntStream.iterate(0, x -> x + 1)  // 0, 1, 3, 4, 5, ...
            .skip(5)  // skips first 5
            .limit(5)  // limit to 5: 5, 6, 7, 8, 9
            .filter(evenOnly)  // 6 , 8
            .reduce(2, Integer::sum);  // 6 + 8 + 2
        System.out.println("Total Sum: " + totalSum);

        // random ints
        Random random = new Random();
        random.ints(1, 11)
            .limit(50)
            .forEach(System.out::println);

        // IntStream generate
        final AtomicInteger counter = new AtomicInteger(1);
        IntStream.generate(counter::getAndIncrement)
            .limit(10)
            .filter(evenOnly)
            .forEach(System.out::println);

        // stream of random strings
        String randomString = Stream.generate(new StringGenerator())
            .limit(16)
            .collect(Collectors.joining());

        System.out.println(randomString);
    }
}

