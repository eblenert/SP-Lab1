package org.splab;


public class Image implements Element {
    private final String imageName;

    Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.printf("Image name: %s\n", imageName);
    }
}
