package org.splab;

public class Table {
    private final String title;

    Table(String title) {
        this.title = title;
    }

    void print() {
        System.out.printf("------%s-------", title);
        System.out.println();

    }
}
