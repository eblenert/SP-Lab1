package org.splab;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private final String name;

    private final List<Element> elements;


    SubChapter(String name) {
        this.name = name;
        elements = new ArrayList<>();

    }
    void createNewParagraph(String p) {
        elements.add(new Paragraph(p));
    }

    void createNewImage(String image) {
        elements.add(new Image(image));
    }

    void createNewTable(String table) {
        elements.add(new Table(table));
    }

    void print() {
        System.out.printf("SubChapter: %s %n", name);
        for (Element e: elements) {
            e.print();
        }

    }
}
