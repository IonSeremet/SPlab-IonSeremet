package com.example.designpatternslab;

public class RenderContentVisitor implements Visitor {

    @Override
    public void visitBook(Book book) {
        // Implement rendering logic for Book
        System.out.println("Rendering Book: " + book.getTitle());
    }

    @Override
    public void visitChapter(Chapter chapter) {
        // Implement rendering logic for Chapter
        System.out.println("Rendering Chapter: " + chapter.getSubChapters());
    }

    @Override
    public void visitSubChapter(SubChapter subChapter) {
        // Implement rendering logic for SubChapter
        System.out.println("Rendering SubChapter: " + subChapter.getTitle());
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        // Implement rendering logic for Paragraph
        System.out.println("Rendering Paragraph: " + paragraph.getText());
    }

    @Override
    public void visitImage(Image image) {
        // Implement rendering logic for Image
        System.out.println("Rendering Image: " + image.getImageUrl());
    }

    @Override
    public void visitTable(Table table) {
        // Implement rendering logic for Table
        System.out.println("Rendering Table: " + table.getTitle());
    }
}

