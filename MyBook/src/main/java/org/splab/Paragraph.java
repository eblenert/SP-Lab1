package org.splab;

public class Paragraph implements Element {
    private final String text;

    Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(text);
    }
}
