package org.splab;

public class TableOfContents implements Element{

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
