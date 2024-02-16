package org.example.sandbox.generics;

import java.util.ArrayList;
import java.util.List;

public class Crate<T extends Box<?>> {

    protected List<T> containers;


    public Crate() {
        this.containers = new ArrayList<>();
    }

    public Crate(List<T> containers) {
        this.containers = containers;
    }

    public List<T> getContainers() {
        return this.containers;
    }

    public void addBox(T box) {
        this.containers.add(box);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Crate={");
        sb.append(this.containers);
        sb.append("}");
        return sb.toString();
    }

}
