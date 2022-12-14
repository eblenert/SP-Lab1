package org.splab;

public interface Element {
    void print();
    void add(Element e);
    void remove(Element e);
    Element get(Integer n);
    void accept(Visitor v);
}
