package org.splab;


public class Image {
    private final String imageName;

    Image(String imageName) {
        this.imageName = imageName;
    }

    void print() {
        System.out.printf("Image name: %s\n", imageName);
    }
}
