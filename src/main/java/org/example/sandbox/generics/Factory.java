package org.example.sandbox.generics;

public class Factory {

    public static <T> T getInstance(Class<T> clazz) throws Exception {
        return clazz.getConstructor().newInstance();
    }

    public static void main(String[] args) {
        try {

            Box<Integer> box = Factory.getInstance(Box.class);
            String message = Factory.getInstance(String.class);

            message = "Hello";

            box.setContents(1);

            System.out.println(box);
            System.out.println(message);

        } catch (Exception e) {
            System.out.println("There was an exception.");
        }

    }

}
