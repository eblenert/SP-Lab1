package org.splab;

public class BookStatistics implements Visitor{
    private int images = 0;
    private int tables = 0;
    private int paragraphs = 0;

    @Override
    public void visitBook(Book b) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitSection(Section s) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitTableOfContents(TableOfContents toc) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitParagraph(Paragraph p) {
       paragraphs++; 
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
        images++;
    }

    @Override
    public void visitImage(Image i) {
       images++; 
        
    }

    @Override
    public void visitTable(Table t) {
        tables++;
       
    }
    
    void printStatistics() {
        System.out.printf("*** Number of images: %d\n", images);
        System.out.printf("*** Number of tables: %d\n", tables);
        System.out.printf("*** Number of paragraphs: %d\n", paragraphs);

    }
}
