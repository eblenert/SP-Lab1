package org.splab;

public class Paragraph implements Element {
    private final String text;

    Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(text);
    }

    @Override
    public void add(Element e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Element e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Element get(Integer n) {
        // TODO Auto-generated method stub
        return null;
    }
}
