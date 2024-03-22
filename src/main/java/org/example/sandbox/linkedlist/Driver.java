package org.example.sandbox.linkedlist;

public class Driver {
    public static void main(String[] args) {
        LinkedList<String> singlyLinkedList = new SinglyLinkedList<>();

        singlyLinkedList.addLast("Here");

        singlyLinkedList.addFirst("First");
        singlyLinkedList.addFirst("Second");
        singlyLinkedList.addFirst("Third");
        singlyLinkedList.addFirst("Fourth");
        singlyLinkedList.addFirst("Fifth");

        singlyLinkedList.addLast("!");

        System.out.println(singlyLinkedList);

        System.out.println(singlyLinkedList.pollFirst());

        System.out.println(singlyLinkedList);

        // System.out.println(singlyLinkedList.pollFirst());
        // System.out.println(singlyLinkedList.pollFirst());
        // System.out.println(singlyLinkedList.pollFirst());
        // System.out.println(singlyLinkedList.pollFirst());
        // System.out.println(singlyLinkedList.pollFirst());
        // System.out.println(singlyLinkedList.pollFirst());
        // System.out.println(singlyLinkedList.pollFirst());
        // System.out.println(singlyLinkedList.pollFirst());
        System.out.println(singlyLinkedList.pollLast());
        System.out.println(singlyLinkedList.pollLast());
        System.out.println(singlyLinkedList.pollLast());
        System.out.println(singlyLinkedList.pollLast());
        System.out.println(singlyLinkedList.pollLast());
        System.out.println(singlyLinkedList.pollLast());
        System.out.println(singlyLinkedList.pollLast());
        System.out.println(singlyLinkedList.pollLast());
        System.out.println(singlyLinkedList.pollLast());
        System.out.println(singlyLinkedList);

    }
}
