package org.example.sandbox.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingDriver {

    public static void main(String[] args) {

        // Generate array of random Integers
        Integer[] arr = IntStream.generate(() -> (int) (Math.random() * 5000))
                                 .boxed()
                                 .limit(100_000)
                                 .toArray(Integer[]::new);

        // List first 10 unsorted elements...
        printFirstTenOfArray(arr);

        Integer[] copy1 = copyArray(arr);
        Integer[] copy2 = copyArray(arr);
        Integer[] copy3 = copyArray(arr);
        Integer[] copy4 = copyArray(arr);
        Integer[] copy5 = copyArray(arr);

        System.out.println("\nSelection Sort...");
        float startTime = System.nanoTime();
        SortingUtility.selectionSort(copy1);
        printFirstTenOfArray(copy1);
        float endTime = System.nanoTime();
        float totalTime = (endTime - startTime) / 1_000_000;
        System.out.println("Total time: " + totalTime + " ms");

        System.out.println("\nInsertion Sort...");
        startTime = System.nanoTime();
        SortingUtility.insertionSort(copy2);
        printFirstTenOfArray(copy2);
        endTime = System.nanoTime();
        totalTime = (endTime - startTime) / 1_000_000;
        System.out.println("Total time: " + totalTime + " ms");

        System.out.println("\nBubble Sort...");
        startTime = System.nanoTime();
        SortingUtility.bubbleSort(copy3);
        printFirstTenOfArray(copy3);
        endTime = System.nanoTime();
        totalTime = (endTime - startTime) / 1_000_000;
        System.out.println("Total time: " + totalTime + " ms");

        System.out.println("\nQuick Sort...");
        startTime = System.nanoTime();
        SortingUtility.quickSort(copy4);
        printFirstTenOfArray(copy4);
        endTime = System.nanoTime();
        totalTime = (endTime - startTime) / 1_000_000;
        System.out.println("Total time: " + totalTime + " ms");

        System.out.println("\nMerge Sort...");
        startTime = System.nanoTime();
        SortingUtility.mergeSort(copy5);
        printFirstTenOfArray(copy5);
        endTime = System.nanoTime();
        totalTime = (endTime - startTime) / 1_000_000;
        System.out.println("Total time: " + totalTime + " ms");

    }

    private static <T> void printFirstTenOfArray(T[] obj) {

        if (obj != null) {

            int counter = 1;
            System.out.println("\nFirst 10 of Array...");

            for (T i : obj) {
                System.out.println(counter + ": " + i.toString());

                if (counter >= 10) {
                    break;
                }
                counter++;
            }

        } else {
            System.out.println("Array is null.");
        }
    }

    private static <T> T[] copyArray(T[] obj) {

        T[] copy = (T[]) Arrays.copyOf(obj, obj.length);

        return copy;
    }

}