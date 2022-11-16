package org.splab;

public class ImageProxy implements Element {
    String url;
    Image realImage = null;

    ImageProxy(String url) {
        this.url = url;
    }

    Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }

        return realImage;
    }

    @Override
    public void print() {
        this.loadImage().print();
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
