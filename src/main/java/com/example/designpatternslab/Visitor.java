package com.example.designpatternslab;

public interface Visitor {
    void visitBook(Book book);
    void visitChapter(Chapter chapter);
    void visitSubChapter(SubChapter subChapter);
    void visitParagraph(Paragraph paragraph);
    void visitImage(Image image);
    void visitTable(Table table);
}