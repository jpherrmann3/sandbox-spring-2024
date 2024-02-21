package org.example.sandbox.collections;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Hello");
        set.add("Howdy");
        set.add("Hi");
        set.add("Hola");
        set.add("Ollo");

        // System.out.println("Printing out set.");
        // set.forEach(System.out::println);
        // System.out.println("\n");

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Howdy");
        list.add("Hi");
        list.add("Hola");
        list.add("Ollo");

        // System.out.println("Printing out list.");
        // list.forEach(System.out::println);
        // System.out.println("\n");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Howdy");
        arrayList.add("Hi");
        arrayList.add("Hola");
        arrayList.add("Ollo");

        // System.out.println("Printing out array list.");
        // arrayList.forEach(System.out::println);
        // System.out.println("\n");

        List<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("Howdy");
        vector.add("Hi");
        vector.add("Hola");
        vector.add("Ollo");

        // System.out.println("Printing out vector list.");
        // vector.forEach(System.out::println);
        // System.out.println("\n");


        Queue<String> queue = new LinkedList<>();
        queue.add("Hello");
        queue.add("Howdy");
        queue.add("Hi");
        queue.add("Hola");
        queue.add("Ollo");

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        Deque<String> deque = new LinkedList<>();
        deque.addFirst("Hello");
        deque.addFirst("Howdy");
        deque.addFirst("Hi");
        deque.addLast("Hola");
        deque.addLast("Ollo");

        // System.out.println(deque.removeFirst());
        // System.out.println(deque.removeLast());
        // System.out.println(deque.removeFirst());
        // System.out.println(deque.removeLast());
        // System.out.println(deque.removeFirst());
        // System.out.println(deque.pollFirst());


        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Hello");
        priorityQueue.add("Howdy");
        priorityQueue.add("Hi");
        priorityQueue.add("Hola");
        priorityQueue.add("Ollo");


    }
}
