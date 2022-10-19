package org.splab;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private final String name;

    private final List<Paragraph> paragraphs;

    private final List<Image> images;

    private final List<Table> tables;
    SubChapter(String name) {
        this.name = name;
        paragraphs = new ArrayList<>();
        images = new ArrayList<>();
        tables = new ArrayList<>();

    }
    void createNewParagraph(String p) {
        paragraphs.add(new Paragraph(p));
    }

    void createNewImage(String image) {
        images.add(new Image(image));
    }

    void createNewTable(String table) {
        tables.add(new Table(table));
    }

    void print() {
        System.out.printf("SubChapter: %s", name);
        for (Paragraph p: paragraphs) {
            p.print();
        }

        for (Image i: images) {
            i.print();
        }

        for (Table t: tables) {
            t.print();
        }
    }
}
