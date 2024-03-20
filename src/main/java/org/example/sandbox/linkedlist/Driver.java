package org.example.sandbox.linkedlist;

public class Driver {
    public static void main(String[] args) {
        LinkedList<String> singlyLinkedList = new SinglyLinkedList<>();

        singlyLinkedList.addFirst("First");
        singlyLinkedList.addFirst("Second");
        singlyLinkedList.addFirst("Third");
        singlyLinkedList.addFirst("Fourth");
        singlyLinkedList.addFirst("Fifth");

        System.out.println(singlyLinkedList);
    }
}
