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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addLast'");
    }

    @Override
    public E pollFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pollFirst'");
    }

    @Override
    public E pollLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pollLast'");
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
