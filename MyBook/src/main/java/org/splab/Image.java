package org.splab;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private final String imageName;

    Image(String imageName) {
        this.imageName = imageName;

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.printf("Image name: %s\n", imageName);
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
       v.visitImage(this); 
    }
}
