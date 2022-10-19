package org.splab;

public class Table implements Element {
    private final String title;

    Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.printf("------%s-------", title);
        System.out.println();

    }
}
