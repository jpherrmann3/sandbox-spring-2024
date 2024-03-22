package org.example.sandbox.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E>{

    private Node head;
    private Node tail;

    @Override
    public void addFirst(E element) {
        Node node = new Node(element, head);

        if (head == null) {
            tail = node;
        }

        head = node;

    }

    @Override
    public void addLast(E element) {
        Node node = new Node(element, null);

        if (tail == null) {
            head = node;
        }

        else {
            tail.next = node;
        }

        tail = node;

    }

    @Override
    public E pollFirst() {

        E element;

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            tail = null;
        }

        element = head.element;

        Node newHead = head.next;

        head.next = null;

        head = newHead;

        return element;
    }

    @Override
    public E pollLast() {
        E element;

        if (tail == null) {
            return null;
        }

        if (head == tail) {
            element = tail.element;
            head = null;
            tail = head;
            return element;
        }

        if (head.next == tail) {
            element = tail.element;
            head.next = null;
            tail = head;
            return element;
        }

        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        element = tail.element;
        tail = current;
        current.next = null;

        return element;

    }

    @Override
    public E peekFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peekFirst'");
    }

    @Override
    public E peekLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peekLast'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public boolean contains(E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        StringJoiner sj = new StringJoiner(", ");
        Node current = head;

        while (current != null) {
            sj.add(current.element.toString());
            current = current.next;
        }

        sb.append(sj);
        sb.append("]");

        return sb.toString();
    }

    private class Node {

        Node next;
        E element;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
