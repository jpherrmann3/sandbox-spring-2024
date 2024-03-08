package org.example.sandbox.queue;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue<E> implements Queue<E>{

    List<E> queue;

    public ArrayListQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public boolean offer(E e) {
        return this.queue.add(e);
    }

    @Override
    public E poll() {
        return this.queue.removeFirst();
    }

    @Override
    public E peek() {
        return this.queue.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: ");
        sb.append(this.queue.toString());
        return sb.toString();
    }

}
