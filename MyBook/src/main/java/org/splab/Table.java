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
