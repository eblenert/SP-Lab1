package org.splab;

public class TableOfContentsGenerator implements Visitor{
    private int page = 1;

    @Override
    public void visitBook(Book b) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitSection(Section s) {
        System.out.println(String.format("%s.....%d", s.name, page));
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitTableOfContents(TableOfContents toc) {
       page++; 
    }

    @Override
    public void visitParagraph(Paragraph p) {
       page++; 
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
       page++; 
    }

    @Override
    public void visitImage(Image i) {
       page++; 
    }

    @Override
    public void visitTable(Table t) {
       page++; 
    }
    
}
