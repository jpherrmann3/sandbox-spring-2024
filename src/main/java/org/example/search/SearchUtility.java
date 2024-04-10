package org.example.search;

import java.util.Arrays;
import java.util.List;

public class SearchUtility {

    public static int linearSearch(int[] array, int targetValue) {
        int found = Integer.MIN_VALUE;

        for (int i: array) {
            if (i == targetValue) {
                found = targetValue;
                break;
            }
        }

        return found;
    }

    public static boolean linearSearchGC(int [] array, int targetValue) {
        boolean found = false;
        for (int i: array) {
            if (i == targetValue) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static <T> T linearSearch(List<T> objectList, T target) {
        T result = null;

        if (objectList.contains(target)) {
            result = objectList.get(objectList.indexOf(target));
        }

        return result;
    }

    public static <T extends Comparable<T>> boolean linearSearch(T[] array, T target) {
        boolean found = false;

        for (T t: array) {
            if (t.compareTo(target) == 0) {
                found = true;
                break;
            }
        }

        return found;
    }

    public static int binarySearchIterative(int[] array, int targetValue) {

        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (array[mid] == targetValue) {
                return mid;
            }
            else if (array[mid] < targetValue) {
                min = mid + 1;
            }
            else {
                max = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] intArray = {2, 4, 6, 5, -1, -2, 1, 0};

        int[] integerArray = Arrays.stream(intArray)
            .sorted()
            .toArray();

        System.out.println(linearSearch(integerArray, 0));
        System.out.println(linearSearch(integerArray, 7));
        System.out.println(linearSearchGC(integerArray, 0));
        System.out.println(linearSearchGC(integerArray, 7));

        System.out.println(binarySearchIterative(integerArray, 6));
        System.out.println(binarySearchIterative(integerArray, 5));
        Arrays.stream(integerArray).forEach(n -> System.out.print(n + " "));

    }
}
