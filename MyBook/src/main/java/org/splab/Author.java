package org.splab;

public class Author {
    private final String name;
    Author(String name) {
        this.name = name;
    }

    void print() {
        System.out.printf("Author: %s", name);
    }
}
