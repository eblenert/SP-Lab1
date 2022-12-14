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

    @Override
    public void add(Element e) {
    }

    @Override
    public void remove(Element e) {
    }

    @Override
    public Element get(Integer n) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
       v.visitTable(this); 
    }
}
