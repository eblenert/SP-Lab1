package org.splab;

public class Paragraph {
    private final String text;

    Paragraph(String text) {
        this.text = text;
    }

    void print() {
        System.out.println(text);
    }
}
