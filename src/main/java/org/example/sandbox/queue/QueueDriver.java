package org.example.sandbox.queue;

public class QueueDriver {

    public static void main(String[] args) {
        ArrayListQueue<String> queue = new ArrayListQueue<>();

        System.out.println(queue.isEmpty());
        System.out.println();

        queue.offer("Hello");
        queue.offer("World");
        queue.offer("I am a");
        queue.offer("queue!");
        System.out.println(queue);
        System.out.println();

        System.out.println(queue.isEmpty());
        System.out.println();

        System.out.println(queue.peek());
        System.out.println();
        System.out.println(queue);
        System.out.println();

        System.out.println(queue.poll());
        System.out.println();

        System.out.println(queue);
    }

}
