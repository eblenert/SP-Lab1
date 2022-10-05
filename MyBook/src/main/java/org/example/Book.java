package org.example;

import java.util.List;
import java.util.ArrayList;

public class Book {
    String title;
    List<String> body;

    Book(String title) {
        body = new ArrayList<String>();
        this.title = title;
    }

    void print() {
        System.out.println(title);
        System.out.println();
        System.out.println();
        for (String string : body) {
            System.out.println(string);
            System.out.println();
        }
    }

    public void createNewParagraph(String string) {
        body.add(string);
    }

    public void createNewTable(String string) {
        body.add(string);
    }

    public void createNewImage(String string) {
        body.add(string);
    }
}
