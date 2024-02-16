package org.example.sandbox.generics;

public class Box<T> {

    private T contents;

    public Box() {
    }

    public Box(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return this.contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Box{contents='").append(getContents()).append("'}");
        return sb.toString();
    }


}
