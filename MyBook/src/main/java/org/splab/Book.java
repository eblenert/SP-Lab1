package org.splab;

public class Book extends Section{
    private Author author;

    Book(String title) {
        super(title);
    }

    public void print() {
        System.out.printf("Book title: %s %n", name);
        author.print();
        System.out.println();
        super.print();
    }

    void addContent(Element e) {
        super.add(e);
    }

    void addAuthor(Author author) {
        this.author = author;
    }
}
