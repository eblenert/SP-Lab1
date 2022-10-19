package org.splab;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private final String title;

    private Author author;

    private final List<Chapter> chapterList;
    Book(String title) {
        this.title = title;
        chapterList = new ArrayList<>();
    }

    int createChapter(String chapterName) {
        chapterList.add(new Chapter(chapterName));
        return chapterList.size() - 1;
    }

    Chapter getChapter(int chapterIndex) {
        return chapterList.get(chapterIndex);
    }
    void print() {
        System.out.printf("Book title: %s", title);
        author.print();
        System.out.println();
        for (Chapter c : chapterList) {
            c.print();
            System.out.println();
        }
    }

    void addAuthor(Author author) {
        this.author = author;
    }
}
