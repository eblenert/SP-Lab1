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
