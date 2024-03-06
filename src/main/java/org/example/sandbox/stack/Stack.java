package org.example.sandbox.stack;

public interface Stack<E>{
    /*
     * Methods to Implement and their map to ArrayList
     * empty -> isEmpty
     * peek -> getFirst
     * pop -> removeFirst
     * push -> addFirst
     * search -> indexOf() + 1, if -1 return -1
    */

    boolean empty();
    E peek();
    E pop();
    void push(E element);
    int search (E element);
}
