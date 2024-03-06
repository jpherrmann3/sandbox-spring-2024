package org.example.sandbox.stack;

import java.util.ArrayList;

public class StackTest {
    /*
     * Methods to Implement and their map to ArrayList
     * empty -> isEmpty
     * peek -> getFirst
     * pop -> removeFirst
     * push -> addFirst
     * search -> indexOf() + 1, if -1 return -1
     */
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("stack");
        myList.add("beautiful");
        myList.add("my");
        myList.add("Hello");

        System.out.println(myList);;

        ArrayListStack<String> myStack = new ArrayListStack<>();

        myList.forEach(myStack::push);
        System.out.println(myStack);
        System.out.println();

        System.out.println(myStack.empty());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        myStack.push("!");
        System.out.println(myStack);
        System.out.println(myStack.search("Hello"));
    }
}
