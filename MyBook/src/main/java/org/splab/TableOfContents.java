package org.splab;

import java.util.List;

public class TableOfContents implements Element{
    private List<String> contents;

    @Override
    public void print() {
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
       v.visitTableOfContents(this); 
    }
    
}
