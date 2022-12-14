package org.splab;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Minți criminale");

        // motto
        Paragraph p0 = new Paragraph("Motto");
        myBook.addContent(p0);

        // chapter 1
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));

        myBook.addContent(cap1);

        // chapter 2
        Section cap2 = new Section("Capitolul 2");
        Paragraph p21 = new Paragraph("Yada yada yada");
        cap2.add(p21);

        myBook.addContent(cap2);

        // chapter 3
        Section cap3 = new Section("Capitolul 3");
        cap3.add(new Image("Crime scene skate park"));

        myBook.addContent(cap3);

        
        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();

        System.out.println();

        TableOfContentsGenerator toc = new TableOfContentsGenerator(); 
        myBook.accept(toc);
    }
}