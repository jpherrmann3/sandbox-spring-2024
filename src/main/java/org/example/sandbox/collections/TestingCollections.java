package org.example.sandbox.collections;

import java.util.ArrayList;
import java.util.Collection;


public class TestingCollections {

    private ArrayList<String> strings;

    public ArrayList<String> getStrings() {
        return this.strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }


    public TestingCollections() {
    }


    public TestingCollections(ArrayList<String> strings) {
        this.strings = strings;
    }


    public static String FoundString() {

        return "";
    }

}
