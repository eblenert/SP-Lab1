package org.splab;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    public final String name;

    private final List<Element> subElementList;

    Section(String name) {
        this.name = name;
        subElementList = new ArrayList<>();
    }

    public void print() {
        System.out.printf("Chapter title: %s%n", name);

        for (Element e : subElementList) {
            e.print();
        }
    }

    @Override
    public void add(Element e) {
        subElementList.add(e);
    }

    @Override
    public void remove(Element e) {
        subElementList.remove(e);
    }

    @Override
    public Element get(Integer n) {
        return subElementList.get(n);
    }

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
        for ( Element e : subElementList) {
            e.accept(v);
        }
    }
}
